class AVLTree {
    private int key, height;
    private AVLTree left, right;
    public static final AVLTree NIL = new AVLTree();

    public AVLTree(int key) {
        this.key = key;
        left = right = NIL;

    }

    public boolean add(int key) {
        int oldSize = size();
        grow(key);
        return size() > oldSize;
    }

    public AVLTree grow(int key) {
        if (this == NIL) return new AVLTree(key);
        if (key == this.key) return this;
        if (key < this.key) left = left.grow(key);
        else right = right.grow(key);
        reBalance();
        height = 1 + Math.max(left.height, right.height);
        return this;
    }

    public boolean isAVLTree() {
        return Math.abs(left.height - right.height) <= 1;
    }

    public boolean contains(int x) {
        if (this == NIL) return false;
        if (x == key) return true;
        if (x < key) return left.contains(x);
        else return right.contains(x);
    }

    public AVLTree(int[] a) {
        for (int x : a) {
            add(x);
        }
    }

    public int size() {
        if (this == NIL) return 0;
        return 1 + left.size() + right.size();
    }

    public String toString() {
        if (this == NIL) return "";
        return left + " " + key + " " + right;
    }

    private AVLTree() {
        left = right = this;
        height = -1;
    }

    private AVLTree(int key, AVLTree left, AVLTree right) {
        this.key = key;
        this.left = left;
        this.right = right;
        height = 1 + Math.max(left.height, right.height);
    }

    private void reBalance() {
        if (right.height > left.height + 1) {
            if (right.left.height > right.right.height) right.rotateRight();
            rotateLeft();
        } else if (left.height > right.height + 1) {
            if (left.right.height > left.left.height) left.rotateLeft();
            rotateRight();
        }
    }

    private void rotateLeft() {
        left = new AVLTree(key, left, right.left);
        key = right.key;
        right = right.right;
    }

    void preOrder(AVLTree top) {
        if (top == NIL) return;
        System.out.println(top.key);
        preOrder(top.left);
        preOrder(top.right);
    }

    private void rotateRight() {
        right = new AVLTree(key, left.right, right);
        key = left.key;
        left = left.left;
    }

    public int getHeight(int key) {
        if (this.key == key) return height;
        return -1;
    }

    AVLTree getLeft() {
        return left;
    }

    AVLTree getRight() {
        return right;
    }

    int getRoot() {
        return this.key;
    }

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree(50);
        avlTree.add(30);
        avlTree.add(45);
        avlTree.add(55);
        avlTree.add(60);
        System.out.println(avlTree);    // when we pass object in sout toString method run
        avlTree.preOrder(avlTree);
        System.out.println("Is AVL Tree: " + avlTree.isAVLTree());
    }
}
