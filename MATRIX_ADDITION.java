import java.util.Scanner;

public class MATRIX_ADDITION {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and column for matrix 1 : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter rows and column for matrix 1 :");
        int c= sc.nextInt();
        int d= sc.nextInt();
        if((a==c)&&(b==d)){
            int[][] arr=new int[a][b];
            System.out.println("enter elements for matrix 1 : ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j]=sc.nextInt();
                }

            }
            int[][] arr2=new int[c][d];
            System.out.println("enter elements for matrix 2 : ");

            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    arr2[i][j]= sc.nextInt();
                }
            }
            int[][] sum=new int[a][b];

            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr2.length; j++){
                    sum[i][j]=arr[i][j]+arr2[i][j];
                    
                }
            }
             for(int i=0; i<a; i++){
                 for(int j=0; j<b; j++){
                      System.out.printum[i][j]+ " " );
                 }
                  System.out.println();
             }
        } else {
            System.out.println("Sum for this matrix cant be done. ");
        }

    }
}
