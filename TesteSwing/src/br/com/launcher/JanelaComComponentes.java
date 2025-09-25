package br.com.launcher;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaComComponentes {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Componentes Swing");
		
		janela.setSize(400, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Olá, Mundo! ");
		
		JButton botao = new JButton("Clique aqui!");
		
		janela.add(label);
		janela.add(botao);
		
		janela.setVisible(true);

	}

}
