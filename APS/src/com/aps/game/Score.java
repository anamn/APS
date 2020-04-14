package com.aps.game;

public class Score {
	
	protected static int score = 1000;

	public static int getScore() {
		return score;
	}
	public static void scoreMinus() {
		score-=100;
	}
	public static void scoreUp() {
		score+=100;
	}
	
	

}
