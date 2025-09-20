package br.com.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import br.com.model.Cliente;//importei o modelo de cliente
import br.com.controller.Controller;

public class ClienteDao {
	//foi criada uma classe para inserir os dados, recebendo o parametro do tipo cliente
	public void inserir(Cliente cliente) {
		String sql = "INSERT INTO clientes (nome, email, telefone, cpf) VALUES (?, ?, ?, ?)";//comando sql para inserir dentro do db
		
		//um try passando os parametros para fechar automaticamente os stmt e conn
		try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getTelefone());
			stmt.setString(4, cliente.getCpf());
			stmt.executeUpdate();//comando para executar o comando insert
			
			System.out.println("Cadastro realizado com sucesso!");
			
		}catch(SQLException e) {//caso dê erro, vai entrar no sql exception
			System.err.println("Erro ao cadastrar usuário! "+ e.getMessage());
			
		}
		
	}
	
	//criado um metodo que vai ter o retorno de uma lista
	public List<Cliente> listar(){
		//criando o objeto do tipo lista
		List<Cliente> lista = new ArrayList<>();
		
		String sql = "SELECT * FROM clientes";//comando para executar o sql
		
		try(Connection conn = Conexao.conectar(); Statement stmt = conn.createStatement(); 
			ResultSet rs = stmt.executeQuery(sql)){// try para realizar a conexao
				while(rs.next()) {//laco while para verificar se tem mais resultados, enquanto tiver, sera criado novos objetos
				Cliente cliente = new Cliente();
		
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefone(rs.getString("telefone"	));
				cliente.setCpf(rs.getString("cpf"));
				
				//adicionando os dados dentro do arraylist
				lista.add(cliente);
				
			}
			
		}catch(SQLException e) {
			System.err.println("Erro ao listar clientes "+ e.getMessage());
			
		}
		return lista;
	}
	
	public void atualizar(Cliente cliente) {
		String sql = "UPDATE clientes SET nome = ?, email = ?, telefone = ?, cpf = ? WHERE id = ?";
		
		try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getTelefone());
			stmt.setString(4, cliente.getCpf());
			stmt.setInt(5, cliente.getId());
			stmt.executeUpdate();
			System.out.println("Cliente atualizado com sucesso!");
			
		}catch(SQLException e) {
			System.err.println("Erro ao atualizar clientes"+ e.getMessage());
			
		}
		
		
	}

	public  void excluir(int id) {

		
		
		String sql = "DELETE FROM clientes WHERE id = ?";
		
		try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			System.err.println("Erro ao excluir cliente" + e.getMessage());
			
		}
		
		
	}
	

}
