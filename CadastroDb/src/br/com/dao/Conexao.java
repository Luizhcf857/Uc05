package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static final String URL = "jdbc:mysql://localhost:3306/clientesdb";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public static Connection conectar() {
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			return conn;
			
		}catch(SQLException e) {
			System.err.println("Erro ao conectar ao banco de dados: "+ e.getMessage());
			return null;
			
		}
		
		
		
		
	}
	
	
}


	
	

