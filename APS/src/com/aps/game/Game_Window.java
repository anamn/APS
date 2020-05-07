package com.aps.game;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game_Window extends JFrame implements Runnable {

// Declara��o de inst�ncias e vari�veis
	private static final long serialVersionUID = -7007275436864432833L;
	private JPanel contentPane;
	protected static String outText;
	protected boolean noPressed = false;
	protected boolean yesPressed = false;
	protected String resposta;
	JButton no_button = new JButton("Nao");
	JButton yes_button = new JButton("Sim");
	JLabel GameText = new JLabel(outText);
	JLabel score = new JLabel("Score: " + Score.getScore());
	JButton debugButton = new JButton("debug");
	NoPressed no_pressed = new NoPressed();
	YesPressed yes_pressed = new YesPressed();

	public static void setText(String s) {
		outText = s;
	}

	public static String getText() {
		return outText;
	}

	// Define a aparencia da janela
	public Game_Window() {
		setBackground(Color.LIGHT_GRAY);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		yes_button.setName("Sim");
		yes_button.setBounds(77, 203, 70, 22);
		contentPane.add(yes_button);
		yes_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setResposta("Sim");
				System.out.println(getResposta());
				GameText.setText(outText);
			}});

		no_button.setName("Nao");
		no_button.setBounds(280, 203, 70, 22);
		contentPane.add(no_button);
		no_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setResposta("Nao");
				System.out.println(getResposta());
				GameText.setText(outText);
			}});

		debugButton.setBounds(170, 203, 89, 23);
		contentPane.add(debugButton);
		debugButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Game_Window.getText());
				System.out.println(getResposta());
			}});

		GameText.setHorizontalAlignment(SwingConstants.CENTER);
		GameText.setBorder(new LineBorder(new Color(0, 0, 0)));
		GameText.setBackground(Color.GRAY);
		GameText.setBounds(41, 36, 348, 139);
		contentPane.add(GameText);

		score.setBounds(31, 11, 95, 14);
		contentPane.add(score);
	}

	@Override
	public void run() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_Window Jframe = new Game_Window();
					Jframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String s) {
		resposta = s;
	}

}
