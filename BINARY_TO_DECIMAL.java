public class BINARY_TO_DECIMAL {
    public static void main(String[] args) {
        int n=101;
        int sum=0;
        int i=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*(int)Math.pow(2,i));
            n=n/10;
            i++;
        }
        System.out.println(sum);
    }
}
