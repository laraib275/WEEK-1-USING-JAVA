import java.util.Scanner;

public class EVEN_ODD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println("The given number is even. ");
        }
        System.out.println("The given number is odd.");
    }
}
