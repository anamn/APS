package com.aps.game;

public class Banho {
	
	//Variaveis
	protected boolean chosen;
	protected String outText;
	
	//Métodos
	protected void sim() {
		System.out.println("Você escolheu tomar banho");
		Score.scoreMinus();
		this.setChosen(true);
	}
	
	protected void nao() {
		System.out.println("Você escolheu não tomar banho");
		Score.scoreUp();
		setChosen(false);
	}
	
	protected void setChosen(Boolean b) {
		this.chosen = b;
	}
	protected void question() {
		outText= "<html><center>O dia começou<br>Você quer tomar um banho?</center></html>";


	}
	
}
