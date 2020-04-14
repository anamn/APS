package com.aps.game;

public class Banho {
	
	//Variaveis
	protected boolean chosen;
	
	//Métodos
	protected void sim() {
		System.out.println("Você escolheu tomar banho");
		Score.scoreMinus();
		this.setChosen(true);
	}
	
	protected void nao() {
		System.out.println("Você escolheu não tomar banho");
		Score.scoreUp();
		this.setChosen(false);
	}
	
	protected void setChosen(Boolean b) {
		this.chosen = b;
	}
	
}
