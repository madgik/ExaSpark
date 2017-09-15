package madgik.mySpark;

import java.util.Scanner;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkDriverExecutionException;
import org.apache.spark.SparkException;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.util.SparkUncaughtExceptionHandler;

import madgik.mySpark.parser.ParserUtils;
import madgik.mySpark.parser.exception.VtExtensionParserCancelationException;
import madgik.mySpark.parser.exception.VtExtensionParserException;
import madgik.mySpark.vtFunctions.ExaremeVtFunction;

public class ExaremeSpark {

	public static void main(String[] args) {
			
		
		
		Logger.getLogger("org").setLevel(Level.OFF);
		Logger.getLogger("akka").setLevel(Level.OFF);
			
			
		while(true){
				
			try{
				
				SparkSession spark = SparkSession.builder()
						.master("local[1]")
						.appName("MySpark")
						.getOrCreate();   
				
				System.out.print("exaremeSQL> ");;
				Scanner scanner = new Scanner(System.in);
				String query = scanner.nextLine();

				if(ParserUtils.checkIfShowVt(query)){
					
//					 Reflections reflections = new Reflections("madgik.mySpark.vtFunctions");
//
//					 Set<Class<? extends ExaremeVtFunction>> allClasses = 
//					     reflections.getSubTypesOf(ExaremeVtFunction.class);
//					 
//					 for(Class<?> cl : allClasses) {
//						 System.out.println(cl.getSimpleName());
//					 }
					
				}else{
				
				
					
					try{
						VtParser vtParse = new VtParser(query, spark);
						vtParse.parseAndEvaluate().show(20);
					}catch(VtExtensionParserException e) {
						if(e.getMessage() != null)
							System.out.println(ParserUtils.displayError(e.getMessage()));
					}
				
				}
				
			} catch (Exception e ){
				if(e.getCause() != null){
					System.out.println(ParserUtils.displayError(e.getCause().getMessage()));
				}else{
					System.out.println(ParserUtils.displayError(e.getMessage()));
				}
			}
		}
			
		
			
	}

}
