public class Main {
    public static void main(String[] args) {
        MyBinaryTree bt = new MyBinaryTree();
        bt.AddNode(new Node("Anna"));
        bt.AddNode(new Node("Béla"));
        bt.AddNode(new Node("Ádám"));

        bt.AddNode(new Node("Dominik"));

        System.out.println(bt.getSize());
        //System.out.println(bt.root.getPerson());
        //System.out.println(bt.root.getLeft().getPerson());
        //System.out.println(bt.root.getRight().getPerson());
        //System.out.println(bt.root.getLeft().getRight().getPerson());
    }
}
