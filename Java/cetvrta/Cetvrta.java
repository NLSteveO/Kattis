import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] rectangles = new int[2][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                rectangles[j][i] = in.nextInt();
            }
        }
        for (int[] i : rectangles) {
            if (i[0] != i[1] && i[0] != i[2]) {
                System.out.print(i[0] + " ");
                continue;
            }
            else if (i[1] != i[0] && i[1] != i[2]) {
                System.out.print(i[1] + " ");
                continue;
            }
            else {
                System.out.print(i[2] + " ");
                continue;
            }
        }
        System.out.print("\n");
    }
}
