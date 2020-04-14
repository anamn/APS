package com.aps.game;

public class Breakfast {
	
	//Variaveis
	protected boolean chosen;
	
		//Métodos
		protected void sim() {
			System.out.println("Você escolheu tomar café da manhã");
			this.setChosen(true);
			}
		
		protected void nao() {
			System.out.println("Você escolheu não tomar café da manhã");
			this.setChosen(false);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}
		

}
