import java.util.Scanner;

public class REVERSE_OF_NUMBER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(reverse(n));
    }
    static int reverse(int n){
        int sum=0;
        while(n!=0){
            int x=n%10;
            sum=(sum*10)+x;
            n=n/10;
        }
        return sum;
    }
}
