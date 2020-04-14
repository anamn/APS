package com.aps.game;

public class Uber {
	
	//Variaveis
		protected boolean chosen;
		
		//Métodos
		protected void sim() {
			System.out.println("Você escolheu ir de uber");
			this.setChosen(true);
		}
		
		protected void nao() {
			System.out.println("Você escolheu não ir de uber");
			this.setChosen(false);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}

}
