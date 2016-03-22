import java.util.Scanner;

public class OddManOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int cases = 1;
        while (num > 0) {
            int count = Integer.parseInt(in.nextLine());
            String[] guestList = in.nextLine().split("\\s");
            int[] guests = new int[count];
            int oddMan = -1;
            for (int i = 0; i < count; i++) {
                guests[i] = Integer.parseInt(guestList[i]);
            }
            for (int guest : guests) {
                int x = 0;
                for (int otherGuest : guests) {
                    if (guest == otherGuest) {
                        x++;
                    }
                }
                if (x == 1) {
                    oddMan = guest;
                }
            }
            System.out.println("Case #" + cases + ": " + oddMan);
            cases++;
            num--;
        }
    }
}
