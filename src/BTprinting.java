
public class BTPrinting extends BinaryTree {
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void printRight() {
        printRight(root, 0);
    }

    private void printRight(Node node, int level) {
        if (node == null) {
            return;
        }

        if (level == maxLevel) {
            System.out.print(node.data + " ");
            maxLevel++;
        }

        printRight(node.right, level + 1);
        printRight(node.left, level + 1);
    }

    private int maxLevel = 0;

    }
}
