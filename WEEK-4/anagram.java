import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str="silnt";
        String str1="listen";
        //fisrt change to lower case
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        //sort the strings
        str=sort(str);
        str1=sort(str1);
        //check the equality of both the strings
        if(str.equals(str1)){
            System.out.println("the given strings are anagram");
        } else {
            System.out.println("not a anagramm");
        }

    }
   static String sort(String s1){
        char[] ch=s1.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            for (int j = i+1; j <ch.length ; j++) {
                if(ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        return new String(ch);
    }
}
