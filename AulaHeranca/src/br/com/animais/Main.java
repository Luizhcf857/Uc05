package br.com.animais;


public class Main {
	
	public static void main(String[] args){
		Cachorro meuCachorro = new Cachorro("Rex", 5);
		System.out.println("Nome: "+meuCachorro.nome);
		System.out.println("Idade: "+meuCachorro.idade);
		meuCachorro.fazerSom();
		
		System.out.println("---------------------------------");
	
		Gato meuGato = new Gato("Frajola", 2);
		System.out.println("Nome: "+ meuGato.nome);
		System.out.println("Idade: "+ meuGato.idade);
		meuGato.fazerSom();
		
		System.out.println("---------------------------------");
		
		Leao meuLeao = new Leao("Simba", 1);
		System.out.println("Nome: "+ meuLeao.nome);
		System.out.println("Idade: "+ meuLeao.idade);
		meuLeao.fazerSom();
		
		System.out.println("---------------------------------");
		
		Tigre meuTigre = new Tigre("Osten", 6);
		System.out.println("Nome: "+ meuTigre.nome);
		System.out.println("Idade: "+ meuTigre.idade);
		meuTigre.fazerSom();
		
		System.out.println("---------------------------------");
		
		Pombo meuPombo = new Pombo("Julio", 4);
		System.out.println("Nome: "+ meuPombo.nome);
		System.out.println("Idade: "+ meuPombo.idade);
		meuPombo.fazerSom();
		
		System.out.println("---------------------------------");
		
		Bode meuBode = new Bode("Arthur", 8);
		System.out.println("Nome: "+ meuBode.nome);
		System.out.println("Idade: "+ meuBode.idade);
		meuBode.fazerSom();
		
		
		
	}

}
