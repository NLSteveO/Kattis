import java.util.ArrayList;
import java.util.Scanner;

public class RaggedRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();
        while (in.hasNextLine()) {
            lines.add(in.nextLine());
        }
        int max = 0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length() > max) {
                max = lines.get(i).length();
            }
        }
        int sum = 0;
        for (int i = 0; i < lines.size() - 1; i++) {
            sum += Math.pow(max - lines.get(i).length(), 2);
        }
        System.out.println(sum);
    }
}
