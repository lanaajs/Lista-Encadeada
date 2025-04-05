package listaEncadeada;

public class Contato {
	
	private Integer id;
	private String nome;
	private String email;
	
	public Contato(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
