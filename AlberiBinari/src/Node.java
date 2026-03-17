public class Node {
    int value;
    Node left;
    Node right;
    Node parent; 

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}