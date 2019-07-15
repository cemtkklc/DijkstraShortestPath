
public class Edge {
	
	private String fromNode;
	
	private String toNode;
	
	private int distance;
	public Edge() {
	}
	public Edge(String fromNode, String toNode, int distance) {
		this.fromNode = fromNode;
		this.toNode = toNode;
		this.distance = distance;
	}
	public String getFromNode() {
		return fromNode;
	}
	public void setFromNode(String fromNode) {
		this.fromNode = fromNode;
	}
	public String getToNode() {
		return toNode;
	}
	public void setToNode(String toNode) {
		this.toNode = toNode;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Edge [fromNode=" + fromNode + ", toNode=" + toNode + ", distance=" + distance + "]";
	}
	
	
	
	
	
}
