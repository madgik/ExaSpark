package madgik.mySpark;

import java.util.Scanner;

import org.apache.spark.sql.SparkSession;

public class ExaremeSpark {

	public static void main(String[] args) {
		
		SparkSession spark = SparkSession.builder()
			     .master("local[4]")
			     .appName("MySpark")
			     .getOrCreate();
		
		while(true){
		
			System.out.print("exaremeSQL> ");;
			Scanner scanner = new Scanner(System.in);
			String sqlQuery = scanner.nextLine();
			
			spark.sql(sqlQuery).show();
		}

	}

}
