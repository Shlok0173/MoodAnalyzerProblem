package com.bridgelabz.mood;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnaylezerTest {
	public class MoodAnalyserTest {

		@Test
		public void testHappyMood() {
			MoodAnyalyezer moodAnalyser = new MoodAnyalyezer("I am in Any Mood");
			String mood = moodAnalyser.analysisMood();
			assertEquals("HAPPY", mood);
		}

		@Test
		public void testSadMood() {
			MoodAnyalyezer moodAnalyser = new MoodAnyalyezer("I am in Sad Mood");
			String mood = moodAnalyser.analysisMood();
			assertEquals("SAD", mood);
		}

		@Test
		public void testNullMood() {
			MoodAnyalyezer moodAnalyser = new MoodAnyalyezer(null);
			String mood = moodAnalyser.analysisMood();
			assertEquals("HAPPY", mood);
		}
	}
}
