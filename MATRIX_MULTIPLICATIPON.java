import java.util.Scanner;

public class MATRIX_MULTIPLICATIPON {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and coloumn for matrix 1 : ");
        int m= sc.nextInt();
        int n= sc.nextInt();
        System.out.println("enter number of rows and coloumn for matrix 2 : ");
        int p= sc.nextInt();
        int q=sc.nextInt();
        if(n==p) {
            int[][] a1=new int[m][n];
            int[][] a2= new int[p][q];
            System.out.println("enter elements for matrix 1 : ");
            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    a1[i][j]=sc.nextInt();
                }
            }

             System.out.println("enter elements for matrix 2 : ");
            for(int i=0; i<p; i++) {
                for(int j=0; j<q; j++) {
                    a2[i][j]=sc.nextInt();
                }
            }

             int[][] mul=new int[m][q];

             for(int i=0; i<m ; i++) {
                     for(int j=0; j<q; j++) {
                         mul[i][j]=0;
                     
                     for(int k=0; k<n; k++){
                       mul[i][j] = mul[i][j] + a1[i][k]*a2[k][j];
                     }

             } }
             System.out.println("result of the multiplication : ");
              for(int i=0; i<m; i++) {
                  for(int j=0; j<q; j++){
                      System.out.print(mul[i][j] + " ");
                  }
                  System.out.println("");
              }
        } else {
            System.out.println("cant multiply");
        }
    }
}
