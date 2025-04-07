package Questao03;

import java.util.Scanner;

public class TestaListaEncadeada {

	public void adicionarNumero(ListaEncadeada lista) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[15];
	
		for (int i = 0; i < 15; i++) {
			System.out.print("Digite um número inteiro: ");
			vetor[i] = sc.nextInt();
	
			Numero num = new Numero();
			num.setNumero(vetor[i]);
			lista.adicionar(num);
		}
	
		System.out.println("\nNúmeros digitados:");
		for (int i = 0; i < 15; i++) {
			System.out.println((i + 1) + "º número no índice: " + vetor[i]);
		}

		sc.close();
	}

	public static void main(String[] args) {
		TestaListaEncadeada testa = new TestaListaEncadeada();
		ListaEncadeada lista = new ListaEncadeada();

		testa.adicionarNumero(lista);
	}

}
