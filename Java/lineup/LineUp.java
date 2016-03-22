import java.util.Scanner;

public class LineUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        String[] list = new String[num];
        for (int i = 0; i < num; i++) {
            list[i] = in.nextLine();
        }
        int inc = 0;
        int dec = 0;
        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j < Math.min(list[i].length(), list[i+1].length()); j++) {
                int compare = list[i].substring(j, j+1).compareTo(list[i+1].substring(j, j+1));
                if (compare > 0) {
                    dec ++;
                    break;
                }
                else if (compare < 0) {
                    inc ++;
                    break;
                }
            }
        }
        if (inc == num-1) {
            System.out.println("INCREASING");
        }
        else if (dec == num-1) {
            System.out.println("DECREASING");
        }
        else {
            System.out.println("NEITHER");
        }
    }
}
