package com.anshu.practices.patterns.creation;

public class App {

	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactory.getInstance();
		DataStructureFactory treeFactory = factory.getFactory(DataStructureType.TREE);
		int[] input = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		DataStructure binaryTree = treeFactory.create(Type.BINARY, input);
		binaryTree.display();
	}

}
