package listaencadeada;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Lista Animal: \n");
		Animal cachorro = new Animal("cachorro");
		Animal gato = new Animal("gato");
		Animal passaro = new Animal("passaro");
		Animal dinossauro = new Animal("dinossauro");
		ListaEncadeada<Animal> lista = new ListaEncadeada<Animal>();
				
		lista.inserir(cachorro, 1);
		lista.inserir(gato, 2);
		lista.inserir(passaro, 2);
		lista.inserir(dinossauro, 3);
		
		System.out.println("Método iterarLista: \n");
		iterarLista(lista);
		
		System.out.println("\nRemoverInicio: " +lista.removerInicio());
		System.out.println("RemoverFim: " +lista.removerFim());
		System.out.println("Remover pos 2: " +lista.remover(2));
		
		System.out.println("\nMétodo mostraLista: \n");
		mostraLista(lista);
		
		System.out.println("\n\nLista Pessoa: \n");
		
		Pessoa p1 = new Pessoa("Ali");
		Pessoa p2 = new Pessoa("Bruno");
		Pessoa p3 = new Pessoa("Kaio");
		Pessoa p4 = new Pessoa("Diego");
		Pessoa p5 = new Pessoa("Lucas");
		Pessoa p6 = new Pessoa("Gustavo");
		ListaEncadeada<Pessoa> lista2 = new ListaEncadeada<Pessoa>();
				
		lista2.inserir(p1, 1);
		lista2.inserir(p2, 2);
		lista2.inserir(p3, 3);
		lista2.inserir(p4, 3);
		lista2.inserir(p5, 4);
		lista2.inserir(p6, 5);
		
		System.out.println("Método iterarLista: \n");
		iterarLista(lista2);
		
		System.out.println("\nRemoverInicio: " +lista2.removerInicio());
		System.out.println("RemoverFim: " +lista2.removerFim());
		System.out.println("Remover pos 2: " +lista2.remover(2));
		
		System.out.println("\nMétodo mostraLista: \n");
		mostraLista(lista2);
	}
	
	public static void mostraLista(ListaEncadeada lista) {
		int numElem = lista.getTamanho();
		
		System.out.println("Lista com " + numElem + " nós.");
		for(int i = 1; i <= numElem; i++) {
			System.out.println(i + " -> " + lista.pesquisar(i));
		}
		System.out.println("Fim da lista.");
	}
	
	public static void iterarLista(ListaEncadeada lista) {
		Iterador it = lista.getInicio();
		Object obj;
		for(int j = 1;(obj = it.proximo()) != null;System.out.println(j++ + " -> " + obj));
		

	}

}