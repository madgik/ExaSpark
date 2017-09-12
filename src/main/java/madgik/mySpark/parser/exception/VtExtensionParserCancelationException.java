package madgik.mySpark.parser.exception;

import org.antlr.v4.runtime.misc.ParseCancellationException;

public class VtExtensionParserCancelationException extends ParseCancellationException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8710783865137453902L;
	
	private String message;
	
	public VtExtensionParserCancelationException() {
	}

	public VtExtensionParserCancelationException(String message) {
		super(message);
		this.message = message;
	}

	public VtExtensionParserCancelationException(Throwable cause) {
		initCause(cause);
	}

	public VtExtensionParserCancelationException(String message, Throwable cause) {
		super(message);
		initCause(cause);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
