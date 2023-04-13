package com.bridgelabz.mood;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnaylezerTest {
	public class MoodAnalyserTest {

		@Test
		public void testHappyMood() {
			MoodAnyalyezer moodAnalyser = new MoodAnyalyezer();
			String message = "I am in Happy Mood";
			String mood = moodAnalyser.analysisMood(message);
			assertEquals("Happy", mood);
		}

		@Test
		public void testSadMood() {
			MoodAnyalyezer moodAnalyser = new MoodAnyalyezer();
			String message = "I am in Sad Mood";
			String mood = moodAnalyser.analysisMood(message);
			assertEquals("Sad", mood);
		}
	}
}
