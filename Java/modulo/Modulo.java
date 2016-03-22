import java.util.Scanner;

public class Modulo {
    public static boolean contains(int val, int[] list) {
        for (int x : list) {
            if (x == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] unique = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int count = 1;
        unique[0] = in.nextInt() % 42;
        while (in.hasNextInt()) {
            int remainder = in.nextInt() % 42;
            if (!contains(remainder, unique)) {
                unique[count] = remainder;
                count++;
            }
        }
        System.out.println(count);
    }
}
