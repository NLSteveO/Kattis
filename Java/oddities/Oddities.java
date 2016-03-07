import java.util.Scanner;

public class Oddities {

    public static boolean isEven(int num) {
        int re = num % 2;
        if (re == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        while (number != 0) {
            int eo = in.nextInt();
            boolean temp;
            if (eo < 0) {
                temp = isEven(eo * -1);
            }
            else {
                temp = isEven(eo);
            }
            if (temp) {
                System.out.println(eo + " is even");
            }
            else {
                System.out.println(eo + " is odd");
            }
            number--;
        }
    }
}
