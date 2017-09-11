package madgik.mySpark.parser;

import madgik.mySpark.parser.exception.VtExtensionParserCancelationException;

public class VtExtensionErrorHandler {
	
	public void trigger(String errorMessage, Exception e) {
		
		throw new VtExtensionParserCancelationException(errorMessage,e);
		
	}

}
