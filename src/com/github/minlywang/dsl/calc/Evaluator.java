package com.github.minlywang.dsl.calc;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.github.minlywang.dsl.calc.CalcParser.ArgumentContext;
import com.github.minlywang.dsl.calc.CalcParser.CompilationUnitContext;
import com.github.minlywang.dsl.calc.CalcParser.ConcatenationContext;
import com.github.minlywang.dsl.calc.CalcParser.ExpressionContext;
import com.github.minlywang.dsl.calc.CalcParser.ExpressionListContext;
import com.github.minlywang.dsl.calc.CalcParser.IfExpressionContext;
import com.github.minlywang.dsl.calc.CalcParser.ImportDeclarationContext;
import com.github.minlywang.dsl.calc.CalcParser.IntegerLiteralContext;
import com.github.minlywang.dsl.calc.CalcParser.JavaStaticMethodsContext;
import com.github.minlywang.dsl.calc.CalcParser.QualifiedNameContext;
import com.github.minlywang.dsl.calc.CalcParser.RelationalExprssionContext;
import com.github.minlywang.dsl.calc.CalcParser.RequireContext;
import com.github.minlywang.dsl.calc.CalcParser.StatementContext;
import com.github.minlywang.dsl.calc.CalcParser.VariableAssignContext;
import com.github.minlywang.dsl.calc.CalcParser.VariableDeclarationContext;
import com.github.minlywang.dsl.calc.CalcParser.WhileExpressionContext;
import com.github.minlywang.dsl.calc.core.CalcScope;
import com.github.minlywang.dsl.calc.core.CalcValue;
import com.github.minlywang.dsl.calc.core.CalcVariable;
import com.github.minlywang.dsl.calc.exception.CalcException;
import com.github.minlywang.dsl.calc.util.ReflectionUtil;
import com.github.minlywang.dsl.calc.util.StringParser;

/**
 * Interpretor
 * 
 * @author minlywang@foxmail.com
 * @since Apr 5, 2014
 * 
 */
public class Evaluator extends CalcBaseVisitor<Object> {
	private CalcScope currentScope = null;

	@Override
	public Object visitExpression(ExpressionContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		CalcValue value = new CalcValue();
		value.setType(int.class);
		if (ctx.getChildCount() == 1) {
			if (ctx.integerLiteral() instanceof CalcParser.IntegerLiteralContext) {
				value.setValue(visitIntegerLiteral(ctx.integerLiteral(), scope));
			} else {
				CalcVariable variable = scope.child(ctx.ID().getText());
				if (variable == null) {
					throw new CalcException("Undefined variable " + ctx.ID().getText() + " !");
				}
				value = scope.child(ctx.ID().getText()).getVariableValue();
			}
		} else {
			if (ctx.getChild(0).getText().equals("(")) {
				value = (CalcValue) visitExpression(ctx.expression(0), scope);
			} else {
				CalcValue left = (CalcValue) visitExpression(ctx.expression(0), scope);
				CalcValue right = (CalcValue) visitExpression(ctx.expression(1), scope);
				if (ctx.op.getType() == CalcParser.ADD) {
					value.setValue(((Integer) left.getValue() + (Integer) right.getValue()));
				} else if (ctx.op.getType() == CalcParser.SUB) {
					value.setValue(((Integer) left.getValue() - (Integer) right.getValue()));
				} else if (ctx.op.getType() == CalcParser.MUL) {
					value.setValue(((Integer) left.getValue() * (Integer) right.getValue()));
				} else if (ctx.op.getType() == CalcParser.DIV) {
					value.setValue(((Integer) left.getValue() / (Integer) right.getValue()));
				} else if (ctx.op.getType() == CalcParser.MOD) {
					value.setValue(((Integer) left.getValue() % (Integer) right.getValue()));
				}
			}
		}
		return value;
	}

	@Override
	public Object visitCompilationUnit(CompilationUnitContext ctx, CalcScope scope) {
		visitImportDeclaration(ctx.importDeclaration(), null);
		List<StatementContext> statementContexts = ctx.statement();
		CalcScope parent = new CalcScope(null);
		setCurrentScope(parent);
		for (StatementContext statementContext : statementContexts) {
			visitStatement(statementContext, parent);
		}
		return true;
	}

	@Override
	public Object visitExpressionList(ExpressionListContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		List<CalcValue> args = new ArrayList<CalcValue>();
		List<ArgumentContext> argumentContexts = ctx.argument();
		for (ArgumentContext argumentContext : argumentContexts) {
			args.add((CalcValue) visitArgument(argumentContext, scope));
		}
		return args;
	}

	private void setCurrentScope(CalcScope scope) {
		this.currentScope = scope;
	}

	@Override
	public Object visitIfExpression(IfExpressionContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		CalcScope ifScope = new CalcScope(scope);
		boolean condition = (Boolean) visitRelationalExprssion(ctx.relationalExprssion(), scope);
		if (condition) {
			List<StatementContext> statementContexts = ctx.statement();
			for (StatementContext statementContext : statementContexts) {
				visitStatement(statementContext, ifScope);
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object visitQualifiedName(QualifiedNameContext ctx, CalcScope scope) {
		List<TerminalNode> ids = ctx.ID();
		List<String> qualifiedNames = new ArrayList<String>();
		for (TerminalNode id : ids) {
			qualifiedNames.add(id.getText());
		}
		return qualifiedNames;
	}

	@Override
	public Object visitJavaStaticMethods(JavaStaticMethodsContext ctx, CalcScope scope) {
		/*
		 * Okay, firstly we need to test existence of class and fields or method
		 * after, we get a value for arguments, finally we invoke a static Java
		 * Method
		 */

		@SuppressWarnings("unchecked")
		List<String> qualifiedNames = (List<String>) visitQualifiedName(ctx.qualifiedName(), scope);
		String className = qualifiedNames.get(0);
		String identifier = ReflectionUtil.fullIdentifier(className);
		if (identifier != null) {
			// making a class object
			Object currentObject = ReflectionUtil.makeObject(identifier);
			if (currentObject != null) {
				// getting a last field object
				for (int i = 1; i < qualifiedNames.size(); i++) {
					if (ReflectionUtil.existsField(currentObject, qualifiedNames.get(i))) {
						currentObject = ReflectionUtil.getFieldObject(currentObject, qualifiedNames.get(i));
					} else {
						@SuppressWarnings("unchecked")
						List<CalcValue> params = (List<CalcValue>) visitExpressionList(ctx.expressionList(), scope);
						// ~ test and invoking
						if (ReflectionUtil.existsSubroutine(currentObject, qualifiedNames.get(i), params.toArray(new CalcValue[] {}))) {
							return ReflectionUtil.invokeStaticSubroutine(currentObject, qualifiedNames.get(i), params.toArray(new CalcValue[] {}));
						}
						break;
					}
				}
			}
		}

		return null;
	}

	@Override
	public Integer visitIntegerLiteral(IntegerLiteralContext ctx, CalcScope scope) {
		return Integer.valueOf(ctx.DecimalLiteral().getText());
	}

	@Override
	public Object visitVariableDeclaration(VariableDeclarationContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		CalcValue value = null;
		if (ctx.expression() == null) {
			;
		} else {
			value = (CalcValue) visitExpression(ctx.expression(), scope);
		}
		CalcVariable var = new CalcVariable();
		var.setVariableName(ctx.ID().getText());
		var.setVariableValue(value);

		/*
		 * we add a variable to current scope for variable life cycle and
		 * visibility.
		 */
		scope.pushChild(var.getVariableName(), var);
		return value;
	}

	@Override
	public Object visitVariableAssign(VariableAssignContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		String id = ctx.ID().getText();
		if (scope.existsChild(id)) {
			CalcVariable var = (CalcVariable) scope.child(id);
			var.setVariableValue((CalcValue) visitExpression(ctx.expression(), scope));
		}
		return null;
	}

	@Override
	public Object visitStatement(StatementContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		if (ctx.variableDeclaration() instanceof CalcParser.VariableDeclarationContext) {
			visitVariableDeclaration(ctx.variableDeclaration(), scope);
		} else if (ctx.variableAssign() instanceof CalcParser.VariableAssignContext) {
			visitVariableAssign(ctx.variableAssign(), scope);
		} else if (ctx.javaStaticMethods() instanceof CalcParser.JavaStaticMethodsContext) {
			visitJavaStaticMethods(ctx.javaStaticMethods(), scope);
		} else if (ctx.ifExpression() instanceof CalcParser.IfExpressionContext) {
			visitIfExpression(ctx.ifExpression(), scope);
		} else if (ctx.whileExpression() instanceof CalcParser.WhileExpressionContext) {
			visitWhileExpression(ctx.whileExpression(), scope);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public Object visitRequire(RequireContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		StringBuilder builder = new StringBuilder();
		List<TerminalNode> nodes = ctx.ID();
		for (int i = 0; i < nodes.size(); i++) {
			if (i == 0) {
				;
			} else {
				builder.append(".");
			}
			builder.append(nodes.get(i).getText());
		}
		return builder.toString();
	}

	@Override
	public Object visitRelationalExprssion(RelationalExprssionContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		Integer left = (Integer) ((CalcValue) visitExpression(ctx.expression(0), scope)).getValue(); // get
																										// value
																										// of
																										// left
		// subexpression
		Integer right = (Integer) ((CalcValue) visitExpression(ctx.expression(1), scope)).getValue(); // get
																										// value
																										// of
		// right
		// subexpression
		if (ctx.op.getType() == CalcParser.EQ) {
			return left == right;
		} else if (ctx.op.getType() == CalcParser.NE) {
			return left != right;
		} else if (ctx.op.getType() == CalcParser.GT) {
			return left > right;
		} else if (ctx.op.getType() == CalcParser.GE) {
			return left >= right;
		} else if (ctx.op.getType() == CalcParser.LT) {
			return left < right;
		} else if (ctx.op.getType() == CalcParser.LE) {
			return left <= right;
		} else {
			throw new RuntimeException("Unrecognized token!");
		}
	}

	@Override
	public Object visitWhileExpression(WhileExpressionContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		CalcScope whileScope = new CalcScope(scope);
		while ((Boolean) visitRelationalExprssion(ctx.relationalExprssion(), scope)) {
			List<StatementContext> statementContexts = ctx.statement();
			for (StatementContext statementContext : statementContexts) {
				visitStatement(statementContext, whileScope);
			}
		}
		return true;
	}

	@Override
	public Integer visitImportDeclaration(ImportDeclarationContext ctx, CalcScope scope) {
		/*
		 * first setup of imported packages and add it to ReflectionUtil class
		 * for using it with reflection full class identifier like :
		 * "java.lang.System"
		 */

		List<RequireContext> requireContexts = ctx.require();
		for (RequireContext requireContext : requireContexts) {
			ReflectionUtil.pushPackage((String) visitRequire(requireContext, null));
		}
		return null;
	}

	@Override
	public Object visitConcatenation(ConcatenationContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		String concatenation = null;
		if (ctx.getChildCount() == 1) { // String literal
			concatenation = visitStringLiteral(ctx.getText());
		} else if (ctx.getChild(0).getText().equals(ctx.concatenation().getText())) {
			concatenation = (String) visitConcatenation(ctx.concatenation(), scope) + String.valueOf(((CalcValue) visitExpression(ctx.expression(), scope)).getValue());
		} else {
			concatenation = String.valueOf(((CalcValue) visitExpression(ctx.expression(), scope)).getValue()) + (String) visitConcatenation(ctx.concatenation(), scope);
		}
		return concatenation;
	}
	
	private String visitStringLiteral(String str){
		if(str == null){
			return "";
		}
		return StringParser.unescapeString(str,true);
	}

	@Override
	public Object visitArgument(ArgumentContext ctx, CalcScope scope) {
		setCurrentScope(scope);
		CalcValue value = new CalcValue();
		if (ctx.expression() instanceof CalcParser.ExpressionContext) {
			value.setType(int.class);
			value.setValue(visitExpression(ctx.expression(), scope));
		} else {
			value.setType(String.class);
			value.setValue(visitConcatenation(ctx.concatenation(), scope));
		}
		return value;
	}

	@Override
	public CalcScope getCurrentScope() {
		return this.currentScope;
	}
}
