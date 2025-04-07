package Questao04;

public class TestaListaEncadeada {

	public void adicionar(ListaEncadeada listaEncadeada) {
		Estudante e1 = new Estudante("Alana", 123456);
		Estudante e2 = new Estudante("Kayke", 654321);
		
		listaEncadeada.adicionar(e1);
		listaEncadeada.adicionar(e2);
	}
	
	public int pesquisa(ListaEncadeada listaEncadeada, int matriculaP) {
		return pesquisaRecursiva(listaEncadeada.getPrimeiro(), matriculaP);
	}

	private int pesquisaRecursiva(Celula atual, int matriculaP) {
		if (atual == null) {
			System.out.println("Matrícula não encontrada.");
			return -1;
		}

		Estudante e = atual.getValor();

		if (e.getMatricula() == matriculaP) {
			System.out.println("Estudante Encontrado!\nNome: " + e.getNome() + 
			"\nMatrícula: " + e.getMatricula());
			return 1;
		}

		return pesquisaRecursiva(atual.getProximo(), matriculaP);
	}
	
	
	public static void main(String[] args) {
		TestaListaEncadeada testa = new TestaListaEncadeada();
		ListaEncadeada lista = new ListaEncadeada();
	
		testa.adicionar(lista);
		testa.pesquisa(lista, 654321); //encontra Alana
	}	
}
