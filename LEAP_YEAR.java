import java.util.Scanner;

public class LEAP_YEAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(check(year));
    }

    static int check(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("not a leap year. ");
        }
        return 0;
    }
}
