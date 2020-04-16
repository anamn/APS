package com.aps.game;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Game_Window extends JFrame {

	private static final long serialVersionUID = -7007275436864432833L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_Window frame = new Game_Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		Banho banho = new Banho();
		Teeth teeth = new Teeth();
		Breakfast breakfast = new Breakfast();
		Car car = new Car();
		Subway subway = new Subway();
		Uber uber = new Uber();
		Faltar faltar = new Faltar();
		
		Choices day = new Choices(banho, teeth, breakfast, car, subway, uber, faltar);
		
			
	}
	private static class yes_pressed implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Choices.setChoice(1);
	}
}
	static class no_pressed implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Choices.setChoice(2);
			
			
	}
}
	
	

	/**
	 * Create the frame.
	 */
	public Game_Window() {
		setBackground(Color.LIGHT_GRAY);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton yes_button = new JButton("Sim");
		yes_button.setBounds(77, 203, 70, 22);
		yes_button.addActionListener(new yes_pressed());
		contentPane.add(yes_button);
		
		JButton no_button = new JButton("N\u00E3o");
		no_button.setBounds(280, 203, 70, 22);
		contentPane.add(no_button);
		no_button.addActionListener(new no_pressed());
		
		JLabel GameText = new JLabel(Choices.outText);
		GameText.setHorizontalAlignment(SwingConstants.CENTER);
		GameText.setBorder(new LineBorder(new Color(0, 0, 0)));
		GameText.setBackground(Color.GRAY);
		GameText.setBounds(41, 36, 348, 139);
		contentPane.add(GameText);
		
		JLabel lblNewLabel_1 = new JLabel("Score:" + Score.getScore() );
		lblNewLabel_1.setBounds(31, 11, 95, 14);
		contentPane.add(lblNewLabel_1);
	}
	
	
//private ActionListener no_pressed() {
//	Choices.setChoice(2);
//	return null;
//}
//private ActionListener yes_pressed() {
//	Choices.setChoice(1);
//	return null;
//}
}
