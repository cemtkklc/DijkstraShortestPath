import java.util.ArrayList;
import java.util.List;

public class DemoApp {

	
	
	public static void main(String[] args) {
	
		List<Edge> edgeList = new ArrayList<>();
		edgeList.add(new Edge("A", "B", 4));
		edgeList.add(new Edge("A", "C", 2));
		edgeList.add(new Edge("B", "D", 5));
		edgeList.add(new Edge("B", "C", 1));
		edgeList.add(new Edge("C", "D", 8));
		edgeList.add(new Edge("C", "E", 10));
		edgeList.add(new Edge("D", "E", 2));
		edgeList.add(new Edge("E", "F", 5));
		edgeList.add(new Edge("D", "F", 6));

		Node startNode = new Node("A", 0, null);

		Node endNode = new Node("F", Integer.MAX_VALUE, null);
		
		Graph graph = new Graph(startNode,endNode,edgeList);
		graph.populateNodeList();
		graph.findPath();
		
		
		
	}

	
}
