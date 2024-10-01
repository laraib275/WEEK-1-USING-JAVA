import java.util.Scanner;

public class FACTORIAL_OF_NUMBER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n= sc.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int n){
       if(n==0){
           return 1;
       }
       return n*fact(n-1);

}
}
