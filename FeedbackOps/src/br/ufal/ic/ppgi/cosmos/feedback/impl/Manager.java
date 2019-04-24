package br.ufal.ic.ppgi.cosmos.feedback.impl;

import java.util.HashMap;
import java.util.Set;

import br.ufal.ic.ppgi.cosmos.feedback.spec.prov.IManager;

public class Manager implements IManager {

	private HashMap<String, Object> providedInterfaces;
	private HashMap<String, Object> requiredInterfaces;
	
	// Construtor
	public Manager() {
		this.providedInterfaces = new HashMap<>();
		this.requiredInterfaces = new HashMap<>();
		// Adiciona as interfaces providas
		this.providedInterfaces.put("IFeedbackOps", new FacadeFeedbackOps(this));
		this.providedInterfaces.put("ICommentOps", new FacadeCommentOps(this));
	}
	
	@Override
	public Set<String> getProvidedInterfaces() {
		return this.providedInterfaces.keySet();
	}

	@Override
	public Set<String> getRequiredInterfaces() {
		return this.requiredInterfaces.keySet();
	}

	@Override
	public Object getProvidedInterface(String interfaceName) {
		return this.providedInterfaces.get(interfaceName);
	}

	@Override
	public void setRequiredInterface(String interfaceName, Object interfaceObject) {
		this.requiredInterfaces.put(interfaceName, interfaceObject);
	}

	@Override
	public Object getRequiredInterface(String interfaceName) {
		return this.requiredInterfaces.get(interfaceName);
	}

}
