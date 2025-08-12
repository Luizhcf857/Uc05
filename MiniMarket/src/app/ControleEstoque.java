package app;

import java.util.Scanner;

public class ControleEstoque {

	public static void main(String[] args) {
		
		/*1.Declaracao do Scanner*/
		Scanner entrada = new Scanner(System.in);
		
		/*2.Declaracao das variaveis do produto*/
		String nomeProduto = "Arroz 5kg";
		int quantidadeEstoque = 150;
		double precoProduto = 22.50;
		boolean disponivel = true;
		char categoria = 'A';
		long codigoBarras = 7891234567890L;
		
		
		/*3.Exibir informacoes  iniciais*/
		System.out.println("=== Informacoes do  Produto ===");
		System.out.println("Nome: "+ nomeProduto);
		System.out.println("Quantidade em estoque: "+ quantidadeEstoque);
		System.out.println("Preco: R$ "+ precoProduto);
		System.out.println("Disponivel: "+ disponivel);
		System.out.println("Categoria: "+ categoria);
		System.out.println("Codigo de barras: "+ codigoBarras);
		
		/*4.Simulacao de venda*/
		System.out.print("\nDigite a quantidade vendida:  ");
		int quantidadeVendida = entrada.nextInt();
		
		quantidadeEstoque -= quantidadeVendida;
		
		System.out.println("Estoque apos a venda: "+ quantidadeEstoque);
		
		
		/*5.Simulacao de reposicao*/
		System.out.print("\nDigite a quantidade de reposicao: ");
		int quantidadeReposicao = entrada.nextInt();
		
		quantidadeEstoque += quantidadeReposicao;
		
		System.out.println("Estoque apos a reposicao: "+ quantidadeEstoque);
		
		
		entrada.close();
		
		

	}

}
