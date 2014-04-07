package com.github.minlywang.dsl.calc;

// Generated from Calc.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Extended CalcParser from the generated
 * 
 * @author minlywang@foxmail.com
 * @since Apr 7, 2014
 * 
 */
@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class CalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__10 = 1, T__9 = 2, T__8 = 3, T__7 = 4, T__6 = 5, T__5 = 6, T__4 = 7, T__3 = 8, T__2 = 9, T__1 = 10, T__0 = 11, HexLiteral = 12, DecimalLiteral = 13, OctalLiteral = 14,
			ID = 15, DOT = 16, COLON = 17, EQ = 18, GT = 19, LT = 20, GE = 21, LE = 22, NE = 23, ADD = 24, SUB = 25, MUL = 26, DIV = 27, MOD = 28, ASSIGN = 29, COMMENT = 30, WS = 31,
			LINE_COMMENT = 32, EscapeSequence = 33;
	public static final String[] tokenNames = { "<INVALID>", "'do'", "'stop'", "')'", "','", "'while'", "'('", "'require'", "'if'", "'def'", "'\\'", "'\"'", "HexLiteral", "DecimalLiteral",
			"OctalLiteral", "ID", "'.'", "':'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "COMMENT", "WS", "LINE_COMMENT", "EscapeSequence" };
	public static final int RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_require = 2, RULE_expression = 3, RULE_concatenation = 4, RULE_expressionList = 5, RULE_argument = 6,
			RULE_relationalExprssion = 7, RULE_ifExpression = 8, RULE_whileExpression = 9, RULE_variableDeclaration = 10, RULE_variableAssign = 11, RULE_javaStaticMethods = 12, RULE_statement = 13,
			RULE_integerLiteral = 14, RULE_stringLiteral = 15, RULE_qualifiedName = 16;
	public static final String[] ruleNames = { "compilationUnit", "importDeclaration", "require", "expression", "concatenation", "expressionList", "argument", "relationalExprssion", "ifExpression",
			"whileExpression", "variableDeclaration", "variableAssign", "javaStaticMethods", "statement", "integerLiteral", "stringLiteral", "qualifiedName" };

	@Override
	public String getGrammarFileName() {
		return "Calc.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public TerminalNode EOF() {
			return getToken(CalcParser.EOF, 0);
		}

		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class, 0);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compilationUnit;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitCompilationUnit(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(34);
				importDeclaration();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 8) | (1L << 9) | (1L << ID))) != 0)) {
					{
						{
							setState(35);
							statement();
						}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> DOT() {
			return getTokens(CalcParser.DOT);
		}

		public List<RequireContext> require() {
			return getRuleContexts(RequireContext.class);
		}

		public RequireContext require(int i) {
			return getRuleContext(RequireContext.class, i);
		}

		public TerminalNode DOT(int i) {
			return getToken(CalcParser.DOT, i);
		}

		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_importDeclaration;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitImportDeclaration(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(43);
							require();
							setState(44);
							match(DOT);
						}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == 7);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequireContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(CalcParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(CalcParser.ID, i);
		}

		public RequireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_require;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitRequire(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final RequireContext require() throws RecognitionException {
		RequireContext _localctx = new RequireContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_require);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(50);
				match(7);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(51);
							match(ID);
						}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == ID);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(CalcParser.ID, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitExpression(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(63);
				switch (_input.LA(1)) {
				case HexLiteral:
				case DecimalLiteral:
				case OctalLiteral: {
					setState(57);
					integerLiteral();
				}
					break;
				case ID: {
					setState(58);
					match(ID);
				}
					break;
				case 6: {
					setState(59);
					match(6);
					setState(60);
					expression(0);
					setState(61);
					match(3);
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(71);
							switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
							case 1: {
								_localctx = new ExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(65);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this, "precpred(_ctx, 3)");
								setState(66);
								((ExpressionContext) _localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
									((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
								}
								consume();
								setState(67);
								expression(4);
							}
								break;

							case 2: {
								_localctx = new ExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(68);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this, "precpred(_ctx, 2)");
								setState(69);
								((ExpressionContext) _localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if (!(_la == ADD || _la == SUB)) {
									((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
								}
								consume();
								setState(70);
								expression(3);
							}
								break;
							}
						}
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConcatenationContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class, 0);
		}

		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_concatenation;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitConcatenation(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		return concatenation(0);
	}

	private ConcatenationContext concatenation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, _parentState);
		ConcatenationContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_concatenation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(82);
				switch (_input.LA(1)) {
				case 6:
				case HexLiteral:
				case DecimalLiteral:
				case OctalLiteral:
				case ID: {
					setState(77);
					expression(0);
					setState(78);
					match(ADD);
					setState(79);
					concatenation(1);
				}
					break;
				case 11: {
					setState(81);
					stringLiteral();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ConcatenationContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_concatenation);
								setState(84);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this, "precpred(_ctx, 2)");
								setState(85);
								match(ADD);
								setState(86);
								expression(0);
							}
						}
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}

		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class, i);
		}

		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionList;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitExpressionList(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(92);
				argument();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == 4) {
					{
						{
							setState(93);
							match(4);
							setState(94);
							argument();
						}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_argument;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitArgument(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argument);
		try {
			setState(102);
			switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(100);
					expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(101);
					concatenation(0);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExprssionContext extends ParserRuleContext {
		public Token op;

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public RelationalExprssionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relationalExprssion;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitRelationalExprssion(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final RelationalExprssionContext relationalExprssion() throws RecognitionException {
		RelationalExprssionContext _localctx = new RelationalExprssionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relationalExprssion);
		int _la;
		try {
			setState(112);
			switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(104);
					expression(0);
					setState(105);
					((RelationalExprssionContext) _localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0))) {
						((RelationalExprssionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
					}
					consume();
					setState(106);
					expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(108);
					expression(0);
					setState(109);
					((RelationalExprssionContext) _localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if (!(_la == EQ || _la == NE)) {
						((RelationalExprssionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
					}
					consume();
					setState(110);
					expression(0);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpressionContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public RelationalExprssionContext relationalExprssion() {
			return getRuleContext(RelationalExprssionContext.class, 0);
		}

		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifExpression;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitIfExpression(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(114);
				match(8);
				setState(115);
				relationalExprssion();
				setState(116);
				match(1);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 8) | (1L << 9) | (1L << ID))) != 0)) {
					{
						{
							setState(117);
							statement();
						}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(2);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileExpressionContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public RelationalExprssionContext relationalExprssion() {
			return getRuleContext(RelationalExprssionContext.class, 0);
		}

		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileExpression;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitWhileExpression(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(125);
				match(5);
				setState(126);
				relationalExprssion();
				setState(127);
				match(1);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 8) | (1L << 9) | (1L << ID))) != 0)) {
					{
						{
							setState(128);
							statement();
						}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(2);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(CalcParser.DOT, 0);
		}

		public TerminalNode ID() {
			return getToken(CalcParser.ID, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclaration;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitVariableDeclaration(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			setState(145);
			switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(136);
					match(9);
					setState(137);
					match(ID);
					setState(138);
					match(ASSIGN);
					setState(139);
					expression(0);
					setState(140);
					match(DOT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(142);
					match(9);
					setState(143);
					match(ID);
					setState(144);
					match(DOT);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignContext extends ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(CalcParser.DOT, 0);
		}

		public TerminalNode ID() {
			return getToken(CalcParser.ID, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public VariableAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableAssign;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitVariableAssign(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final VariableAssignContext variableAssign() throws RecognitionException {
		VariableAssignContext _localctx = new VariableAssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(147);
				match(ID);
				setState(148);
				match(ASSIGN);
				setState(149);
				expression(0);
				setState(150);
				match(DOT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JavaStaticMethodsContext extends ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(CalcParser.DOT, 0);
		}

		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public JavaStaticMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_javaStaticMethods;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitJavaStaticMethods(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final JavaStaticMethodsContext javaStaticMethods() throws RecognitionException {
		JavaStaticMethodsContext _localctx = new JavaStaticMethodsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_javaStaticMethods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(152);
				qualifiedName();
				setState(153);
				match(6);
				setState(155);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 11) | (1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral) | (1L << ID))) != 0)) {
					{
						setState(154);
						expressionList();
					}
				}

				setState(157);
				match(3);
				setState(158);
				match(DOT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class, 0);
		}

		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class, 0);
		}

		public JavaStaticMethodsContext javaStaticMethods() {
			return getRuleContext(JavaStaticMethodsContext.class, 0);
		}

		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class, 0);
		}

		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitStatement(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(165);
			switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(160);
					variableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(161);
					variableAssign();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(162);
					javaStaticMethods();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(163);
					ifExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(164);
					whileExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode OctalLiteral() {
			return getToken(CalcParser.OctalLiteral, 0);
		}

		public TerminalNode DecimalLiteral() {
			return getToken(CalcParser.DecimalLiteral, 0);
		}

		public TerminalNode HexLiteral() {
			return getToken(CalcParser.HexLiteral, 0);
		}

		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_integerLiteral;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitIntegerLiteral(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(167);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode EscapeSequence(int i) {
			return getToken(CalcParser.EscapeSequence, i);
		}

		public List<TerminalNode> EscapeSequence() {
			return getTokens(CalcParser.EscapeSequence);
		}

		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stringLiteral;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitStringLiteral(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(169);
				match(11);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << HexLiteral)
						| (1L << DecimalLiteral) | (1L << OctalLiteral) | (1L << ID) | (1L << DOT) | (1L << COLON) | (1L << EQ) | (1L << GT) | (1L << LT) | (1L << GE) | (1L << LE) | (1L << NE)
						| (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << ASSIGN) | (1L << COMMENT) | (1L << WS) | (1L << LINE_COMMENT) | (1L << EscapeSequence))) != 0)) {
					{
						setState(172);
						switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
						case 1: {
							setState(170);
							match(EscapeSequence);
						}
							break;

						case 2: {
							setState(171);
							_la = _input.LA(1);
							if (_la <= 0 || (_la == 10 || _la == 11)) {
								_errHandler.recoverInline(this);
							}
							consume();
						}
							break;
						}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(11);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(CalcParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(CalcParser.ID, i);
		}

		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_qualifiedName;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitQualifiedName(this, ((CalcVisitor<? extends T>) visitor).getCurrentScope());
			else
				return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(179);
				match(ID);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COLON) {
					{
						{
							setState(180);
							match(COLON);
							setState(181);
							match(ID);
						}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext) _localctx, predIndex);

		case 4:
			return concatenation_sempred((ConcatenationContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);

		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	private boolean concatenation_sempred(ConcatenationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00be\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\6\3\61\n\3\r\3\16"
			+ "\3\62\3\4\3\4\6\4\67\n\4\r\4\16\48\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n" + "\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\3\6\3\6"
			+ "\3\6\5\6U\n\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\3\7\7\7b\n\7" + "\f\7\16\7e\13\7\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ts"
			+ "\n\t\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\13\3\13\3\13\3" + "\13\7\13\u0084\n\13\f\13\16\13\u0087\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3"
			+ "\f\3\f\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5" + "\16\u009e\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00a8\n\17"
			+ "\3\20\3\20\3\21\3\21\3\21\7\21\u00af\n\21\f\21\16\21\u00b2\13\21\3\21" + "\3\21\3\22\3\22\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc\13\22\3\22\2\4\b"
			+ "\n\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\b\3\2\34\36\3\2\32\33" + "\3\2\25\30\4\2\24\24\31\31\3\2\16\20\3\2\f\r\u00c3\2$\3\2\2\2\4\60\3\2"
			+ "\2\2\6\64\3\2\2\2\bA\3\2\2\2\nT\3\2\2\2\f^\3\2\2\2\16h\3\2\2\2\20r\3\2" + "\2\2\22t\3\2\2\2\24\177\3\2\2\2\26\u0093\3\2\2\2\30\u0095\3\2\2\2\32\u009a"
			+ "\3\2\2\2\34\u00a7\3\2\2\2\36\u00a9\3\2\2\2 \u00ab\3\2\2\2\"\u00b5\3\2" + "\2\2$(\5\4\3\2%\'\5\34\17\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)"
			+ "+\3\2\2\2*(\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-.\5\6\4\2./\7\22\2\2/\61\3\2" + "\2\2\60-\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2"
			+ "\2\64\66\7\t\2\2\65\67\7\21\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\2" + "89\3\2\2\29\7\3\2\2\2:;\b\5\1\2;B\5\36\20\2<B\7\21\2\2=>\7\b\2\2>?\5\b"
			+ "\5\2?@\7\5\2\2@B\3\2\2\2A:\3\2\2\2A<\3\2\2\2A=\3\2\2\2BK\3\2\2\2CD\f\5" + "\2\2DE\t\2\2\2EJ\5\b\5\6FG\f\4\2\2GH\t\3\2\2HJ\5\b\5\5IC\3\2\2\2IF\3\2"
			+ "\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NO\b\6\1\2OP\5" + "\b\5\2PQ\7\32\2\2QR\5\n\6\3RU\3\2\2\2SU\5 \21\2TN\3\2\2\2TS\3\2\2\2U["
			+ "\3\2\2\2VW\f\4\2\2WX\7\32\2\2XZ\5\b\5\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2" + "[\\\3\2\2\2\\\13\3\2\2\2][\3\2\2\2^c\5\16\b\2_`\7\6\2\2`b\5\16\b\2a_\3"
			+ "\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\r\3\2\2\2ec\3\2\2\2fi\5\b\5\2gi" + "\5\n\6\2hf\3\2\2\2hg\3\2\2\2i\17\3\2\2\2jk\5\b\5\2kl\t\4\2\2lm\5\b\5\2"
			+ "ms\3\2\2\2no\5\b\5\2op\t\5\2\2pq\5\b\5\2qs\3\2\2\2rj\3\2\2\2rn\3\2\2\2" + "s\21\3\2\2\2tu\7\n\2\2uv\5\20\t\2vz\7\3\2\2wy\5\34\17\2xw\3\2\2\2y|\3"
			+ "\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\4\2\2~\23\3\2\2\2\177" + "\u0080\7\7\2\2\u0080\u0081\5\20\t\2\u0081\u0085\7\3\2\2\u0082\u0084\5"
			+ "\34\17\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085" + "\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\4"
			+ "\2\2\u0089\25\3\2\2\2\u008a\u008b\7\13\2\2\u008b\u008c\7\21\2\2\u008c" + "\u008d\7\37\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7\22\2\2\u008f\u0094\3"
			+ "\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7\21\2\2\u0092\u0094\7\22\2\2" + "\u0093\u008a\3\2\2\2\u0093\u0090\3\2\2\2\u0094\27\3\2\2\2\u0095\u0096"
			+ "\7\21\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5\b\5\2\u0098\u0099\7\22\2" + "\2\u0099\31\3\2\2\2\u009a\u009b\5\"\22\2\u009b\u009d\7\b\2\2\u009c\u009e"
			+ "\5\f\7\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f" + "\u00a0\7\5\2\2\u00a0\u00a1\7\22\2\2\u00a1\33\3\2\2\2\u00a2\u00a8\5\26"
			+ "\f\2\u00a3\u00a8\5\30\r\2\u00a4\u00a8\5\32\16\2\u00a5\u00a8\5\22\n\2\u00a6" + "\u00a8\5\24\13\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3"
			+ "\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\35\3\2\2\2\u00a9" + "\u00aa\t\6\2\2\u00aa\37\3\2\2\2\u00ab\u00b0\7\r\2\2\u00ac\u00af\7#\2\2"
			+ "\u00ad\u00af\n\7\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2" + "\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"
			+ "\u00b0\3\2\2\2\u00b3\u00b4\7\r\2\2\u00b4!\3\2\2\2\u00b5\u00ba\7\21\2\2" + "\u00b6\u00b7\7\23\2\2\u00b7\u00b9\7\21\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc"
			+ "\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb#\3\2\2\2\u00bc" + "\u00ba\3\2\2\2\25(\628AIKT[chrz\u0085\u0093\u009d\u00a7\u00ae\u00b0\u00ba";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}