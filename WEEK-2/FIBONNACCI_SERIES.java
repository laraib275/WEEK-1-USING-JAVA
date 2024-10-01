import java.util.Scanner;

public class FIBONNACCI_SERIES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series of number to be printed: ");
        int n = sc.nextInt();
        System.out.println(0);
//        System.out.println(1);
        for (int i = 1; i <=n; i++) {
            System.out.println(fibonacci(i));
        }
    }
       static int fibonacci(int n){
        int sum, x=0, y=1;
        if(n==0){
            return x;
        }

         for (int i = 2; i <=n ; i++) {
               sum=x+y;
               x=y;
               y=sum;
           }
           return y;

       }

}
