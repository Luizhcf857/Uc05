package br.com.launcher;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridLayoutExemplo {

	public static void main(String[] args) {
		JFrame janela = new JFrame("GridLayout");
		
		janela.setSize(300, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setLayout(new GridLayout(2, 3));
		
		janela.add(new JButton("1"));
		janela.add(new JButton("2"));
		janela.add(new JButton("3"));
		janela.add(new JButton("4"));
		janela.add(new JButton("5"));

		janela.setVisible(true);

	}

}
