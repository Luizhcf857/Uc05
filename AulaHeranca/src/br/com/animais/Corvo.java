package br.com.animais;

public class Corvo extends Animal {
	public Corvo(String nome, int idade) {
		super(nome, idade);
		
	}
	public void fazerSom() {
		System.out.println("O corvo grasna: croac, croac, ua!");
		
	}
}
