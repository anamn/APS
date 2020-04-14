package com.aps.game;

import javax.swing.JFrame;


public class Game {
	
	public static void main(String[] args) {

		Banho banho = new Banho();
		Teeth teeth = new Teeth();
		Breakfast breakfast = new Breakfast();
		Car car = new Car();
		Subway subway = new Subway();
		Uber uber = new Uber();
		Faltar faltar = new Faltar();
		
		Choices day = new Choices(banho, teeth, breakfast, car, subway, uber, faltar);
		
		new Game_Window();

		
	
	}

}
