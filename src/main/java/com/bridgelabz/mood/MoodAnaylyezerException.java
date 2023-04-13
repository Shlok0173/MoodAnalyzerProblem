package com.bridgelabz.mood;

public class MoodAnaylyezerException extends Exception {


	public enum ExceptionType {
		NULL_MESSAGE, EMPTY_MESSAGE, NO_SUCH_FIELD, NO_SUCH_METHOD, NO_SUCH_CLASS, OBJECT_CREATION_ISSUE
	}

	public ExceptionType type;

	public MoodAnaylyezerException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
