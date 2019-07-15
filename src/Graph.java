import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private Node startNode;
	
	private Node endNode;
	
	private Node currentNode;
	
	private List<Node> unvisitedNodes = new ArrayList<>();
	
	private List<Edge> edges = new ArrayList<>();
	
	public Graph() {}
	
	public Graph(Node startNode, Node endNode, List<Edge> edges) {
		this.startNode = startNode;
		this.endNode = endNode;
		this.edges = edges;
	}
	
	
	
	public void findPath() {
		currentNode = startNode;
		while(!(currentNode.getNodeName() == endNode.getNodeName())) {
			System.out.println("Current Node : " + currentNode.getNodeName());
			String fromNodeName = null;
			List<Edge> tempEdgeList = findNeighbors(currentNode);
			for(Edge edge:tempEdgeList) {
				for(Node node: unvisitedNodes) {
					if( (node.getNodeName() != currentNode.getNodeName()) && (!isVisited(node)) ) {
						if(node.getNodeName() == edge.getToNode()) {
							int tempDistance = currentNode.getDistance() + edge.getDistance();
							if(node.getDistance()>tempDistance) {
								fromNodeName = edge.getFromNode();
								node.setDistance(tempDistance);
								node.setDistanceSetterEdgeNode(currentNode.getNodeName());
							}
						}
						
					}
					
				}//end of for unvisitedNodes
			}//end of for EdgeList
			int localDist = Integer.MAX_VALUE;
			String localNodeName = "";
			for(Node node: unvisitedNodes) {
				if(node.getDistance()<localDist && node.getNodeName() != currentNode.getNodeName()) {
					localDist = node.getDistance();
					localNodeName = node.getNodeName();
				}
			}
			Node tempNode = null;
			for(Node node : unvisitedNodes) {
				if(node.getNodeName().equals(currentNode.getNodeName())) {
					tempNode = node;
				}
			}
			unvisitedNodes.remove(tempNode);
			currentNode = findNodeByName(localNodeName);
			if(fromNodeName != null) {
				System.out.print("From To:" + fromNodeName + "------>");
			}
			System.out.println(currentNode.getNodeName());
			if(currentNode.getNodeName().equals(endNode.getNodeName())) {
				System.out.println("Final");
			}
			
		}// end of while
		
	}
	public Node findNodeByName(String nodeName) {
		for(Node nodeLocal: unvisitedNodes) {
			if(nodeLocal.getNodeName() == nodeName) {
				return nodeLocal;
			}
		}
		return null;
	}
	
	
	
	public boolean isVisited(Node node) {
		for(Node lNode: unvisitedNodes) {
			if(lNode.getNodeName() == node.getNodeName()) {
				return false;
			}
		}
		return true;
	}
	
	public List<Edge> findNeighbors(Node node) {
		List<Edge> localNeighbors = new ArrayList<>();
		for(Edge edge: edges) {
			if(edge.getFromNode() == node.getNodeName())
				localNeighbors.add(edge);
		}
		return localNeighbors;
	}
	
	public void populateNodeList() {
		unvisitedNodes.add(new Node("A",0,null));
		unvisitedNodes.add(new Node("B", Integer.MAX_VALUE, null));
		unvisitedNodes.add(new Node("C", Integer.MAX_VALUE, null));
		unvisitedNodes.add(new Node("D", Integer.MAX_VALUE, null));
		unvisitedNodes.add(new Node("E", Integer.MAX_VALUE, null));
		unvisitedNodes.add(new Node("F", Integer.MAX_VALUE, null));
	
	}
	
	
	
}
