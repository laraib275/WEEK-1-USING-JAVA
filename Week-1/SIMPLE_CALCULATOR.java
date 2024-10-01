import java.util.Scanner;

public class SIMPLE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your two numbers: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum of two numbers are " + sum(a,b));
        System.out.println("difference of two numbers : " + substract(a,b));
        System.out.println("product of two numbers : " + multiply(a,b)) ;
        System.out.println("diffwerence of two numbers : " + divide(a, b));
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int substract(int a, int b){
        return a-b;
    }
    static int multiply(int a, int b) {
        return a*b;
    }
    static int divide(int a, int b) {
        return a/b;
    }
}
