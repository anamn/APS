package com.aps.game;

public class Choices {
	
	protected static int choice;
	protected static String outText;
	private static String resposta;
	
	public static String getResposta() {
		return resposta;
	}
	public static void setResposta(String resp) {
		resposta = resp;
	}
	
	
	public static int getChoice() {
		return choice;
	}
	public static void setChoice(int value) {
		choice = value;
	}
	
	
	
	public void dayEnd() {
		outText="<html><center>Você terminou o dia com " + Score.getScore() + " pontos!</html></center>";
	}
	
	public static String getString() {
		return outText;
	}
	

}	

