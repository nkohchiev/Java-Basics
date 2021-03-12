package FirstStepsInProgramming;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = length * width * height;
        double volumeLiters = volumeCm * 0.001;
        double percentNumber = percent * 0.01;
        double needLiters = volumeLiters * (1 - percentNumber);

        System.out.printf("%.3f", needLiters);
    }
}
