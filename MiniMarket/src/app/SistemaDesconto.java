package app;

import java.util.Scanner;

public class SistemaDesconto {

	public static void main(String[] args) {
		
		/*Variavel do tipo Scanner*/
		Scanner scanner = new Scanner(System.in);
		
		/*Essa parte ira receber as informacoes sobre o cliente*/
		System.out.print("Digite o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.println("Selecione o tipo do cliente:");
		System.out.println("1 - Comum");
		System.out.println("2 -  VIP");
		System.out.println("3 - Funcionario");
		System.out.print("Selecione o tipo: ");
		int tipo = scanner.nextInt();
		
		System.out.print("Digite o valor da compra: R$ ");
		double valorCompra = scanner.nextDouble();
		
		/*Variaveis auxiliadores*/
		double desconto = 0;
		String tipoTexto = "";
		
		if(tipo == 1) {
			tipoTexto = "Comum";
			desconto = 0;
			
		}else if(tipo == 2) {
			tipoTexto = "VIP";
			desconto = valorCompra * 0.10;
			
		}else if(tipo == 3) {
			tipoTexto = "Funcionario";
			desconto = valorCompra * 0.20;
		}else {
			System.out.println("Tipo de cliente invalido!");
			scanner.close();
			return;
		}
		
		double valorFinal = valorCompra - desconto;
		
		/*Saida com os calculos, dependendo do cliente*/
		System.out.println("\n--- RESUMO DA COMPRA ---");
		System.out.println("Nome do cliente: "+ nome);
		System.out.println("Tipo de cliente: "+ tipoTexto);
		System.out.printf("Valor da compra %.2f\n", valorCompra);
		System.out.printf("Desconto aplicado: %.2f\n", desconto);
		System.out.printf("Valor final: %.2f\n", valorFinal);
		scanner.close();
	}

}
