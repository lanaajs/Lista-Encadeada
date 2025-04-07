package Questao01;

public class TestaListaEncadeada {

	public void adicionar(ListaEncadeada listaEncadeada) {
		Professor p = new Professor("Angela", "Estrutura de Dados");
		Professor p2 = new Professor("Marco Camara", "Sistema Operacional");
		
		listaEncadeada.adicionar(p);
		listaEncadeada.adicionar(p2);
	}
	
	public void remover(ListaEncadeada lista) {
		lista.remover();
	}
	
	public int verificarTamanho(ListaEncadeada lista) {
		if(lista == null || lista.getPrimeiro() == null) {
			return 0;
		}
	
		int tamanho = 0;
		Celula atual = lista.getPrimeiro();
	
		while (atual != null) {
			tamanho++;
			atual = atual.getProximo();
		}
	
		return tamanho;
	}
		
	public boolean verificarVazia(ListaEncadeada lista) {
		if(lista == null || lista.getPrimeiro() == null) {
			System.out.println("Lista Vazia");
			return true;
		}
		
		System.out.println("Lista possui registros.");
		return false;
	}
	
	public void limparLista(ListaEncadeada lista) {
		while (!verificarVazia(lista)) {
			lista.remover();
		}
	}
	
	public void listarRegistro(ListaEncadeada lista) {
		Celula atual = lista.getPrimeiro();
	
		while (atual != null) {
			System.out.println(atual.getValor().getNome());
			atual = atual.getProximo();
		}
	}
	
	
	public static void main(String[] args) {
		TestaListaEncadeada testa = new TestaListaEncadeada();
		ListaEncadeada lista = new ListaEncadeada();
	
		System.out.println("\n\nProfessores adicionados: ");
		testa.adicionar(lista);
		testa.listarRegistro(lista);
	
		System.out.println("\n*Último Professor Removido*");
		testa.remover(lista);
	
		System.out.println("\nVerificando se a lista está vazia: ");
		testa.verificarVazia(lista);
	
		System.out.println("\nTamanho da lista: " + testa.verificarTamanho(lista));
	
		System.out.println("\nLista de Registros Atual: ");
		testa.listarRegistro(lista);
	}	

}
