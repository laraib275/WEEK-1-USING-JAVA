import java.util.Scanner;

public class PALINDROME_CHECH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="321123";
      palindrome(str);

    }

    static void palindrome(String str){
        String str2="";
        for (int i = 0; i < str.length(); i++) {
          str2=str2+str.charAt(i);

        }
        if(str2.equals(str)){
            System.out.println("is palindrome.  ");
        } else {
            System.out.println("not a palindrome. ");
        }

    }
}
