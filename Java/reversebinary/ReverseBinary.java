import java.util.Scanner;

public class ReverseBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] bin = new int[31];
        int count = 0;
        int temp = num;
        do {
            bin[count] = temp % 2;
            count++;
            temp /= 2;
        }
        while (temp > 0);
        int hhh = (int)Math.pow(2.0, (double)count-1.0);
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (bin[i] == 1) {
                sum += hhh;
            }
            hhh /= 2;
        }
        System.out.println(sum);
    }
}
