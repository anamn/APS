package com.aps.game;

public class Banho {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected boolean pressed = false;

	// M�todos
	protected void sim() {
		System.out.println("Voc� escolheu tomar banho");
		Score.scoreMinus();
		this.setChosen(true);
	}

	protected void nao() {
		System.out.println("Voc� escolheu n�o tomar banho");
		Score.scoreUp();
		setChosen(false);
	}

	protected void setChosen(Boolean b) {
		this.chosen = b;
	}

	protected void setPressed(Boolean b) {
		this.setPressed(b);
	}

	protected void question() {
		Game_Window game = new Game_Window();
		
		Game_Window.setText("<html><center>O dia come�ou<br>Voc� quer tomar um banho?</center></html>");
		while(game.outText == "\"<html><center>O dia come�ou<br>Voc� quer tomar um banho?</center></html>\"") {
			if(game.yes_button.getModel().isPressed()) {
				sim();
			}else if(game.no_button.getModel().isPressed()) {
				nao();
			}
		}//Falta criar os loop's que v�o esperar o input 
		
		
		
		
	}

}


