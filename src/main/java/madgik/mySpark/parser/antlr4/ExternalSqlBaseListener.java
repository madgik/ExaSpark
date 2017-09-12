package madgik.mySpark.parser.antlr4;

// Generated from ExternalSqlBase.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

import madgik.mySpark.parser.exception.VtExtensionParserException;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExternalSqlBaseParser}.
 */
public interface ExternalSqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(ExternalSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(ExternalSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(ExternalSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(ExternalSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(ExternalSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(ExternalSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(ExternalSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(ExternalSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(ExternalSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(ExternalSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(ExternalSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(ExternalSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(ExternalSqlBaseParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(ExternalSqlBaseParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(ExternalSqlBaseParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(ExternalSqlBaseParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(ExternalSqlBaseParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(ExternalSqlBaseParser.SetDatabasePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(ExternalSqlBaseParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(ExternalSqlBaseParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(ExternalSqlBaseParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(ExternalSqlBaseParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateHiveTable(ExternalSqlBaseParser.CreateHiveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateHiveTable(ExternalSqlBaseParser.CreateHiveTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(ExternalSqlBaseParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(ExternalSqlBaseParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(ExternalSqlBaseParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(ExternalSqlBaseParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(ExternalSqlBaseParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(ExternalSqlBaseParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(ExternalSqlBaseParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(ExternalSqlBaseParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(ExternalSqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(ExternalSqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(ExternalSqlBaseParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(ExternalSqlBaseParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterChangeColumn(ExternalSqlBaseParser.ChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitChangeColumn(ExternalSqlBaseParser.ChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(ExternalSqlBaseParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(ExternalSqlBaseParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(ExternalSqlBaseParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(ExternalSqlBaseParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(ExternalSqlBaseParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(ExternalSqlBaseParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(ExternalSqlBaseParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(ExternalSqlBaseParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(ExternalSqlBaseParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(ExternalSqlBaseParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(ExternalSqlBaseParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(ExternalSqlBaseParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(ExternalSqlBaseParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(ExternalSqlBaseParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(ExternalSqlBaseParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(ExternalSqlBaseParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(ExternalSqlBaseParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(ExternalSqlBaseParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(ExternalSqlBaseParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(ExternalSqlBaseParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(ExternalSqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(ExternalSqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(ExternalSqlBaseParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(ExternalSqlBaseParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(ExternalSqlBaseParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(ExternalSqlBaseParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(ExternalSqlBaseParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(ExternalSqlBaseParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(ExternalSqlBaseParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(ExternalSqlBaseParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(ExternalSqlBaseParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(ExternalSqlBaseParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(ExternalSqlBaseParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(ExternalSqlBaseParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(ExternalSqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(ExternalSqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(ExternalSqlBaseParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(ExternalSqlBaseParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(ExternalSqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(ExternalSqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(ExternalSqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(ExternalSqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(ExternalSqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(ExternalSqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(ExternalSqlBaseParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(ExternalSqlBaseParser.DescribeDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(ExternalSqlBaseParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(ExternalSqlBaseParser.DescribeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(ExternalSqlBaseParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(ExternalSqlBaseParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(ExternalSqlBaseParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(ExternalSqlBaseParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(ExternalSqlBaseParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(ExternalSqlBaseParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(ExternalSqlBaseParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(ExternalSqlBaseParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(ExternalSqlBaseParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(ExternalSqlBaseParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(ExternalSqlBaseParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(ExternalSqlBaseParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(ExternalSqlBaseParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(ExternalSqlBaseParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(ExternalSqlBaseParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(ExternalSqlBaseParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(ExternalSqlBaseParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(ExternalSqlBaseParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(ExternalSqlBaseParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(ExternalSqlBaseParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(ExternalSqlBaseParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(ExternalSqlBaseParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(ExternalSqlBaseParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link ExternalSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(ExternalSqlBaseParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(ExternalSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(ExternalSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(ExternalSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(ExternalSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(ExternalSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(ExternalSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(ExternalSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(ExternalSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(ExternalSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(ExternalSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ExternalSqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ExternalSqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(ExternalSqlBaseParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(ExternalSqlBaseParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(ExternalSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(ExternalSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(ExternalSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(ExternalSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(ExternalSqlBaseParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(ExternalSqlBaseParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(ExternalSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(ExternalSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(ExternalSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(ExternalSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(ExternalSqlBaseParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(ExternalSqlBaseParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(ExternalSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(ExternalSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(ExternalSqlBaseParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(ExternalSqlBaseParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(ExternalSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(ExternalSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(ExternalSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(ExternalSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(ExternalSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(ExternalSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(ExternalSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(ExternalSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(ExternalSqlBaseParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(ExternalSqlBaseParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(ExternalSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(ExternalSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(ExternalSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(ExternalSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link ExternalSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(ExternalSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link ExternalSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(ExternalSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link ExternalSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(ExternalSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link ExternalSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(ExternalSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(ExternalSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(ExternalSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ExternalSqlBaseParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ExternalSqlBaseParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(ExternalSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(ExternalSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(ExternalSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(ExternalSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(ExternalSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(ExternalSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(ExternalSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(ExternalSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(ExternalSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(ExternalSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(ExternalSqlBaseParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(ExternalSqlBaseParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(ExternalSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(ExternalSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(ExternalSqlBaseParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(ExternalSqlBaseParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(ExternalSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(ExternalSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(ExternalSqlBaseParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link ExternalSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(ExternalSqlBaseParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(ExternalSqlBaseParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(ExternalSqlBaseParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(ExternalSqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(ExternalSqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(ExternalSqlBaseParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(ExternalSqlBaseParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(ExternalSqlBaseParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(ExternalSqlBaseParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(ExternalSqlBaseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(ExternalSqlBaseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(ExternalSqlBaseParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(ExternalSqlBaseParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(ExternalSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(ExternalSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(ExternalSqlBaseParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(ExternalSqlBaseParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(ExternalSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(ExternalSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ExternalSqlBaseParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ExternalSqlBaseParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(ExternalSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(ExternalSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(ExternalSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(ExternalSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(ExternalSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(ExternalSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(ExternalSqlBaseParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(ExternalSqlBaseParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(ExternalSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(ExternalSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(ExternalSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(ExternalSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(ExternalSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(ExternalSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(ExternalSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(ExternalSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(ExternalSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(ExternalSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(ExternalSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(ExternalSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(ExternalSqlBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(ExternalSqlBaseParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(ExternalSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(ExternalSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(ExternalSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(ExternalSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(ExternalSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(ExternalSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(ExternalSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link ExternalSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(ExternalSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(ExternalSqlBaseParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(ExternalSqlBaseParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link ExternalSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(ExternalSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link ExternalSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(ExternalSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link ExternalSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(ExternalSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link ExternalSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(ExternalSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(ExternalSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(ExternalSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(ExternalSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(ExternalSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(ExternalSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(ExternalSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(ExternalSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(ExternalSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExternalSqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExternalSqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link ExternalSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(ExternalSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link ExternalSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(ExternalSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(ExternalSqlBaseParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(ExternalSqlBaseParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link ExternalSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(ExternalSqlBaseParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link ExternalSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(ExternalSqlBaseParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link ExternalSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(ExternalSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link ExternalSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(ExternalSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(ExternalSqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(ExternalSqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(ExternalSqlBaseParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(ExternalSqlBaseParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(ExternalSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(ExternalSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ExternalSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ExternalSqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ExternalSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ExternalSqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link ExternalSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(ExternalSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link ExternalSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(ExternalSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link ExternalSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(ExternalSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link ExternalSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(ExternalSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(ExternalSqlBaseParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(ExternalSqlBaseParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(ExternalSqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(ExternalSqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(ExternalSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(ExternalSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(ExternalSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(ExternalSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(ExternalSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(ExternalSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(ExternalSqlBaseParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(ExternalSqlBaseParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(ExternalSqlBaseParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(ExternalSqlBaseParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(ExternalSqlBaseParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(ExternalSqlBaseParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeFunctionCall}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimeFunctionCall(ExternalSqlBaseParser.TimeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeFunctionCall}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimeFunctionCall(ExternalSqlBaseParser.TimeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(ExternalSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(ExternalSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(ExternalSqlBaseParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(ExternalSqlBaseParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(ExternalSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(ExternalSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ExternalSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ExternalSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ExternalSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ExternalSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(ExternalSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(ExternalSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(ExternalSqlBaseParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link ExternalSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(ExternalSqlBaseParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(ExternalSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(ExternalSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(ExternalSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(ExternalSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(ExternalSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(ExternalSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ExternalSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ExternalSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ExternalSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ExternalSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ExternalSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ExternalSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(ExternalSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(ExternalSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(ExternalSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(ExternalSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(ExternalSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(ExternalSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(ExternalSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(ExternalSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(ExternalSqlBaseParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(ExternalSqlBaseParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(ExternalSqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(ExternalSqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(ExternalSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(ExternalSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(ExternalSqlBaseParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(ExternalSqlBaseParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link ExternalSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(ExternalSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link ExternalSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(ExternalSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link ExternalSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(ExternalSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link ExternalSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(ExternalSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(ExternalSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(ExternalSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(ExternalSqlBaseParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(ExternalSqlBaseParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(ExternalSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(ExternalSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(ExternalSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(ExternalSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(ExternalSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(ExternalSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(ExternalSqlBaseParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(ExternalSqlBaseParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(ExternalSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(ExternalSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link ExternalSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(ExternalSqlBaseParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link ExternalSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(ExternalSqlBaseParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link ExternalSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(ExternalSqlBaseParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link ExternalSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(ExternalSqlBaseParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(ExternalSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(ExternalSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(ExternalSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(ExternalSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(ExternalSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(ExternalSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ExternalSqlBaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ExternalSqlBaseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link ExternalSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(ExternalSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link ExternalSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(ExternalSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link ExternalSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(ExternalSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link ExternalSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(ExternalSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(ExternalSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(ExternalSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(ExternalSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(ExternalSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(ExternalSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(ExternalSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(ExternalSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(ExternalSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(ExternalSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(ExternalSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(ExternalSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(ExternalSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(ExternalSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(ExternalSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(ExternalSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link ExternalSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(ExternalSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExternalSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(ExternalSqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExternalSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(ExternalSqlBaseParser.NonReservedContext ctx);
}