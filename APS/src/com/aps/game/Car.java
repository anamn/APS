package com.aps.game;

public class Car {
	
	//Variaveis
		protected boolean chosen;
		
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

}
