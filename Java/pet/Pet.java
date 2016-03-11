import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sums = new int[5];
        int winner = 0;
        for (int i = 0; i < 5; i++) {
            String[] splitLine = (in.nextLine()).split("\\s");
            for (String score : splitLine) {
                sums[i] += Integer.parseInt(score);
            }
            if (sums[i] > sums[winner]) {
                winner = i;
            }
        }
        System.out.println((winner+1) + " " + sums[winner]);
    }
}
