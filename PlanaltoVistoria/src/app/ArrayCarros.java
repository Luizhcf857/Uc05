package app;

public class ArrayCarros {

	public static void main(String[] args) {
		//Criando uma array do tipo de carros
		String[] carros = new String[5];
		
		//Inserindo os elementos do array
		
		carros[0] = "Fusca";
		carros[1] = "Civic";
		carros[2] = "Corolla";
		carros[3] = "Gol";
		carros[4] = "HB20";
		
		//Exibindo o aray com o for
		
		System.out.println("Lista de carros cadastrados: \n");
		for(int i = 0; i < carros.length; i++) {
			System.out.println("Posicao: "+ (i + 1) + ": " + carros[i]);
			
		}
		
		//Exemplo de acessar o array direto pela posicao
		System.out.println("\nO carro da posicao 2 eh: "+ carros[2]);
		
		//Exemplo com for-each
		System.out.println("\nExemplo com for-each");
		for(String carro: carros) {
			System.out.println(carro);
			
		}
		
	}

}
