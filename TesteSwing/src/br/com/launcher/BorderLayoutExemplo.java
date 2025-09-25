package br.com.launcher;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayoutExemplo {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Border Layout");
		
		janela.setSize(500, 300);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setLayout(new BorderLayout());
		
		janela.add(new JButton("Norte"), BorderLayout.NORTH);
		janela.add(new JButton("Sul"), BorderLayout.SOUTH);
		janela.add(new JButton("Leste"), BorderLayout.EAST);
		janela.add(new JButton("Oeste"), BorderLayout.WEST);
		janela.add(new JButton("Centro"), BorderLayout.CENTER);
		
		janela.setVisible(true);

	}

}
