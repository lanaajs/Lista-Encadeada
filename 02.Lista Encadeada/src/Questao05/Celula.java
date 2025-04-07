package Questao05;

public class Celula {
	
	private ListaLinear valor; // valor dentro de cada celula >> DATE
	private Celula proximo; // apontador da proxima celula >> NEXT
	
	public Celula getProximo() {
		return proximo;
	}
	public ListaLinear getValor() {
		return valor;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public void setValor(ListaLinear valor) {
		this.valor = valor;
	}
}
