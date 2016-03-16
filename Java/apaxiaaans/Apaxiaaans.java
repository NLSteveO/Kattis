import java.lang.StringBuilder;
import java.util.Scanner;

public class Apaxiaaans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            String name = in.nextLine();
            StringBuilder shortName = new StringBuilder(name.substring(0, 1));
            for (int i = 1; i < name.length(); i++) {
                String prevLetter = shortName.substring(shortName.length()-1, shortName.length());
                String currLetter = name.substring(i, i+1);
                if (!currLetter.equals(prevLetter)) {
                    shortName.append(name.substring(i, i+1));
                }
            }
            System.out.println(shortName);
        } while (in.hasNextLine());
    }
}
