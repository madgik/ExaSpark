package madgik.mySpark.parser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import madgik.mySpark.console.Console;

public final class ParserUtils {
	
	public static String retrimWhitespaces(String sql) {
		return sql.replace("SELECT", "SELECT ")
				  .replace("FROM", " FROM ")
				  .replace("WHERE", " WHERE ");
	}
	
	public static String getErrorMessage(String query, String message, int line, int charPosition) {
		String pointtOfError = "";
		String lineOfError = (query.split("\n"))[line-1];
		
		StringBuilder msg = new StringBuilder();
		msg.append("\n"+message)
		   .append("(line: "+line+", pos: "+charPosition+")")
		   .append("\n\n===SQL===\n")
		   .append(lineOfError+"\n");
		
		
		
		for(int i=0; i<lineOfError.length(); ++i) {
			if(i>=charPosition){
				pointtOfError += "^^";
				break;
			}else{
				pointtOfError += "-";
			}
		}
		
		msg.append(pointtOfError);
		
		return msg.toString();
	}
	
	public static String capitalizeQuery(String query) {
		
		StringBuilder capitalizedQuery = new StringBuilder();
		int quotesCount = 0;
		
		for(int i=0 ; i<query.length() ; ++i) {
			
			char subCharQuery = query.charAt(i);
			
			if(subCharQuery == '\'') { quotesCount++; }
			
			if(quotesCount%2 == 0){
				capitalizedQuery.append(Character.toUpperCase(subCharQuery));
			}else {
				capitalizedQuery.append(subCharQuery);
			}
			
		}
		
		return capitalizedQuery.toString();
		
	}
	
	public static String displayError(String message) {
		
		StringBuilder error = new StringBuilder();
		error.append("\n----------------------"+Console.ANSI_BOLD+Console.ANSI_BRIGHT_RED+"ERROR"+Console.ANSI_RESET+"----------------------\n")
			 .append("\n"+message+"\n")
			 .append("\n-------------------------------------------------\n");
		
		return error.toString();
	}
	
	public static boolean checkIfSelectQuery(String query) {
		
		if(query.toLowerCase().contains("select"))
			return true;
		else
			return false;
		
	}
	
	public static boolean checkIfShowVt(String query) {
		
		if(query.toLowerCase().equals("show virtual tables"))
			return true;
		else
			return false;
		
	}

}
