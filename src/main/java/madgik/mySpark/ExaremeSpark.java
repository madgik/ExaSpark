package madgik.mySpark;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.sql.SparkSession;
import org.jline.reader.Candidate;
import org.jline.reader.Completer;
import org.jline.reader.EndOfFileException;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.ParsedLine;
import org.jline.reader.UserInterruptException;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.reader.impl.history.DefaultHistory;

import com.google.common.reflect.ClassPath;

import madgik.mySpark.console.Console;
import madgik.mySpark.parser.ParserUtils;
import madgik.mySpark.parser.exception.VtExtensionParserException;

public class ExaremeSpark {
	
	public static void main(String[] args) {
			
		Logger.getLogger("org").setLevel(Level.OFF);
		Logger.getLogger("akka").setLevel(Level.OFF);
		
		LineReader reader = Console.initLineReader();
		
		while(true){
				
			try{
				
				SparkSession spark = SparkSession.builder()
						.master("local[1]")
						.appName("ExaremeSpark")
						.getOrCreate();   
				
				String query;
				try{
					query = reader.readLine(Console.ANSI_BOLD+Console.ANSI_BRIGHT_GREEN + "exaremeSQL> "+ Console.ANSI_RESET);
				}catch(UserInterruptException |EndOfFileException e){
					Console.printMessage(("\n"+Console.ANSI_BRIGHT_ORANGE+"Application is going to stop\n"+Console.ANSI_RESET));
					break;
				}
				
				
				if(ParserUtils.checkIfShowVt(query)){
					
					ClassPath cp=ClassPath.from(Thread.currentThread().getContextClassLoader());
					Console.printMessage("+----------------------------+\n");
					Console.printMessage("|              VIRTUAL TABLES|\n");
					Console.printMessage("+----------------------------+\n");

					for(ClassPath.ClassInfo info : cp.getTopLevelClassesRecursive("madgik.mySpark.vtFunctions")) {
					    if(!info.getSimpleName().equals("ExaremeVtFunction")){
							String row = "|";
							int vtSize = info.getSimpleName().length();
//							if(vtSize < 29) {
								for(int i=0; i< 28 - vtSize ; ++i) {
									row = row.concat(" ");
								}
								row = row.concat(info.getSimpleName()+"|\n");
//							}
							
							Console.printMessage(row);
					    }
					}
					Console.printMessage("+----------------------------+\n");
				}else{
				
				
					
					try{
						VtParser vtParse = new VtParser(query, spark);
						vtParse.parseAndEvaluate().show(20);
					}catch(VtExtensionParserException e) {
						if(e.getMessage() != null)
							Console.printMessage(ParserUtils.displayError(e.getMessage()));
					}
				
				}
				
			} catch (Exception e ){
				if(e.getCause() != null){
					Console.printMessage(ParserUtils.displayError(e.getCause().getMessage()));
				}else{
					Console.printMessage(ParserUtils.displayError(e.getMessage()));
				}
			}
		}
			
		
			
	}

}
