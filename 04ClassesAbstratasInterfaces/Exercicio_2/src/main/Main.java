package main;

import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Main {

	public static void main(String[] args) {

		// Controle de Estudantes
		EstudanteSuperiorController controllerEstudanteSuperior = new EstudanteSuperiorController();
		EstudanteTecnicoController controllerEstudanteTecnico = new EstudanteTecnicoController();

		// Estudantes
		EstudanteTecnico estudanteTecnico = new EstudanteTecnico();
		EstudanteSuperior estudanteSuperior = new EstudanteSuperior();

		//''Settando'' intancias
		estudanteSuperior.setNome("EstudanteFatec");
		estudanteSuperior.setEmail("emailFatec@email.com");
		estudanteSuperior.setMediaNotas(9.5f);
		estudanteSuperior.setQtdAprovacoes("18");
		estudanteSuperior.setInstituicaoSegundoGrau("Fatec");
		estudanteSuperior.setAnoConclusaoSegundoGrau(2024);

		estudanteTecnico.setNome("EstudanteEtec");
		estudanteTecnico.setEmail("emailEtec@email.com.br");
		estudanteTecnico.setMediaNotas(7.8f);
		estudanteTecnico.setQtdAprovacoes("8");

		float PR_Superior = Math.round(controllerEstudanteSuperior.percentualRendimento(estudanteSuperior));
		float PP_Superior = controllerEstudanteSuperior.percentualProgressao(estudanteSuperior);

		float PR_Tecnico = controllerEstudanteTecnico.percentualRendimento(estudanteTecnico);
		float PP_Tecnico = controllerEstudanteTecnico.percentualProgressao(estudanteTecnico);

		//Exibindo Resultados
		System.out.printf(estudanteSuperior.toString());
		System.out.printf("PR: %.2f %n",+ PR_Superior);
		System.out.printf("PP: %.2f %n",+ PP_Superior);
		
		System.out.println();
		
		System.out.printf(estudanteTecnico.toString());
		System.out.printf("PR: %.2f %n",+ PR_Tecnico);
		System.out.printf("PP: %.2f %n",+ PP_Tecnico);
		
		
		
		
		
	}

}
