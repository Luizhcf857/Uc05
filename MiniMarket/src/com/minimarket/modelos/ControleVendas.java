package com.minimarket.modelos;

import java.util.Scanner;

public class ControleVendas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] dias = {"Segunda","Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
		int[] vendas = new int[7];
		
		for(int i = 0; i < vendas.length; i++) {
			System.out.print("Digite o valor de "+ dias[i] +" : ");
			vendas[i] = entrada.nextInt();
			
		}
		
		int total = 0;
		int maior = vendas[0];
		int menor = vendas[0];
		int diaMaior = 0;
		int diaMenor = 0;
		
		for(int i = 0; i < vendas.length; i++ ) {
			total += vendas[i];
			
			if(vendas[i] > maior) {
				maior = vendas[i];
				diaMaior = i;
				
			}
			
			if(vendas[i] < menor) {
				menor = vendas[i];
				diaMenor = i;	
			}
			
		}
		
		double media = total / 7.00;
		
		System.out.println("\nTotal de vendas da semana: "+ total);
		System.out.printf("Media de vendas por dia: %.2f\n",media);
		System.out.printf("Maior venda: "+ maior +"("+ dias[diaMaior] +")\n");
		System.out.printf("Menor venda: "+ menor +"("+ dias[diaMenor] +")\n");

	}

}
