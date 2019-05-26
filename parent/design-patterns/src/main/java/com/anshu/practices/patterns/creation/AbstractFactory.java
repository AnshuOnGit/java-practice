package com.anshu.practices.patterns.creation;

public class AbstractFactory {

	public DataStructureFactory getFactory(DataStructureType DSType) {
		switch (DSType) {
		case TREE:
			return new TreeFactory();
		default:
			return null;
		}
	}

	private AbstractFactory() {
	}

	private volatile static AbstractFactory instance;

	public static AbstractFactory getInstance() {
		if (instance == null) {
			synchronized (AbstractFactory.class) {
				if(instance == null) {
					instance = new AbstractFactory();
				}
			}
			
		}
		return instance;
	}

}
