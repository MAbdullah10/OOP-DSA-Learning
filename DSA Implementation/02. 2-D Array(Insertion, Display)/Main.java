import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = s.nextInt();
        System.out.println("Enter number of columns: ");
        int m = s.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; i++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; i++) {
                System.out.println(a[i][j]+"");
            }
            System.out.println("\n");
        }
    }
}
