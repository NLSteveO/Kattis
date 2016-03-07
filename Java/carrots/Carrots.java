import java.util.Scanner;

public class Carrots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contestants = in.nextInt();
        int hufflePuffsSolved = in.nextInt();
        String[] answers = new String[contestants];
        for (int i = 0; i < contestants; i++) {
            answers[i] = in.nextLine();
        }
        System.out.println(hufflePuffsSolved);
    }
}
