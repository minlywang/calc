package com.github.minlywang.dsl.calc;

// Generated from Calc.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		HexLiteral=10, DecimalLiteral=11, OctalLiteral=12, STRING_LITERAL=13, 
		ID=14, DOT=15, COLON=16, EQ=17, GT=18, LT=19, GE=20, LE=21, NE=22, ADD=23, 
		SUB=24, MUL=25, DIV=26, MOD=27, ASSIGN=28, COMMENT=29, WS=30, LINE_COMMENT=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'do'", "'stop'", "')'", "','", "'while'", "'('", "'require'", "'if'", 
		"'def'", "HexLiteral", "DecimalLiteral", "OctalLiteral", "STRING_LITERAL", 
		"ID", "'.'", "':'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'='", "COMMENT", "WS", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"HexLiteral", "DecimalLiteral", "OctalLiteral", "STRING_LITERAL", "EscapeSequence", 
		"OctalEscape", "UnicodeEscape", "HexDigit", "IntegerTypeSuffix", "Exponent", 
		"ID", "Letter", "JavaIDDigit", "DOT", "COLON", "EQ", "GT", "LT", "GE", 
		"LE", "NE", "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", "COMMENT", "WS", 
		"LINE_COMMENT"
	};


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13"+
		"x\n\13\r\13\16\13y\3\13\5\13}\n\13\3\f\3\f\3\f\7\f\u0082\n\f\f\f\16\f"+
		"\u0085\13\f\5\f\u0087\n\f\3\f\5\f\u008a\n\f\3\r\3\r\6\r\u008e\n\r\r\r"+
		"\16\r\u008f\3\r\5\r\u0093\n\r\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16"+
		"\u009b\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ae\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00bd\n\24\3\24\6\24"+
		"\u00c0\n\24\r\24\16\24\u00c1\3\25\3\25\3\25\7\25\u00c7\n\25\f\25\16\25"+
		"\u00ca\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\7&\u00f4\n&\f&\16&\u00f7"+
		"\13&\3&\3&\3&\3&\3&\3\'\6\'\u00ff\n\'\r\'\16\'\u0100\3\'\3\'\3(\3(\3("+
		"\3(\7(\u0109\n(\f(\16(\u010c\13(\3(\5(\u010f\n(\3(\3(\3(\3(\3\u00f5\2"+
		")\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2"+
		"\37\2!\2#\2%\2\'\2)\20+\2-\2/\21\61\22\63\23\65\24\67\259\26;\27=\30?"+
		"\31A\32C\33E\34G\35I\36K\37M O!\3\2\r\4\2ZZzz\5\2\f\f\17\17\u202a\u202b"+
		"\n\2$$))^^ddhhppttvv\5\2\62;CHch\4\2NNnn\4\2GGgg\4\2--//\16\2&&C\\aac"+
		"|\u00c2\u00d8\u00da\u00f8\u00fa\u2001\u3042\u3191\u3302\u3381\u3402\u3d2f"+
		"\u4e02\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971"+
		"\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71"+
		"\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\5\2\13\f"+
		"\16\17\"\"\4\2\f\f\17\17\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2)\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5T\3\2"+
		"\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21m\3\2"+
		"\2\2\23p\3\2\2\2\25t\3\2\2\2\27\u0086\3\2\2\2\31\u008b\3\2\2\2\33\u0094"+
		"\3\2\2\2\35\u00a2\3\2\2\2\37\u00ad\3\2\2\2!\u00af\3\2\2\2#\u00b6\3\2\2"+
		"\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00c3\3\2\2\2+\u00cb\3\2\2\2-\u00cd"+
		"\3\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2\2\65\u00d6\3\2"+
		"\2\2\67\u00d8\3\2\2\29\u00da\3\2\2\2;\u00dd\3\2\2\2=\u00e0\3\2\2\2?\u00e3"+
		"\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00e9\3\2\2\2G\u00eb\3\2\2\2I"+
		"\u00ed\3\2\2\2K\u00ef\3\2\2\2M\u00fe\3\2\2\2O\u0104\3\2\2\2QR\7f\2\2R"+
		"S\7q\2\2S\4\3\2\2\2TU\7u\2\2UV\7v\2\2VW\7q\2\2WX\7r\2\2X\6\3\2\2\2YZ\7"+
		"+\2\2Z\b\3\2\2\2[\\\7.\2\2\\\n\3\2\2\2]^\7y\2\2^_\7j\2\2_`\7k\2\2`a\7"+
		"n\2\2ab\7g\2\2b\f\3\2\2\2cd\7*\2\2d\16\3\2\2\2ef\7t\2\2fg\7g\2\2gh\7s"+
		"\2\2hi\7w\2\2ij\7k\2\2jk\7t\2\2kl\7g\2\2l\20\3\2\2\2mn\7k\2\2no\7h\2\2"+
		"o\22\3\2\2\2pq\7f\2\2qr\7g\2\2rs\7h\2\2s\24\3\2\2\2tu\7\62\2\2uw\t\2\2"+
		"\2vx\5#\22\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\5%\23"+
		"\2|{\3\2\2\2|}\3\2\2\2}\26\3\2\2\2~\u0087\7\62\2\2\177\u0083\4\63;\2\u0080"+
		"\u0082\4\62;\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"~\3\2\2\2\u0086\177\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\5%\23\2\u0089"+
		"\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\30\3\2\2\2\u008b\u008d\7\62\2"+
		"\2\u008c\u008e\4\629\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5%\23\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\32\3\2\2\2\u0094\u0099\7$\2\2"+
		"\u0095\u0098\5\35\17\2\u0096\u0098\n\3\2\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7$\2\2\u009d\34\3\2\2\2"+
		"\u009e\u009f\7^\2\2\u009f\u00a3\t\4\2\2\u00a0\u00a3\5!\21\2\u00a1\u00a3"+
		"\5\37\20\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\36\3\2\2\2\u00a4\u00a5\7^\2\2\u00a5\u00a6\4\62\65\2\u00a6\u00a7"+
		"\4\629\2\u00a7\u00ae\4\629\2\u00a8\u00a9\7^\2\2\u00a9\u00aa\4\629\2\u00aa"+
		"\u00ae\4\629\2\u00ab\u00ac\7^\2\2\u00ac\u00ae\4\629\2\u00ad\u00a4\3\2"+
		"\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae \3\2\2\2\u00af\u00b0"+
		"\7^\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\5#\22\2\u00b2\u00b3\5#\22\2\u00b3"+
		"\u00b4\5#\22\2\u00b4\u00b5\5#\22\2\u00b5\"\3\2\2\2\u00b6\u00b7\t\5\2\2"+
		"\u00b7$\3\2\2\2\u00b8\u00b9\t\6\2\2\u00b9&\3\2\2\2\u00ba\u00bc\t\7\2\2"+
		"\u00bb\u00bd\t\b\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00c0\4\62;\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2(\3\2\2\2\u00c3\u00c8\5+\26\2"+
		"\u00c4\u00c7\5+\26\2\u00c5\u00c7\5-\27\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"*\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\t\t\2\2\u00cc,\3\2\2\2\u00cd"+
		"\u00ce\t\n\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0\60\3\2\2\2\u00d1"+
		"\u00d2\7<\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7?\2\2\u00d5"+
		"\64\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9"+
		"8\3\2\2\2\u00da\u00db\7@\2\2\u00db\u00dc\7?\2\2\u00dc:\3\2\2\2\u00dd\u00de"+
		"\7>\2\2\u00de\u00df\7?\2\2\u00df<\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2"+
		"\7?\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7"+
		"/\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7\61"+
		"\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7\'\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7?"+
		"\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f5"+
		"\3\2\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b&\2\2\u00fcL\3\2\2\2\u00fd\u00ff\t\13\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\b\'\2\2\u0103N\3\2\2\2\u0104\u0105\7\61\2\2\u0105"+
		"\u0106\7\61\2\2\u0106\u010a\3\2\2\2\u0107\u0109\n\f\2\2\u0108\u0107\3"+
		"\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\7\17\2\2\u010e\u010d\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\f\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\b(\2\2\u0113P\3\2\2\2\26\2y|\u0083\u0086\u0089"+
		"\u008f\u0092\u0097\u0099\u00a2\u00ad\u00bc\u00c1\u00c6\u00c8\u00f5\u0100"+
		"\u010a\u010e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}