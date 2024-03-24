package model;

public class EstudanteSuperior extends Estudante{

	private String instituicaoSegundoGrau;
	private int anoConclusaoSegundoGrau;
	
	//Construtores
	public EstudanteSuperior() {
		super();
	}

	//Getters e Setters
	public String getInstituicaoSegundoGrau() {
		return instituicaoSegundoGrau;
	}

	public void setInstituicaoSegundoGrau(String instituicaoSegundoGrau) {
		this.instituicaoSegundoGrau = instituicaoSegundoGrau;
	}

	public int getAnoConclusaoSegundoGrau() {
		return anoConclusaoSegundoGrau;
	}

	public void setAnoConclusaoSegundoGrau(int anoConclusaoSegundoGrau) {
		this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
	}

	@Override
	public String toString() {
		return  "Estudante de Nível Superior"+
				"\nInstituição de Segundo Grau: " + instituicaoSegundoGrau +
				"\nAno de Conclusão do Segundo Grau: " + anoConclusaoSegundoGrau +
				"\nNome: " + getNome() +
				"\nEmail: " + getEmail() +
				"\nMédia das Notas:" + getMediaNotas() +
				"\nQuantidade de Aprovações: " + getQtdAprovacoes() +
				"\n";
	}

	
	
	

}
