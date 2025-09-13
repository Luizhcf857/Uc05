package br.com.gerenciamento;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:mysql://localhost:3306/gerenciamento_cli";//localização da url do banco de dados
	private static final String USUARIO = "root";//usário do banco de dados
	private static final String SENHA = "1234";//senha do banco de dados
	


	public static Connection conectar() {
		try {
			Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
			System.out.println("Conexão bem sucedida");
			
			return conn;
			
		}catch(SQLException e){
			System.err.println("Erro de conexao "+ e.getMessage());
			
			return null;
			
		}
		
		
	}
}