package br.com.launcher;

import javax.swing.JFrame;

public class MinhaPrimeiraJanela {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Minha Primeira Janela");
		
		janela.setSize(400, 300);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setVisible(true);

	}

}
