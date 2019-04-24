package br.ufal.ic.ppgi.cosmos.feedback.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.cosmos.feedback.spec.dt.CommentDT;;

public interface ICommentOps {
	public CommentDT comentarEstilo(int styleId, CommentDT comment);
	public CommentDT comentarProjeto(int projectId, CommentDT comment);
	public List<CommentDT> obterComentariosEstilo(int styleId);
	public List<CommentDT> obterComentariosProjeto(int projectId);
	public CommentDT obterComentario(int commentId);
	public CommentDT alterarComentario(int commentId, CommentDT comment);
	public void excluirComentario(int commentId);
}
