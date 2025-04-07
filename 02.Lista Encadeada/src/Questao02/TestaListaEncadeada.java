package Questao02;

import java.util.Arrays;
import java.util.Comparator;

public class TestaListaEncadeada {

	public void adicionar(ListaEncadeada listaEncadeada) {
		Estudante e1 = new Estudante("Alana", 123456);
		Estudante e2 = new Estudante("Kayke", 654321);
		
		listaEncadeada.adicionar(e1);
		listaEncadeada.adicionar(e2);
	}
	
	public void remover(ListaEncadeada listaeEncadeada) {
		listaeEncadeada.remover();
	}
	
	public void pesquisa(ListaEncadeada listaEncadeada, int matriculaP){
		Celula atual = listaEncadeada.getPrimeiro();

		while(atual != null){
			Estudante e = atual.getValor();

			if(e.getMatricula() == matriculaP){
				System.out.println("Estudante Encontrado!\n Nome: "+ e.getNome() +"\n Matricula: " + e.getMatricula());
				return;
			}

			atual = atual.getProximo();
		}

		System.out.println("Matricula não encontrada.");
	}

	public void listar(ListaEncadeada listaEncadeada){
		Celula atual = listaEncadeada.getPrimeiro();
	
		while (atual != null) {
			System.out.println(atual.getValor().getNome());
			atual = atual.getProximo();
		}
	}

	public void ordemAlfabetica(ListaEncadeada listaEncadeada){
		Celula atual = listaEncadeada.getPrimeiro();
	
		//conta os elementos
		int tamanho = 0;
		while(atual != null){
			tamanho++;
			atual = atual.getProximo();
		}
	
		//cria array e preenche
		Estudante[] estudantes = new Estudante[tamanho];
		atual = listaEncadeada.getPrimeiro();
		int i = 0;
		while(atual != null){
			estudantes[i++] = atual.getValor();
			atual = atual.getProximo();
		}
	
		//ordena
		Arrays.sort(estudantes, new Comparator<Estudante>() {
			@Override
			public int compare(Estudante e1, Estudante e2) {
				return e1.getNome().compareToIgnoreCase(e2.getNome());
			}
		});
	
		//imprime
		for(Estudante e : estudantes){
			System.out.println(" Nome: " + e.getNome() + " - Matrícula: " + e.getMatricula());
		}
	}
	
	public static void main(String[] args) {
		TestaListaEncadeada testa = new TestaListaEncadeada();
		ListaEncadeada lista = new ListaEncadeada();
	
		System.out.println("\n\nEstudantes Adicionados no Sistema!");
		testa.adicionar(lista);

		System.out.println("Listar Estudantes:");
		testa.listar(lista);

		System.out.println("\nPesquisar Matrícula:");
		testa.pesquisa(lista, 123456);

		System.out.println("\nListar Estudantes em Ordem Alfabetica:");
		testa.ordemAlfabetica(lista);

		System.out.println("\nRemovendo Estudante da Lista:");
		testa.remover(lista);

		System.out.println("Listar Estudantes:");
		testa.listar(lista);
	}	

}
