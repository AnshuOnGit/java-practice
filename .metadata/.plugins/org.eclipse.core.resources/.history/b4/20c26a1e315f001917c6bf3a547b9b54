package anshu.goes.crazy.on.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

	static class Node {
		private int value;
		private Node leftsubTree;
		private Node rightsubTree;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeftsubTree() {
			return leftsubTree;
		}

		public void setLeftsubTree(Node leftsubTree) {
			this.leftsubTree = leftsubTree;
		}

		public Node getRightsubTree() {
			return rightsubTree;
		}

		public void setRightsubTree(Node rightsubTree) {
			this.rightsubTree = rightsubTree;
		}

		Node(int value) {
			this.value = value;
		}
	}

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	BinaryTree(Node node) {
		this.root = node;
	}
	
	public List<Integer> inorderTraversal() {
		List<Integer> nodes = new ArrayList<>();
		inorderTraversal(nodes, this.root);
		return nodes;
	}
	
	private void inorderTraversal(List<Integer> listOfNodes, Node node ) {
		if(node.getLeftsubTree() == null && node.getRightsubTree() == null) {
			listOfNodes.add(node.getValue());
		}else if(node.leftsubTree == null && node.getRightsubTree() != null) {
			listOfNodes.add(node.getValue());
			inorderTraversal(listOfNodes, node.getRightsubTree());
		}else if(node.leftsubTree != null && node.getRightsubTree() == null) {
			inorderTraversal(listOfNodes, node.getLeftsubTree());
			listOfNodes.add(node.getValue());
		}else {
			inorderTraversal(listOfNodes, node.getLeftsubTree());
			listOfNodes.add(node.getValue());
			inorderTraversal(listOfNodes, node.getRightsubTree());
		}
	}
	
	public List<Integer> preorderTraversal(){
		List<Integer> nodes = new ArrayList<>();
		preorderTraversal(nodes, this.root);
		return nodes;
	}
	
	private void preorderTraversal(List<Integer> listOfNodes, Node node ) {
		if(node.getLeftsubTree() == null && node.getRightsubTree() == null) {
			listOfNodes.add(node.getValue());
		}else if(node.leftsubTree == null && node.getRightsubTree() != null) {
			listOfNodes.add(node.getValue());
			preorderTraversal(listOfNodes, node.getRightsubTree());
		}else if(node.leftsubTree != null && node.getRightsubTree() == null) {
			listOfNodes.add(node.getValue());
			preorderTraversal(listOfNodes, node.getLeftsubTree());			
		}else {
			listOfNodes.add(node.getValue());
			preorderTraversal(listOfNodes, node.getLeftsubTree());
			preorderTraversal(listOfNodes, node.getRightsubTree());
		}
	}
	
	public List<Integer> nodesAtDistanceK(int k, Node node){
		List<Integer> nodes = new ArrayList<>();
		nodesAtDistanceK(k, node, nodes);
		return nodes;
	}
	
	private void nodesAtDistanceK(int k, Node node, List<Integer> listOfNodes) {
		if(k==0) {
			listOfNodes.add(node.getValue());
		}else {
			if(node.getLeftsubTree() != null)
			nodesAtDistanceK(k-1, node.getLeftsubTree(), listOfNodes);
			if(node.getRightsubTree() != null)
			nodesAtDistanceK(k-1, node.getRightsubTree(), listOfNodes);
		}
	}
	
	public static void main(String[] args) {
		Node node = new Node(2);
		Node node1 = new Node(3);
		Node node2 = new Node(4);
		Node node3 = new Node(5);
		Node node4 = new Node(6);
		Node node5 = new Node(7);
		
		node1.setLeftsubTree(node3);
		node1.setRightsubTree(node5);
		node.setLeftsubTree(node1);
		node.setRightsubTree(node2);
		node2.setRightsubTree(node4);
		
		
		BinaryTree bt = new BinaryTree(node);
		List<Integer> listOfNodes = bt.nodesAtDistanceK(1, node1);
		listOfNodes.stream().forEach(x -> System.out.println(x));
		
	}

}
