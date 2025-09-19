package br.com.model;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String cpf; 
	
	public Cliente(){
		
	}
	
	public Cliente(int id, String nome, String email, String telefone, String cpf) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		
	}
	
	public int getId() {
		return this.id;
		
	}

	public void setId(int id) {
		this.id = id;
		
	}
	
	public String getNome() {
		return this.nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getEmail() {
		return this.email;
	
	}
	
	public void setEmail(String nome) {
		this.nome = nome;
		
	}
	
	public String getTelefone() {
		return this.telefone;
		
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
		
	}
	
	public String getCpf() {
		return this.cpf;
		
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
}
