package Questao03;

public class Celula {
	
	private Numero valor; // valor dentro de cada celula >> DATE
	private Celula proximo; // apontador da proxima celula >> NEXT
	
	public Celula getProximo() {
		return proximo;
	}
	public Numero getValor() {
		return valor;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public void setValor(Numero valor) {
		this.valor = valor;
	}
}
