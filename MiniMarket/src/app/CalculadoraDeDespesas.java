package app;

import java.util.Scanner;

public class CalculadoraDeDespesas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);//entrada, para receber os dados do tipo Scanner
		double totalDespesas = 0;
		double valorDespesas = 1;
		int i = 0;
		
		System.out.println("Bem-vindo(a) ao Gerenciador de Despesas Mensais!");
		System.out.println("Digite o valor de cada despesa.");
		System.out.println("Quando terminar, digite 0 para ver o total\n");
		
		//loop para fazer as contagens das despesas
		while(valorDespesas != 0) {
			System.out.println("Digite o valor da despesa (ou 0 para finalizar ): R$ ");
			
			//Condicao para verifica se o proximo valor vai ser double
			if(entrada.hasNextDouble()) {
				valorDespesas = entrada.nextDouble();
				
			}
			
			if(valorDespesas > 0) {
				totalDespesas += valorDespesas;
				i++;
				
			}else if(valorDespesas < 0) {
				System.out.println("Valor invalido. Por favor, digite um valor positivo!");
				
			}/*else {
				System.out.println("Entrada invalida. Por favor, digite um numero maior que zero!");
				entrada.next();
			}*/
			
		}
		
		System.out.println("\n-----------------------------------------------------");
		
		if(i > 0) {
			System.out.printf("Voce registrou %d despesa(s) no total\n", i);
			System.out.printf("O total de despesas eh: %.2f\n", totalDespesas);
			
		}else {
			System.out.println("Nenhuma despesa foi registrada!");
			
		}
		
		System.out.println("\n-----------------------------------------------------");
		
	entrada.close();
	
		
		
		
	}

}
