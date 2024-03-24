package model;

public abstract class Estudante {

	private String nome;
	private String email;
	private float mediaNotas;
	private String qtdAprovacoes;
	
	//Construtores
	public Estudante() {
		super();
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public float getMediaNotas() {
		return mediaNotas;
	}


	public void setMediaNotas(float mediaNotas) {
		this.mediaNotas = mediaNotas;
	}


	public String getQtdAprovacoes() {
		return qtdAprovacoes;
	}


	public void setQtdAprovacoes(String qtdAprovacoes) {
		this.qtdAprovacoes = qtdAprovacoes;
	}

	@Override
	public String toString() {
		return  "Estudante" + 
				"\nNome: " + nome +
				"\nEmail: " + email +
				"\nMédia das Notas: " + mediaNotas +
				"\nQuantidade de Aprovações: " + qtdAprovacoes +
				"\n";
	}

	
	
}
