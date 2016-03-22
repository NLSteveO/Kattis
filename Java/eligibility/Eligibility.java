import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        while (num > 0) {
            String[] line = in.nextLine().split("\\s");
            String name = line[0];
            int schoolYear = Integer.parseInt((line[1].split("\\/"))[0]);
            int birthYear = Integer.parseInt((line[2].split("\\/"))[0]);
            int courses = Integer.parseInt(line[3]);
            if (schoolYear >= 2010) {
                System.out.println(name + " eligible");
            }
            else if (birthYear >= 1991) {
                System.out.println(name + " eligible");
            }
            else if (courses > 40) {
                System.out.println(name + " ineligible");
            }
            else {
                System.out.println(name + " coach petitions");
            }
            num--;
        }
    }
}
