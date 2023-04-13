package com.bridgelabz.mood;

public class MoodAnyalyezer {

	private String message;

	public MoodAnyalyezer() {
		this.message = "";
	}

	public MoodAnyalyezer(String message) {
		this.message = message;
	}

	public String analysisMood() throws MoodAnaylyezerException {
		try {
			if (message.length() == 0) {
				throw new  MoodAnaylyezerException( MoodAnaylyezerException.ExceptionType.EMPTY_MESSAGE,
						"Mood should not be empty");
			}
			if (message.contains("Sad") || message.contains("SAD")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new  MoodAnaylyezerException( MoodAnaylyezerException.ExceptionType.NULL_MESSAGE,
					"Mood should not be null");
		}
}
}
