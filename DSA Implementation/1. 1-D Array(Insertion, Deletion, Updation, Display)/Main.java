import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= s.nextInt();
        int c[] = new int[n];
        int d[] = new int[n+1];
        System.out.println("Enter elements of array for updation operation");
        for (int i=0;i<5;i++)
        {
            c[i] = s.nextInt();
        }
        System.out.println("Values are:");
        System.out.println("\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
        System.out.println("Enter index to be updated");
        int m= s.nextInt();
        System.out.println("Enter the value");
        int o = s.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i<m)
            {
                d[i]=c[i];
            }
            else if(i==m)
            {
                d[i]=o;
            }
            else
            { d[i]=c[i-1];}
        }
        System.out.println("Elements of array after updation areare:");
        for (int i=0;i<n+1;i++)
        {
            System.out.println(d[i]);
        }

        System.out.println("Enter size of array");
        int x= s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n-1];
        System.out.println("Enter elements of array for deletion operation");
        for (int i=0;i<x;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Values are:");
        System.out.println("\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter index to be deleted");
        int y= s.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if (i<y)
            {
                b[i]=a[i];
            }
            else if(i==m)
                continue;
            else
            {
                b[i-1]= a[i];
            }
        }
        System.out.println("Elements after deletion are");
        for(int i=0;i<n-1;i++)
        {
            System.out.println(b[i]);
        }
    }
}
