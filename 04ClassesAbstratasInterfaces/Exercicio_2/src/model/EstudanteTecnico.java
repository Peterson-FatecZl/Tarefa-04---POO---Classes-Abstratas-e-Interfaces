package model;

public class EstudanteTecnico extends Estudante {

	//Construtores
	public EstudanteTecnico() {
		super();
	}

	@Override
	public String toString() {
		return  "Estudante Técnico" + 
				"\nNome: " + getNome() +
				"\nEmail: " + getEmail() +
				"\nMédia das Notas: " + getMediaNotas() +
				"\nQuantidade de Aprovações: " + getQtdAprovacoes() +
				"\n";
	}


}
