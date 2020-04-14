package com.aps.game;

public class Subway {
	
	//Variaveis
		protected boolean chosen;
		
		//Métodos
		protected void sim() {
			System.out.println("Você escolheu ir de metrô");
			this.setChosen(true);
		}
		
		protected void nao() {
			System.out.println("Você escolheu não ir de metrô");
			this.setChosen(false);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}

}
