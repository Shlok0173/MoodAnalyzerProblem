package com.bridgelabz.mood;

public class MoodAnyalyezer {

	private String message;

	public MoodAnyalyezer() {
		this.message = "";
	}

	public MoodAnyalyezer(String message) {
		this.message = message;
	}

	public String analysisMood() {
		try {
			if (message.contains("Sad") || message.contains("SAD")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
}
	}
}
