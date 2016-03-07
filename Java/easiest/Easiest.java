import java.util.Scanner;

public class Easiest {

    public static int sumOfDigits(int num) {
        String numString = Integer.toString(num);
        int length = numString.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(numString.substring(i, i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        while (number != 0) {
            int sum = sumOfDigits(number);
            for (int i = 11; i < 100000; i++) {
                if (sumOfDigits(number*i) == sum ){
                    System.out.println(i);
                    break;
                }
            }
            number = in.nextInt();
        }
    }
}
