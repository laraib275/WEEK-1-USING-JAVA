public class VOWELS_CONSONANTS_COUNT {
    public static void main(String[] args) {
        String str="Welcome to land of hogwartssss";
        str=str.toLowerCase();
        int vcount=0;
        int ccount=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vcount++;
            } else if (str.charAt(i)>='a'&&str.charAt(i)<='z') {
                ccount++;
            }
        }
        System.out.println("numer of vowels are: " +  vcount);
        System.out.println("number of consonants : "+ccount);
    }
}
