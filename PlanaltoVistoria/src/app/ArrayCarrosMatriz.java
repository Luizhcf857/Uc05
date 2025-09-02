package app;

public class ArrayCarrosMatriz {

	public static void main(String[] args) {
		//Criando a matriz de carros
		String[][] carros = new String[5][3];
		
		
		//preenchendo a matriz
		//Linha = modelo, coluna 1 = ano, coluna 2 = cor
		carros[0][0] = "Civic"; carros[0][1] = "2022"; carros[0][2] = "Preto";
		carros[1][0] = "Corolla"; carros[1][1] = "2021"; carros[1][2] = "Branco";
		carros[2][0] = "Gol"; carros[2][1] = "2019"; carros[2][2] = "Prata";
		carros[3][0] = "Onix"; carros[3][1] = "2020"; carros[3][2] = "Vermelho";
		carros[4][0] = "HB20"; carros[4][1] = "2023"; carros[4][2] = "Azul";
		
		System.out.println("=== Lista de carros ===");
		System.out.println("Modelo\t\tAno\tCor\n");
		
		for(int i = 0; i < carros.length; i++) {
			for(int j = 0; j < carros[i].length; j++) {
				System.out.print(carros[i][j] + "\t");
				
			}
			System.out.println("");
			
		}
	}

}
