package com.aps.game;

public class Car {
	
	//Variaveis
		protected boolean chosen;
		protected String outText;
		
		//Métodos
		protected void sim() {
			System.out.println("Você escolheu ir de carro");
			Score.scoreMinus();
			this.setChosen(true);
		}
		
		protected void nao() {
			System.out.println("Você escolheu não ir de carro");
			Score.scoreUp();
			this.setChosen(false);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}
		protected void question() {
			outText = "<html><center>Você precisa ir para a faculdade<br>Quer ir de carro?\n1 - Sim    2 - Não  </center></html>";
		}

}
