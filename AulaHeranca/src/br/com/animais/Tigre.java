package br.com.animais;

public class Tigre extends Animal {
	public Tigre(String nome, int idade) {
		super(nome, idade);
	}
	
	public void fazerSom() {
		System.out.println("O tigre brama: Grrr, roar!");
		
	}
}
