import java.util.Scanner;
class single_creation
{
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;
    public void insertion() {
        int data,a,m;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Enter data: ");
            data = s.nextInt();
            Node n = new Node(data);
            if (head == null) {
                head = n;
            } else {
                System.out.println("Enter 1 to insert at beginning enter 2 to insert at end and enter 3 to insert at a particular location");
                m=s.nextInt();
                switch (m)
                {
                    case 1:
                        n.next=head;
                        head.prev=n;
                        head=n;
                        break;
                    case 2:
                        tail.next = n;
                        n.prev = tail;
                        tail = n;
                        break;
                    case 3:
                        System.out.println("Enter the position: ");
                        int p =s.nextInt();
                        Node temp1=head;
                        Node ptr=temp1.next;
                        for(int i=1;i<(p-1);i++)
                        {
                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        n.prev=temp1;
                        n.next= ptr;
                        ptr.prev=n;
                        temp1.prev=n;
                        n.next=temp1.next;
                        temp1.next=n;
                        break;
                }
            }
            System.out.println("To enter again press 1: ");
            a = s.nextInt();
        }
        while (a == 1) ;
    }
    public void display()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp =temp.next;
            }
    }

    public static void main(String[] arg)
    {
        single_creation l =new single_creation();
        l.insertion();
        l.display();
        l.insertion();
        l.display();
        l.insertion();
        l.display();
        l.insertion();
        l.display();
    }
}
