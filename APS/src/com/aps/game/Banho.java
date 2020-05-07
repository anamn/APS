package com.aps.game;

public class Banho {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected boolean pressed = false;

	// Métodos
	public void sim() {
		System.out.println("Você escolheu tomar banho");
		Score.scoreMinus();
		this.setChosen(true);
	}

	public void nao() {
		System.out.println("Você escolheu não tomar banho");
		Score.scoreUp();
		setChosen(false);
	}

	public void setChosen(Boolean b) {
		this.chosen = b;
	}

	public void setPressed(Boolean b) {
		this.setPressed(b);
	}

	public void question() {
		Game_Window.setText("<html><center>O dia começou<br>Você quer tomar um banho?</center></html>");	
	}
}
