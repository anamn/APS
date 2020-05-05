package com.aps.game;

public class Car {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected String resposta = resp.getResposta();

	// Métodos
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

	protected void question(Resposta resposta) {
		resp.setResposta(null);
		Game_Window.setText("<html><center>Você precisa ir para a faculdade<br>Quer ir de carro?\n1 - Sim    2 - Não  </center></html>");
		Game_Window game = new Game_Window();

		if (game.yes_button.getModel().isPressed()) {
			this.sim();
			resp.setResposta("Sim");

		} else if (game.no_button.getModel().isPressed()) {
			this.nao();
			resp.setResposta("Não");

		}
	}

}
