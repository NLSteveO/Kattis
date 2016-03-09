import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        int set = 1;
        while (count != 0) {
            System.out.println("SET " + set);
            set++;
            String[] list = new String[count];
            for (int i = 0; i < count/2; i++) {
                list[i] = in.nextLine();
                list[count - (i + 1)] = in.nextLine();
            }
            if ((count % 2) != 0) {
                list[count / 2] = in.nextLine();
            }
            for (String word : list) {
                System.out.println(word);
            }
            count = Integer.parseInt(in.nextLine());
        }
    }
}
