package com.aps.game;

public class Breakfast {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected String outText;

	// Métodos
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

	protected void question(Resposta resposta) {
		resp.setResposta(null);
		Game_Window.setText("<html><center>Você quer tomar café da manhã?<br>1 - Sim    2 - Não  </center></html>");
		Game_Window game = new Game_Window();

		Game_Window.setText("<html><center>O dia começou<br>Você quer tomar um banho?</center></html>");
		if (game.yes_button.getModel().isPressed()) {
			this.sim();
			resp.setResposta("Sim");

		} else if (game.no_button.getModel().isPressed()) {
			this.nao();
			resp.setResposta("Não");

		}
	}

}
