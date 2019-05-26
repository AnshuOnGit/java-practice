package anshu.goes.crazy.on.graphs;

import java.util.LinkedList;

public class Graph {

	private int v;

	private LinkedList<Integer>[] adjacencyList;

	Graph(int v) {
		this.v = v;
		adjacencyList = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjacencyList[i] = new LinkedList<Integer>();
		}
	}

	public void addDirectedEdge(int v, int w) {
		adjacencyList[v].add(w);
	}

	public void addUnDirectedEdge(int v, int w) {
		adjacencyList[v].add(w);
		adjacencyList[w].add(v);
	}

	public void bfsTraverse(int v) {
		boolean[] visited = new boolean[this.v];
		for (int i = 0; i < this.v; i++) {
			visited[i] = false;
		}

		LinkedList<Integer> queue = new LinkedList<>();

		queue.add(v);

		while (queue.size() != 0) {
			int elem = queue.poll();
			if (!visited[elem]) {
				visited[elem] = true;
				System.out.println(elem);
				queue.addAll(adjacencyList[elem]);
			}
		}

	}
	
	public void dfsutil(int v, boolean[] visited) {
		if(!visited[v]) {
			System.out.println(v);
			visited[v] = true;
		}
		dfsutil(adjacencyList[v].pop(), visited);
	}
	
	
	
	public void dfsTraverse(int v) {
		boolean[] visited = new boolean[this.v];
		for (int i = 0; i < this.v; i++) {
			visited[i] = false;
		}
		//dfsutil(v, visited);
		
		LinkedList<Integer> stack = new LinkedList();
		
		stack.push(v);
		
		while(!stack.isEmpty()) {
			Integer toVisit = stack.pop();
			if(!visited[toVisit]) {
				System.out.println(toVisit);
				visited[toVisit] = true;
				//stack.addAll(adjacencyList[toVisit]);
				adjacencyList[toVisit].stream().forEachOrdered(x -> stack.push(x));
			}
		}

	}

	public static void main(String[] args) {
		Graph g = new Graph(4);

		g.addDirectedEdge(0, 1);
		g.addDirectedEdge(0, 2);
		g.addDirectedEdge(1, 2);
		g.addDirectedEdge(2, 0);
		g.addDirectedEdge(2, 3);
		g.addDirectedEdge(3, 1);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.dfsTraverse(0);
	}
}
