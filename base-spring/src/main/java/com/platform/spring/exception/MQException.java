package com.platform.spring.exception;

public class MQException extends JmsException {

	private static final long serialVersionUID = 4333083322223588727L;

	public MQException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public MQException(String msg) {
		super(msg);
	}

	public MQException(Throwable cause) {
		super(cause);
	}
	
}
