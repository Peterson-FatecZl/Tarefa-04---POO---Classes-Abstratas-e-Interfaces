package controller;

import model.Estudante;

public class EstudanteTecnicoController implements IEstudanteController {

	@Override
	public float percentualRendimento(Estudante est) {
		float mediaNotas = est.getMediaNotas();
		float quantidadeAprovacoes = Float.parseFloat(est.getQtdAprovacoes());
		
		float percentualDeRendimento = mediaNotas * quantidadeAprovacoes * 0.931f;
		
		return percentualDeRendimento;
	}

	@Override
	public float percentualProgressao(Estudante est) {
		float quantidadeAprovacoes = Float.parseFloat(est.getQtdAprovacoes());
		
		float percentualDeProgressao = quantidadeAprovacoes / 3;
		return percentualDeProgressao;
	}

}
