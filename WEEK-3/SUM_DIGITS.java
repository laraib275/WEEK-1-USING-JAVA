public class SUM_DIGITS {
    public static void main(String[] args) {
        int n=239;
        System.out.println(sum_of_digits(n));
    }
    static int sum_of_digits(int n){
        int sum=0;
        int t=n;
        while(n!=0){
            int rem=n%10;
            sum=(sum)+rem;
            n=n/10;
        }
        return sum;
    }
}
