package Questao01;

public class Celula {
	
	private Professor valor; // valor dentro de cada celula >> DATE
	private Celula proximo; // apontador da proxima celula >> NEXT
	
	public Celula getProximo() {
		return proximo;
	}
	public Professor getValor() {
		return valor;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public void setValor(Professor valor) {
		this.valor = valor;
	}
}
