import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class tree {
    int target;
    static Node root;

    public tree(int target) {
        this.target = target;
    }

    static void insertion(Node node, int data) {
        if (node == null) {
            root = new Node(data);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        while (!q.isEmpty()) {
            node = q.peek();
            q.remove();

            if (node.left == null) {
                node.left = new Node(data);
                break;
            } else
                q.add(node.left);
            if (node.right == null) {
                node.right = new Node(data);
                break;
            } else
                q.add(node.right);
        }
    }
    static void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }
    static void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data + " ");
    }
    public static Node iterative_bfs(Node root, int target) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.data == target) {
                System.out.println("Node containing target value " + target + " found with value " + current.data);
                return current;
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        System.out.println("Node containing target value " + target + " not found");
        return null;
    }
    public static Node leftNode(Node current){

        return current.left;
    }
    public Node rightNode(Node current){

        return current.right;
    }


    public static void main(String[] args)
    {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println("IN ORDER");
        inOrder(root);
        System.out.println("\n");
        System.out.println("PRE ORDER");
        preOrder(root);
        System.out.println("\n");
        System.out.println("POST ORDER");
        postOrder(root);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value you want to search by iterative BFS method");
        int target = sc.nextInt();
        iterative_bfs(root,target);

    }
}

