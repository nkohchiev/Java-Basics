package FirstStepsInProgramming;

import java.util.Scanner;

public class RadToDeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.printf("%.0f", degrees);
    }
}