import java.util.Scanner;

public class EstimatingTheAreaOfACircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while (!line.equalsIgnoreCase("0 0 0")) {
            String[] splitLine = line.split("\\s");
            double radius = Double.parseDouble(splitLine[0]);
            double trueArea = radius*radius*Math.PI;
            double totalDots = Double.parseDouble(splitLine[1]);
            double circleDots = Double.parseDouble(splitLine[2]);
            double estimateArea = (circleDots/totalDots)*((radius*2)*(radius*2));
            System.out.println(trueArea + " " + estimateArea);
            line = in.nextLine();
        }
    }
}
