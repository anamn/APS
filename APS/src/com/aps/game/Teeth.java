package com.aps.game;

public class Teeth {
	
	//Variaveis
		protected boolean chosen;
		protected short times = 0;
		
		//Métodos
		protected void sim() {
			System.out.println("Você escolheu escovar os dentes");
			this.times++;
			this.setChosen(true);
		}
		protected void sim2() {
			System.out.println("Você escolheu escovar os dentes de novo");
			Score.scoreMinus();
			this.times++;
		}
		
		protected void nao() {
			System.out.println("Você escolheu não escovar os dentes");
			this.setChosen(false);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}
		
		protected short getTimes() {
			return times;
		}
		
}
