public class DECIMAL_TO_BINARY {
    public static void main(String[] args) {
        int n=23;
        int sum;
        String str="";
        while(n!=0){
            int rem=n%2;
            str=rem+str;
            n=n/2;

        }
        System.out.println(str+ " ");
    }
}
