import java.util.Arrays;
import java.util.Scanner;

public class Kornislav {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] chosen = new int[4];
        for (int i = 0; i < 4; i++) {
            chosen[i] = in.nextInt();
        }
        Arrays.sort(chosen);
        System.out.println(chosen[0]*chosen[2]);
    }
}
