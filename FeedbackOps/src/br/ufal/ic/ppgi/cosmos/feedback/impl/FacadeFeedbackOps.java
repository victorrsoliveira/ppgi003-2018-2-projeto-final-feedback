package br.ufal.ic.ppgi.cosmos.feedback.impl;

import java.util.List;

import br.ufal.ic.ppgi.cosmos.feedback.spec.dt.OpinionDT;
import br.ufal.ic.ppgi.cosmos.feedback.spec.prov.IFeedbackOps;
import br.ufal.ic.ppgi.cosmos.feedback.spec.prov.IManager;

public class FacadeFeedbackOps implements IFeedbackOps {

	private IManager manager;
	// TODO Adicionar interfaces requeridas necessarias para implementacao
	// dos metodos abaixo
	
	// Construtor
	public FacadeFeedbackOps(IManager manager) {
		this.manager = manager;
	}
	
	// TODO Implementar todos os metodos a seguir
	@Override
	public OpinionDT fornecerOpiniao(int projectId, OpinionDT opinion) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public List<OpinionDT> obterOpinioesProjeto(int projectId) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public OpinionDT obterOpiniao(int opinionId) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public OpinionDT alterarOpiniao(int opinionId, OpinionDT opinion) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public void excluirOpiniao(int opinionId) {
		// TODO Implementar metodo

	}

}
