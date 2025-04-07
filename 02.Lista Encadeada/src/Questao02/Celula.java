package Questao02;

public class Celula {
	
	private Estudante valor; // valor dentro de cada celula >> DATE
	private Celula proximo; // apontador da proxima celula >> NEXT
	
	public Celula getProximo() {
		return proximo;
	}
	public Estudante getValor() {
		return valor;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public void setValor(Estudante valor) {
		this.valor = valor;
	}
}
