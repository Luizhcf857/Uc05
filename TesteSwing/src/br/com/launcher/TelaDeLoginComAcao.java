package br.com.launcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeLoginComAcao {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Login");
		janela.setSize(300, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new BorderLayout());
		
		JPanel painelCampos = new JPanel(new GridLayout(2, 2, 5, 5));
		
		JLabel labelUsuario = new JLabel("Usuario");
		JTextField campoUsuario = new JTextField(15);
		JLabel labelSenha = new JLabel("Senha:");
		JPasswordField campoSenha = new JPasswordField(15);
		
		painelCampos.add(labelUsuario);
		painelCampos.add(campoUsuario);
		painelCampos.add(labelSenha);
		painelCampos.add(campoSenha);
		
		JPanel painelBotoes = new JPanel(new FlowLayout());
		
		JButton botaoLogin = new JButton("Login");
		JButton botaoCancelar = new JButton("Cancelar");
		
		painelBotoes.add(botaoLogin);
		painelBotoes.add(botaoCancelar);
		
		botaoLogin.addActionListener(new ActionListener(){		
			@Override	
			public void actionPerformed(ActionEvent e) {
				
				String usuario = campoUsuario.getText();
				String senha = new String (campoSenha.getPassword());	
				
				JOptionPane.showMessageDialog(janela, "Usuario: "+ usuario +"\nSenha: "+ senha, "Dados do Login", 
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		});
		
		botaoCancelar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				campoUsuario.setText("");
				campoSenha.setText("");
				
			}
			
		});
		
		janela.add(painelCampos, BorderLayout.CENTER);
		janela.add(painelBotoes, BorderLayout.SOUTH);
		
		
		janela.setVisible(true);

	}

}
