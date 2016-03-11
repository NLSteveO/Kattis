import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = in.nextInt();
        int denominator = in.nextInt();
        while (numerator != 0 && denominator != 0) {
            int whole = numerator/denominator;
            numerator -= whole*denominator;
            System.out.println(whole + " " + numerator + " / " + denominator);
            numerator = in.nextInt();
            denominator = in.nextInt();
        }
    }
}
