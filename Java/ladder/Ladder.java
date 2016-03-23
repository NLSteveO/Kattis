import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opposite = in.nextInt();
        int angle = in.nextInt();
        System.out.println((int)Math.ceil(opposite/Math.sin(Math.toRadians(angle))));
    }
}
