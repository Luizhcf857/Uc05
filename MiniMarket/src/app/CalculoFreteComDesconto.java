package app;

import java.util.Scanner;

public class CalculoFreteComDesconto{

    public static void main(String[] args){
        
        /*Declarada a variável que irá receber os dados do usuário*/
        Scanner entrada = new Scanner(System.in);

        /*Variáveis que irão receber os dados e o tipo do cliente*/
        String nome;
        int opcao;
        double distancia;

        /*Variáveis que tem o valor fixo do km, desconto com base no cliente, valor com desconto e o valor final */
        double valorKm = 1.80;
        double desconto;
        double valor;
        double valorFinal;
        String tipo = " ";

        /*Essa parte sera a seleção de cliente*/
        System.out.println("===============================");
        System.out.println("  SISTEMA DE CÁLCULO DE FRETE");
        System.out.println("===============================");
        System.out.println("  Selecione o tipo de cliente     |");
        System.out.println("1 - Comum                         |");
        System.out.println("2 - VIP                           |");
        System.out.println("3 - Funcionáro                    |");
        System.out.println("-----------------------------------");
        System.out.print("\nSelecione o tipo: ");
        opcao = entrada.nextInt();
        entrada.nextLine();
        
        /*Caso a opcao for diferente das quais estao pedindo ira finalizar o programa*/
        if(opcao > 3 || opcao <= 0) {
        	System.out.println("Cliente invalido!");
        	entrada.close();
        	return;
        }
        
        /*Essa parte ira receber o nome e distancia a ser percorrida*/
        System.out.print("\nDigite o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("\nDigite a distância a ser percorrida(Digite apenas o numero): ");
        distancia = entrada.nextDouble();

        /*Aqui ira armazenar os valores inteiros, foi colocado outra variavel para armazenar, para uma exibir o desconto e a outra  
        o valor*/
        valor = distancia * valorKm;
        valorFinal = valor;

        /*Aqui vai ter uma estrutura condicional para saber o tipo do cliente para realizar os calulos*/
        if(opcao == 1){
            tipo = "Comum";
            desconto = 0;
            valor *= desconto;
            valorFinal -= valor;

        }else if(opcao == 2){
            tipo = "VIP";
            desconto = 0.10;
            valor *= desconto;
            valorFinal -= valor;

        }else if(opcao == 3){
            tipo = "Funcionário";
            desconto = 0.20;
            valor *= desconto;
            valorFinal -= valor;
            
        }

        /*Aqui ira ser a saída dos dados*/
        System.out.println("\nDADOS DO FRETE");
        System.out.println("NOME: "+ nome);
        System.out.println("TIPO: "+ tipo);
        System.out.printf("DESCONTO %.2f R$\n", valor);
        System.out.printf("VALOR FINAL: %.2f R$\n", valorFinal);

    

    entrada.close();








    }


}
