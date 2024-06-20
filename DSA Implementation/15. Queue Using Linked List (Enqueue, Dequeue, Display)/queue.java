import java.util.Scanner;

class queue{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node r= null;
    Node f= null;
    void enqueue(Scanner sc)
    {
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        Node n = new Node(data);
        if(f==null)
        {
            f = n;
            r = n;
        }
        else {
            r.next=n;
            r=n;
        }
    }
    void dequeue(){
        if(f==null)
        {
            System.out.println("Underflow");
        }
        else{
            f=f.next;
            System.out.println( "Item deleted");
        }
    }
    void display(){
        System.out.println("Outputs are:");
        Node temp=f;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue s = new queue();
        int c,l;
        do {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to display");
            System.out.println("Enter your choice");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    s.enqueue(sc);
                    break;
                case 2:
                    s.dequeue();
                    break;
                case 3:
                    s.display();
                    break;
            }
            System.out.println("Enter 0 to go back to main menu");
            System.out.println("Enter any key to exit");
            l= sc.nextInt();
        } while (l== 0) ;
        System.out.println("Exit successfully");
    }
}
