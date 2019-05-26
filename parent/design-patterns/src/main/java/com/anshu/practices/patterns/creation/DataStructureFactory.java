package com.anshu.practices.patterns.creation;

public interface DataStructureFactory {
	
	DataStructure create(Type type, int[] input);

}
