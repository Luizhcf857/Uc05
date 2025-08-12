package app;

public class Mercado {

	public static void main(String[] args) {
		
		//Dados do produto
		String nomeProduto = "Arroz Camil 5kg";
		double precoProduto = 27.90;
		int estoqueProduto = 120;
		
		//Dados do cliente
		String nomeCliente = "Ana Carolina";
		int idadeCliente = 35;
		char generoCliente = 'f';
		
		//Dados do caixa
		int numeroCaixa = 3;
		boolean caixaAberto = true;
		
		//Exibir as informacoes
		System.out.println("=== SISTEMA DE MERCADO ===");
		System.out.println("Poduto: "+ nomeProduto);
		System.out.println("Preco: "+ precoProduto);
		System.out.println("Estoque: "+ estoqueProduto);
		System.out.println("Cliente: "+ nomeCliente);
		System.out.println("Cliente: "+ nomeCliente + "  ("+ idadeCliente + ") anos" );
		System.out.println("Caixa numero "+ numeroCaixa + " Aberto? "+ caixaAberto);
		
		

	}

}
