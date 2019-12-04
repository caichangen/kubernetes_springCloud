package com.hkb.handler;

import java.io.Serializable;

public class MessageCenterException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = -4172036386725446156L;

	public MessageCenterException() {
		super();
	}

	public MessageCenterException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MessageCenterException(String message, Throwable cause) {
		super(message, cause);
	}

	public MessageCenterException(String message) {
		super(message);
	}

	public MessageCenterException(Throwable cause) {
		super(cause);
	}
	
	
}
