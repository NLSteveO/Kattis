import java.util.Scanner;

public class Cold {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (in.nextInt() < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
