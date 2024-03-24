package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController {

	@Override
	public float percentualRendimento(Estudante est) {
		float mediaNotas = est.getMediaNotas();
		float quantidadeAprovacoes = Float.parseFloat(est.getQtdAprovacoes());
		
		float percentualDeRendimento = mediaNotas * quantidadeAprovacoes * 0.972f;
		
		return percentualDeRendimento;
	}

	@Override
	public float percentualProgressao(Estudante est) {
		float quantidadeAprovacoes = Float.parseFloat(est.getQtdAprovacoes());

		float percentualDeProgressao = quantidadeAprovacoes / 6;
		return percentualDeProgressao;
	}

}
