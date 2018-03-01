package madgik.exaSpark;

public class ExaSparkSessionAuto {
	
	public static ExaremeSparkSession initExaSpark() {
		
		return ExaremeSparkSession.exaremebuild()
//				 .master("spark://neopas:7077")
				 .master("local[1]")
				 .appName("Exareme")
				 .config("spark.jars", "target/ExtendedSpark-0.0.1-SNAPSHOT-jar-with-dependencies.jar")
				 .getOrCreateExareme();
		
	}
	
}
