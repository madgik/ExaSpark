package madgik.mySpark.parser;

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
		error.append("\n----------------------ERROR----------------------\n")
			 .append("\n"+message+"\n")
			 .append("\n-------------------------------------------------\n");
		
		return error.toString();
	}

}
