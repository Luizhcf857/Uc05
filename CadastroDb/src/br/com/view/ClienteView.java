package br.com.view;

import br.com.controller.Controller;
import br.com.model.Cliente;
import java.util.Scanner;

public class ClienteView {
	
	private Controller controller;
	private Scanner entrada;
	
	public ClienteView() {
		controller = new Controller();
		entrada = new Scanner(System.in);
		
	}
	
	public void exibirMenu() {
		int opcao;
		
		do {
			System.out.println("--- Menu de Gerenciamento de Clientes ---");
			System.out.println("1. Cadastrar Cliente");
			System.out.println("2. Listar Clientes");
			System.out.println("3. Atualizar Cliente");
			System.out.println("4. Excluir Cliente");
			System.out.println("0. Sair");
			System.out.print("Digite uma opção: ");
			opcao = entrada.nextInt();
			
			entrada.nextLine();
			
			switch(opcao) {
			
			case 1 -> cadastrarCliente();
			case 2 -> controller.listarClientes();
			case 3 -> atualizarCliente();
			case 4 -> excluirCliente();
			case 0 -> System.out.println("Encerrando programa!");
			default -> System.out.println("Opção Inválida!.");			
			}
			
		}while(opcao != 0);
		
	}
	
	private void cadastrarCliente() {
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu email: ");
		String email = entrada.nextLine();
		
		System.out.println("Digite seu telefone: ");
		String telefone = entrada.nextLine();
		
		System.out.println("Digite seu CPF: ");
		String cpf = entrada.nextLine();
		
		Cliente cliente = new Cliente(0, nome, email, telefone, cpf);
		controller.cadastrarCliente(cliente);
		
	}
	
	private void atualizarCliente() {
		System.out.println("ID do cliente: ");
		int id = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Novo nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Novo email: ");
		String email = entrada.nextLine();
		
		System.out.println("Novo telefone: ");
		String telefone = entrada.nextLine();
		
		System.out.println("Novo CPF: ");
		String cpf = entrada.nextLine();
		
		Cliente cliente = new Cliente(id, nome, email, telefone, cpf);
		controller.atualizarCliente(cliente);
		
	}
	
	private void excluirCliente() {
		System.out.println("ID do cliente a excluir: ");
		int id = entrada.nextInt();
		
		entrada.nextLine();
		
		controller.excluir(id);
		
	}

}
