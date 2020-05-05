package com.aps.game;

public class Teeth {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected short times = 0;
	protected String resposta = resp.getResposta();

	// Métodos
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
		resp.setResposta(null);
		Game_Window game = new Game_Window();
		
		if (times == 0) {
			Game_Window.setText("<html><center>Você quer escovar os dentes?<br>1 - Sim    2 - Não  </center></html>");
			if (game.yes_button.getModel().isPressed()) {
				this.sim();
				resp.setResposta("Sim");
			} else if (game.no_button.getModel().isPressed()) {
				this.nao();
				resp.setResposta("Não");
			}
		} else if (times == 1) {
			Game_Window.setText("<html><center>Você quer escovar os dentes de novo?<br>1 - Sim    2 - Não  </center></html>");
			if (game.yes_button.getModel().isPressed()) {
				this.sim2();
				resp.setResposta("Sim");

			} else if (game.no_button.getModel().isPressed()) {
				this.nao();
				resp.setResposta("Não");

			}
		}
	}

}
