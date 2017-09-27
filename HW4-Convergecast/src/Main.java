
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Part 1, update root value with max values from all the nodes
		Node root = new Node(2);
		Node node1 = new Node(7);
		Node node2 = new Node(5);
		Node node3 = new Node(2);
		Node node4 = new Node(6);
		Node node5 = new Node(5);
		Node node6 = new Node(11);
		Node node7 = new Node(9);
		Node node8 = new Node(4);

		// Initialize the tree
		root.setLeftChild(node1);
		root.setRightChild(node2);
		node1.setLeftChild(node3);
		node1.setRightChild(node4);
		node2.setLeftChild(null);
		node2.setRightChild(node7);
		node7.setLeftChild(node8);
		node7.setRightChild(null);
		node3.setLeftChild(null);
		node3.setRightChild(null);
		node4.setLeftChild(node5);
		node4.setRightChild(node6);
		node5.setLeftChild(null);
		node5.setRightChild(null);
		node6.setLeftChild(null);
		node6.setRightChild(null);
		
		int max = root.convergeFromChildren();
		System.out.println("Part 1: ");
		System.out.println("Max from all nodes: " + max);
		System.out.println("Value at root: " + root.getValue());

		// Part 2, the root has all values of all the nodes concatenated
		root = new Node(2);
		node1 = new Node(7);
		node2 = new Node(5);
		node3 = new Node(2);
		node4 = new Node(6);
		node5 = new Node(5);
		node6 = new Node(11);
		node7 = new Node(9);
		node8 = new Node(4);
		// Initialize the tree again
		root.setLeftChild(node1);
		root.setRightChild(node2);
		node1.setLeftChild(node3);
		node1.setRightChild(node4);
		node2.setLeftChild(null);
		node2.setRightChild(node7);
		node7.setLeftChild(node8);
		node7.setRightChild(null);
		node3.setLeftChild(null);
		node3.setRightChild(null);
		node4.setLeftChild(node5);
		node4.setRightChild(node6);
		node5.setLeftChild(null);
		node5.setRightChild(null);
		node6.setLeftChild(null);
		node6.setRightChild(null);		
		
		System.out.println("Part 2: ");
		String concatString = root.concatValuesFromChildren();
		System.out.println("Concat string from all nodes: " + concatString);
	}

}
