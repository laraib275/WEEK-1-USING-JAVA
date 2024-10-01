import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and coloumn for matrix 1 : ");
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] a1 = new int[m][n];
        System.out.println("enter elements for matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a1[i][j] =sc.nextInt();
            }
        }
        System.out.println("your matrix is in the form : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("transpose of the matrix are : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a1[j][i]+ " ");
            }
            System.out.println();

        }
    }
}
