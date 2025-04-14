package Questao03;

import java.util.Scanner;

public class TestaListaEncadeada {

	public void adicionarNum(ListaEncadeada listaEncadeada) {
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0; i < 10; i++) { 
			int valor;
	
			do {
				System.out.print("Digite um número inteiro e positivo para o índice " + (i + 1) + ": ");
				valor = sc.nextInt();
	
				if (valor < 0) {
					System.out.println("Erro: O número deve ser positivo!");
				}
			} while (valor < 0);
	
			//criar um novo objeto Numero e definir seu valor
			Numero novoNumero = new Numero();
			novoNumero.setNum(valor);
	
			listaEncadeada.adicionar(novoNumero); 
		}
	}
	
	public void removerNum(ListaEncadeada lista) {
		if (lista.getPrimeiro() == null) {
			System.out.println("A lista está vazia. Nada para remover.");
		} else {
			lista.remover();
			System.out.println("Último número removido com sucesso!");
		}
	}
	
	public void listarNumeros(ListaEncadeada lista) {
		if (lista.getPrimeiro() == null) {
			System.out.println("A lista está vazia.");
			return;
		}

		//System.out.println("Números ímpares na lista:");

		Celula atual = lista.getPrimeiro();

		while (atual != null) {
			if (atual.getValor().getNum() % 2 != 0) {
				System.out.print(atual.getValor().getNum() + " ");
			}
			atual = atual.getProximo();
		}
	
		//System.out.println("Números pares na lista:");

		atual = lista.getPrimeiro();

		while (atual != null) {
			if (atual.getValor().getNum() % 2 == 0) {
				System.out.print(atual.getValor().getNum() + " ");
			}
			atual = atual.getProximo();
		}
	}

	public static void main(String[] args) {
		TestaListaEncadeada testa = new TestaListaEncadeada();
		ListaEncadeada lista = new ListaEncadeada();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n\nMenu:");
			System.out.println("1 - Adicionar números");
			System.out.println("2 - Remover último número");
			System.out.println("3 - Listar números");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = sc.nextInt();

			switch (opcao) {
				case 1:
					testa.adicionarNum(lista);
					break;
				case 2:
					testa.removerNum(lista);
					break;
				case 3:
					testa.listarNumeros(lista);
					break;
				case 4:
					System.out.println("Saindo...");
					sc.close();
					return;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		}
	}
}
