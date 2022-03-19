public class Node {
    private String person;
    private Node left = null;
    private Node right = null;

    public Node(String person) {
        this.person = person;
    }

    public Node getLeft() { return left; }
    public Node getRight() { return right; }
    public String getPerson() { return person; }

    public void setLeft(Node node) {
        left = node;
    }
    public void setRight(Node node) {
        right = node;
    }
}
