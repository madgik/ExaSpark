package madgik.exaSpark.parser;

import madgik.exaSpark.parser.exception.VtExtensionParserCancelationException;

public class VtExtensionErrorHandler {
	
	public void trigger(String errorMessage, Exception e) {
		
		throw new VtExtensionParserCancelationException(errorMessage,e);
		
	}

}
