package Questao01;

public class Professor {
	
	private String nome;
	private String disciplina;
	
	public Professor(String nome, String disciplina) {
		this.nome = nome;
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public String getNome() {
		return nome;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
