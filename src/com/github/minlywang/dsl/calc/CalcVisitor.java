package com.github.minlywang.dsl.calc;

// Generated from Calc.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import com.github.minlywang.dsl.calc.core.CalcScope;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 * 
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 *  
 * @author minlywang@foxmail.com
 * @since Apr 5, 2014
 * 
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#expression}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CalcParser.ExpressionContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#argument}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitArgument(@NotNull CalcParser.ArgumentContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#compilationUnit}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull CalcParser.CompilationUnitContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#expressionList}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull CalcParser.ExpressionListContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#ifExpression}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitIfExpression(@NotNull CalcParser.IfExpressionContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#qualifiedName}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull CalcParser.QualifiedNameContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#javaStaticMethods}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitJavaStaticMethods(@NotNull CalcParser.JavaStaticMethodsContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#integerLiteral}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull CalcParser.IntegerLiteralContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#statement}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitStatement(@NotNull CalcParser.StatementContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#variableDeclaration}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull CalcParser.VariableDeclarationContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#variableAssign}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitVariableAssign(@NotNull CalcParser.VariableAssignContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#require}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitRequire(@NotNull CalcParser.RequireContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#relationalExprssion}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitRelationalExprssion(@NotNull CalcParser.RelationalExprssionContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#whileExpression}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitWhileExpression(@NotNull CalcParser.WhileExpressionContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#importDeclaration}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull CalcParser.ImportDeclarationContext ctx, CalcScope scope);

	/**
	 * Visit a parse tree produced by {@link CalcParser#concatenation}.
	 * 
	 * @param ctx the parse tree
	 * @param scope scope
	 * @return the visitor result
	 */
	T visitConcatenation(@NotNull CalcParser.ConcatenationContext ctx, CalcScope scope);

	CalcScope getCurrentScope();
}