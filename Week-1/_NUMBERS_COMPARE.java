import java.util.Scanner;

public class _NUMBERS_COMPARE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter yopur three numbers : ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int ans=largest(a,b,c);
        System.out.println(ans);
    }
    static int largest(int a, int b, int c){
        int maxx=a;
        if(b>maxx && b>c){
            maxx=b;
        } else if (c>maxx && c>b) {
            maxx=c;
        } return maxx;

    }
}
