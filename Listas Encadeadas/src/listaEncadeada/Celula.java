package listaEncadeada;

public class Celula {
	
	private Contato valor; // valor dentro de cada celula >> DATE
	private Celula proximo; // apontador da proxima celula >> NEXT
	
	public Celula getProximo() {
		return proximo;
	}
	public Contato getValor() {
		return valor;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public void setValor(Contato valor) {
		this.valor = valor;
	}
}
