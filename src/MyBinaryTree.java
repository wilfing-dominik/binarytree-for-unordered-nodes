import java.util.ArrayList;
import java.util.Stack;

public class MyBinaryTree {
    private Node root = null;
    private int size = 0;

    public int getSize() { return size; }

    public void AddNode(Node newNode) { /*
                                         * Breadth First Search algoritmusos bejárás, új elem hozzáadásához olyan esetben,
                                         * amikor az elemek nagysága nem összehasonlítható (a cél a Bináris fa elveinek tartása)  */
        if (root == null) { /* Ha üres a fa akkor a az új elem lesz a gyökér elem  */
            root = newNode;
        }
        else { /* Ha a fának legaláb egy eleme van */
            Stack<Node> toVisit = new Stack<>(); // A még be nem járt elemek
            ArrayList<Node> visited = new ArrayList(); // A már bejárt elemek

            toVisit.add(root);

            while (toVisit != null) {
                Node currentNode = toVisit.pop();
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(newNode);
                    break;
                }
                else if (currentNode.getRight() == null) {
                    currentNode.setRight(newNode);
                    break;
                }
                else { /* Amikor a jelenleg vizsgált elem egyik gyermeke sem szabad, a gyermekek bekerülnek a vizsgálandó elemek közé  */
                    visited.add(currentNode);
                    if (currentNode.getRight() != null) { /* Azért van a nullosság ismét megvizsgálva, hogy tartható legyen a balról jobbra haladás */
                        toVisit.add(currentNode.getRight());
                    }
                    if (currentNode.getRight() != null) {
                        toVisit.add(currentNode.getLeft());
                    }
                }
            }
        }
        size +=1;
    }
}
