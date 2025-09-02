package concessionarias.estoque;

import java.util.ArrayList;

public class EstoqueCarros {
	
	public static void main(String[] args) {
		
		//Criando um array de estoque
		ArrayList <String> estoque = new ArrayList<>();
		
		System.out.println("--- Gerenciador de Estoque de Carros ---");
		
		//adicionando carros no array de estoque
		estoque.add("Ford Mustang");
		estoque.add("Chevrolet Camaro");
		estoque.add("Volkswagen Jetta");
		estoque.add("Honda Civic");
		estoque.add("Toyota Corolla");
		
		//exibir todo o estoque, e o seu tamanho
		System.out.println("\n Estoque atual (" + estoque.size() + " carros)");

		System.out.println(estoque);
		
		//Simular uma venda, removendo o carro
		System.out.println("\nVendendo o 'Volkswagen Jetta'...");
		estoque.remove("Volkswagen Jetta");
		
		//Exibir estoque apos atualizado apos a venda
		System.out.println("\n Estoque atualizado (" + estoque.size() +" carros)");
		System.out.println(estoque);
		
		//Simular outra venda, agora removendo pelo indice
		//O Honda civic esta no indice 2, ja que o Volkswagen foi removido
		System.out.println("\nVendendo o carro da posicao 2 (Honda Civic)...");
		estoque.remove(2);
		
		//Exibir o estoque atualizado
		System.out.println("\nEstoque atualizado (" + estoque.size() +" carros)");
		System.out.println(estoque);
			
	}



}
