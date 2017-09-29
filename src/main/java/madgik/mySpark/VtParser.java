package madgik.mySpark;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.spark.sql.AnalysisException;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.catalyst.parser.ParseException;
import org.apache.spark.sql.catalyst.parser.SqlBaseLexer;
import org.apache.spark.sql.catalyst.parser.SqlBaseParser;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;
import org.apache.spark.sql.execution.QueryExecution;

import madgik.mySpark.parser.ParserUtils;
import madgik.mySpark.parser.VtExtensionErrorHandler;
import madgik.mySpark.parser.VtExtensionErrorListener;
import madgik.mySpark.parser.VtExtensionListener;
import madgik.mySpark.parser.exception.VtExtensionParserException;

public class VtParser {

	private String query;
	private SparkSession spark;
	
	
	public VtParser(String query, SparkSession spark) {
		super();
		this.query = query+"";
		this.spark = spark;
	}
	
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public SparkSession getSpark() {
		return spark;
	}
	public void setSpark(SparkSession spark) {
		this.spark = spark;
	}
	
	public Dataset<Row> parseAndEvaluate() throws VtExtensionParserException{
		try{
			
			String capitalizedQuery = ParserUtils.capitalizeQuery(this.query);
			
			ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(capitalizedQuery.getBytes()));
			
			SqlBaseLexer lexer = new SqlBaseLexer(input);
			SqlBaseParser parser = new SqlBaseParser(new CommonTokenStream(lexer));
			
			VtExtensionErrorHandler handler = new VtExtensionErrorHandler();
			VtExtensionListener listen = new VtExtensionListener(this.spark, handler);
			VtExtensionErrorListener errorListen = new VtExtensionErrorListener(capitalizedQuery);
			
			lexer.removeErrorListeners();
			lexer.addErrorListener(errorListen);
			
			parser.addParseListener(listen);
			parser.removeErrorListeners();
			parser.addErrorListener(errorListen);
			parser.setErrorHandler(new DefaultErrorStrategy(){
				
				 @Override
				    public void recover(Parser recognizer, RecognitionException e) {
						for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
							context.exception = e;
						}
	
				        throw new ParseCancellationException(e);
				    }
				 
				 @Override
				    public Token recoverInline(Parser recognizer)
				        throws RecognitionException
				    {
						InputMismatchException e = new InputMismatchException(recognizer);
						for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
							context.exception = e;
						}

				        throw new ParseCancellationException(e);
				    }
			});
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			
			parser.queryNoWith();
			
			for (Map.Entry<String, String> entry : listen.getVtToViews().entrySet())
			{
				capitalizedQuery = capitalizedQuery.replace(entry.getKey(), entry.getValue());
			}
			
			LogicalPlan lgk = spark.sessionState().sqlParser().parsePlan(capitalizedQuery);
			QueryExecution qe = spark.sessionState().executePlan(lgk);
			qe.assertAnalyzed();
			
			return Dataset.ofRows(spark, lgk);
		
		}catch (ParseCancellationException | RecognitionException | IOException  e)
        {
			if(e.getMessage() != null){
				throw new VtExtensionParserException(e.getMessage());
			}else {
				throw new VtExtensionParserException(null);
			}
			
        }catch (AnalysisException e) {
        	throw new VtExtensionParserException(e.getMessage());
        }
		
	}
	
}
