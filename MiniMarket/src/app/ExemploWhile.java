package app;

public class ExemploWhile {

	public static void main(String[] args) {
		int contador = 1;
		
		//Laco para repetir o contador cinco vezes
		while(contador <= 5) {
			System.out.println("O contador agora eh: "+ contador);
			
			contador++;//Incremento da variavel
		}
		//Apos sair do laco imprimir uma mensagem na tela
		System.out.println("Fim de contagem!");

	}

}
