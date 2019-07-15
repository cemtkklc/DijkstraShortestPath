
public class Node {

	private String nodeName;
	
	private int distanceFromStart = Integer.MAX_VALUE;
	
	private String distanceSetterEdgeNode;
	
	
	public Node(String nodeName,int distance,String distanceSetterEdgeNode ) {
		this.nodeName = nodeName;
		this.distanceFromStart = distance;
		this.distanceSetterEdgeNode = distanceSetterEdgeNode;
		
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	


	public String getDistanceSetterEdgeNode() {
		return distanceSetterEdgeNode;
	}

	public void setDistanceSetterEdgeNode(String distanceSetterEdgeNode) {
		this.distanceSetterEdgeNode = distanceSetterEdgeNode;
	}

	public int getDistance() {
		return distanceFromStart;
	}

	public void setDistance(int distance) {
		this.distanceFromStart = distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distanceFromStart;
		result = prime * result + ((distanceSetterEdgeNode == null) ? 0 : distanceSetterEdgeNode.hashCode());
		result = prime * result + ((nodeName == null) ? 0 : nodeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (distanceFromStart != other.distanceFromStart)
			return false;
		if (distanceSetterEdgeNode == null) {
			if (other.distanceSetterEdgeNode != null)
				return false;
		} else if (!distanceSetterEdgeNode.equals(other.distanceSetterEdgeNode))
			return false;
		if (nodeName == null) {
			if (other.nodeName != null)
				return false;
		} else if (!nodeName.equals(other.nodeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Node [nodeName=" + nodeName + ", distanceFromStart=" + distanceFromStart + ", distanceSetterEdgeNode="
				+ distanceSetterEdgeNode + "]";
	}
	
	
	
	
}
