package madgik.mySpark.parser.antlr4;

// Generated from ExternalSqlBase.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExternalSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SELECT=10, FROM=11, ADD=12, AS=13, ALL=14, DISTINCT=15, WHERE=16, GROUP=17, 
		BY=18, GROUPING=19, SETS=20, CUBE=21, ROLLUP=22, ORDER=23, HAVING=24, 
		LIMIT=25, AT=26, OR=27, AND=28, IN=29, NOT=30, NO=31, EXISTS=32, BETWEEN=33, 
		LIKE=34, RLIKE=35, IS=36, NULL=37, TRUE=38, FALSE=39, NULLS=40, ASC=41, 
		DESC=42, FOR=43, INTERVAL=44, CASE=45, WHEN=46, THEN=47, ELSE=48, END=49, 
		JOIN=50, CROSS=51, OUTER=52, INNER=53, LEFT=54, SEMI=55, RIGHT=56, FULL=57, 
		NATURAL=58, ON=59, LATERAL=60, WINDOW=61, OVER=62, PARTITION=63, RANGE=64, 
		ROWS=65, UNBOUNDED=66, PRECEDING=67, FOLLOWING=68, CURRENT=69, FIRST=70, 
		AFTER=71, LAST=72, ROW=73, WITH=74, VALUES=75, CREATE=76, TABLE=77, VIEW=78, 
		REPLACE=79, INSERT=80, DELETE=81, INTO=82, DESCRIBE=83, EXPLAIN=84, FORMAT=85, 
		LOGICAL=86, CODEGEN=87, COST=88, CAST=89, SHOW=90, TABLES=91, COLUMNS=92, 
		COLUMN=93, USE=94, PARTITIONS=95, FUNCTIONS=96, DROP=97, UNION=98, EXCEPT=99, 
		SETMINUS=100, INTERSECT=101, TO=102, TABLESAMPLE=103, STRATIFY=104, ALTER=105, 
		RENAME=106, ARRAY=107, MAP=108, STRUCT=109, COMMENT=110, SET=111, RESET=112, 
		DATA=113, START=114, TRANSACTION=115, COMMIT=116, ROLLBACK=117, MACRO=118, 
		IGNORE=119, IF=120, EQ=121, NSEQ=122, NEQ=123, NEQJ=124, LT=125, LTE=126, 
		GT=127, GTE=128, PLUS=129, MINUS=130, ASTERISK=131, SLASH=132, PERCENT=133, 
		DIV=134, TILDE=135, AMPERSAND=136, PIPE=137, HAT=138, PERCENTLIT=139, 
		BUCKET=140, OUT=141, OF=142, SORT=143, CLUSTER=144, DISTRIBUTE=145, OVERWRITE=146, 
		TRANSFORM=147, REDUCE=148, USING=149, SERDE=150, SERDEPROPERTIES=151, 
		RECORDREADER=152, RECORDWRITER=153, DELIMITED=154, FIELDS=155, TERMINATED=156, 
		COLLECTION=157, ITEMS=158, KEYS=159, ESCAPED=160, LINES=161, SEPARATED=162, 
		FUNCTION=163, EXTENDED=164, REFRESH=165, CLEAR=166, CACHE=167, UNCACHE=168, 
		LAZY=169, FORMATTED=170, GLOBAL=171, TEMPORARY=172, OPTIONS=173, UNSET=174, 
		TBLPROPERTIES=175, DBPROPERTIES=176, BUCKETS=177, SKEWED=178, STORED=179, 
		DIRECTORIES=180, LOCATION=181, EXCHANGE=182, ARCHIVE=183, UNARCHIVE=184, 
		FILEFORMAT=185, TOUCH=186, COMPACT=187, CONCATENATE=188, CHANGE=189, CASCADE=190, 
		RESTRICT=191, CLUSTERED=192, SORTED=193, PURGE=194, INPUTFORMAT=195, OUTPUTFORMAT=196, 
		DATABASE=197, DATABASES=198, DFS=199, TRUNCATE=200, ANALYZE=201, COMPUTE=202, 
		LIST=203, STATISTICS=204, PARTITIONED=205, EXTERNAL=206, DEFINED=207, 
		REVOKE=208, GRANT=209, LOCK=210, UNLOCK=211, MSCK=212, REPAIR=213, RECOVER=214, 
		EXPORT=215, IMPORT=216, LOAD=217, ROLE=218, ROLES=219, COMPACTIONS=220, 
		PRINCIPALS=221, TRANSACTIONS=222, INDEX=223, INDEXES=224, LOCKS=225, OPTION=226, 
		ANTI=227, LOCAL=228, INPATH=229, CURRENT_DATE=230, CURRENT_TIMESTAMP=231, 
		STRING=232, BIGINT_LITERAL=233, SMALLINT_LITERAL=234, TINYINT_LITERAL=235, 
		BYTELENGTH_LITERAL=236, INTEGER_VALUE=237, DECIMAL_VALUE=238, DOUBLE_LITERAL=239, 
		BIGDECIMAL_LITERAL=240, IDENTIFIER=241, BACKQUOTED_IDENTIFIER=242, SIMPLE_COMMENT=243, 
		BRACKETED_EMPTY_COMMENT=244, BRACKETED_COMMENT=245, WS=246, UNRECOGNIZED=247, 
		DELIMITER=248;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_statement = 5, 
		RULE_unsupportedHiveNativeCommands = 6, RULE_createTableHeader = 7, RULE_bucketSpec = 8, 
		RULE_skewSpec = 9, RULE_locationSpec = 10, RULE_query = 11, RULE_insertInto = 12, 
		RULE_partitionSpecLocation = 13, RULE_partitionSpec = 14, RULE_partitionVal = 15, 
		RULE_describeFuncName = 16, RULE_describeColName = 17, RULE_ctes = 18, 
		RULE_namedQuery = 19, RULE_tableProvider = 20, RULE_tablePropertyList = 21, 
		RULE_tableProperty = 22, RULE_tablePropertyKey = 23, RULE_tablePropertyValue = 24, 
		RULE_constantList = 25, RULE_nestedConstantList = 26, RULE_createFileFormat = 27, 
		RULE_fileFormat = 28, RULE_storageHandler = 29, RULE_resource = 30, RULE_queryNoWith = 31, 
		RULE_queryOrganization = 32, RULE_multiInsertQueryBody = 33, RULE_queryTerm = 34, 
		RULE_queryPrimary = 35, RULE_sortItem = 36, RULE_querySpecification = 37, 
		RULE_hint = 38, RULE_hintStatement = 39, RULE_fromClause = 40, RULE_aggregation = 41, 
		RULE_groupingSet = 42, RULE_lateralView = 43, RULE_setQuantifier = 44, 
		RULE_relation = 45, RULE_joinRelation = 46, RULE_joinType = 47, RULE_joinCriteria = 48, 
		RULE_sample = 49, RULE_identifierList = 50, RULE_identifierSeq = 51, RULE_orderedIdentifierList = 52, 
		RULE_orderedIdentifier = 53, RULE_identifierCommentList = 54, RULE_identifierComment = 55, 
		RULE_relationPrimary = 56, RULE_inlineTable = 57, RULE_rowFormat = 58, 
		RULE_tableIdentifier = 59, RULE_functionIdentifier = 60, RULE_namedExpression = 61, 
		RULE_namedExpressionSeq = 62, RULE_expression = 63, RULE_booleanExpression = 64, 
		RULE_predicated = 65, RULE_predicate = 66, RULE_valueExpression = 67, 
		RULE_primaryExpression = 68, RULE_constant = 69, RULE_comparisonOperator = 70, 
		RULE_arithmeticOperator = 71, RULE_predicateOperator = 72, RULE_booleanValue = 73, 
		RULE_interval = 74, RULE_intervalField = 75, RULE_intervalValue = 76, 
		RULE_colPosition = 77, RULE_dataType = 78, RULE_colTypeList = 79, RULE_colType = 80, 
		RULE_complexColTypeList = 81, RULE_complexColType = 82, RULE_whenClause = 83, 
		RULE_windows = 84, RULE_namedWindow = 85, RULE_windowSpec = 86, RULE_windowFrame = 87, 
		RULE_frameBound = 88, RULE_qualifiedName = 89, RULE_identifier = 90, RULE_strictIdentifier = 91, 
		RULE_quotedIdentifier = 92, RULE_number = 93, RULE_nonReserved = 94;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
		"singleDataType", "statement", "unsupportedHiveNativeCommands", "createTableHeader", 
		"bucketSpec", "skewSpec", "locationSpec", "query", "insertInto", "partitionSpecLocation", 
		"partitionSpec", "partitionVal", "describeFuncName", "describeColName", 
		"ctes", "namedQuery", "tableProvider", "tablePropertyList", "tableProperty", 
		"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
		"createFileFormat", "fileFormat", "storageHandler", "resource", "queryNoWith", 
		"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "hint", "hintStatement", "fromClause", 
		"aggregation", "groupingSet", "lateralView", "setQuantifier", "relation", 
		"joinRelation", "joinType", "joinCriteria", "sample", "identifierList", 
		"identifierSeq", "orderedIdentifierList", "orderedIdentifier", "identifierCommentList", 
		"identifierComment", "relationPrimary", "inlineTable", "rowFormat", "tableIdentifier", 
		"functionIdentifier", "namedExpression", "namedExpressionSeq", "expression", 
		"booleanExpression", "predicated", "predicate", "valueExpression", "primaryExpression", 
		"constant", "comparisonOperator", "arithmeticOperator", "predicateOperator", 
		"booleanValue", "interval", "intervalField", "intervalValue", "colPosition", 
		"dataType", "colTypeList", "colType", "complexColTypeList", "complexColType", 
		"whenClause", "windows", "namedWindow", "windowSpec", "windowFrame", "frameBound", 
		"qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier", 
		"number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'['", "']'", "':'", 
		"'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", 
		"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
		"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
		"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", 
		"'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", 
		"'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", 
		"'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", "'LATERAL'", 
		"'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", "'UNBOUNDED'", 
		"'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", "'AFTER'", "'LAST'", 
		"'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", "'REPLACE'", 
		"'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", 
		"'LOGICAL'", "'CODEGEN'", "'COST'", "'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", 
		"'COLUMN'", "'USE'", "'PARTITIONS'", "'FUNCTIONS'", "'DROP'", "'UNION'", 
		"'EXCEPT'", "'MINUS'", "'INTERSECT'", "'TO'", "'TABLESAMPLE'", "'STRATIFY'", 
		"'ALTER'", "'RENAME'", "'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", 
		"'RESET'", "'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", 
		"'MACRO'", "'IGNORE'", "'IF'", null, "'<=>'", "'<>'", "'!='", "'<'", null, 
		"'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", 
		"'|'", "'^'", "'PERCENT'", "'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'CLUSTER'", 
		"'DISTRIBUTE'", "'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", 
		"'SERDEPROPERTIES'", "'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", 
		"'FIELDS'", "'TERMINATED'", "'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", 
		"'LINES'", "'SEPARATED'", "'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", 
		"'CACHE'", "'UNCACHE'", "'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", 
		"'UNSET'", "'TBLPROPERTIES'", "'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", 
		"'STORED'", "'DIRECTORIES'", "'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", 
		"'UNARCHIVE'", "'FILEFORMAT'", "'TOUCH'", "'COMPACT'", "'CONCATENATE'", 
		"'CHANGE'", "'CASCADE'", "'RESTRICT'", "'CLUSTERED'", "'SORTED'", "'PURGE'", 
		"'INPUTFORMAT'", "'OUTPUTFORMAT'", null, null, "'DFS'", "'TRUNCATE'", 
		"'ANALYZE'", "'COMPUTE'", "'LIST'", "'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", 
		"'DEFINED'", "'REVOKE'", "'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", 
		"'RECOVER'", "'EXPORT'", "'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", 
		"'PRINCIPALS'", "'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", 
		"'ANTI'", "'LOCAL'", "'INPATH'", "'CURRENT_DATE'", "'CURRENT_TIMESTAMP'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "SELECT", 
		"FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", 
		"SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", 
		"IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", 
		"TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", 
		"THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", 
		"RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", "PARTITION", 
		"RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "FIRST", 
		"AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", "TABLE", "VIEW", "REPLACE", 
		"INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", 
		"CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", 
		"PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", 
		"TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", 
		"COMMENT", "SET", "RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", 
		"MACRO", "IGNORE", "IF", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", 
		"GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", 
		"AMPERSAND", "PIPE", "HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", 
		"CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", "REDUCE", "USING", 
		"SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", "DELIMITED", 
		"FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", 
		"SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", 
		"LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", 
		"DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", 
		"EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", 
		"CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", 
		"PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", 
		"TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
		"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
		"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
		"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", 
		"LOCAL", "INPATH", "CURRENT_DATE", "CURRENT_TIMESTAMP", "STRING", "BIGINT_LITERAL", 
		"SMALLINT_LITERAL", "TINYINT_LITERAL", "BYTELENGTH_LITERAL", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
	};
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

	@Override
	public String getGrammarFileName() { return "ExternalSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public ExternalSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExternalSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			statement();
			setState(191);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExternalSqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSingleExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			namedExpression();
			setState(194);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExternalSqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			tableIdentifier();
			setState(197);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExternalSqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			functionIdentifier();
			setState(200);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExternalSqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSingleDataType(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			dataType();
			setState(203);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(ExternalSqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(ExternalSqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(ExternalSqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(ExternalSqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(ExternalSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(ExternalSqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitExplain(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(ExternalSqlBaseParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(ExternalSqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(ExternalSqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(ExternalSqlBaseParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDropDatabase(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(ExternalSqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitResetConfiguration(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(ExternalSqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(ExternalSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ExternalSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(ExternalSqlBaseParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDescribeDatabase(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitAlterViewQuery(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(ExternalSqlBaseParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitUse(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ExternalSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(ExternalSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ExternalSqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(ExternalSqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(ExternalSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(ExternalSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExternalSqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRenameTable(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(ExternalSqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(ExternalSqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitFailNativeCommand(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(ExternalSqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(ExternalSqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitClearCache(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ExternalSqlBaseParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(ExternalSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ExternalSqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(ExternalSqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitShowTables(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(ExternalSqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(ExternalSqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRecoverPartitions(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(ExternalSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExternalSqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRenameTablePartition(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(ExternalSqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(ExternalSqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRepairTable(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(ExternalSqlBaseParser.REFRESH, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRefreshResource(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitShowCreateTable(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(ExternalSqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(ExternalSqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(ExternalSqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(ExternalSqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(ExternalSqlBaseParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitShowColumns(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ExternalSqlBaseParser.ADD, 0); }
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitAddTablePartition(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(ExternalSqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRefreshTable(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ExternalSqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(ExternalSqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitManageResource(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ExternalSqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(ExternalSqlBaseParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ExternalSqlBaseParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(ExternalSqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateDatabase(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(ExternalSqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(ExternalSqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(ExternalSqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ExternalSqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(ExternalSqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitAnalyze(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ExternalSqlBaseParser.COMMENT, 0); }
		public TerminalNode PARTITIONED() { return getToken(ExternalSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(ExternalSqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public SkewSpecContext skewSpec() {
			return getRuleContext(SkewSpecContext.class,0);
		}
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(ExternalSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateHiveTable(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(ExternalSqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TerminalNode TEMPORARY() { return getToken(ExternalSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode USING() { return getToken(ExternalSqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateFunction(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(ExternalSqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(ExternalSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ExternalSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ExternalSqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitShowTable(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(ExternalSqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ExternalSqlBaseParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(ExternalSqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSetDatabaseProperties(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(ExternalSqlBaseParser.OPTIONS, 0); }
		public TerminalNode PARTITIONED() { return getToken(ExternalSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(ExternalSqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ExternalSqlBaseParser.COMMENT, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateTable(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(ExternalSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ExternalSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(ExternalSqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(ExternalSqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDescribeTable(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(ExternalSqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateTableLike(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(ExternalSqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitUncacheTable(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(ExternalSqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(ExternalSqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ExternalSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDropFunction(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(ExternalSqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(ExternalSqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(ExternalSqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(ExternalSqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(ExternalSqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(ExternalSqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitLoadData(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(ExternalSqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitShowPartitions(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(ExternalSqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(ExternalSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(ExternalSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(ExternalSqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDescribeFunction(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(ExternalSqlBaseParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(ExternalSqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitChangeColumn(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitStatementDefault(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(ExternalSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTruncateTable(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ExternalSqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(ExternalSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ExternalSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ExternalSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSetTableSerDe(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(ExternalSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ExternalSqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ExternalSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ExternalSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(ExternalSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(ExternalSqlBaseParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(ExternalSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(ExternalSqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateView(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(ExternalSqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(ExternalSqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDropTablePartitions(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(ExternalSqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSetConfiguration(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(ExternalSqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(ExternalSqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDropTable(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(ExternalSqlBaseParser.DATABASES, 0); }
		public TerminalNode LIKE() { return getToken(ExternalSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitShowDatabases(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ExternalSqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitShowTblProperties(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(ExternalSqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ExternalSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitUnsetTableProperties(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ExternalSqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSetTableLocation(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(ExternalSqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ExternalSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitShowFunctions(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(ExternalSqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(ExternalSqlBaseParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCacheTable(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ExternalSqlBaseParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(ExternalSqlBaseParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitAddTableColumns(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(ExternalSqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ExternalSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSetTableProperties(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(USE);
				setState(207);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(CREATE);
				setState(209);
				match(DATABASE);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(210);
					match(IF);
					setState(211);
					match(NOT);
					setState(212);
					match(EXISTS);
					}
					break;
				}
				setState(215);
				identifier();
				setState(218);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(216);
					match(COMMENT);
					setState(217);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(221);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(220);
					locationSpec();
					}
				}

				setState(226);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(223);
					match(WITH);
					setState(224);
					match(DBPROPERTIES);
					setState(225);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(ALTER);
				setState(229);
				match(DATABASE);
				setState(230);
				identifier();
				setState(231);
				match(SET);
				setState(232);
				match(DBPROPERTIES);
				setState(233);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(DROP);
				setState(236);
				match(DATABASE);
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(237);
					match(IF);
					setState(238);
					match(EXISTS);
					}
					break;
				}
				setState(241);
				identifier();
				setState(243);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(242);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				createTableHeader();
				setState(250);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(246);
					match(T__0);
					setState(247);
					colTypeList();
					setState(248);
					match(T__1);
					}
				}

				setState(252);
				tableProvider();
				setState(255);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(253);
					match(OPTIONS);
					setState(254);
					((CreateTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(260);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(257);
					match(PARTITIONED);
					setState(258);
					match(BY);
					setState(259);
					((CreateTableContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(263);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(262);
					bucketSpec();
					}
				}

				setState(266);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(265);
					locationSpec();
					}
				}

				setState(270);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(268);
					match(COMMENT);
					setState(269);
					((CreateTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(276);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(273);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(272);
						match(AS);
						}
					}

					setState(275);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
				createTableHeader();
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(279);
					match(T__0);
					setState(280);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(281);
					match(T__1);
					}
					break;
				}
				setState(287);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(285);
					match(COMMENT);
					setState(286);
					((CreateHiveTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(295);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(289);
					match(PARTITIONED);
					setState(290);
					match(BY);
					setState(291);
					match(T__0);
					setState(292);
					((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
					setState(293);
					match(T__1);
					}
				}

				setState(298);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(297);
					bucketSpec();
					}
				}

				setState(301);
				_la = _input.LA(1);
				if (_la==SKEWED) {
					{
					setState(300);
					skewSpec();
					}
				}

				setState(304);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(303);
					rowFormat();
					}
				}

				setState(307);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(306);
					createFileFormat();
					}
				}

				setState(310);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(309);
					locationSpec();
					}
				}

				setState(314);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(312);
					match(TBLPROPERTIES);
					setState(313);
					tablePropertyList();
					}
				}

				setState(320);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(317);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(316);
						match(AS);
						}
					}

					setState(319);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(322);
				match(CREATE);
				setState(323);
				match(TABLE);
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(324);
					match(IF);
					setState(325);
					match(NOT);
					setState(326);
					match(EXISTS);
					}
					break;
				}
				setState(329);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(330);
				match(LIKE);
				setState(331);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(333);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(332);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				match(ANALYZE);
				setState(336);
				match(TABLE);
				setState(337);
				tableIdentifier();
				setState(339);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(338);
					partitionSpec();
					}
				}

				setState(341);
				match(COMPUTE);
				setState(342);
				match(STATISTICS);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(343);
					identifier();
					}
					break;
				case 2:
					{
					setState(344);
					match(FOR);
					setState(345);
					match(COLUMNS);
					setState(346);
					identifierSeq();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(349);
				match(ALTER);
				setState(350);
				match(TABLE);
				setState(351);
				tableIdentifier();
				setState(352);
				match(ADD);
				setState(353);
				match(COLUMNS);
				setState(354);
				match(T__0);
				setState(355);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(356);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(358);
				match(ALTER);
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(360);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(361);
				match(RENAME);
				setState(362);
				match(TO);
				setState(363);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(365);
				match(ALTER);
				setState(366);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(367);
				tableIdentifier();
				setState(368);
				match(SET);
				setState(369);
				match(TBLPROPERTIES);
				setState(370);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(372);
				match(ALTER);
				setState(373);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(374);
				tableIdentifier();
				setState(375);
				match(UNSET);
				setState(376);
				match(TBLPROPERTIES);
				setState(379);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(377);
					match(IF);
					setState(378);
					match(EXISTS);
					}
				}

				setState(381);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(383);
				match(ALTER);
				setState(384);
				match(TABLE);
				setState(385);
				tableIdentifier();
				setState(387);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(386);
					partitionSpec();
					}
				}

				setState(389);
				match(CHANGE);
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(390);
					match(COLUMN);
					}
					break;
				}
				setState(393);
				identifier();
				setState(394);
				colType();
				setState(396);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(395);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(398);
				match(ALTER);
				setState(399);
				match(TABLE);
				setState(400);
				tableIdentifier();
				setState(402);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(401);
					partitionSpec();
					}
				}

				setState(404);
				match(SET);
				setState(405);
				match(SERDE);
				setState(406);
				match(STRING);
				setState(410);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(407);
					match(WITH);
					setState(408);
					match(SERDEPROPERTIES);
					setState(409);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(412);
				match(ALTER);
				setState(413);
				match(TABLE);
				setState(414);
				tableIdentifier();
				setState(416);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(415);
					partitionSpec();
					}
				}

				setState(418);
				match(SET);
				setState(419);
				match(SERDEPROPERTIES);
				setState(420);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(422);
				match(ALTER);
				setState(423);
				match(TABLE);
				setState(424);
				tableIdentifier();
				setState(425);
				match(ADD);
				setState(429);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(426);
					match(IF);
					setState(427);
					match(NOT);
					setState(428);
					match(EXISTS);
					}
				}

				setState(432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(431);
					partitionSpecLocation();
					}
					}
					setState(434); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(436);
				match(ALTER);
				setState(437);
				match(VIEW);
				setState(438);
				tableIdentifier();
				setState(439);
				match(ADD);
				setState(443);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(440);
					match(IF);
					setState(441);
					match(NOT);
					setState(442);
					match(EXISTS);
					}
				}

				setState(446); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(445);
					partitionSpec();
					}
					}
					setState(448); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(450);
				match(ALTER);
				setState(451);
				match(TABLE);
				setState(452);
				tableIdentifier();
				setState(453);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(454);
				match(RENAME);
				setState(455);
				match(TO);
				setState(456);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(458);
				match(ALTER);
				setState(459);
				match(TABLE);
				setState(460);
				tableIdentifier();
				setState(461);
				match(DROP);
				setState(464);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(462);
					match(IF);
					setState(463);
					match(EXISTS);
					}
				}

				setState(466);
				partitionSpec();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(467);
					match(T__2);
					setState(468);
					partitionSpec();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(475);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(474);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(477);
				match(ALTER);
				setState(478);
				match(VIEW);
				setState(479);
				tableIdentifier();
				setState(480);
				match(DROP);
				setState(483);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(481);
					match(IF);
					setState(482);
					match(EXISTS);
					}
				}

				setState(485);
				partitionSpec();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(486);
					match(T__2);
					setState(487);
					partitionSpec();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(493);
				match(ALTER);
				setState(494);
				match(TABLE);
				setState(495);
				tableIdentifier();
				setState(497);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(496);
					partitionSpec();
					}
				}

				setState(499);
				match(SET);
				setState(500);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(502);
				match(ALTER);
				setState(503);
				match(TABLE);
				setState(504);
				tableIdentifier();
				setState(505);
				match(RECOVER);
				setState(506);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(508);
				match(DROP);
				setState(509);
				match(TABLE);
				setState(512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(510);
					match(IF);
					setState(511);
					match(EXISTS);
					}
					break;
				}
				setState(514);
				tableIdentifier();
				setState(516);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(515);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(518);
				match(DROP);
				setState(519);
				match(VIEW);
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(520);
					match(IF);
					setState(521);
					match(EXISTS);
					}
					break;
				}
				setState(524);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(525);
				match(CREATE);
				setState(528);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(526);
					match(OR);
					setState(527);
					match(REPLACE);
					}
				}

				setState(534);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(531);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(530);
						match(GLOBAL);
						}
					}

					setState(533);
					match(TEMPORARY);
					}
				}

				setState(536);
				match(VIEW);
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(537);
					match(IF);
					setState(538);
					match(NOT);
					setState(539);
					match(EXISTS);
					}
					break;
				}
				setState(542);
				tableIdentifier();
				setState(544);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(543);
					identifierCommentList();
					}
				}

				setState(548);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(546);
					match(COMMENT);
					setState(547);
					match(STRING);
					}
				}

				setState(553);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(550);
					match(PARTITIONED);
					setState(551);
					match(ON);
					setState(552);
					identifierList();
					}
				}

				setState(557);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(555);
					match(TBLPROPERTIES);
					setState(556);
					tablePropertyList();
					}
				}

				setState(559);
				match(AS);
				setState(560);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(562);
				match(CREATE);
				setState(565);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(563);
					match(OR);
					setState(564);
					match(REPLACE);
					}
				}

				setState(568);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(567);
					match(GLOBAL);
					}
				}

				setState(570);
				match(TEMPORARY);
				setState(571);
				match(VIEW);
				setState(572);
				tableIdentifier();
				setState(577);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(573);
					match(T__0);
					setState(574);
					colTypeList();
					setState(575);
					match(T__1);
					}
				}

				setState(579);
				tableProvider();
				setState(582);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(580);
					match(OPTIONS);
					setState(581);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(584);
				match(ALTER);
				setState(585);
				match(VIEW);
				setState(586);
				tableIdentifier();
				setState(588);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(587);
					match(AS);
					}
				}

				setState(590);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(592);
				match(CREATE);
				setState(594);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(593);
					match(TEMPORARY);
					}
				}

				setState(596);
				match(FUNCTION);
				setState(597);
				qualifiedName();
				setState(598);
				match(AS);
				setState(599);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(609);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(600);
					match(USING);
					setState(601);
					resource();
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(602);
						match(T__2);
						setState(603);
						resource();
						}
						}
						setState(608);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(611);
				match(DROP);
				setState(613);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(612);
					match(TEMPORARY);
					}
				}

				setState(615);
				match(FUNCTION);
				setState(618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(616);
					match(IF);
					setState(617);
					match(EXISTS);
					}
					break;
				}
				setState(620);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(621);
				match(EXPLAIN);
				setState(623);
				_la = _input.LA(1);
				if (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LOGICAL - 86)) | (1L << (CODEGEN - 86)) | (1L << (COST - 86)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(622);
					_la = _input.LA(1);
					if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LOGICAL - 86)) | (1L << (CODEGEN - 86)) | (1L << (COST - 86)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(625);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(626);
				match(SHOW);
				setState(627);
				match(TABLES);
				setState(630);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(628);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(629);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(636);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(633);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(632);
						match(LIKE);
						}
					}

					setState(635);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(638);
				match(SHOW);
				setState(639);
				match(TABLE);
				setState(640);
				match(EXTENDED);
				setState(643);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(641);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(642);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(645);
				match(LIKE);
				setState(646);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(648);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(647);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(650);
				match(SHOW);
				setState(651);
				match(DATABASES);
				setState(654);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(652);
					match(LIKE);
					setState(653);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(656);
				match(SHOW);
				setState(657);
				match(TBLPROPERTIES);
				setState(658);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(663);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(659);
					match(T__0);
					setState(660);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(661);
					match(T__1);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(665);
				match(SHOW);
				setState(666);
				match(COLUMNS);
				setState(667);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(668);
				tableIdentifier();
				setState(671);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(669);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(670);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(673);
				match(SHOW);
				setState(674);
				match(PARTITIONS);
				setState(675);
				tableIdentifier();
				setState(677);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(676);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(679);
				match(SHOW);
				setState(681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(680);
					identifier();
					}
					break;
				}
				setState(683);
				match(FUNCTIONS);
				setState(691);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DIV - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (USING - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)) | (1L << (CLUSTERED - 134)) | (1L << (SORTED - 134)) | (1L << (PURGE - 134)) | (1L << (INPUTFORMAT - 134)) | (1L << (OUTPUTFORMAT - 134)) | (1L << (DATABASE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (CURRENT_DATE - 198)) | (1L << (CURRENT_TIMESTAMP - 198)) | (1L << (STRING - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
					{
					setState(685);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(684);
						match(LIKE);
						}
						break;
					}
					setState(689);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case IF:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case USING:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case CURRENT_DATE:
					case CURRENT_TIMESTAMP:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(687);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(688);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(693);
				match(SHOW);
				setState(694);
				match(CREATE);
				setState(695);
				match(TABLE);
				setState(696);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(697);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(698);
				match(FUNCTION);
				setState(700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(699);
					match(EXTENDED);
					}
					break;
				}
				setState(702);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(703);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(704);
				match(DATABASE);
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(705);
					match(EXTENDED);
					}
					break;
				}
				setState(708);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(709);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(710);
					match(TABLE);
					}
					break;
				}
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(713);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(716);
				tableIdentifier();
				setState(718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(717);
					partitionSpec();
					}
					break;
				}
				setState(721);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DIV - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (USING - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)) | (1L << (CLUSTERED - 134)) | (1L << (SORTED - 134)) | (1L << (PURGE - 134)) | (1L << (INPUTFORMAT - 134)) | (1L << (OUTPUTFORMAT - 134)) | (1L << (DATABASE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (CURRENT_DATE - 198)) | (1L << (CURRENT_TIMESTAMP - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
					{
					setState(720);
					describeColName();
					}
				}

				}
				break;
			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(723);
				match(REFRESH);
				setState(724);
				match(TABLE);
				setState(725);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(726);
				match(REFRESH);
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(727);
						matchWildcard();
						}
						} 
					}
					setState(732);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				}
				break;
			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(733);
				match(CACHE);
				setState(735);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(734);
					match(LAZY);
					}
				}

				setState(737);
				match(TABLE);
				setState(738);
				tableIdentifier();
				setState(743);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(740);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(739);
						match(AS);
						}
					}

					setState(742);
					query();
					}
				}

				}
				break;
			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(745);
				match(UNCACHE);
				setState(746);
				match(TABLE);
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(747);
					match(IF);
					setState(748);
					match(EXISTS);
					}
					break;
				}
				setState(751);
				tableIdentifier();
				}
				break;
			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(752);
				match(CLEAR);
				setState(753);
				match(CACHE);
				}
				break;
			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(754);
				match(LOAD);
				setState(755);
				match(DATA);
				setState(757);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(756);
					match(LOCAL);
					}
				}

				setState(759);
				match(INPATH);
				setState(760);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(762);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(761);
					match(OVERWRITE);
					}
				}

				setState(764);
				match(INTO);
				setState(765);
				match(TABLE);
				setState(766);
				tableIdentifier();
				setState(768);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(767);
					partitionSpec();
					}
				}

				}
				break;
			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(770);
				match(TRUNCATE);
				setState(771);
				match(TABLE);
				setState(772);
				tableIdentifier();
				setState(774);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(773);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(776);
				match(MSCK);
				setState(777);
				match(REPAIR);
				setState(778);
				match(TABLE);
				setState(779);
				tableIdentifier();
				}
				break;
			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(780);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(781);
				identifier();
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(782);
						matchWildcard();
						}
						} 
					}
					setState(787);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(788);
				match(SET);
				setState(789);
				match(ROLE);
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(790);
						matchWildcard();
						}
						} 
					}
					setState(795);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(796);
				match(SET);
				setState(800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(797);
						matchWildcard();
						}
						} 
					}
					setState(802);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(803);
				match(RESET);
				}
				break;
			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(804);
				unsupportedHiveNativeCommands();
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(805);
						matchWildcard();
						}
						} 
					}
					setState(810);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(ExternalSqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(ExternalSqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(ExternalSqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(ExternalSqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(ExternalSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(ExternalSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(ExternalSqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(ExternalSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(ExternalSqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(ExternalSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(ExternalSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(ExternalSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(ExternalSqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(ExternalSqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(ExternalSqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(ExternalSqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(ExternalSqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(ExternalSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(ExternalSqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(ExternalSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(ExternalSqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(ExternalSqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(ExternalSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(ExternalSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(ExternalSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(ExternalSqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(ExternalSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(ExternalSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(ExternalSqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(ExternalSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(ExternalSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(ExternalSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(ExternalSqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(ExternalSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(ExternalSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(ExternalSqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(ExternalSqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(ExternalSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(ExternalSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(ExternalSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(ExternalSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(ExternalSqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(ExternalSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(ExternalSqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(814);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(816);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(818);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(823);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(822);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(825);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(826);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(827);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(828);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(829);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(832);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(833);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(834);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(835);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(836);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(837);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(838);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(839);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(840);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(841);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(842);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(843);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(844);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(845);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(846);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(847);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(848);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(849);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(850);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(851);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(852);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(853);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(854);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(855);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(856);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(857);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(858);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(860);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(863);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(866);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(869);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(872);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(875);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(876);
				tableIdentifier();
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(878);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(881);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(882);
				tableIdentifier();
				setState(883);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(886);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(887);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(888);
				tableIdentifier();
				setState(889);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(894);
				tableIdentifier();
				setState(895);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(896);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(898);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(899);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(900);
				tableIdentifier();
				setState(901);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(902);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(904);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(905);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(906);
				tableIdentifier();
				setState(907);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(908);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(909);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(910);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(912);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(913);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(914);
				tableIdentifier();
				setState(915);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(916);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(917);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(919);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(920);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(921);
				tableIdentifier();
				setState(922);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(923);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(925);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(926);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(927);
				tableIdentifier();
				setState(928);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(929);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(931);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(932);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(933);
				tableIdentifier();
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(937);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(938);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(939);
				tableIdentifier();
				setState(940);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(943);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(944);
				tableIdentifier();
				setState(946);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(945);
					partitionSpec();
					}
				}

				setState(948);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(950);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(951);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(952);
				tableIdentifier();
				setState(954);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(953);
					partitionSpec();
					}
				}

				setState(956);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(958);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(959);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(960);
				tableIdentifier();
				setState(962);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(961);
					partitionSpec();
					}
				}

				setState(964);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(965);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(967);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(968);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(969);
				tableIdentifier();
				setState(971);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(970);
					partitionSpec();
					}
				}

				setState(973);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(974);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(976);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(977);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(978);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(979);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(980);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(981);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(982);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ExternalSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(ExternalSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateTableHeader(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(CREATE);
			setState(987);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(986);
				match(TEMPORARY);
				}
			}

			setState(990);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(989);
				match(EXTERNAL);
				}
			}

			setState(992);
			match(TABLE);
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(993);
				match(IF);
				setState(994);
				match(NOT);
				setState(995);
				match(EXISTS);
				}
				break;
			}
			setState(998);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(ExternalSqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(ExternalSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ExternalSqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ExternalSqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(ExternalSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(ExternalSqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(ExternalSqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitBucketSpec(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(CLUSTERED);
			setState(1001);
			match(BY);
			setState(1002);
			identifierList();
			setState(1006);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1003);
				match(SORTED);
				setState(1004);
				match(BY);
				setState(1005);
				orderedIdentifierList();
				}
			}

			setState(1008);
			match(INTO);
			setState(1009);
			match(INTEGER_VALUE);
			setState(1010);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(ExternalSqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(ExternalSqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(ExternalSqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(ExternalSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(ExternalSqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSkewSpec(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(SKEWED);
			setState(1013);
			match(BY);
			setState(1014);
			identifierList();
			setState(1015);
			match(ON);
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1016);
				constantList();
				}
				break;
			case 2:
				{
				setState(1017);
				nestedConstantList();
				}
				break;
			}
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1020);
				match(STORED);
				setState(1021);
				match(AS);
				setState(1022);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(ExternalSqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitLocationSpec(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(LOCATION);
			setState(1026);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExternalSqlBaseParser.EOF, 0); }
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1028);
				ctes();
				}
			}

			setState(1031);
			queryNoWith();
			setState(1032);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExternalSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(ExternalSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public TerminalNode INTO() { return getToken(ExternalSqlBaseParser.INTO, 0); }
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitInsertInto(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insertInto);
		int _la;
		try {
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(INSERT);
				setState(1035);
				match(OVERWRITE);
				setState(1036);
				match(TABLE);
				setState(1037);
				tableIdentifier();
				setState(1044);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1038);
					partitionSpec();
					setState(1042);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1039);
						match(IF);
						setState(1040);
						match(NOT);
						setState(1041);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				match(INSERT);
				setState(1047);
				match(INTO);
				setState(1049);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1048);
					match(TABLE);
					}
					break;
				}
				setState(1051);
				tableIdentifier();
				setState(1053);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1052);
					partitionSpec();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			partitionSpec();
			setState(1059);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1058);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ExternalSqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitPartitionSpec(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(PARTITION);
			setState(1062);
			match(T__0);
			setState(1063);
			partitionVal();
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1064);
				match(T__2);
				setState(1065);
				partitionVal();
				}
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ExternalSqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitPartitionVal(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			identifier();
			setState(1076);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1074);
				match(EQ);
				setState(1075);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDescribeFuncName(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_describeFuncName);
		try {
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1082);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(ExternalSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExternalSqlBaseParser.STRING, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDescribeColName(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			identifier();
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1086);
				match(T__3);
				setState(1089);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1087);
					identifier();
					}
					break;
				case STRING:
					{
					setState(1088);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ExternalSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCtes(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(WITH);
			setState(1097);
			namedQuery();
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1098);
				match(T__2);
				setState(1099);
				namedQuery();
				}
				}
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitNamedQuery(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1107);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1106);
				match(AS);
				}
			}

			setState(1109);
			match(T__0);
			setState(1110);
			query();
			setState(1111);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(ExternalSqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTableProvider(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(USING);
			setState(1114);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTablePropertyList(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(T__0);
			setState(1117);
			tableProperty();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1118);
				match(T__2);
				setState(1119);
				tableProperty();
				}
				}
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1125);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ExternalSqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTableProperty(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1132);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (STRING - 232)) | (1L << (INTEGER_VALUE - 232)) | (1L << (DECIMAL_VALUE - 232)))) != 0)) {
				{
				setState(1129);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1128);
					match(EQ);
					}
				}

				setState(1131);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTablePropertyKey(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1143);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				identifier();
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1135);
					match(T__3);
					setState(1136);
					identifier();
					}
					}
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(ExternalSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(ExternalSqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTablePropertyValue(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyValue);
		try {
			setState(1149);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1145);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1147);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1148);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitConstantList(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(T__0);
			setState(1152);
			constant();
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1153);
				match(T__2);
				setState(1154);
				constant();
				}
				}
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1160);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitNestedConstantList(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(T__0);
			setState(1163);
			constantList();
			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1164);
				match(T__2);
				setState(1165);
				constantList();
				}
				}
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1171);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(ExternalSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(ExternalSqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCreateFileFormat(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_createFileFormat);
		try {
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1173);
				match(STORED);
				setState(1174);
				match(AS);
				setState(1175);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176);
				match(STORED);
				setState(1177);
				match(BY);
				setState(1178);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(ExternalSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(ExternalSqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(ExternalSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExternalSqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTableFileFormat(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitGenericFileFormat(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fileFormat);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				match(INPUTFORMAT);
				setState(1182);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1183);
				match(OUTPUTFORMAT);
				setState(1184);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(ExternalSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ExternalSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitStorageHandler(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(STRING);
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1189);
				match(WITH);
				setState(1190);
				match(SERDEPROPERTIES);
				setState(1191);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			identifier();
			setState(1195);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExternalSqlBaseParser.EOF, 0); }
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSingleInsertQuery(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExternalSqlBaseParser.EOF, 0); }
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitMultiInsertQuery(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_queryNoWith);
		int _la;
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1197);
					insertInto();
					}
				}

				setState(1200);
				queryTerm(0);
				setState(1201);
				queryOrganization();
				setState(1202);
				match(EOF);
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1204);
				fromClause();
				setState(1206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1205);
					multiInsertQueryBody();
					}
					}
					setState(1208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
				setState(1210);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(ExternalSqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(ExternalSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ExternalSqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(ExternalSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(ExternalSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(ExternalSqlBaseParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(ExternalSqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitQueryOrganization(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1214);
				match(ORDER);
				setState(1215);
				match(BY);
				setState(1216);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1217);
					match(T__2);
					setState(1218);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1236);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1226);
				match(CLUSTER);
				setState(1227);
				match(BY);
				setState(1228);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1229);
					match(T__2);
					setState(1230);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1248);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1238);
				match(DISTRIBUTE);
				setState(1239);
				match(BY);
				setState(1240);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1241);
					match(T__2);
					setState(1242);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1260);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1250);
				match(SORT);
				setState(1251);
				match(BY);
				setState(1252);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1253);
					match(T__2);
					setState(1254);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1263);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1262);
				windows();
				}
			}

			setState(1267);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1265);
				match(LIMIT);
				setState(1266);
				((QueryOrganizationContext)_localctx).limit = expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1269);
				insertInto();
				}
			}

			setState(1272);
			querySpecification();
			setState(1273);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitQueryTermDefault(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(ExternalSqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(ExternalSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(ExternalSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(ExternalSqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSetOperation(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1276);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1278);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1279);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (UNION - 98)) | (1L << (EXCEPT - 98)) | (1L << (SETMINUS - 98)) | (1L << (INTERSECT - 98)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1281);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1280);
						setQuantifier();
						}
					}

					setState(1283);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(1288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSubquery(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitInlineTableDefault1(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(ExternalSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTable(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_queryPrimary);
		try {
			setState(1297);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				match(TABLE);
				setState(1291);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1292);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1293);
				match(T__0);
				setState(1294);
				queryNoWith();
				setState(1295);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ExternalSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(ExternalSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ExternalSqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(ExternalSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(ExternalSqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSortItem(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			expression();
			setState(1301);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1300);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1305);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1303);
				match(NULLS);
				setState(1304);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(ExternalSqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(ExternalSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExternalSqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(ExternalSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(ExternalSqlBaseParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(ExternalSqlBaseParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(ExternalSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(ExternalSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(ExternalSqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(ExternalSqlBaseParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(ExternalSqlBaseParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitQuerySpecification(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1317);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1307);
					match(SELECT);
					setState(1308);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1309);
					match(T__0);
					setState(1310);
					namedExpressionSeq();
					setState(1311);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1313);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1314);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1315);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1316);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1320);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1319);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1324);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1322);
					match(RECORDWRITER);
					setState(1323);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1326);
				match(USING);
				setState(1327);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1328);
					match(AS);
					setState(1338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						setState(1329);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1330);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1331);
						match(T__0);
						setState(1334);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
						case 1:
							{
							setState(1332);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1333);
							colTypeList();
							}
							break;
						}
						setState(1336);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1342);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1345);
					match(RECORDREADER);
					setState(1346);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1349);
					fromClause();
					}
					break;
				}
				setState(1354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1352);
					match(WHERE);
					setState(1353);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1378);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1356);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1357);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1362);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1364);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						setState(1363);
						setQuantifier();
						}
						break;
					}
					setState(1366);
					namedExpressionSeq();
					setState(1368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1367);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1370);
					fromClause();
					setState(1376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1371);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1373);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1372);
							setQuantifier();
							}
							break;
						}
						setState(1375);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1380);
						lateralView();
						}
						} 
					}
					setState(1385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				setState(1388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1386);
					match(WHERE);
					setState(1387);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1390);
					aggregation();
					}
					break;
				}
				setState(1395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1393);
					match(HAVING);
					setState(1394);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1397);
					windows();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitHint(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(T__4);
			setState(1403);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DIV - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (USING - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)) | (1L << (CLUSTERED - 134)) | (1L << (SORTED - 134)) | (1L << (PURGE - 134)) | (1L << (INPUTFORMAT - 134)) | (1L << (OUTPUTFORMAT - 134)) | (1L << (DATABASE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (CURRENT_DATE - 198)) | (1L << (CURRENT_TIMESTAMP - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
				{
				{
				setState(1405);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1404);
					match(T__2);
					}
				}

				setState(1407);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1413);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitHintStatement(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hintStatement);
		int _la;
		try {
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1415);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1417);
				match(T__0);
				setState(1418);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1419);
					match(T__2);
					setState(1420);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1426);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ExternalSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(FROM);
			setState(1431);
			relation();
			setState(1436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1432);
					match(T__2);
					setState(1433);
					relation();
					}
					} 
				}
				setState(1438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			setState(1442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1439);
					lateralView();
					}
					} 
				}
				setState(1444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(ExternalSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ExternalSqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(ExternalSqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(ExternalSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(ExternalSqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(ExternalSqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(ExternalSqlBaseParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitAggregation(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_aggregation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(GROUP);
			setState(1446);
			match(BY);
			setState(1447);
			((AggregationContext)_localctx).expression = expression();
			((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
			setState(1452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1448);
					match(T__2);
					setState(1449);
					((AggregationContext)_localctx).expression = expression();
					((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
					}
					} 
				}
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1455);
				match(WITH);
				setState(1456);
				((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;
			case 2:
				{
				setState(1457);
				match(WITH);
				setState(1458);
				((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;
			case 3:
				{
				setState(1459);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1460);
				match(SETS);
				setState(1461);
				match(T__0);
				setState(1462);
				groupingSet();
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1463);
					match(T__2);
					setState(1464);
					groupingSet();
					}
					}
					setState(1469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1470);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitGroupingSet(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_groupingSet);
		int _la;
		try {
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				match(T__0);
				setState(1483);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (ASTERISK - 129)) | (1L << (DIV - 129)) | (1L << (TILDE - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (BUCKET - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (SORT - 129)) | (1L << (CLUSTER - 129)) | (1L << (DISTRIBUTE - 129)) | (1L << (OVERWRITE - 129)) | (1L << (TRANSFORM - 129)) | (1L << (REDUCE - 129)) | (1L << (USING - 129)) | (1L << (SERDE - 129)) | (1L << (SERDEPROPERTIES - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (DELIMITED - 129)) | (1L << (FIELDS - 129)) | (1L << (TERMINATED - 129)) | (1L << (COLLECTION - 129)) | (1L << (ITEMS - 129)) | (1L << (KEYS - 129)) | (1L << (ESCAPED - 129)) | (1L << (LINES - 129)) | (1L << (SEPARATED - 129)) | (1L << (FUNCTION - 129)) | (1L << (EXTENDED - 129)) | (1L << (REFRESH - 129)) | (1L << (CLEAR - 129)) | (1L << (CACHE - 129)) | (1L << (UNCACHE - 129)) | (1L << (LAZY - 129)) | (1L << (FORMATTED - 129)) | (1L << (GLOBAL - 129)) | (1L << (TEMPORARY - 129)) | (1L << (OPTIONS - 129)) | (1L << (UNSET - 129)) | (1L << (TBLPROPERTIES - 129)) | (1L << (DBPROPERTIES - 129)) | (1L << (BUCKETS - 129)) | (1L << (SKEWED - 129)) | (1L << (STORED - 129)) | (1L << (DIRECTORIES - 129)) | (1L << (LOCATION - 129)) | (1L << (EXCHANGE - 129)) | (1L << (ARCHIVE - 129)) | (1L << (UNARCHIVE - 129)) | (1L << (FILEFORMAT - 129)) | (1L << (TOUCH - 129)) | (1L << (COMPACT - 129)) | (1L << (CONCATENATE - 129)) | (1L << (CHANGE - 129)) | (1L << (CASCADE - 129)) | (1L << (RESTRICT - 129)) | (1L << (CLUSTERED - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (SORTED - 193)) | (1L << (PURGE - 193)) | (1L << (INPUTFORMAT - 193)) | (1L << (OUTPUTFORMAT - 193)) | (1L << (DATABASE - 193)) | (1L << (DATABASES - 193)) | (1L << (DFS - 193)) | (1L << (TRUNCATE - 193)) | (1L << (ANALYZE - 193)) | (1L << (COMPUTE - 193)) | (1L << (LIST - 193)) | (1L << (STATISTICS - 193)) | (1L << (PARTITIONED - 193)) | (1L << (EXTERNAL - 193)) | (1L << (DEFINED - 193)) | (1L << (REVOKE - 193)) | (1L << (GRANT - 193)) | (1L << (LOCK - 193)) | (1L << (UNLOCK - 193)) | (1L << (MSCK - 193)) | (1L << (REPAIR - 193)) | (1L << (RECOVER - 193)) | (1L << (EXPORT - 193)) | (1L << (IMPORT - 193)) | (1L << (LOAD - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (COMPACTIONS - 193)) | (1L << (PRINCIPALS - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (INDEX - 193)) | (1L << (INDEXES - 193)) | (1L << (LOCKS - 193)) | (1L << (OPTION - 193)) | (1L << (ANTI - 193)) | (1L << (LOCAL - 193)) | (1L << (INPATH - 193)) | (1L << (CURRENT_DATE - 193)) | (1L << (CURRENT_TIMESTAMP - 193)) | (1L << (STRING - 193)) | (1L << (BIGINT_LITERAL - 193)) | (1L << (SMALLINT_LITERAL - 193)) | (1L << (TINYINT_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_LITERAL - 193)) | (1L << (BIGDECIMAL_LITERAL - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)))) != 0)) {
					{
					setState(1475);
					expression();
					setState(1480);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1476);
						match(T__2);
						setState(1477);
						expression();
						}
						}
						setState(1482);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1485);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(ExternalSqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(ExternalSqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitLateralView(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(LATERAL);
			setState(1490);
			match(VIEW);
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1491);
				match(OUTER);
				}
				break;
			}
			setState(1494);
			qualifiedName();
			setState(1495);
			match(T__0);
			setState(1504);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (ASTERISK - 129)) | (1L << (DIV - 129)) | (1L << (TILDE - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (BUCKET - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (SORT - 129)) | (1L << (CLUSTER - 129)) | (1L << (DISTRIBUTE - 129)) | (1L << (OVERWRITE - 129)) | (1L << (TRANSFORM - 129)) | (1L << (REDUCE - 129)) | (1L << (USING - 129)) | (1L << (SERDE - 129)) | (1L << (SERDEPROPERTIES - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (DELIMITED - 129)) | (1L << (FIELDS - 129)) | (1L << (TERMINATED - 129)) | (1L << (COLLECTION - 129)) | (1L << (ITEMS - 129)) | (1L << (KEYS - 129)) | (1L << (ESCAPED - 129)) | (1L << (LINES - 129)) | (1L << (SEPARATED - 129)) | (1L << (FUNCTION - 129)) | (1L << (EXTENDED - 129)) | (1L << (REFRESH - 129)) | (1L << (CLEAR - 129)) | (1L << (CACHE - 129)) | (1L << (UNCACHE - 129)) | (1L << (LAZY - 129)) | (1L << (FORMATTED - 129)) | (1L << (GLOBAL - 129)) | (1L << (TEMPORARY - 129)) | (1L << (OPTIONS - 129)) | (1L << (UNSET - 129)) | (1L << (TBLPROPERTIES - 129)) | (1L << (DBPROPERTIES - 129)) | (1L << (BUCKETS - 129)) | (1L << (SKEWED - 129)) | (1L << (STORED - 129)) | (1L << (DIRECTORIES - 129)) | (1L << (LOCATION - 129)) | (1L << (EXCHANGE - 129)) | (1L << (ARCHIVE - 129)) | (1L << (UNARCHIVE - 129)) | (1L << (FILEFORMAT - 129)) | (1L << (TOUCH - 129)) | (1L << (COMPACT - 129)) | (1L << (CONCATENATE - 129)) | (1L << (CHANGE - 129)) | (1L << (CASCADE - 129)) | (1L << (RESTRICT - 129)) | (1L << (CLUSTERED - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (SORTED - 193)) | (1L << (PURGE - 193)) | (1L << (INPUTFORMAT - 193)) | (1L << (OUTPUTFORMAT - 193)) | (1L << (DATABASE - 193)) | (1L << (DATABASES - 193)) | (1L << (DFS - 193)) | (1L << (TRUNCATE - 193)) | (1L << (ANALYZE - 193)) | (1L << (COMPUTE - 193)) | (1L << (LIST - 193)) | (1L << (STATISTICS - 193)) | (1L << (PARTITIONED - 193)) | (1L << (EXTERNAL - 193)) | (1L << (DEFINED - 193)) | (1L << (REVOKE - 193)) | (1L << (GRANT - 193)) | (1L << (LOCK - 193)) | (1L << (UNLOCK - 193)) | (1L << (MSCK - 193)) | (1L << (REPAIR - 193)) | (1L << (RECOVER - 193)) | (1L << (EXPORT - 193)) | (1L << (IMPORT - 193)) | (1L << (LOAD - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (COMPACTIONS - 193)) | (1L << (PRINCIPALS - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (INDEX - 193)) | (1L << (INDEXES - 193)) | (1L << (LOCKS - 193)) | (1L << (OPTION - 193)) | (1L << (ANTI - 193)) | (1L << (LOCAL - 193)) | (1L << (INPATH - 193)) | (1L << (CURRENT_DATE - 193)) | (1L << (CURRENT_TIMESTAMP - 193)) | (1L << (STRING - 193)) | (1L << (BIGINT_LITERAL - 193)) | (1L << (SMALLINT_LITERAL - 193)) | (1L << (TINYINT_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_LITERAL - 193)) | (1L << (BIGDECIMAL_LITERAL - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)))) != 0)) {
				{
				setState(1496);
				expression();
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1497);
					match(T__2);
					setState(1498);
					expression();
					}
					}
					setState(1503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1506);
			match(T__1);
			setState(1507);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1508);
					match(AS);
					}
					break;
				}
				setState(1511);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1512);
						match(T__2);
						setState(1513);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1518);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(ExternalSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(ExternalSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSetQuantifier(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			relationPrimary();
			setState(1527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1524);
					joinRelation();
					}
					} 
				}
				setState(1529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(ExternalSqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(ExternalSqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitJoinRelation(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_joinRelation);
		try {
			setState(1541);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1530);
				joinType();
				}
				setState(1531);
				match(JOIN);
				setState(1532);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1533);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				match(NATURAL);
				setState(1537);
				joinType();
				setState(1538);
				match(JOIN);
				setState(1539);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(ExternalSqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(ExternalSqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(ExternalSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(ExternalSqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(ExternalSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(ExternalSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(ExternalSqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(ExternalSqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitJoinType(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_joinType);
		int _la;
		try {
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1544);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1543);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1546);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1547);
				match(LEFT);
				setState(1549);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1548);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1551);
				match(LEFT);
				setState(1552);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1553);
				match(RIGHT);
				setState(1555);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1554);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1557);
				match(FULL);
				setState(1559);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1558);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1562);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1561);
					match(LEFT);
					}
				}

				setState(1564);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ExternalSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(ExternalSqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitJoinCriteria(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_joinCriteria);
		int _la;
		try {
			setState(1581);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1567);
				match(ON);
				setState(1568);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1569);
				match(USING);
				setState(1570);
				match(T__0);
				setState(1571);
				identifier();
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1572);
					match(T__2);
					setState(1573);
					identifier();
					}
					}
					setState(1578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1579);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public Token percentage;
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode TABLESAMPLE() { return getToken(ExternalSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode BYTELENGTH_LITERAL() { return getToken(ExternalSqlBaseParser.BYTELENGTH_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OUT() { return getToken(ExternalSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(ExternalSqlBaseParser.OF, 0); }
		public TerminalNode PERCENTLIT() { return getToken(ExternalSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode ROWS() { return getToken(ExternalSqlBaseParser.ROWS, 0); }
		public TerminalNode BUCKET() { return getToken(ExternalSqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(ExternalSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(ExternalSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode DECIMAL_VALUE() { return getToken(ExternalSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode ON() { return getToken(ExternalSqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSample(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(TABLESAMPLE);
			setState(1584);
			match(T__0);
			setState(1606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				{
				setState(1585);
				((SampleContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1586);
				((SampleContext)_localctx).sampleType = match(PERCENTLIT);
				}
				}
				break;
			case 2:
				{
				{
				setState(1587);
				expression();
				setState(1588);
				((SampleContext)_localctx).sampleType = match(ROWS);
				}
				}
				break;
			case 3:
				{
				setState(1590);
				((SampleContext)_localctx).sampleType = match(BYTELENGTH_LITERAL);
				}
				break;
			case 4:
				{
				{
				setState(1591);
				((SampleContext)_localctx).sampleType = match(BUCKET);
				setState(1592);
				((SampleContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1593);
				match(OUT);
				setState(1594);
				match(OF);
				setState(1595);
				((SampleContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1604);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1596);
					match(ON);
					setState(1602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						setState(1597);
						identifier();
						}
						break;
					case 2:
						{
						setState(1598);
						qualifiedName();
						setState(1599);
						match(T__0);
						setState(1600);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				}
				break;
			}
			setState(1608);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			match(T__0);
			setState(1611);
			identifierSeq();
			setState(1612);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIdentifierSeq(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			identifier();
			setState(1619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1615);
					match(T__2);
					setState(1616);
					identifier();
					}
					} 
				}
				setState(1621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(T__0);
			setState(1623);
			orderedIdentifier();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1624);
				match(T__2);
				setState(1625);
				orderedIdentifier();
				}
				}
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1631);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(ExternalSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ExternalSqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitOrderedIdentifier(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			identifier();
			setState(1635);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1634);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIdentifierCommentList(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(T__0);
			setState(1638);
			identifierComment();
			setState(1643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1639);
				match(T__2);
				setState(1640);
				identifierComment();
				}
				}
				setState(1645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1646);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ExternalSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIdentifierComment(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			identifier();
			setState(1651);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1649);
				match(COMMENT);
				setState(1650);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTableValuedFunction(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitInlineTableDefault2(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitAliasedRelation(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitAliasedQuery(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTableName(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_relationPrimary);
		int _la;
		try {
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1653);
				tableIdentifier();
				setState(1655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1654);
					sample();
					}
					break;
				}
				setState(1661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1657);
						match(AS);
						}
						break;
					}
					setState(1660);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				match(T__0);
				setState(1664);
				queryNoWith();
				setState(1665);
				match(T__1);
				setState(1667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1666);
					sample();
					}
					break;
				}
				setState(1673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1670);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1669);
						match(AS);
						}
						break;
					}
					setState(1672);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1675);
				match(T__0);
				setState(1676);
				relation();
				setState(1677);
				match(T__1);
				setState(1679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1678);
					sample();
					}
					break;
				}
				setState(1685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
					case 1:
						{
						setState(1681);
						match(AS);
						}
						break;
					}
					setState(1684);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1687);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1688);
				identifier();
				setState(1689);
				match(T__0);
				setState(1698);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (ASTERISK - 129)) | (1L << (DIV - 129)) | (1L << (TILDE - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (BUCKET - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (SORT - 129)) | (1L << (CLUSTER - 129)) | (1L << (DISTRIBUTE - 129)) | (1L << (OVERWRITE - 129)) | (1L << (TRANSFORM - 129)) | (1L << (REDUCE - 129)) | (1L << (USING - 129)) | (1L << (SERDE - 129)) | (1L << (SERDEPROPERTIES - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (DELIMITED - 129)) | (1L << (FIELDS - 129)) | (1L << (TERMINATED - 129)) | (1L << (COLLECTION - 129)) | (1L << (ITEMS - 129)) | (1L << (KEYS - 129)) | (1L << (ESCAPED - 129)) | (1L << (LINES - 129)) | (1L << (SEPARATED - 129)) | (1L << (FUNCTION - 129)) | (1L << (EXTENDED - 129)) | (1L << (REFRESH - 129)) | (1L << (CLEAR - 129)) | (1L << (CACHE - 129)) | (1L << (UNCACHE - 129)) | (1L << (LAZY - 129)) | (1L << (FORMATTED - 129)) | (1L << (GLOBAL - 129)) | (1L << (TEMPORARY - 129)) | (1L << (OPTIONS - 129)) | (1L << (UNSET - 129)) | (1L << (TBLPROPERTIES - 129)) | (1L << (DBPROPERTIES - 129)) | (1L << (BUCKETS - 129)) | (1L << (SKEWED - 129)) | (1L << (STORED - 129)) | (1L << (DIRECTORIES - 129)) | (1L << (LOCATION - 129)) | (1L << (EXCHANGE - 129)) | (1L << (ARCHIVE - 129)) | (1L << (UNARCHIVE - 129)) | (1L << (FILEFORMAT - 129)) | (1L << (TOUCH - 129)) | (1L << (COMPACT - 129)) | (1L << (CONCATENATE - 129)) | (1L << (CHANGE - 129)) | (1L << (CASCADE - 129)) | (1L << (RESTRICT - 129)) | (1L << (CLUSTERED - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (SORTED - 193)) | (1L << (PURGE - 193)) | (1L << (INPUTFORMAT - 193)) | (1L << (OUTPUTFORMAT - 193)) | (1L << (DATABASE - 193)) | (1L << (DATABASES - 193)) | (1L << (DFS - 193)) | (1L << (TRUNCATE - 193)) | (1L << (ANALYZE - 193)) | (1L << (COMPUTE - 193)) | (1L << (LIST - 193)) | (1L << (STATISTICS - 193)) | (1L << (PARTITIONED - 193)) | (1L << (EXTERNAL - 193)) | (1L << (DEFINED - 193)) | (1L << (REVOKE - 193)) | (1L << (GRANT - 193)) | (1L << (LOCK - 193)) | (1L << (UNLOCK - 193)) | (1L << (MSCK - 193)) | (1L << (REPAIR - 193)) | (1L << (RECOVER - 193)) | (1L << (EXPORT - 193)) | (1L << (IMPORT - 193)) | (1L << (LOAD - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (COMPACTIONS - 193)) | (1L << (PRINCIPALS - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (INDEX - 193)) | (1L << (INDEXES - 193)) | (1L << (LOCKS - 193)) | (1L << (OPTION - 193)) | (1L << (ANTI - 193)) | (1L << (LOCAL - 193)) | (1L << (INPATH - 193)) | (1L << (CURRENT_DATE - 193)) | (1L << (CURRENT_TIMESTAMP - 193)) | (1L << (STRING - 193)) | (1L << (BIGINT_LITERAL - 193)) | (1L << (SMALLINT_LITERAL - 193)) | (1L << (TINYINT_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_LITERAL - 193)) | (1L << (BIGDECIMAL_LITERAL - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)))) != 0)) {
					{
					setState(1690);
					expression();
					setState(1695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1691);
						match(T__2);
						setState(1692);
						expression();
						}
						}
						setState(1697);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1700);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(ExternalSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitInlineTable(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(VALUES);
			setState(1705);
			expression();
			setState(1710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1706);
					match(T__2);
					setState(1707);
					expression();
					}
					} 
				}
				setState(1712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1713);
					match(AS);
					}
					break;
				}
				setState(1716);
				identifier();
				setState(1718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1717);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(ExternalSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(ExternalSqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(ExternalSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(ExternalSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ExternalSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRowFormatSerde(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(ExternalSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(ExternalSqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(ExternalSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(ExternalSqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(ExternalSqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(ExternalSqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(ExternalSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ExternalSqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(ExternalSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(ExternalSqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(ExternalSqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(ExternalSqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(ExternalSqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(ExternalSqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(ExternalSqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(ExternalSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExternalSqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(ExternalSqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRowFormatDelimited(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_rowFormat);
		try {
			setState(1771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				match(ROW);
				setState(1723);
				match(FORMAT);
				setState(1724);
				match(SERDE);
				setState(1725);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1726);
					match(WITH);
					setState(1727);
					match(SERDEPROPERTIES);
					setState(1728);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1731);
				match(ROW);
				setState(1732);
				match(FORMAT);
				setState(1733);
				match(DELIMITED);
				setState(1743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1734);
					match(FIELDS);
					setState(1735);
					match(TERMINATED);
					setState(1736);
					match(BY);
					setState(1737);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1741);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
					case 1:
						{
						setState(1738);
						match(ESCAPED);
						setState(1739);
						match(BY);
						setState(1740);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1745);
					match(COLLECTION);
					setState(1746);
					match(ITEMS);
					setState(1747);
					match(TERMINATED);
					setState(1748);
					match(BY);
					setState(1749);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1752);
					match(MAP);
					setState(1753);
					match(KEYS);
					setState(1754);
					match(TERMINATED);
					setState(1755);
					match(BY);
					setState(1756);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1759);
					match(LINES);
					setState(1760);
					match(TERMINATED);
					setState(1761);
					match(BY);
					setState(1762);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1765);
					match(NULL);
					setState(1766);
					match(DEFINED);
					setState(1767);
					match(AS);
					setState(1768);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTableIdentifier(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1773);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1774);
				match(T__3);
				}
				break;
			}
			setState(1778);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitFunctionIdentifier(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1780);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1781);
				match(T__3);
				}
				break;
			}
			setState(1785);
			((FunctionIdentifierContext)_localctx).function = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitNamedExpression(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			expression();
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1788);
					match(AS);
					}
					break;
				}
				setState(1793);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1791);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1792);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			namedExpression();
			setState(1802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1798);
					match(T__2);
					setState(1799);
					namedExpression();
					}
					} 
				}
				setState(1804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitLogicalNot(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitBooleanDefault(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitExists(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ExternalSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExternalSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitLogicalBinary(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1808);
				match(NOT);
				setState(1809);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1810);
				match(EXISTS);
				setState(1811);
				match(T__0);
				setState(1812);
				query();
				setState(1813);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1815);
				predicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1824);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1818);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1819);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1820);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1821);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1822);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1823);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitPredicated(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			valueExpression(0);
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1830);
				predicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(ExternalSqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(ExternalSqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(ExternalSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(ExternalSqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(ExternalSqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(ExternalSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(ExternalSqlBaseParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_predicate);
		int _la;
		try {
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1834);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1833);
					match(NOT);
					}
				}

				setState(1836);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1837);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1838);
				match(AND);
				setState(1839);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1841);
					match(NOT);
					}
				}

				setState(1844);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1845);
				match(T__0);
				setState(1846);
				expression();
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1847);
					match(T__2);
					setState(1848);
					expression();
					}
					}
					setState(1853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1854);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1857);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1856);
					match(NOT);
					}
				}

				setState(1859);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1860);
				match(T__0);
				setState(1861);
				query();
				setState(1862);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1865);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1864);
					match(NOT);
					}
				}

				setState(1867);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1868);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1869);
				match(IS);
				setState(1871);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1870);
					match(NOT);
					}
				}

				setState(1873);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitComparison(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(ExternalSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ExternalSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ExternalSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(ExternalSqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ExternalSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(ExternalSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(ExternalSqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(ExternalSqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitArithmeticBinary(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ExternalSqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(ExternalSqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitArithmeticUnary(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1877);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1878);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (TILDE - 129)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1879);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1901);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1882);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1883);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (ASTERISK - 131)) | (1L << (SLASH - 131)) | (1L << (PERCENT - 131)) | (1L << (DIV - 131)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1884);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1885);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1886);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1887);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1888);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1889);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1890);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1891);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1892);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1893);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1894);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1895);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1896);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1897);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1898);
						comparisonOperator();
						setState(1899);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(ExternalSqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitStruct(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDereference(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(ExternalSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ExternalSqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ExternalSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSimpleCase(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitColumnReference(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitRowConstructor(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(ExternalSqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(ExternalSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(ExternalSqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitLast(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(ExternalSqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitStar(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSubscript(this);
		}
	}
	public static class TimeFunctionCallContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(ExternalSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(ExternalSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TimeFunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTimeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTimeFunctionCall(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSubqueryExpression(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(ExternalSqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitCast(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitConstantDefault(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(ExternalSqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitFunctionCall(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(ExternalSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ExternalSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ExternalSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSearchedCase(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(ExternalSqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(ExternalSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(ExternalSqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitFirst(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				_localctx = new TimeFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1907);
				((TimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((TimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1908);
				match(CASE);
				setState(1910); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1909);
					whenClause();
					}
					}
					setState(1912); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1916);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1914);
					match(ELSE);
					setState(1915);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1918);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1920);
				match(CASE);
				setState(1921);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1923); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1922);
					whenClause();
					}
					}
					setState(1925); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1929);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1927);
					match(ELSE);
					setState(1928);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1931);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1933);
				match(CAST);
				setState(1934);
				match(T__0);
				setState(1935);
				expression();
				setState(1936);
				match(AS);
				setState(1937);
				dataType();
				setState(1938);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1940);
				match(STRUCT);
				setState(1941);
				match(T__0);
				setState(1950);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (ASTERISK - 129)) | (1L << (DIV - 129)) | (1L << (TILDE - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (BUCKET - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (SORT - 129)) | (1L << (CLUSTER - 129)) | (1L << (DISTRIBUTE - 129)) | (1L << (OVERWRITE - 129)) | (1L << (TRANSFORM - 129)) | (1L << (REDUCE - 129)) | (1L << (USING - 129)) | (1L << (SERDE - 129)) | (1L << (SERDEPROPERTIES - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (DELIMITED - 129)) | (1L << (FIELDS - 129)) | (1L << (TERMINATED - 129)) | (1L << (COLLECTION - 129)) | (1L << (ITEMS - 129)) | (1L << (KEYS - 129)) | (1L << (ESCAPED - 129)) | (1L << (LINES - 129)) | (1L << (SEPARATED - 129)) | (1L << (FUNCTION - 129)) | (1L << (EXTENDED - 129)) | (1L << (REFRESH - 129)) | (1L << (CLEAR - 129)) | (1L << (CACHE - 129)) | (1L << (UNCACHE - 129)) | (1L << (LAZY - 129)) | (1L << (FORMATTED - 129)) | (1L << (GLOBAL - 129)) | (1L << (TEMPORARY - 129)) | (1L << (OPTIONS - 129)) | (1L << (UNSET - 129)) | (1L << (TBLPROPERTIES - 129)) | (1L << (DBPROPERTIES - 129)) | (1L << (BUCKETS - 129)) | (1L << (SKEWED - 129)) | (1L << (STORED - 129)) | (1L << (DIRECTORIES - 129)) | (1L << (LOCATION - 129)) | (1L << (EXCHANGE - 129)) | (1L << (ARCHIVE - 129)) | (1L << (UNARCHIVE - 129)) | (1L << (FILEFORMAT - 129)) | (1L << (TOUCH - 129)) | (1L << (COMPACT - 129)) | (1L << (CONCATENATE - 129)) | (1L << (CHANGE - 129)) | (1L << (CASCADE - 129)) | (1L << (RESTRICT - 129)) | (1L << (CLUSTERED - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (SORTED - 193)) | (1L << (PURGE - 193)) | (1L << (INPUTFORMAT - 193)) | (1L << (OUTPUTFORMAT - 193)) | (1L << (DATABASE - 193)) | (1L << (DATABASES - 193)) | (1L << (DFS - 193)) | (1L << (TRUNCATE - 193)) | (1L << (ANALYZE - 193)) | (1L << (COMPUTE - 193)) | (1L << (LIST - 193)) | (1L << (STATISTICS - 193)) | (1L << (PARTITIONED - 193)) | (1L << (EXTERNAL - 193)) | (1L << (DEFINED - 193)) | (1L << (REVOKE - 193)) | (1L << (GRANT - 193)) | (1L << (LOCK - 193)) | (1L << (UNLOCK - 193)) | (1L << (MSCK - 193)) | (1L << (REPAIR - 193)) | (1L << (RECOVER - 193)) | (1L << (EXPORT - 193)) | (1L << (IMPORT - 193)) | (1L << (LOAD - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (COMPACTIONS - 193)) | (1L << (PRINCIPALS - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (INDEX - 193)) | (1L << (INDEXES - 193)) | (1L << (LOCKS - 193)) | (1L << (OPTION - 193)) | (1L << (ANTI - 193)) | (1L << (LOCAL - 193)) | (1L << (INPATH - 193)) | (1L << (CURRENT_DATE - 193)) | (1L << (CURRENT_TIMESTAMP - 193)) | (1L << (STRING - 193)) | (1L << (BIGINT_LITERAL - 193)) | (1L << (SMALLINT_LITERAL - 193)) | (1L << (TINYINT_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_LITERAL - 193)) | (1L << (BIGDECIMAL_LITERAL - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)))) != 0)) {
					{
					setState(1942);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(1947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1943);
						match(T__2);
						setState(1944);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(1949);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1952);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1953);
				match(FIRST);
				setState(1954);
				match(T__0);
				setState(1955);
				expression();
				setState(1958);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1956);
					match(IGNORE);
					setState(1957);
					match(NULLS);
					}
				}

				setState(1960);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1962);
				match(LAST);
				setState(1963);
				match(T__0);
				setState(1964);
				expression();
				setState(1967);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1965);
					match(IGNORE);
					setState(1966);
					match(NULLS);
					}
				}

				setState(1969);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1971);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1972);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1973);
				qualifiedName();
				setState(1974);
				match(T__3);
				setState(1975);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1977);
				match(T__0);
				setState(1978);
				namedExpression();
				setState(1981); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1979);
					match(T__2);
					setState(1980);
					namedExpression();
					}
					}
					setState(1983); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(1985);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1987);
				match(T__0);
				setState(1988);
				query();
				setState(1989);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1991);
				qualifiedName();
				setState(1992);
				match(T__0);
				setState(2004);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (ASTERISK - 129)) | (1L << (DIV - 129)) | (1L << (TILDE - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (BUCKET - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (SORT - 129)) | (1L << (CLUSTER - 129)) | (1L << (DISTRIBUTE - 129)) | (1L << (OVERWRITE - 129)) | (1L << (TRANSFORM - 129)) | (1L << (REDUCE - 129)) | (1L << (USING - 129)) | (1L << (SERDE - 129)) | (1L << (SERDEPROPERTIES - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (DELIMITED - 129)) | (1L << (FIELDS - 129)) | (1L << (TERMINATED - 129)) | (1L << (COLLECTION - 129)) | (1L << (ITEMS - 129)) | (1L << (KEYS - 129)) | (1L << (ESCAPED - 129)) | (1L << (LINES - 129)) | (1L << (SEPARATED - 129)) | (1L << (FUNCTION - 129)) | (1L << (EXTENDED - 129)) | (1L << (REFRESH - 129)) | (1L << (CLEAR - 129)) | (1L << (CACHE - 129)) | (1L << (UNCACHE - 129)) | (1L << (LAZY - 129)) | (1L << (FORMATTED - 129)) | (1L << (GLOBAL - 129)) | (1L << (TEMPORARY - 129)) | (1L << (OPTIONS - 129)) | (1L << (UNSET - 129)) | (1L << (TBLPROPERTIES - 129)) | (1L << (DBPROPERTIES - 129)) | (1L << (BUCKETS - 129)) | (1L << (SKEWED - 129)) | (1L << (STORED - 129)) | (1L << (DIRECTORIES - 129)) | (1L << (LOCATION - 129)) | (1L << (EXCHANGE - 129)) | (1L << (ARCHIVE - 129)) | (1L << (UNARCHIVE - 129)) | (1L << (FILEFORMAT - 129)) | (1L << (TOUCH - 129)) | (1L << (COMPACT - 129)) | (1L << (CONCATENATE - 129)) | (1L << (CHANGE - 129)) | (1L << (CASCADE - 129)) | (1L << (RESTRICT - 129)) | (1L << (CLUSTERED - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (SORTED - 193)) | (1L << (PURGE - 193)) | (1L << (INPUTFORMAT - 193)) | (1L << (OUTPUTFORMAT - 193)) | (1L << (DATABASE - 193)) | (1L << (DATABASES - 193)) | (1L << (DFS - 193)) | (1L << (TRUNCATE - 193)) | (1L << (ANALYZE - 193)) | (1L << (COMPUTE - 193)) | (1L << (LIST - 193)) | (1L << (STATISTICS - 193)) | (1L << (PARTITIONED - 193)) | (1L << (EXTERNAL - 193)) | (1L << (DEFINED - 193)) | (1L << (REVOKE - 193)) | (1L << (GRANT - 193)) | (1L << (LOCK - 193)) | (1L << (UNLOCK - 193)) | (1L << (MSCK - 193)) | (1L << (REPAIR - 193)) | (1L << (RECOVER - 193)) | (1L << (EXPORT - 193)) | (1L << (IMPORT - 193)) | (1L << (LOAD - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (COMPACTIONS - 193)) | (1L << (PRINCIPALS - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (INDEX - 193)) | (1L << (INDEXES - 193)) | (1L << (LOCKS - 193)) | (1L << (OPTION - 193)) | (1L << (ANTI - 193)) | (1L << (LOCAL - 193)) | (1L << (INPATH - 193)) | (1L << (CURRENT_DATE - 193)) | (1L << (CURRENT_TIMESTAMP - 193)) | (1L << (STRING - 193)) | (1L << (BIGINT_LITERAL - 193)) | (1L << (SMALLINT_LITERAL - 193)) | (1L << (TINYINT_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_LITERAL - 193)) | (1L << (BIGDECIMAL_LITERAL - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)))) != 0)) {
					{
					setState(1994);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
					case 1:
						{
						setState(1993);
						setQuantifier();
						}
						break;
					}
					setState(1996);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2001);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1997);
						match(T__2);
						setState(1998);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2003);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2006);
				match(T__1);
				setState(2009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2007);
					match(OVER);
					setState(2008);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2011);
				identifier();
				}
				break;
			case 15:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2012);
				match(T__0);
				setState(2013);
				expression();
				setState(2014);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2028);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2026);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2018);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2019);
						match(T__6);
						setState(2020);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2021);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2023);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2024);
						match(T__3);
						setState(2025);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2030);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(ExternalSqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitNullLiteral(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(ExternalSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExternalSqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitStringLiteral(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTypeConstructor(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIntervalLiteral(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitNumericLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitBooleanLiteral(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_constant);
		try {
			int _alt;
			setState(2043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2031);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2032);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2033);
				identifier();
				setState(2034);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2036);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2037);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2039); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2038);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2041); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ExternalSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ExternalSqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(ExternalSqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(ExternalSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ExternalSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(ExternalSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(ExternalSqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(ExternalSqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (EQ - 121)) | (1L << (NSEQ - 121)) | (1L << (NEQ - 121)) | (1L << (NEQJ - 121)) | (1L << (LT - 121)) | (1L << (LTE - 121)) | (1L << (GT - 121)) | (1L << (GTE - 121)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ExternalSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(ExternalSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ExternalSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ExternalSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(ExternalSqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(ExternalSqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(ExternalSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(ExternalSqlBaseParser.PIPE, 0); }
		public TerminalNode HAT() { return getToken(ExternalSqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitArithmeticOperator(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			_la = _input.LA(1);
			if ( !(((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (ASTERISK - 129)) | (1L << (SLASH - 129)) | (1L << (PERCENT - 129)) | (1L << (DIV - 129)) | (1L << (TILDE - 129)) | (1L << (AMPERSAND - 129)) | (1L << (PIPE - 129)) | (1L << (HAT - 129)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ExternalSqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(ExternalSqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(ExternalSqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitPredicateOperator(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ExternalSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExternalSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitBooleanValue(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(ExternalSqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(INTERVAL);
			setState(2057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2054);
					intervalField();
					}
					} 
				}
				setState(2059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(ExternalSqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIntervalField(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2061);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2062);
				match(TO);
				setState(2063);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(ExternalSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(ExternalSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(ExternalSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIntervalValue(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_intervalValue);
		int _la;
		try {
			setState(2071);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2067);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2066);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(2069);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2070);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(ExternalSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(ExternalSqlBaseParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitColPosition(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_colPosition);
		try {
			setState(2076);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2073);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2074);
				match(AFTER);
				setState(2075);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(ExternalSqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(ExternalSqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(ExternalSqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(ExternalSqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitComplexDataType(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(ExternalSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(ExternalSqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitPrimitiveDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_dataType);
		int _la;
		try {
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2078);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2079);
				match(LT);
				setState(2080);
				dataType();
				setState(2081);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2083);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2084);
				match(LT);
				setState(2085);
				dataType();
				setState(2086);
				match(T__2);
				setState(2087);
				dataType();
				setState(2088);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2090);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2097);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2091);
					match(LT);
					setState(2093);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DIV - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (USING - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)) | (1L << (CLUSTERED - 134)) | (1L << (SORTED - 134)) | (1L << (PURGE - 134)) | (1L << (INPUTFORMAT - 134)) | (1L << (OUTPUTFORMAT - 134)) | (1L << (DATABASE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (CURRENT_DATE - 198)) | (1L << (CURRENT_TIMESTAMP - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
						{
						setState(2092);
						complexColTypeList();
						}
					}

					setState(2095);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2096);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2099);
				identifier();
				setState(2110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2100);
					match(T__0);
					setState(2101);
					match(INTEGER_VALUE);
					setState(2106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2102);
						match(T__2);
						setState(2103);
						match(INTEGER_VALUE);
						}
						}
						setState(2108);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2109);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitColTypeList(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			colType();
			setState(2119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2115);
					match(T__2);
					setState(2116);
					colType();
					}
					} 
				}
				setState(2121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ExternalSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitColType(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			identifier();
			setState(2123);
			dataType();
			setState(2126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2124);
				match(COMMENT);
				setState(2125);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitComplexColTypeList(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			complexColType();
			setState(2133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2129);
				match(T__2);
				setState(2130);
				complexColType();
				}
				}
				setState(2135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ExternalSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(ExternalSqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitComplexColType(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			identifier();
			setState(2137);
			match(T__8);
			setState(2138);
			dataType();
			setState(2141);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2139);
				match(COMMENT);
				setState(2140);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(ExternalSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(ExternalSqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitWhenClause(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			match(WHEN);
			setState(2144);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2145);
			match(THEN);
			setState(2146);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(ExternalSqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitWindows(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			match(WINDOW);
			setState(2149);
			namedWindow();
			setState(2154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2150);
					match(T__2);
					setState(2151);
					namedWindow();
					}
					} 
				}
				setState(2156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitNamedWindow(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			identifier();
			setState(2158);
			match(AS);
			setState(2159);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitWindowRef(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(ExternalSqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(ExternalSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ExternalSqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(ExternalSqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(ExternalSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(ExternalSqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(ExternalSqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitWindowDef(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_windowSpec);
		int _la;
		try {
			setState(2203);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__0:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2162);
				match(T__0);
				setState(2197);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2163);
					match(CLUSTER);
					setState(2164);
					match(BY);
					setState(2165);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2166);
						match(T__2);
						setState(2167);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2172);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2183);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2173);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2174);
						match(BY);
						setState(2175);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2180);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2176);
							match(T__2);
							setState(2177);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2182);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2195);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2185);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2186);
						match(BY);
						setState(2187);
						sortItem();
						setState(2192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2188);
							match(T__2);
							setState(2189);
							sortItem();
							}
							}
							setState(2194);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2200);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2199);
					windowFrame();
					}
				}

				setState(2202);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(ExternalSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(ExternalSqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(ExternalSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ExternalSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitWindowFrame(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_windowFrame);
		try {
			setState(2221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2205);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2206);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2207);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2208);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2209);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2210);
				match(BETWEEN);
				setState(2211);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2212);
				match(AND);
				setState(2213);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2215);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2216);
				match(BETWEEN);
				setState(2217);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2218);
				match(AND);
				setState(2219);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(ExternalSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(ExternalSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(ExternalSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(ExternalSqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(ExternalSqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitFrameBound(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_frameBound);
		int _la;
		try {
			setState(2230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2223);
				match(UNBOUNDED);
				setState(2224);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2225);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2226);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2227);
				expression();
				setState(2228);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			identifier();
			setState(2237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2233);
					match(T__3);
					setState(2234);
					identifier();
					}
					} 
				}
				setState(2239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(ExternalSqlBaseParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(ExternalSqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(ExternalSqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(ExternalSqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(ExternalSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(ExternalSqlBaseParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(ExternalSqlBaseParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(ExternalSqlBaseParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(ExternalSqlBaseParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(ExternalSqlBaseParser.ON, 0); }
		public TerminalNode UNION() { return getToken(ExternalSqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(ExternalSqlBaseParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(ExternalSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(ExternalSqlBaseParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_identifier);
		try {
			setState(2255);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2240);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2241);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2242);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2243);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2244);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2245);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2246);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2247);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2248);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2249);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2250);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2251);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2252);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2253);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2254);
				match(SETMINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(ExternalSqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_strictIdentifier);
		try {
			setState(2260);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2257);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2258);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2259);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(ExternalSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(ExternalSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(ExternalSqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitBigIntLiteral(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(ExternalSqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitTinyIntLiteral(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(ExternalSqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(ExternalSqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitDoubleLiteral(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(ExternalSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitIntegerLiteral(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(ExternalSqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(ExternalSqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitSmallIntLiteral(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_number);
		int _la;
		try {
			setState(2292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2265);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2264);
					match(MINUS);
					}
				}

				setState(2267);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2269);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2268);
					match(MINUS);
					}
				}

				setState(2271);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2273);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2272);
					match(MINUS);
					}
				}

				setState(2275);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2277);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2276);
					match(MINUS);
					}
				}

				setState(2279);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2281);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2280);
					match(MINUS);
					}
				}

				setState(2283);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2285);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2284);
					match(MINUS);
					}
				}

				setState(2287);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2289);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2288);
					match(MINUS);
					}
				}

				setState(2291);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(ExternalSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ExternalSqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(ExternalSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(ExternalSqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(ExternalSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(ExternalSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(ExternalSqlBaseParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(ExternalSqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(ExternalSqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(ExternalSqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(ExternalSqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(ExternalSqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(ExternalSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(ExternalSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(ExternalSqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(ExternalSqlBaseParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(ExternalSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(ExternalSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(ExternalSqlBaseParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(ExternalSqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(ExternalSqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(ExternalSqlBaseParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(ExternalSqlBaseParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(ExternalSqlBaseParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(ExternalSqlBaseParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(ExternalSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode USING() { return getToken(ExternalSqlBaseParser.USING, 0); }
		public TerminalNode SERDE() { return getToken(ExternalSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(ExternalSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(ExternalSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(ExternalSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(ExternalSqlBaseParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(ExternalSqlBaseParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(ExternalSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(ExternalSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(ExternalSqlBaseParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(ExternalSqlBaseParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(ExternalSqlBaseParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(ExternalSqlBaseParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(ExternalSqlBaseParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(ExternalSqlBaseParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(ExternalSqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(ExternalSqlBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(ExternalSqlBaseParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(ExternalSqlBaseParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(ExternalSqlBaseParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(ExternalSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(ExternalSqlBaseParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(ExternalSqlBaseParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(ExternalSqlBaseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ExternalSqlBaseParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(ExternalSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(ExternalSqlBaseParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(ExternalSqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(ExternalSqlBaseParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(ExternalSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(ExternalSqlBaseParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(ExternalSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(ExternalSqlBaseParser.USE, 0); }
		public List<TerminalNode> TO() { return getTokens(ExternalSqlBaseParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(ExternalSqlBaseParser.TO, i);
		}
		public TerminalNode BUCKET() { return getToken(ExternalSqlBaseParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(ExternalSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(ExternalSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(ExternalSqlBaseParser.OF, 0); }
		public TerminalNode SET() { return getToken(ExternalSqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(ExternalSqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(ExternalSqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(ExternalSqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ExternalSqlBaseParser.IF, 0); }
		public TerminalNode NO() { return getToken(ExternalSqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(ExternalSqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(ExternalSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(ExternalSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(ExternalSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(ExternalSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(ExternalSqlBaseParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(ExternalSqlBaseParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(ExternalSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(ExternalSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(ExternalSqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(ExternalSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(ExternalSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(ExternalSqlBaseParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(ExternalSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(ExternalSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(ExternalSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(ExternalSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(ExternalSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(ExternalSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(ExternalSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(ExternalSqlBaseParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(ExternalSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(ExternalSqlBaseParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(ExternalSqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExternalSqlBaseParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(ExternalSqlBaseParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(ExternalSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(ExternalSqlBaseParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(ExternalSqlBaseParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(ExternalSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(ExternalSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(ExternalSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(ExternalSqlBaseParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(ExternalSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(ExternalSqlBaseParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(ExternalSqlBaseParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(ExternalSqlBaseParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(ExternalSqlBaseParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(ExternalSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(ExternalSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(ExternalSqlBaseParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(ExternalSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(ExternalSqlBaseParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(ExternalSqlBaseParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(ExternalSqlBaseParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(ExternalSqlBaseParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(ExternalSqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(ExternalSqlBaseParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(ExternalSqlBaseParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(ExternalSqlBaseParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(ExternalSqlBaseParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(ExternalSqlBaseParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(ExternalSqlBaseParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(ExternalSqlBaseParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(ExternalSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(ExternalSqlBaseParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(ExternalSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(ExternalSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(ExternalSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(ExternalSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(ExternalSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(ExternalSqlBaseParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(ExternalSqlBaseParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(ExternalSqlBaseParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(ExternalSqlBaseParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(ExternalSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ExternalSqlBaseParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(ExternalSqlBaseParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(ExternalSqlBaseParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(ExternalSqlBaseParser.SETS, 0); }
		public TerminalNode AT() { return getToken(ExternalSqlBaseParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(ExternalSqlBaseParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(ExternalSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(ExternalSqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(ExternalSqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(ExternalSqlBaseParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(ExternalSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(ExternalSqlBaseParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(ExternalSqlBaseParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(ExternalSqlBaseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(ExternalSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(ExternalSqlBaseParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(ExternalSqlBaseParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(ExternalSqlBaseParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(ExternalSqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(ExternalSqlBaseParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(ExternalSqlBaseParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(ExternalSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ExternalSqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(ExternalSqlBaseParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(ExternalSqlBaseParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(ExternalSqlBaseParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(ExternalSqlBaseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(ExternalSqlBaseParser.OUTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(ExternalSqlBaseParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(ExternalSqlBaseParser.TABLE, i);
		}
		public TerminalNode TRUE() { return getToken(ExternalSqlBaseParser.TRUE, 0); }
		public List<TerminalNode> WITH() { return getTokens(ExternalSqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(ExternalSqlBaseParser.WITH, i);
		}
		public TerminalNode RLIKE() { return getToken(ExternalSqlBaseParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(ExternalSqlBaseParser.AND, 0); }
		public TerminalNode CASE() { return getToken(ExternalSqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(ExternalSqlBaseParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(ExternalSqlBaseParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(ExternalSqlBaseParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(ExternalSqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ExternalSqlBaseParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(ExternalSqlBaseParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(ExternalSqlBaseParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(ExternalSqlBaseParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(ExternalSqlBaseParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(ExternalSqlBaseParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(ExternalSqlBaseParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(ExternalSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(ExternalSqlBaseParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(ExternalSqlBaseParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(ExternalSqlBaseParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(ExternalSqlBaseParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(ExternalSqlBaseParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(ExternalSqlBaseParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(ExternalSqlBaseParser.NOT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(ExternalSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(ExternalSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExternalSqlBaseListener ) ((ExternalSqlBaseListener)listener).exitNonReserved(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (DIV - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (USING - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (GLOBAL - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)) | (1L << (CLUSTERED - 134)) | (1L << (SORTED - 134)) | (1L << (PURGE - 134)) | (1L << (INPUTFORMAT - 134)) | (1L << (OUTPUTFORMAT - 134)) | (1L << (DATABASE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (RECOVER - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (CURRENT_DATE - 198)) | (1L << (CURRENT_TIMESTAMP - 198)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 64:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 67:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 68:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00fa\u08fb\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d8\n\7\3\7\3\7\3\7\5\7\u00dd\n\7\3\7"+
		"\5\7\u00e0\n\7\3\7\3\7\3\7\5\7\u00e5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00f2\n\7\3\7\3\7\5\7\u00f6\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00fd\n\7\3\7\3\7\3\7\5\7\u0102\n\7\3\7\3\7\3\7\5\7\u0107\n\7\3\7"+
		"\5\7\u010a\n\7\3\7\5\7\u010d\n\7\3\7\3\7\5\7\u0111\n\7\3\7\5\7\u0114\n"+
		"\7\3\7\5\7\u0117\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u011e\n\7\3\7\3\7\5\7\u0122"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u012a\n\7\3\7\5\7\u012d\n\7\3\7\5\7\u0130"+
		"\n\7\3\7\5\7\u0133\n\7\3\7\5\7\u0136\n\7\3\7\5\7\u0139\n\7\3\7\3\7\5\7"+
		"\u013d\n\7\3\7\5\7\u0140\n\7\3\7\5\7\u0143\n\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u014a\n\7\3\7\3\7\3\7\3\7\5\7\u0150\n\7\3\7\3\7\3\7\3\7\5\7\u0156\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u015e\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u017e\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0186\n\7"+
		"\3\7\3\7\5\7\u018a\n\7\3\7\3\7\3\7\5\7\u018f\n\7\3\7\3\7\3\7\3\7\5\7\u0195"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u019d\n\7\3\7\3\7\3\7\3\7\5\7\u01a3\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01b0\n\7\3\7\6\7\u01b3"+
		"\n\7\r\7\16\7\u01b4\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01be\n\7\3\7\6\7"+
		"\u01c1\n\7\r\7\16\7\u01c2\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u01d3\n\7\3\7\3\7\3\7\7\7\u01d8\n\7\f\7\16\7\u01db\13"+
		"\7\3\7\5\7\u01de\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01e6\n\7\3\7\3\7\3\7"+
		"\7\7\u01eb\n\7\f\7\16\7\u01ee\13\7\3\7\3\7\3\7\3\7\5\7\u01f4\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0203\n\7\3\7\3\7\5"+
		"\7\u0207\n\7\3\7\3\7\3\7\3\7\5\7\u020d\n\7\3\7\3\7\3\7\3\7\5\7\u0213\n"+
		"\7\3\7\5\7\u0216\n\7\3\7\5\7\u0219\n\7\3\7\3\7\3\7\3\7\5\7\u021f\n\7\3"+
		"\7\3\7\5\7\u0223\n\7\3\7\3\7\5\7\u0227\n\7\3\7\3\7\3\7\5\7\u022c\n\7\3"+
		"\7\3\7\5\7\u0230\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0238\n\7\3\7\5\7\u023b"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0244\n\7\3\7\3\7\3\7\5\7\u0249\n"+
		"\7\3\7\3\7\3\7\3\7\5\7\u024f\n\7\3\7\3\7\3\7\3\7\5\7\u0255\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u025f\n\7\f\7\16\7\u0262\13\7\5\7\u0264\n"+
		"\7\3\7\3\7\5\7\u0268\n\7\3\7\3\7\3\7\5\7\u026d\n\7\3\7\3\7\3\7\5\7\u0272"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0279\n\7\3\7\5\7\u027c\n\7\3\7\5\7\u027f"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0286\n\7\3\7\3\7\3\7\5\7\u028b\n\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0291\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u029a\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u02a2\n\7\3\7\3\7\3\7\3\7\5\7\u02a8\n\7\3\7\3"+
		"\7\5\7\u02ac\n\7\3\7\3\7\5\7\u02b0\n\7\3\7\3\7\5\7\u02b4\n\7\5\7\u02b6"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u02bf\n\7\3\7\3\7\3\7\3\7\5\7\u02c5"+
		"\n\7\3\7\3\7\3\7\5\7\u02ca\n\7\3\7\5\7\u02cd\n\7\3\7\3\7\5\7\u02d1\n\7"+
		"\3\7\5\7\u02d4\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u02db\n\7\f\7\16\7\u02de\13"+
		"\7\3\7\3\7\5\7\u02e2\n\7\3\7\3\7\3\7\5\7\u02e7\n\7\3\7\5\7\u02ea\n\7\3"+
		"\7\3\7\3\7\3\7\5\7\u02f0\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u02f8\n\7\3\7"+
		"\3\7\3\7\5\7\u02fd\n\7\3\7\3\7\3\7\3\7\5\7\u0303\n\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0309\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0312\n\7\f\7\16\7\u0315"+
		"\13\7\3\7\3\7\3\7\7\7\u031a\n\7\f\7\16\7\u031d\13\7\3\7\3\7\7\7\u0321"+
		"\n\7\f\7\16\7\u0324\13\7\3\7\3\7\3\7\7\7\u0329\n\7\f\7\16\7\u032c\13\7"+
		"\5\7\u032e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0336\n\b\3\b\3\b\5\b\u033a"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0341\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u03b5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u03bd\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u03c5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u03ce\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u03da\n\b\3\t\3\t\5\t\u03de\n"+
		"\t\3\t\5\t\u03e1\n\t\3\t\3\t\3\t\3\t\5\t\u03e7\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u03f1\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u03fd\n\13\3\13\3\13\3\13\5\13\u0402\n\13\3\f\3\f\3\f\3\r\5\r"+
		"\u0408\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0415"+
		"\n\16\5\16\u0417\n\16\3\16\3\16\3\16\5\16\u041c\n\16\3\16\3\16\5\16\u0420"+
		"\n\16\5\16\u0422\n\16\3\17\3\17\5\17\u0426\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u042d\n\20\f\20\16\20\u0430\13\20\3\20\3\20\3\21\3\21\3\21\5"+
		"\21\u0437\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u043e\n\22\3\23\3\23\3\23"+
		"\3\23\5\23\u0444\n\23\7\23\u0446\n\23\f\23\16\23\u0449\13\23\3\24\3\24"+
		"\3\24\3\24\7\24\u044f\n\24\f\24\16\24\u0452\13\24\3\25\3\25\5\25\u0456"+
		"\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0463"+
		"\n\27\f\27\16\27\u0466\13\27\3\27\3\27\3\30\3\30\5\30\u046c\n\30\3\30"+
		"\5\30\u046f\n\30\3\31\3\31\3\31\7\31\u0474\n\31\f\31\16\31\u0477\13\31"+
		"\3\31\5\31\u047a\n\31\3\32\3\32\3\32\3\32\5\32\u0480\n\32\3\33\3\33\3"+
		"\33\3\33\7\33\u0486\n\33\f\33\16\33\u0489\13\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\7\34\u0491\n\34\f\34\16\34\u0494\13\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u049e\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u04a5"+
		"\n\36\3\37\3\37\3\37\3\37\5\37\u04ab\n\37\3 \3 \3 \3!\5!\u04b1\n!\3!\3"+
		"!\3!\3!\3!\3!\6!\u04b9\n!\r!\16!\u04ba\3!\3!\5!\u04bf\n!\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u04c6\n\"\f\"\16\"\u04c9\13\"\5\"\u04cb\n\"\3\"\3\"\3\"\3\""+
		"\3\"\7\"\u04d2\n\"\f\"\16\"\u04d5\13\"\5\"\u04d7\n\"\3\"\3\"\3\"\3\"\3"+
		"\"\7\"\u04de\n\"\f\"\16\"\u04e1\13\"\5\"\u04e3\n\"\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u04ea\n\"\f\"\16\"\u04ed\13\"\5\"\u04ef\n\"\3\"\5\"\u04f2\n\"\3\""+
		"\3\"\5\"\u04f6\n\"\3#\5#\u04f9\n#\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0504"+
		"\n$\3$\7$\u0507\n$\f$\16$\u050a\13$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0514\n"+
		"%\3&\3&\5&\u0518\n&\3&\3&\5&\u051c\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u0528\n\'\3\'\5\'\u052b\n\'\3\'\3\'\5\'\u052f\n\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0539\n\'\3\'\3\'\5\'\u053d\n\'\5\'\u053f"+
		"\n\'\3\'\5\'\u0542\n\'\3\'\3\'\5\'\u0546\n\'\3\'\5\'\u0549\n\'\3\'\3\'"+
		"\5\'\u054d\n\'\3\'\3\'\7\'\u0551\n\'\f\'\16\'\u0554\13\'\3\'\5\'\u0557"+
		"\n\'\3\'\3\'\5\'\u055b\n\'\3\'\3\'\3\'\5\'\u0560\n\'\3\'\5\'\u0563\n\'"+
		"\5\'\u0565\n\'\3\'\7\'\u0568\n\'\f\'\16\'\u056b\13\'\3\'\3\'\5\'\u056f"+
		"\n\'\3\'\5\'\u0572\n\'\3\'\3\'\5\'\u0576\n\'\3\'\5\'\u0579\n\'\5\'\u057b"+
		"\n\'\3(\3(\3(\5(\u0580\n(\3(\7(\u0583\n(\f(\16(\u0586\13(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\7)\u0590\n)\f)\16)\u0593\13)\3)\3)\5)\u0597\n)\3*\3*\3*\3"+
		"*\7*\u059d\n*\f*\16*\u05a0\13*\3*\7*\u05a3\n*\f*\16*\u05a6\13*\3+\3+\3"+
		"+\3+\3+\7+\u05ad\n+\f+\16+\u05b0\13+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+"+
		"\u05bc\n+\f+\16+\u05bf\13+\3+\3+\5+\u05c3\n+\3,\3,\3,\3,\7,\u05c9\n,\f"+
		",\16,\u05cc\13,\5,\u05ce\n,\3,\3,\5,\u05d2\n,\3-\3-\3-\5-\u05d7\n-\3-"+
		"\3-\3-\3-\3-\7-\u05de\n-\f-\16-\u05e1\13-\5-\u05e3\n-\3-\3-\3-\5-\u05e8"+
		"\n-\3-\3-\3-\7-\u05ed\n-\f-\16-\u05f0\13-\5-\u05f2\n-\3.\3.\3/\3/\7/\u05f8"+
		"\n/\f/\16/\u05fb\13/\3\60\3\60\3\60\3\60\5\60\u0601\n\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u0608\n\60\3\61\5\61\u060b\n\61\3\61\3\61\3\61\5\61\u0610"+
		"\n\61\3\61\3\61\3\61\3\61\5\61\u0616\n\61\3\61\3\61\5\61\u061a\n\61\3"+
		"\61\5\61\u061d\n\61\3\61\5\61\u0620\n\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u0629\n\62\f\62\16\62\u062c\13\62\3\62\3\62\5\62\u0630\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u0645\n\63\5\63\u0647\n\63\5\63\u0649\n"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u0654\n\65\f\65"+
		"\16\65\u0657\13\65\3\66\3\66\3\66\3\66\7\66\u065d\n\66\f\66\16\66\u0660"+
		"\13\66\3\66\3\66\3\67\3\67\5\67\u0666\n\67\38\38\38\38\78\u066c\n8\f8"+
		"\168\u066f\138\38\38\39\39\39\59\u0676\n9\3:\3:\5:\u067a\n:\3:\5:\u067d"+
		"\n:\3:\5:\u0680\n:\3:\3:\3:\3:\5:\u0686\n:\3:\5:\u0689\n:\3:\5:\u068c"+
		"\n:\3:\3:\3:\3:\5:\u0692\n:\3:\5:\u0695\n:\3:\5:\u0698\n:\3:\3:\3:\3:"+
		"\3:\3:\7:\u06a0\n:\f:\16:\u06a3\13:\5:\u06a5\n:\3:\3:\5:\u06a9\n:\3;\3"+
		";\3;\3;\7;\u06af\n;\f;\16;\u06b2\13;\3;\5;\u06b5\n;\3;\3;\5;\u06b9\n;"+
		"\5;\u06bb\n;\3<\3<\3<\3<\3<\3<\3<\5<\u06c4\n<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\5<\u06d0\n<\5<\u06d2\n<\3<\3<\3<\3<\3<\5<\u06d9\n<\3<\3<\3<\3<"+
		"\3<\5<\u06e0\n<\3<\3<\3<\3<\5<\u06e6\n<\3<\3<\3<\3<\5<\u06ec\n<\5<\u06ee"+
		"\n<\3=\3=\3=\5=\u06f3\n=\3=\3=\3>\3>\3>\5>\u06fa\n>\3>\3>\3?\3?\5?\u0700"+
		"\n?\3?\3?\5?\u0704\n?\5?\u0706\n?\3@\3@\3@\7@\u070b\n@\f@\16@\u070e\13"+
		"@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u071b\nB\3B\3B\3B\3B\3B\3B\7B\u0723"+
		"\nB\fB\16B\u0726\13B\3C\3C\5C\u072a\nC\3D\5D\u072d\nD\3D\3D\3D\3D\3D\3"+
		"D\5D\u0735\nD\3D\3D\3D\3D\3D\7D\u073c\nD\fD\16D\u073f\13D\3D\3D\3D\5D"+
		"\u0744\nD\3D\3D\3D\3D\3D\3D\5D\u074c\nD\3D\3D\3D\3D\5D\u0752\nD\3D\5D"+
		"\u0755\nD\3E\3E\3E\3E\5E\u075b\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\7E\u0770\nE\fE\16E\u0773\13E\3F\3F\3F\3F\6F\u0779"+
		"\nF\rF\16F\u077a\3F\3F\5F\u077f\nF\3F\3F\3F\3F\3F\6F\u0786\nF\rF\16F\u0787"+
		"\3F\3F\5F\u078c\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u079c"+
		"\nF\fF\16F\u079f\13F\5F\u07a1\nF\3F\3F\3F\3F\3F\3F\5F\u07a9\nF\3F\3F\3"+
		"F\3F\3F\3F\3F\5F\u07b2\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\6F\u07c0"+
		"\nF\rF\16F\u07c1\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u07cd\nF\3F\3F\3F\7F\u07d2"+
		"\nF\fF\16F\u07d5\13F\5F\u07d7\nF\3F\3F\3F\5F\u07dc\nF\3F\3F\3F\3F\3F\5"+
		"F\u07e3\nF\3F\3F\3F\3F\3F\3F\3F\3F\7F\u07ed\nF\fF\16F\u07f0\13F\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\6G\u07fa\nG\rG\16G\u07fb\5G\u07fe\nG\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\7L\u080a\nL\fL\16L\u080d\13L\3M\3M\3M\3M\5M\u0813\nM"+
		"\3N\5N\u0816\nN\3N\3N\5N\u081a\nN\3O\3O\3O\5O\u081f\nO\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0830\nP\3P\3P\5P\u0834\nP\3P\3P\3P"+
		"\3P\3P\7P\u083b\nP\fP\16P\u083e\13P\3P\5P\u0841\nP\5P\u0843\nP\3Q\3Q\3"+
		"Q\7Q\u0848\nQ\fQ\16Q\u084b\13Q\3R\3R\3R\3R\5R\u0851\nR\3S\3S\3S\7S\u0856"+
		"\nS\fS\16S\u0859\13S\3T\3T\3T\3T\3T\5T\u0860\nT\3U\3U\3U\3U\3U\3V\3V\3"+
		"V\3V\7V\u086b\nV\fV\16V\u086e\13V\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\7X"+
		"\u087b\nX\fX\16X\u087e\13X\3X\3X\3X\3X\3X\7X\u0885\nX\fX\16X\u0888\13"+
		"X\5X\u088a\nX\3X\3X\3X\3X\3X\7X\u0891\nX\fX\16X\u0894\13X\5X\u0896\nX"+
		"\5X\u0898\nX\3X\5X\u089b\nX\3X\5X\u089e\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u08b0\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u08b9\nZ\3["+
		"\3[\3[\7[\u08be\n[\f[\16[\u08c1\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u08d2\n\\\3]\3]\3]\5]\u08d7\n]\3^\3^\3"+
		"_\5_\u08dc\n_\3_\3_\5_\u08e0\n_\3_\3_\5_\u08e4\n_\3_\3_\5_\u08e8\n_\3"+
		"_\3_\5_\u08ec\n_\3_\3_\5_\u08f0\n_\3_\3_\5_\u08f4\n_\3_\5_\u08f7\n_\3"+
		"`\3`\3`\7\u02dc\u0313\u031b\u0322\u032a\6F\u0082\u0088\u008aa\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\33"+
		"\3\2\u00c0\u00c1\3\2OP\5\2XZ\u00a6\u00a6\u00ac\u00ac\4\2\r\r\37\37\4\2"+
		",,UU\4\2\u00a6\u00a6\u00ac\u00ac\4\2\16\16\u00cd\u00cd\3\2dg\3\2+,\4\2"+
		"HHJJ\3\2\20\21\3\2\u00ef\u00f0\3\2$%\4\2\u0083\u0084\u0089\u0089\3\2\u0085"+
		"\u0088\3\2\u0083\u0084\3\2\u00e8\u00e9\3\2{\u0082\3\2\u0083\u008c\3\2"+
		"\35 \3\2()\4\2AA\u0093\u0093\4\2\31\31\u0091\u0091\3\2EF\t\2\f\63\66\66"+
		">chz\u0088\u0088\u008d\u00e4\u00e6\u00e9\u0a7e\2\u00c0\3\2\2\2\4\u00c3"+
		"\3\2\2\2\6\u00c6\3\2\2\2\b\u00c9\3\2\2\2\n\u00cc\3\2\2\2\f\u032d\3\2\2"+
		"\2\16\u03d9\3\2\2\2\20\u03db\3\2\2\2\22\u03ea\3\2\2\2\24\u03f6\3\2\2\2"+
		"\26\u0403\3\2\2\2\30\u0407\3\2\2\2\32\u0421\3\2\2\2\34\u0423\3\2\2\2\36"+
		"\u0427\3\2\2\2 \u0433\3\2\2\2\"\u043d\3\2\2\2$\u043f\3\2\2\2&\u044a\3"+
		"\2\2\2(\u0453\3\2\2\2*\u045b\3\2\2\2,\u045e\3\2\2\2.\u0469\3\2\2\2\60"+
		"\u0479\3\2\2\2\62\u047f\3\2\2\2\64\u0481\3\2\2\2\66\u048c\3\2\2\28\u049d"+
		"\3\2\2\2:\u04a4\3\2\2\2<\u04a6\3\2\2\2>\u04ac\3\2\2\2@\u04be\3\2\2\2B"+
		"\u04ca\3\2\2\2D\u04f8\3\2\2\2F\u04fd\3\2\2\2H\u0513\3\2\2\2J\u0515\3\2"+
		"\2\2L\u057a\3\2\2\2N\u057c\3\2\2\2P\u0596\3\2\2\2R\u0598\3\2\2\2T\u05a7"+
		"\3\2\2\2V\u05d1\3\2\2\2X\u05d3\3\2\2\2Z\u05f3\3\2\2\2\\\u05f5\3\2\2\2"+
		"^\u0607\3\2\2\2`\u061f\3\2\2\2b\u062f\3\2\2\2d\u0631\3\2\2\2f\u064c\3"+
		"\2\2\2h\u0650\3\2\2\2j\u0658\3\2\2\2l\u0663\3\2\2\2n\u0667\3\2\2\2p\u0672"+
		"\3\2\2\2r\u06a8\3\2\2\2t\u06aa\3\2\2\2v\u06ed\3\2\2\2x\u06f2\3\2\2\2z"+
		"\u06f9\3\2\2\2|\u06fd\3\2\2\2~\u0707\3\2\2\2\u0080\u070f\3\2\2\2\u0082"+
		"\u071a\3\2\2\2\u0084\u0727\3\2\2\2\u0086\u0754\3\2\2\2\u0088\u075a\3\2"+
		"\2\2\u008a\u07e2\3\2\2\2\u008c\u07fd\3\2\2\2\u008e\u07ff\3\2\2\2\u0090"+
		"\u0801\3\2\2\2\u0092\u0803\3\2\2\2\u0094\u0805\3\2\2\2\u0096\u0807\3\2"+
		"\2\2\u0098\u080e\3\2\2\2\u009a\u0819\3\2\2\2\u009c\u081e\3\2\2\2\u009e"+
		"\u0842\3\2\2\2\u00a0\u0844\3\2\2\2\u00a2\u084c\3\2\2\2\u00a4\u0852\3\2"+
		"\2\2\u00a6\u085a\3\2\2\2\u00a8\u0861\3\2\2\2\u00aa\u0866\3\2\2\2\u00ac"+
		"\u086f\3\2\2\2\u00ae\u089d\3\2\2\2\u00b0\u08af\3\2\2\2\u00b2\u08b8\3\2"+
		"\2\2\u00b4\u08ba\3\2\2\2\u00b6\u08d1\3\2\2\2\u00b8\u08d6\3\2\2\2\u00ba"+
		"\u08d8\3\2\2\2\u00bc\u08f6\3\2\2\2\u00be\u08f8\3\2\2\2\u00c0\u00c1\5\f"+
		"\7\2\u00c1\u00c2\7\2\2\3\u00c2\3\3\2\2\2\u00c3\u00c4\5|?\2\u00c4\u00c5"+
		"\7\2\2\3\u00c5\5\3\2\2\2\u00c6\u00c7\5x=\2\u00c7\u00c8\7\2\2\3\u00c8\7"+
		"\3\2\2\2\u00c9\u00ca\5z>\2\u00ca\u00cb\7\2\2\3\u00cb\t\3\2\2\2\u00cc\u00cd"+
		"\5\u009eP\2\u00cd\u00ce\7\2\2\3\u00ce\13\3\2\2\2\u00cf\u032e\5\30\r\2"+
		"\u00d0\u00d1\7`\2\2\u00d1\u032e\5\u00b6\\\2\u00d2\u00d3\7N\2\2\u00d3\u00d7"+
		"\7\u00c7\2\2\u00d4\u00d5\7z\2\2\u00d5\u00d6\7 \2\2\u00d6\u00d8\7\"\2\2"+
		"\u00d7\u00d4\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc"+
		"\5\u00b6\\\2\u00da\u00db\7p\2\2\u00db\u00dd\7\u00ea\2\2\u00dc\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\5\26\f\2\u00df"+
		"\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e2\7L"+
		"\2\2\u00e2\u00e3\7\u00b2\2\2\u00e3\u00e5\5,\27\2\u00e4\u00e1\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u032e\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7\u00c7"+
		"\2\2\u00e8\u00e9\5\u00b6\\\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7\u00b2\2"+
		"\2\u00eb\u00ec\5,\27\2\u00ec\u032e\3\2\2\2\u00ed\u00ee\7c\2\2\u00ee\u00f1"+
		"\7\u00c7\2\2\u00ef\u00f0\7z\2\2\u00f0\u00f2\7\"\2\2\u00f1\u00ef\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\5\u00b6\\\2\u00f4"+
		"\u00f6\t\2\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u032e\3\2"+
		"\2\2\u00f7\u00fc\5\20\t\2\u00f8\u00f9\7\3\2\2\u00f9\u00fa\5\u00a0Q\2\u00fa"+
		"\u00fb\7\4\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\5*\26\2\u00ff\u0100\7\u00af\2\2\u0100"+
		"\u0102\5,\27\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0106\3\2"+
		"\2\2\u0103\u0104\7\u00cf\2\2\u0104\u0105\7\24\2\2\u0105\u0107\5f\64\2"+
		"\u0106\u0103\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a"+
		"\5\22\n\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2"+
		"\u010b\u010d\5\26\f\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0110"+
		"\3\2\2\2\u010e\u010f\7p\2\2\u010f\u0111\7\u00ea\2\2\u0110\u010e\3\2\2"+
		"\2\u0110\u0111\3\2\2\2\u0111\u0116\3\2\2\2\u0112\u0114\7\17\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\5\30"+
		"\r\2\u0116\u0113\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u032e\3\2\2\2\u0118"+
		"\u011d\5\20\t\2\u0119\u011a\7\3\2\2\u011a\u011b\5\u00a0Q\2\u011b\u011c"+
		"\7\4\2\2\u011c\u011e\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u0120\7p\2\2\u0120\u0122\7\u00ea\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0129\3\2\2\2\u0123\u0124\7\u00cf\2"+
		"\2\u0124\u0125\7\24\2\2\u0125\u0126\7\3\2\2\u0126\u0127\5\u00a0Q\2\u0127"+
		"\u0128\7\4\2\2\u0128\u012a\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u012d\5\22\n\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130\5\24\13\2\u012f\u012e\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\5v<\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\58"+
		"\35\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0139\5\26\f\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3"+
		"\2\2\2\u013a\u013b\7\u00b1\2\2\u013b\u013d\5,\27\2\u013c\u013a\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u0142\3\2\2\2\u013e\u0140\7\17\2\2\u013f\u013e"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\5\30\r\2"+
		"\u0142\u013f\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u032e\3\2\2\2\u0144\u0145"+
		"\7N\2\2\u0145\u0149\7O\2\2\u0146\u0147\7z\2\2\u0147\u0148\7 \2\2\u0148"+
		"\u014a\7\"\2\2\u0149\u0146\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\5x=\2\u014c\u014d\7$\2\2\u014d\u014f\5x=\2\u014e\u0150"+
		"\5\26\f\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u032e\3\2\2\2"+
		"\u0151\u0152\7\u00cb\2\2\u0152\u0153\7O\2\2\u0153\u0155\5x=\2\u0154\u0156"+
		"\5\36\20\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2"+
		"\u0157\u0158\7\u00cc\2\2\u0158\u015d\7\u00ce\2\2\u0159\u015e\5\u00b6\\"+
		"\2\u015a\u015b\7-\2\2\u015b\u015c\7^\2\2\u015c\u015e\5h\65\2\u015d\u0159"+
		"\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u032e\3\2\2\2\u015f"+
		"\u0160\7k\2\2\u0160\u0161\7O\2\2\u0161\u0162\5x=\2\u0162\u0163\7\16\2"+
		"\2\u0163\u0164\7^\2\2\u0164\u0165\7\3\2\2\u0165\u0166\5\u00a0Q\2\u0166"+
		"\u0167\7\4\2\2\u0167\u032e\3\2\2\2\u0168\u0169\7k\2\2\u0169\u016a\t\3"+
		"\2\2\u016a\u016b\5x=\2\u016b\u016c\7l\2\2\u016c\u016d\7h\2\2\u016d\u016e"+
		"\5x=\2\u016e\u032e\3\2\2\2\u016f\u0170\7k\2\2\u0170\u0171\t\3\2\2\u0171"+
		"\u0172\5x=\2\u0172\u0173\7q\2\2\u0173\u0174\7\u00b1\2\2\u0174\u0175\5"+
		",\27\2\u0175\u032e\3\2\2\2\u0176\u0177\7k\2\2\u0177\u0178\t\3\2\2\u0178"+
		"\u0179\5x=\2\u0179\u017a\7\u00b0\2\2\u017a\u017d\7\u00b1\2\2\u017b\u017c"+
		"\7z\2\2\u017c\u017e\7\"\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\5,\27\2\u0180\u032e\3\2\2\2\u0181\u0182\7k"+
		"\2\2\u0182\u0183\7O\2\2\u0183\u0185\5x=\2\u0184\u0186\5\36\20\2\u0185"+
		"\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\7\u00bf"+
		"\2\2\u0188\u018a\7_\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\5\u00b6\\\2\u018c\u018e\5\u00a2R\2\u018d\u018f"+
		"\5\u009cO\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u032e\3\2\2"+
		"\2\u0190\u0191\7k\2\2\u0191\u0192\7O\2\2\u0192\u0194\5x=\2\u0193\u0195"+
		"\5\36\20\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2"+
		"\u0196\u0197\7q\2\2\u0197\u0198\7\u0098\2\2\u0198\u019c\7\u00ea\2\2\u0199"+
		"\u019a\7L\2\2\u019a\u019b\7\u0099\2\2\u019b\u019d\5,\27\2\u019c\u0199"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u032e\3\2\2\2\u019e\u019f\7k\2\2\u019f"+
		"\u01a0\7O\2\2\u01a0\u01a2\5x=\2\u01a1\u01a3\5\36\20\2\u01a2\u01a1\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7q\2\2\u01a5"+
		"\u01a6\7\u0099\2\2\u01a6\u01a7\5,\27\2\u01a7\u032e\3\2\2\2\u01a8\u01a9"+
		"\7k\2\2\u01a9\u01aa\7O\2\2\u01aa\u01ab\5x=\2\u01ab\u01af\7\16\2\2\u01ac"+
		"\u01ad\7z\2\2\u01ad\u01ae\7 \2\2\u01ae\u01b0\7\"\2\2\u01af\u01ac\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\5\34\17\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u032e\3\2\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7P\2\2\u01b8\u01b9"+
		"\5x=\2\u01b9\u01bd\7\16\2\2\u01ba\u01bb\7z\2\2\u01bb\u01bc\7 \2\2\u01bc"+
		"\u01be\7\"\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2"+
		"\2\2\u01bf\u01c1\5\36\20\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u032e\3\2\2\2\u01c4\u01c5\7k"+
		"\2\2\u01c5\u01c6\7O\2\2\u01c6\u01c7\5x=\2\u01c7\u01c8\5\36\20\2\u01c8"+
		"\u01c9\7l\2\2\u01c9\u01ca\7h\2\2\u01ca\u01cb\5\36\20\2\u01cb\u032e\3\2"+
		"\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce\7O\2\2\u01ce\u01cf\5x=\2\u01cf\u01d2"+
		"\7c\2\2\u01d0\u01d1\7z\2\2\u01d1\u01d3\7\"\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d9\5\36\20\2\u01d5\u01d6\7"+
		"\5\2\2\u01d6\u01d8\5\36\20\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2"+
		"\2\2\u01dc\u01de\7\u00c4\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u032e\3\2\2\2\u01df\u01e0\7k\2\2\u01e0\u01e1\7P\2\2\u01e1\u01e2\5x=\2"+
		"\u01e2\u01e5\7c\2\2\u01e3\u01e4\7z\2\2\u01e4\u01e6\7\"\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ec\5\36\20\2"+
		"\u01e8\u01e9\7\5\2\2\u01e9\u01eb\5\36\20\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u032e\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f0\7k\2\2\u01f0\u01f1\7O\2\2\u01f1\u01f3\5x=\2"+
		"\u01f2\u01f4\5\36\20\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\5\26\f\2\u01f7\u032e\3\2\2\2\u01f8"+
		"\u01f9\7k\2\2\u01f9\u01fa\7O\2\2\u01fa\u01fb\5x=\2\u01fb\u01fc\7\u00d8"+
		"\2\2\u01fc\u01fd\7a\2\2\u01fd\u032e\3\2\2\2\u01fe\u01ff\7c\2\2\u01ff\u0202"+
		"\7O\2\2\u0200\u0201\7z\2\2\u0201\u0203\7\"\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\5x=\2\u0205\u0207\7\u00c4"+
		"\2\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u032e\3\2\2\2\u0208"+
		"\u0209\7c\2\2\u0209\u020c\7P\2\2\u020a\u020b\7z\2\2\u020b\u020d\7\"\2"+
		"\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u032e"+
		"\5x=\2\u020f\u0212\7N\2\2\u0210\u0211\7\35\2\2\u0211\u0213\7Q\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0218\3\2\2\2\u0214\u0216\7\u00ad"+
		"\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0219\7\u00ae\2\2\u0218\u0215\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021e\7P\2\2\u021b\u021c\7z\2\2\u021c\u021d\7 \2\2\u021d"+
		"\u021f\7\"\2\2\u021e\u021b\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0222\5x=\2\u0221\u0223\5n8\2\u0222\u0221\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0225\7p\2\2\u0225\u0227\7\u00ea\2"+
		"\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022b\3\2\2\2\u0228\u0229"+
		"\7\u00cf\2\2\u0229\u022a\7=\2\2\u022a\u022c\5f\64\2\u022b\u0228\3\2\2"+
		"\2\u022b\u022c\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022e\7\u00b1\2\2\u022e"+
		"\u0230\5,\27\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0232\7\17\2\2\u0232\u0233\5\30\r\2\u0233\u032e\3\2\2\2\u0234"+
		"\u0237\7N\2\2\u0235\u0236\7\35\2\2\u0236\u0238\7Q\2\2\u0237\u0235\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u023b\7\u00ad\2\2\u023a"+
		"\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\7\u00ae"+
		"\2\2\u023d\u023e\7P\2\2\u023e\u0243\5x=\2\u023f\u0240\7\3\2\2\u0240\u0241"+
		"\5\u00a0Q\2\u0241\u0242\7\4\2\2\u0242\u0244\3\2\2\2\u0243\u023f\3\2\2"+
		"\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0248\5*\26\2\u0246\u0247"+
		"\7\u00af\2\2\u0247\u0249\5,\27\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2"+
		"\2\u0249\u032e\3\2\2\2\u024a\u024b\7k\2\2\u024b\u024c\7P\2\2\u024c\u024e"+
		"\5x=\2\u024d\u024f\7\17\2\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0251\5\30\r\2\u0251\u032e\3\2\2\2\u0252\u0254\7"+
		"N\2\2\u0253\u0255\7\u00ae\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2"+
		"\u0255\u0256\3\2\2\2\u0256\u0257\7\u00a5\2\2\u0257\u0258\5\u00b4[\2\u0258"+
		"\u0259\7\17\2\2\u0259\u0263\7\u00ea\2\2\u025a\u025b\7\u0097\2\2\u025b"+
		"\u0260\5> \2\u025c\u025d\7\5\2\2\u025d\u025f\5> \2\u025e\u025c\3\2\2\2"+
		"\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264"+
		"\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u025a\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u032e\3\2\2\2\u0265\u0267\7c\2\2\u0266\u0268\7\u00ae\2\2\u0267\u0266"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026c\7\u00a5\2"+
		"\2\u026a\u026b\7z\2\2\u026b\u026d\7\"\2\2\u026c\u026a\3\2\2\2\u026c\u026d"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u032e\5\u00b4[\2\u026f\u0271\7V\2\2"+
		"\u0270\u0272\t\4\2\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273\u032e\5\f\7\2\u0274\u0275\7\\\2\2\u0275\u0278\7]\2\2\u0276"+
		"\u0277\t\5\2\2\u0277\u0279\5\u00b6\\\2\u0278\u0276\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u027e\3\2\2\2\u027a\u027c\7$\2\2\u027b\u027a\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\7\u00ea\2\2\u027e\u027b"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u032e\3\2\2\2\u0280\u0281\7\\\2\2\u0281"+
		"\u0282\7O\2\2\u0282\u0285\7\u00a6\2\2\u0283\u0284\t\5\2\2\u0284\u0286"+
		"\5\u00b6\\\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2"+
		"\2\u0287\u0288\7$\2\2\u0288\u028a\7\u00ea\2\2\u0289\u028b\5\36\20\2\u028a"+
		"\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u032e\3\2\2\2\u028c\u028d\7\\"+
		"\2\2\u028d\u0290\7\u00c8\2\2\u028e\u028f\7$\2\2\u028f\u0291\7\u00ea\2"+
		"\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u032e\3\2\2\2\u0292\u0293"+
		"\7\\\2\2\u0293\u0294\7\u00b1\2\2\u0294\u0299\5x=\2\u0295\u0296\7\3\2\2"+
		"\u0296\u0297\5\60\31\2\u0297\u0298\7\4\2\2\u0298\u029a\3\2\2\2\u0299\u0295"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u032e\3\2\2\2\u029b\u029c\7\\\2\2\u029c"+
		"\u029d\7^\2\2\u029d\u029e\t\5\2\2\u029e\u02a1\5x=\2\u029f\u02a0\t\5\2"+
		"\2\u02a0\u02a2\5\u00b6\\\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u032e\3\2\2\2\u02a3\u02a4\7\\\2\2\u02a4\u02a5\7a\2\2\u02a5\u02a7\5x="+
		"\2\u02a6\u02a8\5\36\20\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u032e\3\2\2\2\u02a9\u02ab\7\\\2\2\u02aa\u02ac\5\u00b6\\\2\u02ab\u02aa"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b5\7b\2\2\u02ae"+
		"\u02b0\7$\2\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\3\2"+
		"\2\2\u02b1\u02b4\5\u00b4[\2\u02b2\u02b4\7\u00ea\2\2\u02b3\u02b1\3\2\2"+
		"\2\u02b3\u02b2\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02af\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u032e\3\2\2\2\u02b7\u02b8\7\\\2\2\u02b8\u02b9\7N\2\2\u02b9"+
		"\u02ba\7O\2\2\u02ba\u032e\5x=\2\u02bb\u02bc\t\6\2\2\u02bc\u02be\7\u00a5"+
		"\2\2\u02bd\u02bf\7\u00a6\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u032e\5\"\22\2\u02c1\u02c2\t\6\2\2\u02c2\u02c4\7"+
		"\u00c7\2\2\u02c3\u02c5\7\u00a6\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6\u032e\5\u00b6\\\2\u02c7\u02c9\t\6\2\2\u02c8"+
		"\u02ca\7O\2\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2"+
		"\2\2\u02cb\u02cd\t\7\2\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\u02d0\5x=\2\u02cf\u02d1\5\36\20\2\u02d0\u02cf\3\2"+
		"\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d4\5$\23\2\u02d3"+
		"\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u032e\3\2\2\2\u02d5\u02d6\7\u00a7"+
		"\2\2\u02d6\u02d7\7O\2\2\u02d7\u032e\5x=\2\u02d8\u02dc\7\u00a7\2\2\u02d9"+
		"\u02db\13\2\2\2\u02da\u02d9\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02dd\3"+
		"\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u032e\3\2\2\2\u02de\u02dc\3\2\2\2\u02df"+
		"\u02e1\7\u00a9\2\2\u02e0\u02e2\7\u00ab\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7O\2\2\u02e4\u02e9\5x=\2\u02e5"+
		"\u02e7\7\17\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3"+
		"\2\2\2\u02e8\u02ea\5\30\r\2\u02e9\u02e6\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u032e\3\2\2\2\u02eb\u02ec\7\u00aa\2\2\u02ec\u02ef\7O\2\2\u02ed\u02ee"+
		"\7z\2\2\u02ee\u02f0\7\"\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u032e\5x=\2\u02f2\u02f3\7\u00a8\2\2\u02f3\u032e\7"+
		"\u00a9\2\2\u02f4\u02f5\7\u00db\2\2\u02f5\u02f7\7s\2\2\u02f6\u02f8\7\u00e6"+
		"\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fa\7\u00e7\2\2\u02fa\u02fc\7\u00ea\2\2\u02fb\u02fd\7\u0094\2\2\u02fc"+
		"\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7T"+
		"\2\2\u02ff\u0300\7O\2\2\u0300\u0302\5x=\2\u0301\u0303\5\36\20\2\u0302"+
		"\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u032e\3\2\2\2\u0304\u0305\7\u00ca"+
		"\2\2\u0305\u0306\7O\2\2\u0306\u0308\5x=\2\u0307\u0309\5\36\20\2\u0308"+
		"\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u032e\3\2\2\2\u030a\u030b\7\u00d6"+
		"\2\2\u030b\u030c\7\u00d7\2\2\u030c\u030d\7O\2\2\u030d\u032e\5x=\2\u030e"+
		"\u030f\t\b\2\2\u030f\u0313\5\u00b6\\\2\u0310\u0312\13\2\2\2\u0311\u0310"+
		"\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0314\3\2\2\2\u0313\u0311\3\2\2\2\u0314"+
		"\u032e\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\7q\2\2\u0317\u031b\7\u00dc"+
		"\2\2\u0318\u031a\13\2\2\2\u0319\u0318\3\2\2\2\u031a\u031d\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u032e\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031e\u0322\7q\2\2\u031f\u0321\13\2\2\2\u0320\u031f\3\2\2\2\u0321"+
		"\u0324\3\2\2\2\u0322\u0323\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u032e\3\2"+
		"\2\2\u0324\u0322\3\2\2\2\u0325\u032e\7r\2\2\u0326\u032a\5\16\b\2\u0327"+
		"\u0329\13\2\2\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u032b\3"+
		"\2\2\2\u032a\u0328\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u00cf\3\2\2\2\u032d\u00d0\3\2\2\2\u032d\u00d2\3\2\2\2\u032d\u00e6\3\2"+
		"\2\2\u032d\u00ed\3\2\2\2\u032d\u00f7\3\2\2\2\u032d\u0118\3\2\2\2\u032d"+
		"\u0144\3\2\2\2\u032d\u0151\3\2\2\2\u032d\u015f\3\2\2\2\u032d\u0168\3\2"+
		"\2\2\u032d\u016f\3\2\2\2\u032d\u0176\3\2\2\2\u032d\u0181\3\2\2\2\u032d"+
		"\u0190\3\2\2\2\u032d\u019e\3\2\2\2\u032d\u01a8\3\2\2\2\u032d\u01b6\3\2"+
		"\2\2\u032d\u01c4\3\2\2\2\u032d\u01cc\3\2\2\2\u032d\u01df\3\2\2\2\u032d"+
		"\u01ef\3\2\2\2\u032d\u01f8\3\2\2\2\u032d\u01fe\3\2\2\2\u032d\u0208\3\2"+
		"\2\2\u032d\u020f\3\2\2\2\u032d\u0234\3\2\2\2\u032d\u024a\3\2\2\2\u032d"+
		"\u0252\3\2\2\2\u032d\u0265\3\2\2\2\u032d\u026f\3\2\2\2\u032d\u0274\3\2"+
		"\2\2\u032d\u0280\3\2\2\2\u032d\u028c\3\2\2\2\u032d\u0292\3\2\2\2\u032d"+
		"\u029b\3\2\2\2\u032d\u02a3\3\2\2\2\u032d\u02a9\3\2\2\2\u032d\u02b7\3\2"+
		"\2\2\u032d\u02bb\3\2\2\2\u032d\u02c1\3\2\2\2\u032d\u02c7\3\2\2\2\u032d"+
		"\u02d5\3\2\2\2\u032d\u02d8\3\2\2\2\u032d\u02df\3\2\2\2\u032d\u02eb\3\2"+
		"\2\2\u032d\u02f2\3\2\2\2\u032d\u02f4\3\2\2\2\u032d\u0304\3\2\2\2\u032d"+
		"\u030a\3\2\2\2\u032d\u030e\3\2\2\2\u032d\u0316\3\2\2\2\u032d\u031e\3\2"+
		"\2\2\u032d\u0325\3\2\2\2\u032d\u0326\3\2\2\2\u032e\r\3\2\2\2\u032f\u0330"+
		"\7N\2\2\u0330\u03da\7\u00dc\2\2\u0331\u0332\7c\2\2\u0332\u03da\7\u00dc"+
		"\2\2\u0333\u0335\7\u00d3\2\2\u0334\u0336\7\u00dc\2\2\u0335\u0334\3\2\2"+
		"\2\u0335\u0336\3\2\2\2\u0336\u03da\3\2\2\2\u0337\u0339\7\u00d2\2\2\u0338"+
		"\u033a\7\u00dc\2\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u03da"+
		"\3\2\2\2\u033b\u033c\7\\\2\2\u033c\u03da\7\u00d3\2\2\u033d\u033e\7\\\2"+
		"\2\u033e\u0340\7\u00dc\2\2\u033f\u0341\7\u00d3\2\2\u0340\u033f\3\2\2\2"+
		"\u0340\u0341\3\2\2\2\u0341\u03da\3\2\2\2\u0342\u0343\7\\\2\2\u0343\u03da"+
		"\7\u00df\2\2\u0344\u0345\7\\\2\2\u0345\u03da\7\u00dd\2\2\u0346\u0347\7"+
		"\\\2\2\u0347\u0348\7G\2\2\u0348\u03da\7\u00dd\2\2\u0349\u034a\7\u00d9"+
		"\2\2\u034a\u03da\7O\2\2\u034b\u034c\7\u00da\2\2\u034c\u03da\7O\2\2\u034d"+
		"\u034e\7\\\2\2\u034e\u03da\7\u00de\2\2\u034f\u0350\7\\\2\2\u0350\u0351"+
		"\7N\2\2\u0351\u03da\7O\2\2\u0352\u0353\7\\\2\2\u0353\u03da\7\u00e0\2\2"+
		"\u0354\u0355\7\\\2\2\u0355\u03da\7\u00e2\2\2\u0356\u0357\7\\\2\2\u0357"+
		"\u03da\7\u00e3\2\2\u0358\u0359\7N\2\2\u0359\u03da\7\u00e1\2\2\u035a\u035b"+
		"\7c\2\2\u035b\u03da\7\u00e1\2\2\u035c\u035d\7k\2\2\u035d\u03da\7\u00e1"+
		"\2\2\u035e\u035f\7\u00d4\2\2\u035f\u03da\7O\2\2\u0360\u0361\7\u00d4\2"+
		"\2\u0361\u03da\7\u00c7\2\2\u0362\u0363\7\u00d5\2\2\u0363\u03da\7O\2\2"+
		"\u0364\u0365\7\u00d5\2\2\u0365\u03da\7\u00c7\2\2\u0366\u0367\7N\2\2\u0367"+
		"\u0368\7\u00ae\2\2\u0368\u03da\7x\2\2\u0369\u036a\7c\2\2\u036a\u036b\7"+
		"\u00ae\2\2\u036b\u03da\7x\2\2\u036c\u036d\7k\2\2\u036d\u036e\7O\2\2\u036e"+
		"\u036f\5x=\2\u036f\u0370\7 \2\2\u0370\u0371\7\u00c2\2\2\u0371\u03da\3"+
		"\2\2\2\u0372\u0373\7k\2\2\u0373\u0374\7O\2\2\u0374\u0375\5x=\2\u0375\u0376"+
		"\7\u00c2\2\2\u0376\u0377\7\24\2\2\u0377\u03da\3\2\2\2\u0378\u0379\7k\2"+
		"\2\u0379\u037a\7O\2\2\u037a\u037b\5x=\2\u037b\u037c\7 \2\2\u037c\u037d"+
		"\7\u00c3\2\2\u037d\u03da\3\2\2\2\u037e\u037f\7k\2\2\u037f\u0380\7O\2\2"+
		"\u0380\u0381\5x=\2\u0381\u0382\7\u00b4\2\2\u0382\u0383\7\24\2\2\u0383"+
		"\u03da\3\2\2\2\u0384\u0385\7k\2\2\u0385\u0386\7O\2\2\u0386\u0387\5x=\2"+
		"\u0387\u0388\7 \2\2\u0388\u0389\7\u00b4\2\2\u0389\u03da\3\2\2\2\u038a"+
		"\u038b\7k\2\2\u038b\u038c\7O\2\2\u038c\u038d\5x=\2\u038d\u038e\7 \2\2"+
		"\u038e\u038f\7\u00b5\2\2\u038f\u0390\7\17\2\2\u0390\u0391\7\u00b6\2\2"+
		"\u0391\u03da\3\2\2\2\u0392\u0393\7k\2\2\u0393\u0394\7O\2\2\u0394\u0395"+
		"\5x=\2\u0395\u0396\7q\2\2\u0396\u0397\7\u00b4\2\2\u0397\u0398\7\u00b7"+
		"\2\2\u0398\u03da\3\2\2\2\u0399\u039a\7k\2\2\u039a\u039b\7O\2\2\u039b\u039c"+
		"\5x=\2\u039c\u039d\7\u00b8\2\2\u039d\u039e\7A\2\2\u039e\u03da\3\2\2\2"+
		"\u039f\u03a0\7k\2\2\u03a0\u03a1\7O\2\2\u03a1\u03a2\5x=\2\u03a2\u03a3\7"+
		"\u00b9\2\2\u03a3\u03a4\7A\2\2\u03a4\u03da\3\2\2\2\u03a5\u03a6\7k\2\2\u03a6"+
		"\u03a7\7O\2\2\u03a7\u03a8\5x=\2\u03a8\u03a9\7\u00ba\2\2\u03a9\u03aa\7"+
		"A\2\2\u03aa\u03da\3\2\2\2\u03ab\u03ac\7k\2\2\u03ac\u03ad\7O\2\2\u03ad"+
		"\u03ae\5x=\2\u03ae\u03af\7\u00bc\2\2\u03af\u03da\3\2\2\2\u03b0\u03b1\7"+
		"k\2\2\u03b1\u03b2\7O\2\2\u03b2\u03b4\5x=\2\u03b3\u03b5\5\36\20\2\u03b4"+
		"\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\7\u00bd"+
		"\2\2\u03b7\u03da\3\2\2\2\u03b8\u03b9\7k\2\2\u03b9\u03ba\7O\2\2\u03ba\u03bc"+
		"\5x=\2\u03bb\u03bd\5\36\20\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03bf\7\u00be\2\2\u03bf\u03da\3\2\2\2\u03c0\u03c1"+
		"\7k\2\2\u03c1\u03c2\7O\2\2\u03c2\u03c4\5x=\2\u03c3\u03c5\5\36\20\2\u03c4"+
		"\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\7q"+
		"\2\2\u03c7\u03c8\7\u00bb\2\2\u03c8\u03da\3\2\2\2\u03c9\u03ca\7k\2\2\u03ca"+
		"\u03cb\7O\2\2\u03cb\u03cd\5x=\2\u03cc\u03ce\5\36\20\2\u03cd\u03cc\3\2"+
		"\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7Q\2\2\u03d0"+
		"\u03d1\7^\2\2\u03d1\u03da\3\2\2\2\u03d2\u03d3\7t\2\2\u03d3\u03da\7u\2"+
		"\2\u03d4\u03da\7v\2\2\u03d5\u03da\7w\2\2\u03d6\u03da\7\u00c9\2\2\u03d7"+
		"\u03d8\7S\2\2\u03d8\u03da\7\r\2\2\u03d9\u032f\3\2\2\2\u03d9\u0331\3\2"+
		"\2\2\u03d9\u0333\3\2\2\2\u03d9\u0337\3\2\2\2\u03d9\u033b\3\2\2\2\u03d9"+
		"\u033d\3\2\2\2\u03d9\u0342\3\2\2\2\u03d9\u0344\3\2\2\2\u03d9\u0346\3\2"+
		"\2\2\u03d9\u0349\3\2\2\2\u03d9\u034b\3\2\2\2\u03d9\u034d\3\2\2\2\u03d9"+
		"\u034f\3\2\2\2\u03d9\u0352\3\2\2\2\u03d9\u0354\3\2\2\2\u03d9\u0356\3\2"+
		"\2\2\u03d9\u0358\3\2\2\2\u03d9\u035a\3\2\2\2\u03d9\u035c\3\2\2\2\u03d9"+
		"\u035e\3\2\2\2\u03d9\u0360\3\2\2\2\u03d9\u0362\3\2\2\2\u03d9\u0364\3\2"+
		"\2\2\u03d9\u0366\3\2\2\2\u03d9\u0369\3\2\2\2\u03d9\u036c\3\2\2\2\u03d9"+
		"\u0372\3\2\2\2\u03d9\u0378\3\2\2\2\u03d9\u037e\3\2\2\2\u03d9\u0384\3\2"+
		"\2\2\u03d9\u038a\3\2\2\2\u03d9\u0392\3\2\2\2\u03d9\u0399\3\2\2\2\u03d9"+
		"\u039f\3\2\2\2\u03d9\u03a5\3\2\2\2\u03d9\u03ab\3\2\2\2\u03d9\u03b0\3\2"+
		"\2\2\u03d9\u03b8\3\2\2\2\u03d9\u03c0\3\2\2\2\u03d9\u03c9\3\2\2\2\u03d9"+
		"\u03d2\3\2\2\2\u03d9\u03d4\3\2\2\2\u03d9\u03d5\3\2\2\2\u03d9\u03d6\3\2"+
		"\2\2\u03d9\u03d7\3\2\2\2\u03da\17\3\2\2\2\u03db\u03dd\7N\2\2\u03dc\u03de"+
		"\7\u00ae\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2"+
		"\2\u03df\u03e1\7\u00d0\2\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e2\3\2\2\2\u03e2\u03e6\7O\2\2\u03e3\u03e4\7z\2\2\u03e4\u03e5\7 \2"+
		"\2\u03e5\u03e7\7\"\2\2\u03e6\u03e3\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8"+
		"\3\2\2\2\u03e8\u03e9\5x=\2\u03e9\21\3\2\2\2\u03ea\u03eb\7\u00c2\2\2\u03eb"+
		"\u03ec\7\24\2\2\u03ec\u03f0\5f\64\2\u03ed\u03ee\7\u00c3\2\2\u03ee\u03ef"+
		"\7\24\2\2\u03ef\u03f1\5j\66\2\u03f0\u03ed\3\2\2\2\u03f0\u03f1\3\2\2\2"+
		"\u03f1\u03f2\3\2\2\2\u03f2\u03f3\7T\2\2\u03f3\u03f4\7\u00ef\2\2\u03f4"+
		"\u03f5\7\u00b3\2\2\u03f5\23\3\2\2\2\u03f6\u03f7\7\u00b4\2\2\u03f7\u03f8"+
		"\7\24\2\2\u03f8\u03f9\5f\64\2\u03f9\u03fc\7=\2\2\u03fa\u03fd\5\64\33\2"+
		"\u03fb\u03fd\5\66\34\2\u03fc\u03fa\3\2\2\2\u03fc\u03fb\3\2\2\2\u03fd\u0401"+
		"\3\2\2\2\u03fe\u03ff\7\u00b5\2\2\u03ff\u0400\7\17\2\2\u0400\u0402\7\u00b6"+
		"\2\2\u0401\u03fe\3\2\2\2\u0401\u0402\3\2\2\2\u0402\25\3\2\2\2\u0403\u0404"+
		"\7\u00b7\2\2\u0404\u0405\7\u00ea\2\2\u0405\27\3\2\2\2\u0406\u0408\5&\24"+
		"\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a"+
		"\5@!\2\u040a\u040b\7\2\2\3\u040b\31\3\2\2\2\u040c\u040d\7R\2\2\u040d\u040e"+
		"\7\u0094\2\2\u040e\u040f\7O\2\2\u040f\u0416\5x=\2\u0410\u0414\5\36\20"+
		"\2\u0411\u0412\7z\2\2\u0412\u0413\7 \2\2\u0413\u0415\7\"\2\2\u0414\u0411"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0410\3\2\2\2\u0416"+
		"\u0417\3\2\2\2\u0417\u0422\3\2\2\2\u0418\u0419\7R\2\2\u0419\u041b\7T\2"+
		"\2\u041a\u041c\7O\2\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d"+
		"\3\2\2\2\u041d\u041f\5x=\2\u041e\u0420\5\36\20\2\u041f\u041e\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0422\3\2\2\2\u0421\u040c\3\2\2\2\u0421\u0418\3\2"+
		"\2\2\u0422\33\3\2\2\2\u0423\u0425\5\36\20\2\u0424\u0426\5\26\f\2\u0425"+
		"\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426\35\3\2\2\2\u0427\u0428\7A\2\2"+
		"\u0428\u0429\7\3\2\2\u0429\u042e\5 \21\2\u042a\u042b\7\5\2\2\u042b\u042d"+
		"\5 \21\2\u042c\u042a\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0432\7\4"+
		"\2\2\u0432\37\3\2\2\2\u0433\u0436\5\u00b6\\\2\u0434\u0435\7{\2\2\u0435"+
		"\u0437\5\u008cG\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437!\3\2\2"+
		"\2\u0438\u043e\5\u00b4[\2\u0439\u043e\7\u00ea\2\2\u043a\u043e\5\u008e"+
		"H\2\u043b\u043e\5\u0090I\2\u043c\u043e\5\u0092J\2\u043d\u0438\3\2\2\2"+
		"\u043d\u0439\3\2\2\2\u043d\u043a\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043c"+
		"\3\2\2\2\u043e#\3\2\2\2\u043f\u0447\5\u00b6\\\2\u0440\u0443\7\6\2\2\u0441"+
		"\u0444\5\u00b6\\\2\u0442\u0444\7\u00ea\2\2\u0443\u0441\3\2\2\2\u0443\u0442"+
		"\3\2\2\2\u0444\u0446\3\2\2\2\u0445\u0440\3\2\2\2\u0446\u0449\3\2\2\2\u0447"+
		"\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448%\3\2\2\2\u0449\u0447\3\2\2\2"+
		"\u044a\u044b\7L\2\2\u044b\u0450\5(\25\2\u044c\u044d\7\5\2\2\u044d\u044f"+
		"\5(\25\2\u044e\u044c\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451\'\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0455\5\u00b6"+
		"\\\2\u0454\u0456\7\17\2\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0457\3\2\2\2\u0457\u0458\7\3\2\2\u0458\u0459\5\30\r\2\u0459\u045a\7"+
		"\4\2\2\u045a)\3\2\2\2\u045b\u045c\7\u0097\2\2\u045c\u045d\5\u00b4[\2\u045d"+
		"+\3\2\2\2\u045e\u045f\7\3\2\2\u045f\u0464\5.\30\2\u0460\u0461\7\5\2\2"+
		"\u0461\u0463\5.\30\2\u0462\u0460\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462"+
		"\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0467\3\2\2\2\u0466\u0464\3\2\2\2\u0467"+
		"\u0468\7\4\2\2\u0468-\3\2\2\2\u0469\u046e\5\60\31\2\u046a\u046c\7{\2\2"+
		"\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f"+
		"\5\62\32\2\u046e\u046b\3\2\2\2\u046e\u046f\3\2\2\2\u046f/\3\2\2\2\u0470"+
		"\u0475\5\u00b6\\\2\u0471\u0472\7\6\2\2\u0472\u0474\5\u00b6\\\2\u0473\u0471"+
		"\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476"+
		"\u047a\3\2\2\2\u0477\u0475\3\2\2\2\u0478\u047a\7\u00ea\2\2\u0479\u0470"+
		"\3\2\2\2\u0479\u0478\3\2\2\2\u047a\61\3\2\2\2\u047b\u0480\7\u00ef\2\2"+
		"\u047c\u0480\7\u00f0\2\2\u047d\u0480\5\u0094K\2\u047e\u0480\7\u00ea\2"+
		"\2\u047f\u047b\3\2\2\2\u047f\u047c\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u047e"+
		"\3\2\2\2\u0480\63\3\2\2\2\u0481\u0482\7\3\2\2\u0482\u0487\5\u008cG\2\u0483"+
		"\u0484\7\5\2\2\u0484\u0486\5\u008cG\2\u0485\u0483\3\2\2\2\u0486\u0489"+
		"\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048a\3\2\2\2\u0489"+
		"\u0487\3\2\2\2\u048a\u048b\7\4\2\2\u048b\65\3\2\2\2\u048c\u048d\7\3\2"+
		"\2\u048d\u0492\5\64\33\2\u048e\u048f\7\5\2\2\u048f\u0491\5\64\33\2\u0490"+
		"\u048e\3\2\2\2\u0491\u0494\3\2\2\2\u0492\u0490\3\2\2\2\u0492\u0493\3\2"+
		"\2\2\u0493\u0495\3\2\2\2\u0494\u0492\3\2\2\2\u0495\u0496\7\4\2\2\u0496"+
		"\67\3\2\2\2\u0497\u0498\7\u00b5\2\2\u0498\u0499\7\17\2\2\u0499\u049e\5"+
		":\36\2\u049a\u049b\7\u00b5\2\2\u049b\u049c\7\24\2\2\u049c\u049e\5<\37"+
		"\2\u049d\u0497\3\2\2\2\u049d\u049a\3\2\2\2\u049e9\3\2\2\2\u049f\u04a0"+
		"\7\u00c5\2\2\u04a0\u04a1\7\u00ea\2\2\u04a1\u04a2\7\u00c6\2\2\u04a2\u04a5"+
		"\7\u00ea\2\2\u04a3\u04a5\5\u00b6\\\2\u04a4\u049f\3\2\2\2\u04a4\u04a3\3"+
		"\2\2\2\u04a5;\3\2\2\2\u04a6\u04aa\7\u00ea\2\2\u04a7\u04a8\7L\2\2\u04a8"+
		"\u04a9\7\u0099\2\2\u04a9\u04ab\5,\27\2\u04aa\u04a7\3\2\2\2\u04aa\u04ab"+
		"\3\2\2\2\u04ab=\3\2\2\2\u04ac\u04ad\5\u00b6\\\2\u04ad\u04ae\7\u00ea\2"+
		"\2\u04ae?\3\2\2\2\u04af\u04b1\5\32\16\2\u04b0\u04af\3\2\2\2\u04b0\u04b1"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\5F$\2\u04b3\u04b4\5B\"\2\u04b4"+
		"\u04b5\7\2\2\3\u04b5\u04bf\3\2\2\2\u04b6\u04b8\5R*\2\u04b7\u04b9\5D#\2"+
		"\u04b8\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb"+
		"\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\7\2\2\3\u04bd\u04bf\3\2\2\2\u04be"+
		"\u04b0\3\2\2\2\u04be\u04b6\3\2\2\2\u04bfA\3\2\2\2\u04c0\u04c1\7\31\2\2"+
		"\u04c1\u04c2\7\24\2\2\u04c2\u04c7\5J&\2\u04c3\u04c4\7\5\2\2\u04c4\u04c6"+
		"\5J&\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7"+
		"\u04c8\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca\u04c0\3\2"+
		"\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04d6\3\2\2\2\u04cc\u04cd\7\u0092\2\2\u04cd"+
		"\u04ce\7\24\2\2\u04ce\u04d3\5\u0080A\2\u04cf\u04d0\7\5\2\2\u04d0\u04d2"+
		"\5\u0080A\2\u04d1\u04cf\3\2\2\2\u04d2\u04d5\3\2\2\2\u04d3\u04d1\3\2\2"+
		"\2\u04d3\u04d4\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d6\u04cc"+
		"\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04e2\3\2\2\2\u04d8\u04d9\7\u0093\2"+
		"\2\u04d9\u04da\7\24\2\2\u04da\u04df\5\u0080A\2\u04db\u04dc\7\5\2\2\u04dc"+
		"\u04de\5\u0080A\2\u04dd\u04db\3\2\2\2\u04de\u04e1\3\2\2\2\u04df\u04dd"+
		"\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2"+
		"\u04d8\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04ee\3\2\2\2\u04e4\u04e5\7\u0091"+
		"\2\2\u04e5\u04e6\7\24\2\2\u04e6\u04eb\5J&\2\u04e7\u04e8\7\5\2\2\u04e8"+
		"\u04ea\5J&\2\u04e9\u04e7\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2"+
		"\2\u04eb\u04ec\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04e4"+
		"\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04f2\5\u00aaV"+
		"\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f4"+
		"\7\33\2\2\u04f4\u04f6\5\u0080A\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6\3\2\2"+
		"\2\u04f6C\3\2\2\2\u04f7\u04f9\5\32\16\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9"+
		"\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\5L\'\2\u04fb\u04fc\5B\"\2\u04fc"+
		"E\3\2\2\2\u04fd\u04fe\b$\1\2\u04fe\u04ff\5H%\2\u04ff\u0508\3\2\2\2\u0500"+
		"\u0501\f\3\2\2\u0501\u0503\t\t\2\2\u0502\u0504\5Z.\2\u0503\u0502\3\2\2"+
		"\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\5F$\4\u0506\u0500"+
		"\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"G\3\2\2\2\u050a\u0508\3\2\2\2\u050b\u0514\5L\'\2\u050c\u050d\7O\2\2\u050d"+
		"\u0514\5x=\2\u050e\u0514\5t;\2\u050f\u0510\7\3\2\2\u0510\u0511\5@!\2\u0511"+
		"\u0512\7\4\2\2\u0512\u0514\3\2\2\2\u0513\u050b\3\2\2\2\u0513\u050c\3\2"+
		"\2\2\u0513\u050e\3\2\2\2\u0513\u050f\3\2\2\2\u0514I\3\2\2\2\u0515\u0517"+
		"\5\u0080A\2\u0516\u0518\t\n\2\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2"+
		"\2\u0518\u051b\3\2\2\2\u0519\u051a\7*\2\2\u051a\u051c\t\13\2\2\u051b\u0519"+
		"\3\2\2\2\u051b\u051c\3\2\2\2\u051cK\3\2\2\2\u051d\u051e\7\f\2\2\u051e"+
		"\u051f\7\u0095\2\2\u051f\u0520\7\3\2\2\u0520\u0521\5~@\2\u0521\u0522\7"+
		"\4\2\2\u0522\u0528\3\2\2\2\u0523\u0524\7n\2\2\u0524\u0528\5~@\2\u0525"+
		"\u0526\7\u0096\2\2\u0526\u0528\5~@\2\u0527\u051d\3\2\2\2\u0527\u0523\3"+
		"\2\2\2\u0527\u0525\3\2\2\2\u0528\u052a\3\2\2\2\u0529\u052b\5v<\2\u052a"+
		"\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052e\3\2\2\2\u052c\u052d\7\u009b"+
		"\2\2\u052d\u052f\7\u00ea\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0530\3\2\2\2\u0530\u0531\7\u0097\2\2\u0531\u053e\7\u00ea\2\2\u0532\u053c"+
		"\7\17\2\2\u0533\u053d\5h\65\2\u0534\u053d\5\u00a0Q\2\u0535\u0538\7\3\2"+
		"\2\u0536\u0539\5h\65\2\u0537\u0539\5\u00a0Q\2\u0538\u0536\3\2\2\2\u0538"+
		"\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\7\4\2\2\u053b\u053d\3\2"+
		"\2\2\u053c\u0533\3\2\2\2\u053c\u0534\3\2\2\2\u053c\u0535\3\2\2\2\u053d"+
		"\u053f\3\2\2\2\u053e\u0532\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2"+
		"\2\2\u0540\u0542\5v<\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0545"+
		"\3\2\2\2\u0543\u0544\7\u009a\2\2\u0544\u0546\7\u00ea\2\2\u0545\u0543\3"+
		"\2\2\2\u0545\u0546\3\2\2\2\u0546\u0548\3\2\2\2\u0547\u0549\5R*\2\u0548"+
		"\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054c\3\2\2\2\u054a\u054b\7\22"+
		"\2\2\u054b\u054d\5\u0082B\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d"+
		"\u057b\3\2\2\2\u054e\u0552\7\f\2\2\u054f\u0551\5N(\2\u0550\u054f\3\2\2"+
		"\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0556"+
		"\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u0557\5Z.\2\u0556\u0555\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\5~@\2\u0559\u055b\5R*\2"+
		"\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u0565\3\2\2\2\u055c\u0562"+
		"\5R*\2\u055d\u055f\7\f\2\2\u055e\u0560\5Z.\2\u055f\u055e\3\2\2\2\u055f"+
		"\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\5~@\2\u0562\u055d\3\2\2"+
		"\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564\u054e\3\2\2\2\u0564\u055c"+
		"\3\2\2\2\u0565\u0569\3\2\2\2\u0566\u0568\5X-\2\u0567\u0566\3\2\2\2\u0568"+
		"\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056e\3\2"+
		"\2\2\u056b\u0569\3\2\2\2\u056c\u056d\7\22\2\2\u056d\u056f\5\u0082B\2\u056e"+
		"\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0571\3\2\2\2\u0570\u0572\5T"+
		"+\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0575\3\2\2\2\u0573"+
		"\u0574\7\32\2\2\u0574\u0576\5\u0082B\2\u0575\u0573\3\2\2\2\u0575\u0576"+
		"\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0579\5\u00aaV\2\u0578\u0577\3\2\2"+
		"\2\u0578\u0579\3\2\2\2\u0579\u057b\3\2\2\2\u057a\u0527\3\2\2\2\u057a\u0564"+
		"\3\2\2\2\u057bM\3\2\2\2\u057c\u057d\7\7\2\2\u057d\u0584\5P)\2\u057e\u0580"+
		"\7\5\2\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581"+
		"\u0583\5P)\2\u0582\u057f\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2"+
		"\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u0588"+
		"\7\b\2\2\u0588O\3\2\2\2\u0589\u0597\5\u00b6\\\2\u058a\u058b\5\u00b6\\"+
		"\2\u058b\u058c\7\3\2\2\u058c\u0591\5\u008aF\2\u058d\u058e\7\5\2\2\u058e"+
		"\u0590\5\u008aF\2\u058f\u058d\3\2\2\2\u0590\u0593\3\2\2\2\u0591\u058f"+
		"\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0591\3\2\2\2\u0594"+
		"\u0595\7\4\2\2\u0595\u0597\3\2\2\2\u0596\u0589\3\2\2\2\u0596\u058a\3\2"+
		"\2\2\u0597Q\3\2\2\2\u0598\u0599\7\r\2\2\u0599\u059e\5\\/\2\u059a\u059b"+
		"\7\5\2\2\u059b\u059d\5\\/\2\u059c\u059a\3\2\2\2\u059d\u05a0\3\2\2\2\u059e"+
		"\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a4\3\2\2\2\u05a0\u059e\3\2"+
		"\2\2\u05a1\u05a3\5X-\2\u05a2\u05a1\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2"+
		"\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5S\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7"+
		"\u05a8\7\23\2\2\u05a8\u05a9\7\24\2\2\u05a9\u05ae\5\u0080A\2\u05aa\u05ab"+
		"\7\5\2\2\u05ab\u05ad\5\u0080A\2\u05ac\u05aa\3\2\2\2\u05ad\u05b0\3\2\2"+
		"\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05c2\3\2\2\2\u05b0\u05ae"+
		"\3\2\2\2\u05b1\u05b2\7L\2\2\u05b2\u05c3\7\30\2\2\u05b3\u05b4\7L\2\2\u05b4"+
		"\u05c3\7\27\2\2\u05b5\u05b6\7\25\2\2\u05b6\u05b7\7\26\2\2\u05b7\u05b8"+
		"\7\3\2\2\u05b8\u05bd\5V,\2\u05b9\u05ba\7\5\2\2\u05ba\u05bc\5V,\2\u05bb"+
		"\u05b9\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2"+
		"\2\2\u05be\u05c0\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05c1\7\4\2\2\u05c1"+
		"\u05c3\3\2\2\2\u05c2\u05b1\3\2\2\2\u05c2\u05b3\3\2\2\2\u05c2\u05b5\3\2"+
		"\2\2\u05c2\u05c3\3\2\2\2\u05c3U\3\2\2\2\u05c4\u05cd\7\3\2\2\u05c5\u05ca"+
		"\5\u0080A\2\u05c6\u05c7\7\5\2\2\u05c7\u05c9\5\u0080A\2\u05c8\u05c6\3\2"+
		"\2\2\u05c9\u05cc\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u05ce\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cd\u05c5\3\2\2\2\u05cd\u05ce\3\2"+
		"\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d2\7\4\2\2\u05d0\u05d2\5\u0080A\2\u05d1"+
		"\u05c4\3\2\2\2\u05d1\u05d0\3\2\2\2\u05d2W\3\2\2\2\u05d3\u05d4\7>\2\2\u05d4"+
		"\u05d6\7P\2\2\u05d5\u05d7\7\66\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2"+
		"\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\5\u00b4[\2\u05d9\u05e2\7\3\2\2\u05da"+
		"\u05df\5\u0080A\2\u05db\u05dc\7\5\2\2\u05dc\u05de\5\u0080A\2\u05dd\u05db"+
		"\3\2\2\2\u05de\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0"+
		"\u05e3\3\2\2\2\u05e1\u05df\3\2\2\2\u05e2\u05da\3\2\2\2\u05e2\u05e3\3\2"+
		"\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\7\4\2\2\u05e5\u05f1\5\u00b6\\\2\u05e6"+
		"\u05e8\7\17\2\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\3"+
		"\2\2\2\u05e9\u05ee\5\u00b6\\\2\u05ea\u05eb\7\5\2\2\u05eb\u05ed\5\u00b6"+
		"\\\2\u05ec\u05ea\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee"+
		"\u05ef\3\2\2\2\u05ef\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05e7\3\2"+
		"\2\2\u05f1\u05f2\3\2\2\2\u05f2Y\3\2\2\2\u05f3\u05f4\t\f\2\2\u05f4[\3\2"+
		"\2\2\u05f5\u05f9\5r:\2\u05f6\u05f8\5^\60\2\u05f7\u05f6\3\2\2\2\u05f8\u05fb"+
		"\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa]\3\2\2\2\u05fb"+
		"\u05f9\3\2\2\2\u05fc\u05fd\5`\61\2\u05fd\u05fe\7\64\2\2\u05fe\u0600\5"+
		"r:\2\u05ff\u0601\5b\62\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601"+
		"\u0608\3\2\2\2\u0602\u0603\7<\2\2\u0603\u0604\5`\61\2\u0604\u0605\7\64"+
		"\2\2\u0605\u0606\5r:\2\u0606\u0608\3\2\2\2\u0607\u05fc\3\2\2\2\u0607\u0602"+
		"\3\2\2\2\u0608_\3\2\2\2\u0609\u060b\7\67\2\2\u060a\u0609\3\2\2\2\u060a"+
		"\u060b\3\2\2\2\u060b\u0620\3\2\2\2\u060c\u0620\7\65\2\2\u060d\u060f\7"+
		"8\2\2\u060e\u0610\7\66\2\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"\u0620\3\2\2\2\u0611\u0612\78\2\2\u0612\u0620\79\2\2\u0613\u0615\7:\2"+
		"\2\u0614\u0616\7\66\2\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u0620\3\2\2\2\u0617\u0619\7;\2\2\u0618\u061a\7\66\2\2\u0619\u0618\3\2"+
		"\2\2\u0619\u061a\3\2\2\2\u061a\u0620\3\2\2\2\u061b\u061d\78\2\2\u061c"+
		"\u061b\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\7\u00e5"+
		"\2\2\u061f\u060a\3\2\2\2\u061f\u060c\3\2\2\2\u061f\u060d\3\2\2\2\u061f"+
		"\u0611\3\2\2\2\u061f\u0613\3\2\2\2\u061f\u0617\3\2\2\2\u061f\u061c\3\2"+
		"\2\2\u0620a\3\2\2\2\u0621\u0622\7=\2\2\u0622\u0630\5\u0082B\2\u0623\u0624"+
		"\7\u0097\2\2\u0624\u0625\7\3\2\2\u0625\u062a\5\u00b6\\\2\u0626\u0627\7"+
		"\5\2\2\u0627\u0629\5\u00b6\\\2\u0628\u0626\3\2\2\2\u0629\u062c\3\2\2\2"+
		"\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062d\3\2\2\2\u062c\u062a"+
		"\3\2\2\2\u062d\u062e\7\4\2\2\u062e\u0630\3\2\2\2\u062f\u0621\3\2\2\2\u062f"+
		"\u0623\3\2\2\2\u0630c\3\2\2\2\u0631\u0632\7i\2\2\u0632\u0648\7\3\2\2\u0633"+
		"\u0634\t\r\2\2\u0634\u0649\7\u008d\2\2\u0635\u0636\5\u0080A\2\u0636\u0637"+
		"\7C\2\2\u0637\u0649\3\2\2\2\u0638\u0649\7\u00ee\2\2\u0639\u063a\7\u008e"+
		"\2\2\u063a\u063b\7\u00ef\2\2\u063b\u063c\7\u008f\2\2\u063c\u063d\7\u0090"+
		"\2\2\u063d\u0646\7\u00ef\2\2\u063e\u0644\7=\2\2\u063f\u0645\5\u00b6\\"+
		"\2\u0640\u0641\5\u00b4[\2\u0641\u0642\7\3\2\2\u0642\u0643\7\4\2\2\u0643"+
		"\u0645\3\2\2\2\u0644\u063f\3\2\2\2\u0644\u0640\3\2\2\2\u0645\u0647\3\2"+
		"\2\2\u0646\u063e\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\3\2\2\2\u0648"+
		"\u0633\3\2\2\2\u0648\u0635\3\2\2\2\u0648\u0638\3\2\2\2\u0648\u0639\3\2"+
		"\2\2\u0649\u064a\3\2\2\2\u064a\u064b\7\4\2\2\u064be\3\2\2\2\u064c\u064d"+
		"\7\3\2\2\u064d\u064e\5h\65\2\u064e\u064f\7\4\2\2\u064fg\3\2\2\2\u0650"+
		"\u0655\5\u00b6\\\2\u0651\u0652\7\5\2\2\u0652\u0654\5\u00b6\\\2\u0653\u0651"+
		"\3\2\2\2\u0654\u0657\3\2\2\2\u0655\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656"+
		"i\3\2\2\2\u0657\u0655\3\2\2\2\u0658\u0659\7\3\2\2\u0659\u065e\5l\67\2"+
		"\u065a\u065b\7\5\2\2\u065b\u065d\5l\67\2\u065c\u065a\3\2\2\2\u065d\u0660"+
		"\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0661\3\2\2\2\u0660"+
		"\u065e\3\2\2\2\u0661\u0662\7\4\2\2\u0662k\3\2\2\2\u0663\u0665\5\u00b6"+
		"\\\2\u0664\u0666\t\n\2\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666"+
		"m\3\2\2\2\u0667\u0668\7\3\2\2\u0668\u066d\5p9\2\u0669\u066a\7\5\2\2\u066a"+
		"\u066c\5p9\2\u066b\u0669\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2"+
		"\2\u066d\u066e\3\2\2\2\u066e\u0670\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u0671"+
		"\7\4\2\2\u0671o\3\2\2\2\u0672\u0675\5\u00b6\\\2\u0673\u0674\7p\2\2\u0674"+
		"\u0676\7\u00ea\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676q\3\2"+
		"\2\2\u0677\u0679\5x=\2\u0678\u067a\5d\63\2\u0679\u0678\3\2\2\2\u0679\u067a"+
		"\3\2\2\2\u067a\u067f\3\2\2\2\u067b\u067d\7\17\2\2\u067c\u067b\3\2\2\2"+
		"\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\5\u00b8]\2\u067f"+
		"\u067c\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u06a9\3\2\2\2\u0681\u0682\7\3"+
		"\2\2\u0682\u0683\5@!\2\u0683\u0685\7\4\2\2\u0684\u0686\5d\63\2\u0685\u0684"+
		"\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u068b\3\2\2\2\u0687\u0689\7\17\2\2"+
		"\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c"+
		"\5\u00b8]\2\u068b\u0688\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u06a9\3\2\2"+
		"\2\u068d\u068e\7\3\2\2\u068e\u068f\5\\/\2\u068f\u0691\7\4\2\2\u0690\u0692"+
		"\5d\63\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0697\3\2\2\2\u0693"+
		"\u0695\7\17\2\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\3"+
		"\2\2\2\u0696\u0698\5\u00b8]\2\u0697\u0694\3\2\2\2\u0697\u0698\3\2\2\2"+
		"\u0698\u06a9\3\2\2\2\u0699\u06a9\5t;\2\u069a\u069b\5\u00b6\\\2\u069b\u06a4"+
		"\7\3\2\2\u069c\u06a1\5\u0080A\2\u069d\u069e\7\5\2\2\u069e\u06a0\5\u0080"+
		"A\2\u069f\u069d\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f\3\2\2\2\u06a1"+
		"\u06a2\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4\u069c\3\2"+
		"\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\7\4\2\2\u06a7"+
		"\u06a9\3\2\2\2\u06a8\u0677\3\2\2\2\u06a8\u0681\3\2\2\2\u06a8\u068d\3\2"+
		"\2\2\u06a8\u0699\3\2\2\2\u06a8\u069a\3\2\2\2\u06a9s\3\2\2\2\u06aa\u06ab"+
		"\7M\2\2\u06ab\u06b0\5\u0080A\2\u06ac\u06ad\7\5\2\2\u06ad\u06af\5\u0080"+
		"A\2\u06ae\u06ac\3\2\2\2\u06af\u06b2\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b0"+
		"\u06b1\3\2\2\2\u06b1\u06ba\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b3\u06b5\7\17"+
		"\2\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6"+
		"\u06b8\5\u00b6\\\2\u06b7\u06b9\5f\64\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9"+
		"\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06b4\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb"+
		"u\3\2\2\2\u06bc\u06bd\7K\2\2\u06bd\u06be\7W\2\2\u06be\u06bf\7\u0098\2"+
		"\2\u06bf\u06c3\7\u00ea\2\2\u06c0\u06c1\7L\2\2\u06c1\u06c2\7\u0099\2\2"+
		"\u06c2\u06c4\5,\27\2\u06c3\u06c0\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06ee"+
		"\3\2\2\2\u06c5\u06c6\7K\2\2\u06c6\u06c7\7W\2\2\u06c7\u06d1\7\u009c\2\2"+
		"\u06c8\u06c9\7\u009d\2\2\u06c9\u06ca\7\u009e\2\2\u06ca\u06cb\7\24\2\2"+
		"\u06cb\u06cf\7\u00ea\2\2\u06cc\u06cd\7\u00a2\2\2\u06cd\u06ce\7\24\2\2"+
		"\u06ce\u06d0\7\u00ea\2\2\u06cf\u06cc\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0"+
		"\u06d2\3\2\2\2\u06d1\u06c8\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d8\3\2"+
		"\2\2\u06d3\u06d4\7\u009f\2\2\u06d4\u06d5\7\u00a0\2\2\u06d5\u06d6\7\u009e"+
		"\2\2\u06d6\u06d7\7\24\2\2\u06d7\u06d9\7\u00ea\2\2\u06d8\u06d3\3\2\2\2"+
		"\u06d8\u06d9\3\2\2\2\u06d9\u06df\3\2\2\2\u06da\u06db\7n\2\2\u06db\u06dc"+
		"\7\u00a1\2\2\u06dc\u06dd\7\u009e\2\2\u06dd\u06de\7\24\2\2\u06de\u06e0"+
		"\7\u00ea\2\2\u06df\u06da\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e5\3\2\2"+
		"\2\u06e1\u06e2\7\u00a3\2\2\u06e2\u06e3\7\u009e\2\2\u06e3\u06e4\7\24\2"+
		"\2\u06e4\u06e6\7\u00ea\2\2\u06e5\u06e1\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6"+
		"\u06eb\3\2\2\2\u06e7\u06e8\7\'\2\2\u06e8\u06e9\7\u00d1\2\2\u06e9\u06ea"+
		"\7\17\2\2\u06ea\u06ec\7\u00ea\2\2\u06eb\u06e7\3\2\2\2\u06eb\u06ec\3\2"+
		"\2\2\u06ec\u06ee\3\2\2\2\u06ed\u06bc\3\2\2\2\u06ed\u06c5\3\2\2\2\u06ee"+
		"w\3\2\2\2\u06ef\u06f0\5\u00b6\\\2\u06f0\u06f1\7\6\2\2\u06f1\u06f3\3\2"+
		"\2\2\u06f2\u06ef\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4"+
		"\u06f5\5\u00b6\\\2\u06f5y\3\2\2\2\u06f6\u06f7\5\u00b6\\\2\u06f7\u06f8"+
		"\7\6\2\2\u06f8\u06fa\3\2\2\2\u06f9\u06f6\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa"+
		"\u06fb\3\2\2\2\u06fb\u06fc\5\u00b6\\\2\u06fc{\3\2\2\2\u06fd\u0705\5\u0080"+
		"A\2\u06fe\u0700\7\17\2\2\u06ff\u06fe\3\2\2\2\u06ff\u0700\3\2\2\2\u0700"+
		"\u0703\3\2\2\2\u0701\u0704\5\u00b6\\\2\u0702\u0704\5f\64\2\u0703\u0701"+
		"\3\2\2\2\u0703\u0702\3\2\2\2\u0704\u0706\3\2\2\2\u0705\u06ff\3\2\2\2\u0705"+
		"\u0706\3\2\2\2\u0706}\3\2\2\2\u0707\u070c\5|?\2\u0708\u0709\7\5\2\2\u0709"+
		"\u070b\5|?\2\u070a\u0708\3\2\2\2\u070b\u070e\3\2\2\2\u070c\u070a\3\2\2"+
		"\2\u070c\u070d\3\2\2\2\u070d\177\3\2\2\2\u070e\u070c\3\2\2\2\u070f\u0710"+
		"\5\u0082B\2\u0710\u0081\3\2\2\2\u0711\u0712\bB\1\2\u0712\u0713\7 \2\2"+
		"\u0713\u071b\5\u0082B\7\u0714\u0715\7\"\2\2\u0715\u0716\7\3\2\2\u0716"+
		"\u0717\5\30\r\2\u0717\u0718\7\4\2\2\u0718\u071b\3\2\2\2\u0719\u071b\5"+
		"\u0084C\2\u071a\u0711\3\2\2\2\u071a\u0714\3\2\2\2\u071a\u0719\3\2\2\2"+
		"\u071b\u0724\3\2\2\2\u071c\u071d\f\4\2\2\u071d\u071e\7\36\2\2\u071e\u0723"+
		"\5\u0082B\5\u071f\u0720\f\3\2\2\u0720\u0721\7\35\2\2\u0721\u0723\5\u0082"+
		"B\4\u0722\u071c\3\2\2\2\u0722\u071f\3\2\2\2\u0723\u0726\3\2\2\2\u0724"+
		"\u0722\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0083\3\2\2\2\u0726\u0724\3\2"+
		"\2\2\u0727\u0729\5\u0088E\2\u0728\u072a\5\u0086D\2\u0729\u0728\3\2\2\2"+
		"\u0729\u072a\3\2\2\2\u072a\u0085\3\2\2\2\u072b\u072d\7 \2\2\u072c\u072b"+
		"\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\7#\2\2\u072f"+
		"\u0730\5\u0088E\2\u0730\u0731\7\36\2\2\u0731\u0732\5\u0088E\2\u0732\u0755"+
		"\3\2\2\2\u0733\u0735\7 \2\2\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u0736\3\2\2\2\u0736\u0737\7\37\2\2\u0737\u0738\7\3\2\2\u0738\u073d\5"+
		"\u0080A\2\u0739\u073a\7\5\2\2\u073a\u073c\5\u0080A\2\u073b\u0739\3\2\2"+
		"\2\u073c\u073f\3\2\2\2\u073d\u073b\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0740"+
		"\3\2\2\2\u073f\u073d\3\2\2\2\u0740\u0741\7\4\2\2\u0741\u0755\3\2\2\2\u0742"+
		"\u0744\7 \2\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\3\2"+
		"\2\2\u0745\u0746\7\37\2\2\u0746\u0747\7\3\2\2\u0747\u0748\5\30\r\2\u0748"+
		"\u0749\7\4\2\2\u0749\u0755\3\2\2\2\u074a\u074c\7 \2\2\u074b\u074a\3\2"+
		"\2\2\u074b\u074c\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074e\t\16\2\2\u074e"+
		"\u0755\5\u0088E\2\u074f\u0751\7&\2\2\u0750\u0752\7 \2\2\u0751\u0750\3"+
		"\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0755\7\'\2\2\u0754"+
		"\u072c\3\2\2\2\u0754\u0734\3\2\2\2\u0754\u0743\3\2\2\2\u0754\u074b\3\2"+
		"\2\2\u0754\u074f\3\2\2\2\u0755\u0087\3\2\2\2\u0756\u0757\bE\1\2\u0757"+
		"\u075b\5\u008aF\2\u0758\u0759\t\17\2\2\u0759\u075b\5\u0088E\t\u075a\u0756"+
		"\3\2\2\2\u075a\u0758\3\2\2\2\u075b\u0771\3\2\2\2\u075c\u075d\f\b\2\2\u075d"+
		"\u075e\t\20\2\2\u075e\u0770\5\u0088E\t\u075f\u0760\f\7\2\2\u0760\u0761"+
		"\t\21\2\2\u0761\u0770\5\u0088E\b\u0762\u0763\f\6\2\2\u0763\u0764\7\u008a"+
		"\2\2\u0764\u0770\5\u0088E\7\u0765\u0766\f\5\2\2\u0766\u0767\7\u008c\2"+
		"\2\u0767\u0770\5\u0088E\6\u0768\u0769\f\4\2\2\u0769\u076a\7\u008b\2\2"+
		"\u076a\u0770\5\u0088E\5\u076b\u076c\f\3\2\2\u076c\u076d\5\u008eH\2\u076d"+
		"\u076e\5\u0088E\4\u076e\u0770\3\2\2\2\u076f\u075c\3\2\2\2\u076f\u075f"+
		"\3\2\2\2\u076f\u0762\3\2\2\2\u076f\u0765\3\2\2\2\u076f\u0768\3\2\2\2\u076f"+
		"\u076b\3\2\2\2\u0770\u0773\3\2\2\2\u0771\u076f\3\2\2\2\u0771\u0772\3\2"+
		"\2\2\u0772\u0089\3\2\2\2\u0773\u0771\3\2\2\2\u0774\u0775\bF\1\2\u0775"+
		"\u07e3\t\22\2\2\u0776\u0778\7/\2\2\u0777\u0779\5\u00a8U\2\u0778\u0777"+
		"\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u0778\3\2\2\2\u077a\u077b\3\2\2\2\u077b"+
		"\u077e\3\2\2\2\u077c\u077d\7\62\2\2\u077d\u077f\5\u0080A\2\u077e\u077c"+
		"\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0781\7\63\2\2"+
		"\u0781\u07e3\3\2\2\2\u0782\u0783\7/\2\2\u0783\u0785\5\u0080A\2\u0784\u0786"+
		"\5\u00a8U\2\u0785\u0784\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0785\3\2\2"+
		"\2\u0787\u0788\3\2\2\2\u0788\u078b\3\2\2\2\u0789\u078a\7\62\2\2\u078a"+
		"\u078c\5\u0080A\2\u078b\u0789\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078d"+
		"\3\2\2\2\u078d\u078e\7\63\2\2\u078e\u07e3\3\2\2\2\u078f\u0790\7[\2\2\u0790"+
		"\u0791\7\3\2\2\u0791\u0792\5\u0080A\2\u0792\u0793\7\17\2\2\u0793\u0794"+
		"\5\u009eP\2\u0794\u0795\7\4\2\2\u0795\u07e3\3\2\2\2\u0796\u0797\7o\2\2"+
		"\u0797\u07a0\7\3\2\2\u0798\u079d\5|?\2\u0799\u079a\7\5\2\2\u079a\u079c"+
		"\5|?\2\u079b\u0799\3\2\2\2\u079c\u079f\3\2\2\2\u079d\u079b\3\2\2\2\u079d"+
		"\u079e\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u07a0\u0798\3\2"+
		"\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07e3\7\4\2\2\u07a3"+
		"\u07a4\7H\2\2\u07a4\u07a5\7\3\2\2\u07a5\u07a8\5\u0080A\2\u07a6\u07a7\7"+
		"y\2\2\u07a7\u07a9\7*\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9"+
		"\u07aa\3\2\2\2\u07aa\u07ab\7\4\2\2\u07ab\u07e3\3\2\2\2\u07ac\u07ad\7J"+
		"\2\2\u07ad\u07ae\7\3\2\2\u07ae\u07b1\5\u0080A\2\u07af\u07b0\7y\2\2\u07b0"+
		"\u07b2\7*\2\2\u07b1\u07af\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2"+
		"\2\2\u07b3\u07b4\7\4\2\2\u07b4\u07e3\3\2\2\2\u07b5\u07e3\5\u008cG\2\u07b6"+
		"\u07e3\7\u0085\2\2\u07b7\u07b8\5\u00b4[\2\u07b8\u07b9\7\6\2\2\u07b9\u07ba"+
		"\7\u0085\2\2\u07ba\u07e3\3\2\2\2\u07bb\u07bc\7\3\2\2\u07bc\u07bf\5|?\2"+
		"\u07bd\u07be\7\5\2\2\u07be\u07c0\5|?\2\u07bf\u07bd\3\2\2\2\u07c0\u07c1"+
		"\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3"+
		"\u07c4\7\4\2\2\u07c4\u07e3\3\2\2\2\u07c5\u07c6\7\3\2\2\u07c6\u07c7\5\30"+
		"\r\2\u07c7\u07c8\7\4\2\2\u07c8\u07e3\3\2\2\2\u07c9\u07ca\5\u00b4[\2\u07ca"+
		"\u07d6\7\3\2\2\u07cb\u07cd\5Z.\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2"+
		"\2\u07cd\u07ce\3\2\2\2\u07ce\u07d3\5\u0080A\2\u07cf\u07d0\7\5\2\2\u07d0"+
		"\u07d2\5\u0080A\2\u07d1\u07cf\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3\u07d1"+
		"\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d7\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d6"+
		"\u07cc\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07db\7\4"+
		"\2\2\u07d9\u07da\7@\2\2\u07da\u07dc\5\u00aeX\2\u07db\u07d9\3\2\2\2\u07db"+
		"\u07dc\3\2\2\2\u07dc\u07e3\3\2\2\2\u07dd\u07e3\5\u00b6\\\2\u07de\u07df"+
		"\7\3\2\2\u07df\u07e0\5\u0080A\2\u07e0\u07e1\7\4\2\2\u07e1\u07e3\3\2\2"+
		"\2\u07e2\u0774\3\2\2\2\u07e2\u0776\3\2\2\2\u07e2\u0782\3\2\2\2\u07e2\u078f"+
		"\3\2\2\2\u07e2\u0796\3\2\2\2\u07e2\u07a3\3\2\2\2\u07e2\u07ac\3\2\2\2\u07e2"+
		"\u07b5\3\2\2\2\u07e2\u07b6\3\2\2\2\u07e2\u07b7\3\2\2\2\u07e2\u07bb\3\2"+
		"\2\2\u07e2\u07c5\3\2\2\2\u07e2\u07c9\3\2\2\2\u07e2\u07dd\3\2\2\2\u07e2"+
		"\u07de\3\2\2\2\u07e3\u07ee\3\2\2\2\u07e4\u07e5\f\6\2\2\u07e5\u07e6\7\t"+
		"\2\2\u07e6\u07e7\5\u0088E\2\u07e7\u07e8\7\n\2\2\u07e8\u07ed\3\2\2\2\u07e9"+
		"\u07ea\f\4\2\2\u07ea\u07eb\7\6\2\2\u07eb\u07ed\5\u00b6\\\2\u07ec\u07e4"+
		"\3\2\2\2\u07ec\u07e9\3\2\2\2\u07ed\u07f0\3\2\2\2\u07ee\u07ec\3\2\2\2\u07ee"+
		"\u07ef\3\2\2\2\u07ef\u008b\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f1\u07fe\7\'"+
		"\2\2\u07f2\u07fe\5\u0096L\2\u07f3\u07f4\5\u00b6\\\2\u07f4\u07f5\7\u00ea"+
		"\2\2\u07f5\u07fe\3\2\2\2\u07f6\u07fe\5\u00bc_\2\u07f7\u07fe\5\u0094K\2"+
		"\u07f8\u07fa\7\u00ea\2\2\u07f9\u07f8\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb"+
		"\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fe\3\2\2\2\u07fd\u07f1\3\2"+
		"\2\2\u07fd\u07f2\3\2\2\2\u07fd\u07f3\3\2\2\2\u07fd\u07f6\3\2\2\2\u07fd"+
		"\u07f7\3\2\2\2\u07fd\u07f9\3\2\2\2\u07fe\u008d\3\2\2\2\u07ff\u0800\t\23"+
		"\2\2\u0800\u008f\3\2\2\2\u0801\u0802\t\24\2\2\u0802\u0091\3\2\2\2\u0803"+
		"\u0804\t\25\2\2\u0804\u0093\3\2\2\2\u0805\u0806\t\26\2\2\u0806\u0095\3"+
		"\2\2\2\u0807\u080b\7.\2\2\u0808\u080a\5\u0098M\2\u0809\u0808\3\2\2\2\u080a"+
		"\u080d\3\2\2\2\u080b\u0809\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u0097\3\2"+
		"\2\2\u080d\u080b\3\2\2\2\u080e\u080f\5\u009aN\2\u080f\u0812\5\u00b6\\"+
		"\2\u0810\u0811\7h\2\2\u0811\u0813\5\u00b6\\\2\u0812\u0810\3\2\2\2\u0812"+
		"\u0813\3\2\2\2\u0813\u0099\3\2\2\2\u0814\u0816\t\21\2\2\u0815\u0814\3"+
		"\2\2\2\u0815\u0816\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u081a\t\r\2\2\u0818"+
		"\u081a\7\u00ea\2\2\u0819\u0815\3\2\2\2\u0819\u0818\3\2\2\2\u081a\u009b"+
		"\3\2\2\2\u081b\u081f\7H\2\2\u081c\u081d\7I\2\2\u081d\u081f\5\u00b6\\\2"+
		"\u081e\u081b\3\2\2\2\u081e\u081c\3\2\2\2\u081f\u009d\3\2\2\2\u0820\u0821"+
		"\7m\2\2\u0821\u0822\7\177\2\2\u0822\u0823\5\u009eP\2\u0823\u0824\7\u0081"+
		"\2\2\u0824\u0843\3\2\2\2\u0825\u0826\7n\2\2\u0826\u0827\7\177\2\2\u0827"+
		"\u0828\5\u009eP\2\u0828\u0829\7\5\2\2\u0829\u082a\5\u009eP\2\u082a\u082b"+
		"\7\u0081\2\2\u082b\u0843\3\2\2\2\u082c\u0833\7o\2\2\u082d\u082f\7\177"+
		"\2\2\u082e\u0830\5\u00a4S\2\u082f\u082e\3\2\2\2\u082f\u0830\3\2\2\2\u0830"+
		"\u0831\3\2\2\2\u0831\u0834\7\u0081\2\2\u0832\u0834\7}\2\2\u0833\u082d"+
		"\3\2\2\2\u0833\u0832\3\2\2\2\u0834\u0843\3\2\2\2\u0835\u0840\5\u00b6\\"+
		"\2\u0836\u0837\7\3\2\2\u0837\u083c\7\u00ef\2\2\u0838\u0839\7\5\2\2\u0839"+
		"\u083b\7\u00ef\2\2\u083a\u0838\3\2\2\2\u083b\u083e\3\2\2\2\u083c\u083a"+
		"\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083f\3\2\2\2\u083e\u083c\3\2\2\2\u083f"+
		"\u0841\7\4\2\2\u0840\u0836\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0843\3\2"+
		"\2\2\u0842\u0820\3\2\2\2\u0842\u0825\3\2\2\2\u0842\u082c\3\2\2\2\u0842"+
		"\u0835\3\2\2\2\u0843\u009f\3\2\2\2\u0844\u0849\5\u00a2R\2\u0845\u0846"+
		"\7\5\2\2\u0846\u0848\5\u00a2R\2\u0847\u0845\3\2\2\2\u0848\u084b\3\2\2"+
		"\2\u0849\u0847\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u00a1\3\2\2\2\u084b\u0849"+
		"\3\2\2\2\u084c\u084d\5\u00b6\\\2\u084d\u0850\5\u009eP\2\u084e\u084f\7"+
		"p\2\2\u084f\u0851\7\u00ea\2\2\u0850\u084e\3\2\2\2\u0850\u0851\3\2\2\2"+
		"\u0851\u00a3\3\2\2\2\u0852\u0857\5\u00a6T\2\u0853\u0854\7\5\2\2\u0854"+
		"\u0856\5\u00a6T\2\u0855\u0853\3\2\2\2\u0856\u0859\3\2\2\2\u0857\u0855"+
		"\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u00a5\3\2\2\2\u0859\u0857\3\2\2\2\u085a"+
		"\u085b\5\u00b6\\\2\u085b\u085c\7\13\2\2\u085c\u085f\5\u009eP\2\u085d\u085e"+
		"\7p\2\2\u085e\u0860\7\u00ea\2\2\u085f\u085d\3\2\2\2\u085f\u0860\3\2\2"+
		"\2\u0860\u00a7\3\2\2\2\u0861\u0862\7\60\2\2\u0862\u0863\5\u0080A\2\u0863"+
		"\u0864\7\61\2\2\u0864\u0865\5\u0080A\2\u0865\u00a9\3\2\2\2\u0866\u0867"+
		"\7?\2\2\u0867\u086c\5\u00acW\2\u0868\u0869\7\5\2\2\u0869\u086b\5\u00ac"+
		"W\2\u086a\u0868\3\2\2\2\u086b\u086e\3\2\2\2\u086c\u086a\3\2\2\2\u086c"+
		"\u086d\3\2\2\2\u086d\u00ab\3\2\2\2\u086e\u086c\3\2\2\2\u086f\u0870\5\u00b6"+
		"\\\2\u0870\u0871\7\17\2\2\u0871\u0872\5\u00aeX\2\u0872\u00ad\3\2\2\2\u0873"+
		"\u089e\5\u00b6\\\2\u0874\u0897\7\3\2\2\u0875\u0876\7\u0092\2\2\u0876\u0877"+
		"\7\24\2\2\u0877\u087c\5\u0080A\2\u0878\u0879\7\5\2\2\u0879\u087b\5\u0080"+
		"A\2\u087a\u0878\3\2\2\2\u087b\u087e\3\2\2\2\u087c\u087a\3\2\2\2\u087c"+
		"\u087d\3\2\2\2\u087d\u0898\3\2\2\2\u087e\u087c\3\2\2\2\u087f\u0880\t\27"+
		"\2\2\u0880\u0881\7\24\2\2\u0881\u0886\5\u0080A\2\u0882\u0883\7\5\2\2\u0883"+
		"\u0885\5\u0080A\2\u0884\u0882\3\2\2\2\u0885\u0888\3\2\2\2\u0886\u0884"+
		"\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u088a\3\2\2\2\u0888\u0886\3\2\2\2\u0889"+
		"\u087f\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u0895\3\2\2\2\u088b\u088c\t\30"+
		"\2\2\u088c\u088d\7\24\2\2\u088d\u0892\5J&\2\u088e\u088f\7\5\2\2\u088f"+
		"\u0891\5J&\2\u0890\u088e\3\2\2\2\u0891\u0894\3\2\2\2\u0892\u0890\3\2\2"+
		"\2\u0892\u0893\3\2\2\2\u0893\u0896\3\2\2\2\u0894\u0892\3\2\2\2\u0895\u088b"+
		"\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0898\3\2\2\2\u0897\u0875\3\2\2\2\u0897"+
		"\u0889\3\2\2\2\u0898\u089a\3\2\2\2\u0899\u089b\5\u00b0Y\2\u089a\u0899"+
		"\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089e\7\4\2\2\u089d"+
		"\u0873\3\2\2\2\u089d\u0874\3\2\2\2\u089e\u00af\3\2\2\2\u089f\u08a0\7B"+
		"\2\2\u08a0\u08b0\5\u00b2Z\2\u08a1\u08a2\7C\2\2\u08a2\u08b0\5\u00b2Z\2"+
		"\u08a3\u08a4\7B\2\2\u08a4\u08a5\7#\2\2\u08a5\u08a6\5\u00b2Z\2\u08a6\u08a7"+
		"\7\36\2\2\u08a7\u08a8\5\u00b2Z\2\u08a8\u08b0\3\2\2\2\u08a9\u08aa\7C\2"+
		"\2\u08aa\u08ab\7#\2\2\u08ab\u08ac\5\u00b2Z\2\u08ac\u08ad\7\36\2\2\u08ad"+
		"\u08ae\5\u00b2Z\2\u08ae\u08b0\3\2\2\2\u08af\u089f\3\2\2\2\u08af\u08a1"+
		"\3\2\2\2\u08af\u08a3\3\2\2\2\u08af\u08a9\3\2\2\2\u08b0\u00b1\3\2\2\2\u08b1"+
		"\u08b2\7D\2\2\u08b2\u08b9\t\31\2\2\u08b3\u08b4\7G\2\2\u08b4\u08b9\7K\2"+
		"\2\u08b5\u08b6\5\u0080A\2\u08b6\u08b7\t\31\2\2\u08b7\u08b9\3\2\2\2\u08b8"+
		"\u08b1\3\2\2\2\u08b8\u08b3\3\2\2\2\u08b8\u08b5\3\2\2\2\u08b9\u00b3\3\2"+
		"\2\2\u08ba\u08bf\5\u00b6\\\2\u08bb\u08bc\7\6\2\2\u08bc\u08be\5\u00b6\\"+
		"\2\u08bd\u08bb\3\2\2\2\u08be\u08c1\3\2\2\2\u08bf\u08bd\3\2\2\2\u08bf\u08c0"+
		"\3\2\2\2\u08c0\u00b5\3\2\2\2\u08c1\u08bf\3\2\2\2\u08c2\u08d2\5\u00b8]"+
		"\2\u08c3\u08d2\7\u00e5\2\2\u08c4\u08d2\7;\2\2\u08c5\u08d2\7\67\2\2\u08c6"+
		"\u08d2\78\2\2\u08c7\u08d2\79\2\2\u08c8\u08d2\7:\2\2\u08c9\u08d2\7<\2\2"+
		"\u08ca\u08d2\7\64\2\2\u08cb\u08d2\7\65\2\2\u08cc\u08d2\7=\2\2\u08cd\u08d2"+
		"\7d\2\2\u08ce\u08d2\7g\2\2\u08cf\u08d2\7e\2\2\u08d0\u08d2\7f\2\2\u08d1"+
		"\u08c2\3\2\2\2\u08d1\u08c3\3\2\2\2\u08d1\u08c4\3\2\2\2\u08d1\u08c5\3\2"+
		"\2\2\u08d1\u08c6\3\2\2\2\u08d1\u08c7\3\2\2\2\u08d1\u08c8\3\2\2\2\u08d1"+
		"\u08c9\3\2\2\2\u08d1\u08ca\3\2\2\2\u08d1\u08cb\3\2\2\2\u08d1\u08cc\3\2"+
		"\2\2\u08d1\u08cd\3\2\2\2\u08d1\u08ce\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d1"+
		"\u08d0\3\2\2\2\u08d2\u00b7\3\2\2\2\u08d3\u08d7\7\u00f3\2\2\u08d4\u08d7"+
		"\5\u00ba^\2\u08d5\u08d7\5\u00be`\2\u08d6\u08d3\3\2\2\2\u08d6\u08d4\3\2"+
		"\2\2\u08d6\u08d5\3\2\2\2\u08d7\u00b9\3\2\2\2\u08d8\u08d9\7\u00f4\2\2\u08d9"+
		"\u00bb\3\2\2\2\u08da\u08dc\7\u0084\2\2\u08db\u08da\3\2\2\2\u08db\u08dc"+
		"\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08f7\7\u00f0\2\2\u08de\u08e0\7\u0084"+
		"\2\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1"+
		"\u08f7\7\u00ef\2\2\u08e2\u08e4\7\u0084\2\2\u08e3\u08e2\3\2\2\2\u08e3\u08e4"+
		"\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08f7\7\u00eb\2\2\u08e6\u08e8\7\u0084"+
		"\2\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9"+
		"\u08f7\7\u00ec\2\2\u08ea\u08ec\7\u0084\2\2\u08eb\u08ea\3\2\2\2\u08eb\u08ec"+
		"\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08f7\7\u00ed\2\2\u08ee\u08f0\7\u0084"+
		"\2\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1"+
		"\u08f7\7\u00f1\2\2\u08f2\u08f4\7\u0084\2\2\u08f3\u08f2\3\2\2\2\u08f3\u08f4"+
		"\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f7\7\u00f2\2\2\u08f6\u08db\3\2\2"+
		"\2\u08f6\u08df\3\2\2\2\u08f6\u08e3\3\2\2\2\u08f6\u08e7\3\2\2\2\u08f6\u08eb"+
		"\3\2\2\2\u08f6\u08ef\3\2\2\2\u08f6\u08f3\3\2\2\2\u08f7\u00bd\3\2\2\2\u08f8"+
		"\u08f9\t\32\2\2\u08f9\u00bf\3\2\2\2\u013e\u00d7\u00dc\u00df\u00e4\u00f1"+
		"\u00f5\u00fc\u0101\u0106\u0109\u010c\u0110\u0113\u0116\u011d\u0121\u0129"+
		"\u012c\u012f\u0132\u0135\u0138\u013c\u013f\u0142\u0149\u014f\u0155\u015d"+
		"\u017d\u0185\u0189\u018e\u0194\u019c\u01a2\u01af\u01b4\u01bd\u01c2\u01d2"+
		"\u01d9\u01dd\u01e5\u01ec\u01f3\u0202\u0206\u020c\u0212\u0215\u0218\u021e"+
		"\u0222\u0226\u022b\u022f\u0237\u023a\u0243\u0248\u024e\u0254\u0260\u0263"+
		"\u0267\u026c\u0271\u0278\u027b\u027e\u0285\u028a\u0290\u0299\u02a1\u02a7"+
		"\u02ab\u02af\u02b3\u02b5\u02be\u02c4\u02c9\u02cc\u02d0\u02d3\u02dc\u02e1"+
		"\u02e6\u02e9\u02ef\u02f7\u02fc\u0302\u0308\u0313\u031b\u0322\u032a\u032d"+
		"\u0335\u0339\u0340\u03b4\u03bc\u03c4\u03cd\u03d9\u03dd\u03e0\u03e6\u03f0"+
		"\u03fc\u0401\u0407\u0414\u0416\u041b\u041f\u0421\u0425\u042e\u0436\u043d"+
		"\u0443\u0447\u0450\u0455\u0464\u046b\u046e\u0475\u0479\u047f\u0487\u0492"+
		"\u049d\u04a4\u04aa\u04b0\u04ba\u04be\u04c7\u04ca\u04d3\u04d6\u04df\u04e2"+
		"\u04eb\u04ee\u04f1\u04f5\u04f8\u0503\u0508\u0513\u0517\u051b\u0527\u052a"+
		"\u052e\u0538\u053c\u053e\u0541\u0545\u0548\u054c\u0552\u0556\u055a\u055f"+
		"\u0562\u0564\u0569\u056e\u0571\u0575\u0578\u057a\u057f\u0584\u0591\u0596"+
		"\u059e\u05a4\u05ae\u05bd\u05c2\u05ca\u05cd\u05d1\u05d6\u05df\u05e2\u05e7"+
		"\u05ee\u05f1\u05f9\u0600\u0607\u060a\u060f\u0615\u0619\u061c\u061f\u062a"+
		"\u062f\u0644\u0646\u0648\u0655\u065e\u0665\u066d\u0675\u0679\u067c\u067f"+
		"\u0685\u0688\u068b\u0691\u0694\u0697\u06a1\u06a4\u06a8\u06b0\u06b4\u06b8"+
		"\u06ba\u06c3\u06cf\u06d1\u06d8\u06df\u06e5\u06eb\u06ed\u06f2\u06f9\u06ff"+
		"\u0703\u0705\u070c\u071a\u0722\u0724\u0729\u072c\u0734\u073d\u0743\u074b"+
		"\u0751\u0754\u075a\u076f\u0771\u077a\u077e\u0787\u078b\u079d\u07a0\u07a8"+
		"\u07b1\u07c1\u07cc\u07d3\u07d6\u07db\u07e2\u07ec\u07ee\u07fb\u07fd\u080b"+
		"\u0812\u0815\u0819\u081e\u082f\u0833\u083c\u0840\u0842\u0849\u0850\u0857"+
		"\u085f\u086c\u087c\u0886\u0889\u0892\u0895\u0897\u089a\u089d\u08af\u08b8"+
		"\u08bf\u08d1\u08d6\u08db\u08df\u08e3\u08e7\u08eb\u08ef\u08f3\u08f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}