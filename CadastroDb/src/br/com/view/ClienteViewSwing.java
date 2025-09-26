package br.com.view;

import br.com.controller.Controller;
import br.com.model.Cliente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;


public class ClienteViewSwing extends JFrame{
	private Controller controler;
	private JTable tabela;
	private DefaultTableModel modelo;
	
	public ClienteViewSwing() {
		controler = new Controller();
		setTitle("Sistemas de Clientes");
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel painel = new JPanel(new BorderLayout());
		
		modelo = new DefaultTableModel(new Object[] {"ID", "Nome", "Email", "Telefone", "CPF" }, 0);
		tabela = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(tabela);
		painel.add(scroll, BorderLayout.CENTER);
		
		JPanel botoes = new JPanel();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener((ActionEvent e) -> cadastrarCliente());
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener((ActionEvent e) -> atualizarCliente());
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener((ActionEvent e) -> excluirCliente());
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener((ActionEvent e) -> carregarClientes());
		
		botoes.add(btnCadastrar);
		botoes.add(btnAtualizar);
		botoes.add(btnExcluir);
		botoes.add(btnListar);
		
		painel.add(botoes);
		
		add(painel);
		carregarClientes();
	}
	
	private void carregarClientes() {
		modelo.setRowCount(0);
		List<Cliente> clientes = controler.obterClientes();
		
		for(Cliente c: clientes ) {
			modelo.addRow(new Object[]{
				c.getId(),
				c.getNome(),
				c.getEmail(),
				c.getTelefone(),
				c.getCpf()
			});
			
			
		}
		
	}
	
	private void cadastrarCliente() {
		JTextField nomeField = new JTextField();
		JTextField emailField = new JTextField();
		JTextField telefoneField = new JTextField();
		JTextField cpfField = new JTextField();
		 
		Object[] form = {
			"Nome:", nomeField,
			"Email:", emailField,
			"Telefone:", telefoneField,
			"CPF:",
			
		};
		
		int option = JOptionPane.showConfirmDialog(this, form, "Cadastar Cliente", JOptionPane.OK_CANCEL_OPTION);
		if(option == JOptionPane.OK_OPTION) {
			Cliente cliente = new Cliente(0, nomeField.getText(), emailField.getText(), telefoneField.getText(), 
					cpfField.getText());
			controler.atualizarCliente(cliente);
			carregarClientes();
			
			
			
		}
		
	}
	
	private void atualizarCliente() {
		int linha = tabela.getSelectedRow();
		if(linha == -1) {
			JOptionPane.showMessageDialog(this, "Selecione um item para atualizar.");
			return;
			
		}
		
		int id = (int) tabela.getValueAt(linha, 0);
		String nomeAtual = (String) tabela.getValueAt(linha, 1);
		String emailAtual = (String) tabela.getValueAt(linha, 2);
		String telefoneAtual = (String) tabela.getValueAt(linha, 3);
		String cpfAtual = (String) tabela.getValueAt(linha, 4);
		
		JTextField nomeField = new JTextField(nomeAtual);
		JTextField emailField = new JTextField(emailAtual);
		JTextField telefoneField = new JTextField(telefoneAtual);
		JTextField cpfField = new JTextField(cpfAtual);
		
		Object[] form = {
			"Nome:", nomeField,
			"Email:", emailField,
			"Telefone:", telefoneField,
			"CPF:", cpfField
			
		};
		
		int option = JOptionPane.showConfirmDialog(this, form, "Atualizar Cliente", JOptionPane.OK_CANCEL_OPTION);
		if(option == JOptionPane.OK_OPTION) {
			Cliente cliente = new Cliente (id, nomeField.getText(), emailField.getText(), telefoneField.getText(), cpfField.getText());
			controler.atualizarCliente(cliente);
			carregarClientes();
			
		}
		
	}
	
	private void excluirCliente() {
		int linha = tabela.getSelectedRow();
		if(linha == 1) {
			JOptionPane.showMessageDialog(this, "Selecione um cliente para excluir");
			return;
			
		}
		
		int id = (int) tabela.getValueAt(linha, 0);
		int confirm = JOptionPane.showConfirmDialog(this, "Deseja excluir esse cliente?");
		if(confirm == JOptionPane.YES_OPTION) {
			controler.excluir(id);
			carregarClientes();
			
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new ClienteViewSwing().setVisible(true));
		
	}
	
	

}
