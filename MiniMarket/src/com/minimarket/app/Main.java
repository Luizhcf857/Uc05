package com.minimarket.app;

import com.minimarket.modelos.Produto;
import com.minimarket.modelos.Alimento;
import com.minimarket.modelos.Eletronico;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("--- PRODUTO GENERICO ---");
		Produto produtoGenerico = new Produto("Caderno", 15.00, "12345");
		produtoGenerico.exibirInformacoes();
		System.out.println("Imposto a pagar: R$ "+ String.format("%.2f", produtoGenerico.calcularImposto()));
		
		System.out.println("\n--- PRODUTO ELETRONICO ---");
		Eletronico smartphone = new Eletronico("Iphone X", 2500.00, "54321", 12);
		smartphone.exibirInformacoes();
		System.out.println("Imposto a pagar: R$ "+ String.format("%.2f", smartphone.calcularImposto()));
		
		System.out.println("\n--- PRODUTO ALIMENTO ---");
		Alimento feijao = new Alimento("Feijao", 8.50, "98765", "10/12/2026");
		feijao.exibirInformacoes();
		System.out.println("Imposto a pagar: R$ " + String.format("%.2f", feijao.calcularImposto()));
		
	}

}
