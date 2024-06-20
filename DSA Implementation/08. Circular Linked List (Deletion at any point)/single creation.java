import java.util.Scanner;
class single_creation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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
                n.next = head;
            } else {
                n.next = head;
                head = n;
                tail.next = head;
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
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }

            while (temp != head);
    }
    public void deletion(){
        Scanner s = new Scanner(System.in);
        System.out.println("if you delete an element from begining press 1, if from back press 2, else press 3");
        int m = s.nextInt();

        switch (m) {
            case 1:
                Node temp = head;
                temp = temp.next;
                head = temp;
                tail.next=temp;
                break ;
            case 2:
                Node temp1 = head;
                Node ptr = temp1.next;
                while (ptr.next != head) {
                    temp1 = ptr;
                    ptr = ptr.next;
                }
                temp1.next = null;
                tail=temp1;
                break;
            case 3:
                System.out.println("Enter the node you want to delete: ");
                int p=s.nextInt();
                Node temp2 = head;
                Node ptr1 = temp2.next;
                for(int i=1;i<(p-1);i++) {
                    temp2 = ptr1;
                    ptr1= ptr1.next;
                }
                temp2.next = ptr1.next;
                break;
        }
    }
    public static void main(String[] arg) {
        single_creation l = new single_creation();
        l.creation();
        l.display();
        l.deletion();
        l.display();
        l.deletion();
        l.display();
        l.deletion();
        l.display();
    }
}
