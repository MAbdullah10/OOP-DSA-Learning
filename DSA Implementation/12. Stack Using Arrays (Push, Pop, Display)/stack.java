import java.util.Scanner;

class stack{
    int top=-1;
    int n=10;
    int a[] = new int[n];
    void push(Scanner sc)
    {
        System.out.println("Enter data: ");
        int sa = sc.nextInt();
        if(top==(n-1))
        {
            System.out.println("Overflow");
        }
        else {

            top=top+1;
            a[top]=sa;
            System.out.println("Item inserted");
        }
    }
        void pop(){
        if(top==-1)
            {
            System.out.println("Underflow");
            }
        else{
            top =top-1;
            System.out.println( "Item deleted");
            }
        }

    void display(){
        System.out.println("Outputs are:");
        for(int i=top;i>=0;i--)
        {
            System.out.println(a[i]);
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
