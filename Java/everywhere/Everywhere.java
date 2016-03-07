import java.util.ArrayList;
import java.util.Scanner;

public class Everywhere {
    public static void main(String[] args) {
        int testCaseCount, workTripsCount;
        Scanner in = new Scanner(System.in);
        testCaseCount = in.nextInt();
        while (testCaseCount > 0) {
            workTripsCount = in.nextInt();
            ArrayList<String> cities = new ArrayList<String>();
            for (int i = 0; i < workTripsCount; i++) {
                String temp = in.next();
                if (!cities.contains(temp)) {
                    cities.add(temp);
                }
            }
            System.out.println(cities.size());
            testCaseCount--;
        }
    }
}
