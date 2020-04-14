package com.aps.game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
		
		Button yes_button = new Button("Sim");
		yes_button.setBounds(77, 203, 70, 22);
		contentPane.add(yes_button);
		
		Button no_button = new Button("N\u00E3o");
		no_button.setBounds(280, 203, 70, 22);
		contentPane.add(no_button);
		//"Your score: 1000\r\nO dia come\u00E7ou\r\nVoc\u00EA quer tomar um banho?\r\n1 - Sim    2 - N\u00E3o  "
		JLabel GameText = new JLabel("<html>    Your score: 1000<br>\r\nO dia come\u00E7ou<br>\r\nVoc\u00EA quer tomar um banho?<br>\r\n1 - Sim    2 - N\u00E3o  </html>");
		GameText.setBorder(new LineBorder(new Color(0, 0, 0)));
		GameText.setBackground(Color.GRAY);
		GameText.setBounds(39, 36, 350, 139);
		contentPane.add(GameText);
		
		JLabel lblNewLabel_1 = new JLabel("Score:" + Score.getScore() );
		lblNewLabel_1.setBounds(31, 11, 95, 14);
		contentPane.add(lblNewLabel_1);
	}
}
