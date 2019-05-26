package com.anshu.practices.patterns.creation;

public class BinaryTree implements DataStructure {

	static class Node {
		private int value;
		private Node leftSubTree;
		private Node rightSubTree;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeftSubTree() {
			return leftSubTree;
		}

		public void setLeftSubTree(Node leftSubTree) {
			this.leftSubTree = leftSubTree;
		}

		public Node getRightSubTree() {
			return rightSubTree;
		}

		public void setRightSubTree(Node rightSubTree) {
			this.rightSubTree = rightSubTree;
		}

		private void display() {

			String leftSubtreeRoot = "left subtree root = ";
			if (this.getLeftSubTree() != null) {
				leftSubtreeRoot = leftSubtreeRoot + this.getLeftSubTree().getValue();
			} else {
				leftSubtreeRoot = leftSubtreeRoot + "null";
			}
			String rightSubtreeRoot = "right subtree root = ";
			if (this.getRightSubTree() != null) {
				rightSubtreeRoot = rightSubtreeRoot + this.getRightSubTree().getValue();
			} else {
				rightSubtreeRoot = rightSubtreeRoot + "null";
			}
			System.out.println("Node value = " + this.getValue() + " " + leftSubtreeRoot + " " + rightSubtreeRoot);
			if (this.getLeftSubTree() != null) {
				this.getLeftSubTree().display();
			}
			if (this.getRightSubTree() != null) {
				this.getRightSubTree().display();
			}
		}

	}

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void display() {
		this.root.display();
	}

}
