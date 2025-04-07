package Questao05;

import java.util.Scanner;

public class TestaListaEncadeada {

	ListaLinear ll = new ListaLinear();

	public void addInicio(int num) {
		if (ll.getTamanho() >= ListaLinear.getMax()) {
			System.out.println("Lista cheia");
			return;
		}

		for (int i = ll.getTamanho(); i > 0; i--) {
			ll.setElemento(i, ll.getElemento(i - 1));
		}

		ll.setElemento(0, num);
		ll.setTamanho(ll.getTamanho() + 1);

		System.out.println("Número " + num + " adicionado no início");
	}

	public void addFim(int num) {
		if (ll.getTamanho() >= ListaLinear.getMax()) {
			System.out.println("Lista cheia");
			return;
		}

		ll.setElemento(ll.getTamanho(), num);
		ll.setTamanho(ll.getTamanho() + 1);

		System.out.println("Número " + num + " adicionado no fim");
	}

	public void exibir() {
		System.out.print("Lista: ");
		
		for (int i = 0; i < ll.getTamanho(); i++) {
			System.out.print(ll.getElemento(i) + " ");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		TestaListaEncadeada testa = new TestaListaEncadeada();
		Scanner sc = new Scanner(System.in);

		int opcao, numero;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Adicionar no início");
			System.out.println("2 - Adicionar no fim");
			System.out.println("3 - Exibir lista");
			System.out.println("0 - Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();

			switch (opcao) {
				case 1:
					System.out.print("Digite o número: ");
					numero = sc.nextInt();
					testa.addInicio(numero);
					break;
				case 2:
					System.out.print("Digite o número: ");
					numero = sc.nextInt();
					testa.addFim(numero);
					break;
				case 3:
					testa.exibir();
					break;
				case 0:
					System.out.println("Encerrando...");
					break;
				default:
					System.out.println("Opção inválida!");
			}
		} while (opcao != 0);

		sc.close();
	}
}
