package app;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Carlos";
		aluno1.idade = 18;
		aluno1.curso = "Tecnico em Desenvolvimento de Sistemas";
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Alany";
		aluno2.idade = 21;
		aluno2.curso = "Tecnico em Desenvolvimento de Sistemas";
		
		aluno1.exibirInformacoes();
		aluno2.exibirInformacoes();
	}
}
		
		 class Aluno{
			public String nome;
			public int idade;
			public String curso;
			
			  void exibirInformacoes() {
				System.out.println("Nome: "+ nome);
				System.out.println("Idade: "+ idade);
				System.out.println("Curso: "+ curso);
				System.out.println("----------------------------------------------");
				
			}
			
			
		}

	


