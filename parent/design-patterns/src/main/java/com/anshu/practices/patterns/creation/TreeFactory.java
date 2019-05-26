package com.anshu.practices.patterns.creation;

import com.anshu.practices.patterns.creation.BinaryTree.Node;
import com.anshu.practices.patterns.utils.DectoBinary;

public class TreeFactory implements DataStructureFactory {

	public DataStructure create(Type type, int[] input) {
		switch (type) {
		case BINARY: {
			BinaryTree bt = new BinaryTree();
			Node rootNode = new Node();
			rootNode.setValue(input[0]);
			bt.setRoot(rootNode);

			for (int i = 1; i < input.length; i++) {
				Node node = new Node();
				node.setValue(input[i]);
				int navLength = (int) (Math.log(i + 1) / Math.log(2));
				int base = (int) Math.pow(2, navLength);
				if (i - base + 1 < 0) {
					System.out.println("caught == " + i + "---" + navLength + "---" + base);
				}
				int[] binMagicNumber = DectoBinary.getBinary(i - base + 1);
				Node tempLoc = bt.getRoot();

				int[] nav = new int[navLength];
				int count = binMagicNumber.length - 1;
				for (int j = navLength - 1; j >= 0; j--) {
					if (count >= 0) {
						nav[j] = binMagicNumber[count];
					} else {
						nav[j] = 0;
					}
					count--;
				}

				for (int p = 0; p < navLength - 1; p++) {
					if (nav[p] == 0) {
						tempLoc = tempLoc.getLeftSubTree();
					} else {
						tempLoc = tempLoc.getRightSubTree();
					}
				}

				if (nav[navLength - 1] == 0) {
					tempLoc.setLeftSubTree(node);
				} else {
					tempLoc.setRightSubTree(node);
				}
			}
			return bt;
		}
		default:
			return null;
		}
	}

}
