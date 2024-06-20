import java.util.LinkedList;
import java.util.Queue;

class BinaryST extends TreeCode {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertion(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = insertion(root.left, data);
        } else {
            root.right = insertion(root.right, data);
        }
        return root;
    }


    public static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public static boolean searching(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (root.data > value) {
            return searching(root.left, value);
        } else if (root.data < value) {
            return searching(root.right, value);
        } else {
            return true;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

        }
    }
}
