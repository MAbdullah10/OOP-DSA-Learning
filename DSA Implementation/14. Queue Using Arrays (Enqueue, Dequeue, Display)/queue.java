import java.util.Scanner;

class queue{
    int f=-1,r=-1;
    int n=10;
    int q[] = new int[n];
    void enqueue(Scanner sc)
    {
        System.out.println("Enter data: ");
        int sa = sc.nextInt();
        if(r==(n-1))
        {
            System.out.println("Overflow");
        }
        else {
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
                q[r]=sa;
            }
            else{
                r=r+1;
                q[r]=sa;
            }
            System.out.println("Item inserted");
        }
    }
    void dequeue(){
        if(f==-1 && r==-1)
        {
            System.out.println("Underflow");
        }
        else{
            f=f+1;
            System.out.println( "Item deleted");
        }
    }

    void display(){
        System.out.println("Outputs are:");
        for(int i=f;i<=r;i++)
        {
            System.out.println(q[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        queue s = new queue();
        int c,l;
        do {
            System.out.println("Enter 1 to enqueue");
            System.out.println("Enter 2 to dequeue");
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
