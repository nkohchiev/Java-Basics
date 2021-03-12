package ForLoop;

import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double oddsum = 0;
        double evensum = 0;

        for (int i = 1; i <= n; i++) {
            double value = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0) {
                oddsum += value;
                if (value > oddMax) {
                    oddMax = value;
                }
                if (value < oddMin) {
                    oddMin = value;
                }
            }
            if (i % 2 == 0) {
                evensum += value;
                if (value > evenMax) {
                    evenMax = value;
                }
                if (value < evenMin) {
                    evenMin = value;
                }
            }

        }
        System.out.printf("OddSum=%.2f,%n", oddsum);
        if (oddsum != 0) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        } else {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        }
        System.out.printf("EvenSum=%.2f,%n", evensum);
        if (evensum != 0) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        } else {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
    }
}
