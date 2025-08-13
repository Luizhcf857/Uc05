package app;

import java.util.Scanner;

public class Financeiro{

    public static void main(String[] args){

        /*Declaração da variável tipo Scanner */
        Scanner entrada = new Scanner(System.in);

        /*Variáveis que serão usadas para receber as informações do produto */
        String nome;
        double precoCompra;
        double precoVenda;
        int quantidadeVendida;

        /*Variáveis que irão fazer os cálculos */
        double receita;
        double custo;
        double lucroBruto;
        double imposto;
        double lucroLiquido;
        

        /*Nessa parte o usuário ira inserir os dados do produto */
        System.out.print("Digite o nome do produto: ");
        nome = entrada.nextLine();

        System.out.print("Digite o preço da compra: ");
        precoCompra = entrada.nextDouble();

        System.out.print("Digite o preço da venda: ");
        precoVenda = entrada.nextDouble();

        System.out.print("Digite a quantidade vendida: ");
        quantidadeVendida = entrada.nextInt();

        /*Esse bloco de codigo ira realizar as operações aritméticas */
        receita = precoVenda * quantidadeVendida;
        custo = precoCompra * quantidadeVendida;
        lucroBruto = receita - custo;
        imposto = receita * 0.08;
        lucroLiquido = lucroBruto - imposto;

        /*Essa parte ira exibir os resultados financeiros */
        System.out.println("Nome: "+ nome);
        System.out.println("Receita Total: "+ receita);
        System.out.println("Custo Total: "+ custo);
        System.out.println("Lucro Bruto: "+ lucroBruto);
        System.out.println("Imposto: "+ imposto);
        System.out.println("Lucro Líquido: "+ lucroLiquido);



        entrada.close();


    }



}