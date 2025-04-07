package Questao03;

public class ListaEncadeada {
	
	private Celula primeiro; //determinam o começo e o fim, eles não podem sair
	private Celula ultimo; 
	private Celula posicaoAtual; //vai percorrer as celulas do inicio ao fim
	
	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}
	public Celula getPrimeiro() {
		return primeiro;
	}
	public Celula getUltimo() {
		return ultimo;
	}
	
	public void setPosicaoAtual(Celula posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}
	public void setPrimeiro(Celula primeiro) {
		this.primeiro = primeiro;
	}
	public void setUltimo(Celula ultimo) {
		this.ultimo = ultimo;
	}
	
	//adicionando uma celula nova
	public void adicionar(Numero valor) {
		Celula c = new Celula();
		c.setValor(valor);
		
		if(primeiro == null && ultimo == null) {
			primeiro = c;
			ultimo = c;
		}else {
			ultimo.setProximo(c);
			ultimo = c;
		}
	}
	
	//verificando se tem proximo
	public boolean temProximo() {
		if(primeiro == null) {
			return false;
		}else if(posicaoAtual == null){
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true:false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}
	
	//remover
	public void remover() {
		if(primeiro.getProximo() != null) {
			Celula celula = recuperarPenultimo(primeiro);
			ultimo = celula;
			ultimo.setProximo(null);
		}else {
			primeiro = ultimo = null;
		}
	}
	
	//recuperar penultima celula
	private Celula recuperarPenultimo(Celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
			return recuperarPenultimo(celula.getProximo());
	}
	
	
}
