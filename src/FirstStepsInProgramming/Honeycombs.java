package FirstStepsInProgramming;

import java.util.Scanner;

    public class Honeycombs {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numberBees = Integer.parseInt(scanner.nextLine());
            int numberFlowers = Integer.parseInt(scanner.nextLine());

            double honeyCombs = numberBees * numberFlowers * 0.21;

            double leftOver = honeyCombs / 100;

            double leftOver1 = leftOver % 2 * 100;

            double honeyCombsFilled = (honeyCombs - leftOver1) * 0.01;

            System.out.printf("%.0f honeycombs filled.%n%.2f grams of honey left.", honeyCombsFilled, leftOver1);




        }
    }
