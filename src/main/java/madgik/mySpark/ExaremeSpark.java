package madgik.mySpark;

import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.sql.SparkSession;

import madgik.mySpark.parser.ParserUtils;
import madgik.mySpark.parser.exception.VtExtensionParserException;

public class ExaremeSpark {

public static void main(String[] args) {
		
		Logger.getLogger("org").setLevel(Level.OFF);
		Logger.getLogger("akka").setLevel(Level.OFF);
		
		SparkSession spark = SparkSession.builder()
			     .master("local[1]")
			     .appName("MySpark")
			     .getOrCreate();   
		
		while(true){
			
			System.out.print("exaremeSQL> ");;
			Scanner scanner = new Scanner(System.in);
			String query = scanner.nextLine();
			
			try{
				VtParser vtParse = new VtParser(query, spark);
				vtParse.parseAndEvaluate().show();
			}catch(VtExtensionParserException e) {
				if(e.getMessage() != null)
					System.out.println(ParserUtils.displayError(e.getMessage()));
			}
			
		
		}
		
		
		
	}

}
