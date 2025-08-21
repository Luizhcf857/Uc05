package br.com.animais;

public class Animal {
	String nome;
	int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: "+ this.idade);
		
	}
	
	public void fazerSom() {
		System.out.println("O animal faz um som: ");
		
	}

}
