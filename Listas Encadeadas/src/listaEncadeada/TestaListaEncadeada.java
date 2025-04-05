package listaEncadeada;

public class TestaListaEncadeada {

	public void addContato(ListaEncadeada listaEncadeada) {
		Contato contato = new Contato(1, "alana", "alana@ucsal.com");
		Contato contato2 = new Contato(2, "alana2", "alana@ucsal.com");
		
		listaEncadeada.adicionar(contato);
		listaEncadeada.adicionar(contato2);
	}
	
	public void removerContato(ListaEncadeada lista) {
		lista.remover();
	}
	
	public static void main(String[] args) {
		TestaListaEncadeada testa = new TestaListaEncadeada();
		ListaEncadeada lista = new ListaEncadeada();
		
		System.out.println("Adicionando Contato: ");
		testa.addContato(lista);
		
		while(lista.temProximo()){
			System.out.println(lista.getPosicaoAtual().getValor().getNome());
		}
		
		System.out.println("Removendo Contato: ");
		testa.removerContato(lista);
		
		while(lista.temProximo()){
			System.out.println(lista.getPosicaoAtual().getValor().getNome());
		}
	}

}
