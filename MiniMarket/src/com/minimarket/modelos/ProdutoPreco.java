package com.minimarket.modelos;

public class ProdutoPreco {

	public static void main(String[] args) {
		double  precos[] = {19.99, 45.50, 13.75, 89.90, 33.30};
		double soma = 0;
		double maior = precos[0];
		double menor = precos[0];
		int i;
		
		System.out.println("Precos dos produtos: ");
		for(i = 0; i < precos.length; i++) {
			System.out.println("Precos "+ (i + 1) + ": R$ " + precos[i]);
			
			soma += precos[i];
			
			if(precos[i] > maior) {
				maior = precos[i];
				
			}
			
			if(precos[i] < menor) {
				menor = precos[i];
				
			}
			
			
		}
		
		double media = soma / precos.length;
		
		System.out.printf("\nPreco Medio: %.2f\n", media);
		System.out.printf("\nMaior preco: %.2f\n", maior);
		System.out.printf("\nMenor preco: %.2f\n", menor);
	}

}
