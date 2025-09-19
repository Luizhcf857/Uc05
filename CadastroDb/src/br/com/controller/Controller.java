package br.com.controller;

import java.sql.*;
import java.util.List;
import br.com.dao.ClienteDao;
import br.com.model.Cliente;


public class Controller {
	private ClienteDao dao;
	
	public Controller(){
		dao = new ClienteDao();
		
	}
	
	public void cadastrarCliente(Cliente cliente) {
		if(cliente.getNome().isEmpty() || cliente.getEmail().isEmpty() || cliente.getTelefone().isEmpty() || cliente.getCpf().isEmpty()) {
			System.out.println("Todos os campos sao obrigatorios!");
			return;
			
		}
		if(!cliente.getEmail().contains("@")) {
			System.out.println("Email invalido!");
			return;
		}
		dao.inserir(cliente);
		
	}
	
	public void listarClientes() {
		List<Cliente> cliente = dao.listar();
		for(Cliente clientes: cliente) {
			System.out.println("ID: "+ clientes.getId() + " | Nome: "+ clientes.getNome() + " | Email: "+ clientes.getEmail() + " | Telefone: "
					+ clientes.getTelefone() + " | CPF: "+ clientes.getCpf());
														
		}
		
	}
	
	public void atualizarCliente(Cliente cliente) {
		dao.atualizar(cliente);
		
	}
	
	public void excluir(int id) {
		dao.excluir(id);
		
	}
	

}
