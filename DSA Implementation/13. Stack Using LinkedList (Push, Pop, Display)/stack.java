import java.util.Scanner;

class stack{
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
    Node top = null;
    void push(Scanner sc)
    {
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        Node n = new Node(data);
        if(top==null)
        {
            top = n;
        }
        else {
            n.next=top;
            top=n;
        }
    }
        void pop(){
        if(top==null)
            {
            System.out.println("Underflow");
            }
        else{
            top = top.next;
            System.out.println( "Item deleted");
            }
        }
    void display(){
        System.out.println("Outputs are:");
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int c,l;
        do {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to display");
            System.out.println("Enter your choice");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    s.push(sc);
                    break;
                case 2:
                    s.pop();
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
