package br.ufal.ic.ppgi.cosmos.feedback.impl;

import java.util.List;

import br.ufal.ic.ppgi.cosmos.feedback.spec.dt.CommentDT;
import br.ufal.ic.ppgi.cosmos.feedback.spec.prov.ICommentOps;
import br.ufal.ic.ppgi.cosmos.feedback.spec.prov.IManager;

public class FacadeCommentOps implements ICommentOps {

	private IManager manager;
	// TODO Adicionar interfaces requeridas necessarias para implementacao
	// dos metodos abaixo
	
	// Construtor
	public FacadeCommentOps(IManager manager) {
		this.manager = manager;
	}
	
	// TODO Implementar todos os metodos a seguir
	@Override
	public CommentDT comentarEstilo(int styleId, CommentDT comment) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public CommentDT comentarProjeto(int projectId, CommentDT comment) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public List<CommentDT> obterComentariosEstilo(int styleId) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public List<CommentDT> obterComentariosProjeto(int projectId) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public CommentDT obterComentario(int commentId) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public CommentDT alterarComentario(int commentId, CommentDT comment) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public void excluirComentario(int commentId) {
		// TODO Implementar metodo

	}

}
