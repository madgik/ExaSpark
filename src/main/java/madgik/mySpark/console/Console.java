package madgik.mySpark.console;

import java.io.IOException;

import org.apache.spark.sql.SparkSession;
import org.jline.reader.Completer;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.reader.impl.history.DefaultHistory;

import madgik.mySpark.Candidates;
import madgik.mySpark.parser.ParserUtils;

public final class Console {

	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BRIGHT_ORANGE = "\u001b[38;5;223;1m";
	public static final String ANSI_BRIGHT_PURPLE_LIGHT = "\u001b[38;5;199;1m";
	public static final String ANSI_BRIGHT_PURPLE = "\u001b[38;5;207;1m";
	public static final String ANSI_BRIGHT_PURPLE_DARK = "\u001b[38;5;164;1m";
	public static final String ANSI_BRIGHT_GREEN = "\u001b[32;1m";
	public static final String ANSI_BRIGHT_RED = "\u001B[31;1m";
	public static final String ANSI_BOLD = "\u001b[1m";
	public static final String ANSI_UNDERLINE = "\u001b[4m";
	
	public static void printMainTerm() {
		System.out.print(ANSI_BOLD+ANSI_BRIGHT_GREEN + "exaremeSQL> "+ ANSI_RESET);
	}
	
	public static void printMessage(String message) {
		System.out.print(message);
	}

	public static LineReader initLineReader() {
		
		SparkSession spark = SparkSession.builder()
				.master("local[1]")
				.appName("ExaremeSpark")
				.getOrCreate();   
		
		Completer comp = null;
		try {
			comp = new StringsCompleter(Candidates.getCandidates(spark));
		} catch (IOException e1) {
			Console.printMessage(ParserUtils.displayError(e1.getMessage()));
		}
		
		spark.stop();
		
		return LineReaderBuilder
					.builder()
					.history(new DefaultHistory())
					.completer(comp)
					.appName("exaremeSql")
					.build();
		
		
		
	}
}
