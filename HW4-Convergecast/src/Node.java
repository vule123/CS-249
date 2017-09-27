
public class Node {

	private int value;
	private String concatnatedValues;
	private Node rightChild;
	private Node leftChild;
	private Node parent;

	public Node(int val) {
		value = val;
	}

	public void setRightChild(Node rChild) {
		if (rChild != null) {
			rightChild = rChild;
			rightChild.setParent(this);
		}
	}

	public void setLeftChild(Node lChild) {
		if (lChild != null) {
			leftChild = lChild;
			leftChild.setParent(this);
		}
	}

	public void setParent(Node par) {
		parent = par;
	}

	public int getValue() {
		return value;
	}

	public String getConcatenatedValues() {
		return concatnatedValues;
	}
	
	public int convergeFromChildren() {
		if (leftChild == null && rightChild == null) {
			return value;
		}
		int maxFromChildren;
		if (leftChild == null) {
			maxFromChildren = rightChild.convergeFromChildren();
		} else if (rightChild == null) {
			maxFromChildren = leftChild.convergeFromChildren();
		} else {
			maxFromChildren = Math.max(leftChild.convergeFromChildren(), rightChild.convergeFromChildren());
		}
		
		value = Math.max(maxFromChildren, value);
		return value;
	}
	
	public String concatValuesFromChildren() {
		if (leftChild == null && rightChild == null) {
			return String.valueOf(value);
		}
		String concatStringFromChildren = null;
		if (leftChild == null) {
			concatStringFromChildren = rightChild.concatValuesFromChildren();
		} else if (rightChild == null) {
			concatStringFromChildren = leftChild.concatValuesFromChildren();
		} else {
			concatStringFromChildren = leftChild.concatValuesFromChildren() + rightChild.concatValuesFromChildren();
		}
		concatnatedValues = String.valueOf(value) + concatStringFromChildren;
		return concatnatedValues;
	}
}

