import java.util.Scanner;
class single_creation {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=  null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data, a;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            data = s.nextInt();
            Node n = new Node(data);
            if (head == null) {
                head = n;
                tail = n;
            } else {
                head.prev= n;
                n.next = head;
                head = n;
            }
            System.out.println("To enter again press 1: ");
            a = s.nextInt();
        }
        while (a == 1);
    }
    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
    }

    public static void main(String[] arg) {
        single_creation l = new single_creation();
        l.creation();
        l.display();
    }
}
