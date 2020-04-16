package com.aps.game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Game_Window extends JFrame {

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
		
		contentPane.add(yes_button);
		
		JButton no_button = new JButton("N\u00E3o");
		no_button.setBounds(280, 203, 70, 22);
		contentPane.add(no_button);
		
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
}
