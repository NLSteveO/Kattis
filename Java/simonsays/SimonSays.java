import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        while (num > 0) {
          String line = in.nextLine();
          if (line.contains("Simon says")) {
            System.out.println(line.substring(11));
          }
          num--;
        }
    }
}
