package br.ufal.ic.ppgi.cosmos.feedback.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.cosmos.feedback.spec.dt.OpinionDT;;

public interface IFeedbackOps {
	public OpinionDT fornecerOpiniao(int projectId, OpinionDT opinion);
	public List<OpinionDT> obterOpinioesProjeto(int projectId);
	public OpinionDT obterOpiniao(int opinionId);
	public OpinionDT alterarOpiniao(int opinionId, OpinionDT opinion);
	public void excluirOpiniao(int opinionId);
}
