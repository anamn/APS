package com.aps.game;

public class Faltar {
	
	//Variaveis
		protected boolean chosen;
		
		//Métodos
		protected void sim() {
			System.out.println("Você escolheu não ir a faculdade");
			this.setChosen(true);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}

}
