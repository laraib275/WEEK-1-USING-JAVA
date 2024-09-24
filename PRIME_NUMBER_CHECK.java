import java.util.Scanner;

public class PRIME_NUMBER_CHECK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n= sc.nextInt();

        System.out.println(isprime(n));
    }

    static int isprime(int n){
        int count=0;
        for(int i=2; i<=n/2; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            return 1;
        }
        return 0;
    }
}
