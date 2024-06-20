class heapSort {
    int[] heap;
    int heapSize=0;
    heapSort(int size){
        heap=new int[size];
    }
    boolean insertion(int value){
        if(isFull()) System.out.println("Heap is full");
        heap[heapSize++]=value;
        heapifyUp(heapSize-1);
        return false;
    }
    boolean isFull(){
        if(heapSize==heap.length-1)return true;
        return false;
    }
    int getMin(){return 0;}
    void getMax(){}
    void extractMin(){}
    void decreaseKey(){}
    void insert(){}
//void delete(){}

    public int delete() {
        int root = heap[0];
        // heap[--heapSize];
        heapifyDown(0);
        return root;
    }
    private void heapifyUp(int index){
        int parent=(index-1)/2;
        while (index > 0 && heap[index] > heap[parent]) {
            int temp = heap[index];
            heap[index] = heap[parent];
            heap[parent] = temp;
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index){
        while (leftChild(index) < heapSize) {
            int smallerChildIndex = leftChild(index);
//        if (rightChild(index) < heapSize && heap[rightChild(index)] < data[smallerChildIndex]) {
//            smallerChildIndex = rightChild(index);
//        }
            if (heap[index] > heap[smallerChildIndex]) {
                int temp = heap[index];
                heap[index] = heap[smallerChildIndex];
                heap[smallerChildIndex] = temp;
                index = smallerChildIndex;
            } else {
                break;
            }
        }
    }

    int size(){return 0; }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    public static void main(String[] args) {
        heapSort heapSort=new heapSort(10);
        heapSort.insertion(10);heapSort.insertion(30);heapSort.insertion(20);
        for (int i=0;i<=2;i++)System.out.println(heapSort.heap[i]);

    }
}
