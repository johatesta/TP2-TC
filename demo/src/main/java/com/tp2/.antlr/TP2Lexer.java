// Generated from c:\Users\USUARIO\Documents\TP2\demo\src\main\java\com\tp2\TP2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TP2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, PA=3, PC=4, CA=5, CC=6, LA=7, LC=8, MAS=9, MENOS=10, 
		ASTERISCO=11, DIVISION=12, MODULO=13, MASMAS=14, MENOSMENOS=15, MASIGUAL=16, 
		MENOSIGUAL=17, PORIGUAL=18, BARRAIGUAL=19, MODULOIGUAL=20, IGUAL=21, AND=22, 
		OR=23, NOT=24, TRUE=25, FALSE=26, MAYOR=27, MENOR=28, IGUALIGUAL=29, DISTINTOIGUAL=30, 
		MAYORIGUAL=31, MENORIGUAL=32, INT=33, CHAR=34, DOUBLE=35, VOID=36, IF=37, 
		FOR=38, WHILE=39, COMILLAS=40, PUNTO=41, COMA=42, PUNTOYCOMA=43, RETURN=44, 
		THEN=45, ELSE=46, ID=47, NUMINT=48, CARACTER=49, VALORCHAR=50, NUMDOUBLE=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "PA", "PC", "CA", "CC", "LA", "LC", "MAS", "MENOS", 
			"ASTERISCO", "DIVISION", "MODULO", "MASMAS", "MENOSMENOS", "MASIGUAL", 
			"MENOSIGUAL", "PORIGUAL", "BARRAIGUAL", "MODULOIGUAL", "IGUAL", "AND", 
			"OR", "NOT", "TRUE", "FALSE", "MAYOR", "MENOR", "IGUALIGUAL", "DISTINTOIGUAL", 
			"MAYORIGUAL", "MENORIGUAL", "INT", "CHAR", "DOUBLE", "VOID", "IF", "FOR", 
			"WHILE", "COMILLAS", "PUNTO", "COMA", "PUNTOYCOMA", "RETURN", "THEN", 
			"ELSE", "ID", "NUMINT", "CARACTER", "VALORCHAR", "NUMDOUBLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'='", "'&&'", "'||'", "'!'", "'true'", "'false'", "'>'", "'<'", 
			"'=='", "'!='", "'>='", "'<='", "'int'", "'char'", "'double'", "'void'", 
			"'if'", "'for'", "'while'", "'\"'", "'.'", "','", "';'", "'return'", 
			"'then'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "PA", "PC", "CA", "CC", "LA", "LC", "MAS", "MENOS", 
			"ASTERISCO", "DIVISION", "MODULO", "MASMAS", "MENOSMENOS", "MASIGUAL", 
			"MENOSIGUAL", "PORIGUAL", "BARRAIGUAL", "MODULOIGUAL", "IGUAL", "AND", 
			"OR", "NOT", "TRUE", "FALSE", "MAYOR", "MENOR", "IGUALIGUAL", "DISTINTOIGUAL", 
			"MAYORIGUAL", "MENORIGUAL", "INT", "CHAR", "DOUBLE", "VOID", "IF", "FOR", 
			"WHILE", "COMILLAS", "PUNTO", "COMA", "PUNTOYCOMA", "RETURN", "THEN", 
			"ELSE", "ID", "NUMINT", "CARACTER", "VALORCHAR", "NUMDOUBLE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TP2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TP2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u011e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3r\n\3\r\3\16\3s\3\3\5\3w\n\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3\60\3\60\7\60\u0108\n\60\f\60\16\60\u010b\13\60\3\61\6\61\u010e"+
		"\n\61\r\61\16\61\u010f\3\62\3\62\3\63\3\63\3\63\3\63\3\64\5\64\u0119\n"+
		"\64\3\64\3\64\3\64\3\64\3s\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65\3\2\b\5\2\13\f\17\17\"\"\3\3\f\f\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\4\2--//\2\u0121\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\3i\3\2\2\2\5m\3\2\2\2\7z\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2\r\u0080\3\2\2"+
		"\2\17\u0082\3\2\2\2\21\u0084\3\2\2\2\23\u0086\3\2\2\2\25\u0088\3\2\2\2"+
		"\27\u008a\3\2\2\2\31\u008c\3\2\2\2\33\u008e\3\2\2\2\35\u0090\3\2\2\2\37"+
		"\u0093\3\2\2\2!\u0096\3\2\2\2#\u0099\3\2\2\2%\u009c\3\2\2\2\'\u009f\3"+
		"\2\2\2)\u00a2\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00aa\3\2\2\2\61"+
		"\u00ad\3\2\2\2\63\u00af\3\2\2\2\65\u00b4\3\2\2\2\67\u00ba\3\2\2\29\u00bc"+
		"\3\2\2\2;\u00be\3\2\2\2=\u00c1\3\2\2\2?\u00c4\3\2\2\2A\u00c7\3\2\2\2C"+
		"\u00ca\3\2\2\2E\u00ce\3\2\2\2G\u00d3\3\2\2\2I\u00da\3\2\2\2K\u00df\3\2"+
		"\2\2M\u00e2\3\2\2\2O\u00e6\3\2\2\2Q\u00ec\3\2\2\2S\u00ee\3\2\2\2U\u00f0"+
		"\3\2\2\2W\u00f2\3\2\2\2Y\u00f4\3\2\2\2[\u00fb\3\2\2\2]\u0100\3\2\2\2_"+
		"\u0105\3\2\2\2a\u010d\3\2\2\2c\u0111\3\2\2\2e\u0113\3\2\2\2g\u0118\3\2"+
		"\2\2ij\t\2\2\2jk\3\2\2\2kl\b\2\2\2l\4\3\2\2\2mn\7\61\2\2no\7\61\2\2oq"+
		"\3\2\2\2pr\13\2\2\2qp\3\2\2\2rs\3\2\2\2st\3\2\2\2sq\3\2\2\2tv\3\2\2\2"+
		"uw\t\3\2\2vu\3\2\2\2wx\3\2\2\2xy\b\3\2\2y\6\3\2\2\2z{\7*\2\2{\b\3\2\2"+
		"\2|}\7+\2\2}\n\3\2\2\2~\177\7]\2\2\177\f\3\2\2\2\u0080\u0081\7_\2\2\u0081"+
		"\16\3\2\2\2\u0082\u0083\7}\2\2\u0083\20\3\2\2\2\u0084\u0085\7\177\2\2"+
		"\u0085\22\3\2\2\2\u0086\u0087\7-\2\2\u0087\24\3\2\2\2\u0088\u0089\7/\2"+
		"\2\u0089\26\3\2\2\2\u008a\u008b\7,\2\2\u008b\30\3\2\2\2\u008c\u008d\7"+
		"\61\2\2\u008d\32\3\2\2\2\u008e\u008f\7\'\2\2\u008f\34\3\2\2\2\u0090\u0091"+
		"\7-\2\2\u0091\u0092\7-\2\2\u0092\36\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095"+
		"\7/\2\2\u0095 \3\2\2\2\u0096\u0097\7-\2\2\u0097\u0098\7?\2\2\u0098\"\3"+
		"\2\2\2\u0099\u009a\7/\2\2\u009a\u009b\7?\2\2\u009b$\3\2\2\2\u009c\u009d"+
		"\7,\2\2\u009d\u009e\7?\2\2\u009e&\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7\'\2\2\u00a3\u00a4\7?\2\2\u00a4*\3"+
		"\2\2\2\u00a5\u00a6\7?\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8\u00a9"+
		"\7(\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7~\2\2\u00ab\u00ac\7~\2\2\u00ac\60"+
		"\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7g\2\2\u00b3\64\3\2\2\2\u00b4"+
		"\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb8\3\2\2\2"+
		"\u00bc\u00bd\7>\2\2\u00bd:\3\2\2\2\u00be\u00bf\7?\2\2\u00bf\u00c0\7?\2"+
		"\2\u00c0<\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c3\7?\2\2\u00c3>\3\2\2\2"+
		"\u00c4\u00c5\7@\2\2\u00c5\u00c6\7?\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7>\2"+
		"\2\u00c8\u00c9\7?\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7"+
		"p\2\2\u00cc\u00cd\7v\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0"+
		"\7j\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7t\2\2\u00d2F\3\2\2\2\u00d3\u00d4"+
		"\7f\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7d\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9H\3\2\2\2\u00da\u00db\7x\2\2\u00db"+
		"\u00dc\7q\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7f\2\2\u00deJ\3\2\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7h\2\2\u00e1L\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3"+
		"\u00e4\7q\2\2\u00e4\u00e5\7t\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7y\2\2\u00e7"+
		"\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7g\2\2"+
		"\u00ebP\3\2\2\2\u00ec\u00ed\7$\2\2\u00edR\3\2\2\2\u00ee\u00ef\7\60\2\2"+
		"\u00efT\3\2\2\2\u00f0\u00f1\7.\2\2\u00f1V\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3"+
		"X\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"\u00f8\7w\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7p\2\2\u00faZ\3\2\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\u00fd\7j\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7p\2\2"+
		"\u00ff\\\3\2\2\2\u0100\u0101\7g\2\2\u0101\u0102\7n\2\2\u0102\u0103\7u"+
		"\2\2\u0103\u0104\7g\2\2\u0104^\3\2\2\2\u0105\u0109\t\4\2\2\u0106\u0108"+
		"\t\5\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a`\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\t\6\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110b\3\2\2\2\u0111\u0112\4\2\0\2\u0112d\3\2\2\2\u0113\u0114"+
		"\7)\2\2\u0114\u0115\5c\62\2\u0115\u0116\7)\2\2\u0116f\3\2\2\2\u0117\u0119"+
		"\t\7\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\5a\61\2\u011b\u011c\7\60\2\2\u011c\u011d\5a\61\2\u011dh\3\2\2\2"+
		"\b\2sv\u0109\u010f\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}