package com.aps.game;

public class Teeth {
	
	//Variaveis
		protected boolean chosen;
		protected short times = 0;
		protected String outText;
		
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
		protected void question() {
			if(times==0) {
				outText = "<html><center>Você quer escovar os dentes?<br>1 - Sim    2 - Não  </center></html>";
			}
			else if(times == 1) {
				outText = "<html><center>Você quer escovar os dentes de novo?<br>1 - Sim    2 - Não  </center></html>";
			}
		}
		
}
