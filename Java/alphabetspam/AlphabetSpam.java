import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int[] counts = new int[4];
        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))) {
                counts[0]++;
            }
            else if (Character.isLowerCase(line.charAt(i))) {
                counts[1]++;
            }
            else if (line.charAt(i) == '_') {
                counts[2]++;
            }
            else {
                counts[3]++;
            }
        }
        double sig = Math.pow(10, 15);
        double ws = (double)counts[2]/(double)line.length();
        double lc = (double)counts[1]/(double)line.length();
        double uc = (double)counts[0]/(double)line.length();
        double sy = (double)counts[3]/(double)line.length();
        System.out.println(Math.round(ws*sig)/sig);
        System.out.println(Math.round(lc*sig)/sig);
        System.out.println(Math.round(uc*sig)/sig);
        System.out.println(Math.round(sy*sig)/sig);
    }
}
