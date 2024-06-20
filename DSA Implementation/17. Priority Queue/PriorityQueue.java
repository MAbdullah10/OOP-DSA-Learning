class PriorityQueue1 {
    private Node root;
    public PriorityQueue1() {
        this.root = null;
    }
    public void add(int value) {
        Node node = new Node(value);

        if (this.root == null) {
            this.root = node;
        } else {
            add(node, this.root);
        }
    }

    private void add(Node node, Node current) {
        if (node.value > current.value) {
            if (current.left == null) {
                current.left = node;
            } else {
                add(node, current.left);
            }
        } else {
            if (current.right == null) {
                current.right = node;
            } else {
                add(node, current.right);
            }
        }
    }
    public int peek() {
        return this.root.value;
    }
    public int poll() {
        int value = this.root.value;
        this.root = remove(this.root);

        return value;
    }
    private Node remove(Node node) {
        if (node.left == null && node.right == null) {
            return null;
        } else if (node.left == null) {
            return node.right;
        } else if (node.right == null) {
            return node.left;
        } else {
            Node successor = getSuccessor(node);
            successor.left = node.left;
            successor.right = node.right;

            return successor;
        }
    }

    private Node getSuccessor(Node node) {
        if (node.right == null) {
            return node.left;
        }

        Node current = node.right;
        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    private class Node {

        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        PriorityQueue1 queue = new PriorityQueue1();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("The peek value is " + queue.peek());
        System.out.println("The poll value is " + queue.poll());
        System.out.println("The peek value is " + queue.peek());
        System.out.println("The poll value is " + queue.poll());
        System.out.println("The peek value is " + queue.peek());
        System.out.println("The poll value is " + queue.poll());

        System.out.println("Is the queue empty? " + queue.isEmpty());

    }
}
