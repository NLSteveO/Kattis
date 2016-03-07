import java.util.Scanner;

public class Speedlimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num != -1) {
            int[] speeds = new int[num];
            int[] time = new int[num];
            speeds[0] = in.nextInt();
            time[0] = in.nextInt();
            int dist = speeds[0] * time[0];
            int old = time[0];
            for(int i = 1; i < num; i++) {
                speeds[i] = in.nextInt();
                int tmp = in.nextInt();
                time[i] = tmp - old;
                old = tmp;
                dist += speeds[i] * time[i];
            }
            System.out.println(dist + " miles");
            num = in.nextInt();
        }
    }
}
