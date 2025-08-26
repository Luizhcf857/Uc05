package app;

//Classe principal
public class ControleFinanceiro {
	public double saldo;
	
	//Construtor da classe
	public ControleFinanceiro(double saldoInicial) {
		this.saldo = saldoInicial;
			
	}
	
	//Metodo para registrar a entrada
	public void registrarEntrada(double valor) {
		
		//condicional para verificar se o valor é maior que zero, caso nao for, exibir uma mensagem de erro
		if(valor > 0) {
			saldo += valor;
			System.out.println("Entrada Registrada: R$ "+ valor);
			
		}else {
			System.out.println("Valor invalido para entrada!");
			
		}
		
	}
	
	public void registrarSaida(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			
		}else {
			System.out.println("Saldo insuficiente ou valor invalido!");
			
		}
		
	}
	
	public void exibirSaldo() {
		System.out.println("Seu saldo atual eh: "+ saldo);
		
	}
	
	public static void main(String[] args) {
		ControleFinanceiro controle = new ControleFinanceiro(500);
		
		controle.exibirSaldo();
		controle.registrarEntrada(200);
		controle.registrarSaida(100);
		controle.registrarSaida(700);
		controle.exibirSaldo();
	}

}
