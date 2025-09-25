package br.com.launcher;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutExamplo {

	public static void main(String[] args) {
		JFrame janela = new JFrame("FlowLayout");
		
		janela.setSize(400, 150);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setLayout(new FlowLayout());
		
		janela.add(new JButton("Botao 1"));
		janela.add(new JButton("Botao 2"));
		janela.add(new JButton("Botao 3"));
		janela.add(new JButton("Botao 4"));
		janela.add(new JButton("Botao 5"));
		
		janela.setVisible(true);
	}

}
