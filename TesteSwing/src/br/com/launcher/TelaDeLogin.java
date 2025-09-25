package br.com.launcher;

import javax.swing.*;
import java.awt.*;

public class TelaDeLogin {

	public static void main(String[] args) {
	JFrame janela = new JFrame("Login");
	
	janela.setSize(300, 200);
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel painelCampos = new JPanel();
	painelCampos.setLayout(new GridLayout(2, 2, 5, 5));
	
	JLabel labelUsuario = new JLabel("Usuario:");
	JTextField campoUsuario = new JTextField(15);
	JLabel labelSenha = new JLabel("Senha:");
	JPasswordField campoSenha = new JPasswordField(15);
	
	painelCampos.add(labelUsuario);
	painelCampos.add(campoUsuario);
	painelCampos.add(labelSenha);
	painelCampos.add(campoSenha);
	
	JPanel painelBotoes = new JPanel();
	painelBotoes.setLayout(new FlowLayout());
	
	JButton botaoLogin = new JButton("Login");
	JButton botaoCancelar = new JButton("Cancelar");
	
	painelBotoes.add(botaoLogin);
	painelBotoes.add(botaoCancelar);
	
	janela.add(painelCampos, BorderLayout.CENTER);
	janela.add(painelBotoes, BorderLayout.SOUTH);
	
	janela.setVisible(true);

	}

}
