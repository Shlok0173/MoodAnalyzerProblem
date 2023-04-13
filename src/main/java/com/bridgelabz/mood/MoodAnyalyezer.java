package com.bridgelabz.mood;

public class MoodAnyalyezer {

	public String analysisMood(String message) {
		if (message.contains("happy") || message.contains("Happy")) {
			return "Happy";
		} else {
			return "Sad";
		}
	}
}
