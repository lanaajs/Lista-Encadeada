package Questao05;

public class ListaLinear {

	private static final int MAX = 7;
	private int[] lista = new int[MAX];
	private int tamanho = 0;

	public static int getMax() {
		return MAX;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	//elemento
	public int getElemento(int i) {
		return lista[i];
	}

	public void setElemento(int i, int valor) {
		lista[i] = valor;
	}

	public void exibirLista() {
		
	}
}
