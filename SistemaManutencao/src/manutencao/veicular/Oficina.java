package manutencao.veicular;

import java.util.Scanner;
import java.util.ArrayList;

public class Oficina {

    public static void main(String[] args) {
        //Objetos de array e scanner
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> veiculosEmManutencao = new ArrayList<>();

        //Variavel de controle do menu
        int menu;

        String[] servicos = {"Troca de óleo", "Alinhamento e balanceamento", "Revisão Geral", "Troca de pneus"};
        double[] precos = {150.00, 120.00, 350.00, 400.00};

        do {
            System.out.println("--- Menu Principal ---");
            System.out.println("\n1. Novo Orçamento");
            System.out.println("2. Ver veículos em manutenção");
            System.out.println("3. Sair");
            System.out.print("\nDigite a opção desejada: ");
            menu = entrada.nextInt();

            entrada.nextLine();

            switch (menu) {

                case 1:
                    //Novo orçamento
                    System.out.println("\n--- Novo orçamento ---");

                    //criando variáveis que irão auxiliar o caso 1
                    double valorTotal = 0.0;
                    String modeloVeiculo;

                    System.out.println("Digite o nome do carro: ");
                    modeloVeiculo = entrada.nextLine();

                    veiculosEmManutencao.add(modeloVeiculo);

                    System.out.println("--- Serviços Disponíveis ---");
                    for (int i = 0; i < servicos.length; i++) {
                        System.out.println((i + 1) + "." + servicos[i] + " - R$" + precos[i]);
                    }

                    System.out.print("\nQuantos serviços você deseja adicionar: ");
                    int numServicos = entrada.nextInt();

                    entrada.nextLine();

                    for (int i = 0; i < numServicos; i++) {
                        System.out.print("\nDigite o número do serviço" + (i + 1) + ": ");
                        int escolhaServico = entrada.nextInt();

                        entrada.nextLine();

                        if (escolhaServico > 0 && escolhaServico <= servicos.length) {
                            valorTotal += precos[escolhaServico - 1];

                        } else {
                            System.out.println("Serviço Inválido. Serviço não adicionado");

                        }   
                        
                    }
                    
                    if (valorTotal > 500.00) {
                        double desconto = valorTotal * 0.10;
                        valorTotal -= desconto;

                        System.out.println("Valor de 10% aplicado (R$ " + desconto + " )");

                    }

                    System.out.println("O valor total do orçamento para o veiculo " + modeloVeiculo + " é R$ " + valorTotal);

                    break;

                case 2:

                    System.out.println("\n --- Veículos em manutenção ---");

                    if (veiculosEmManutencao.isEmpty()) {
                        System.out.println("Nenhum veículo em manutenção no momento");

                    } else {
                        for (String veiculos : veiculosEmManutencao) {
                            System.out.println("- " + veiculosEmManutencao);

                        }

                    }

                    break;

                case 3:
                    System.out.println("Encerrando, muito obrigado!");

                    break;

                default:
                    System.out.println("Opção Inválida!");

                    break;

            }

        } while (menu != 3);

        entrada.close();

    }

}
