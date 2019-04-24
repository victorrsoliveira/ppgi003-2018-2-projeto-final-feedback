package br.ufal.ic.ppgi.cosmos.feedback.impl;

import br.ufal.ic.ppgi.cosmos.feedback.spec.prov.IManager;

public class ComponentFactory {

	private static IManager manager = null;
	
	private ComponentFactory() {
		// Esta classe sera Singleton
	}
	
	// Factory method
	public static IManager createInstance() {
		if (manager == null) {
			manager = new Manager();
		}
		return manager;
	}
}
