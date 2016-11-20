import java.util.Scanner;

public class Rijeci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int prev = 0;
        int curr = 1;
        for (int i = 1; i < num; i++) {
            int tmp = prev + curr;
            prev = curr;
            curr = tmp;
        }
        System.out.println(prev + " " + curr);
    }
}
