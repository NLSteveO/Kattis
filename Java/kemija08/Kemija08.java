import java.util.Scanner;
import java.lang.StringBuilder;

public class Kemija08 {
    public static boolean isVowel(String letter) {
        String vowels = "aeiou";
        return vowels.contains(letter);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            String[] words = in.nextLine().split("\\s");
            StringBuilder decoded = new StringBuilder("");
            for (int j = 0; j < words.length; j++) {
                for (int i = 0; i < words[j].length(); i++) {
                    if (isVowel(words[j].substring(i, i+1))) {
                        decoded.append(words[j].substring(i, i+1));
                        i += 2;
                    }
                    else {
                        decoded.append(words[j].substring(i, i+1));
                    }
                }
                if (j != words.length - 1) {
                    decoded.append(" ");
                }
            }
            System.out.println(decoded);
        } while (in.hasNextLine());
    }
}
