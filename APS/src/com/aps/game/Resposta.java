package com.aps.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resposta implements ActionListener {
	
	private String resposta;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		resposta = e.getActionCommand();
		System.out.println(resposta);
		
		
	}

	public String getResposta() {
		return resposta;
	}

}
