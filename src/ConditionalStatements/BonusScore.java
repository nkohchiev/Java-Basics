package ConditionalStatements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        // < 100 -> 5 points
        // > 100 -> 20% to the number
        // > 100 -> 10% to the number

        if (number < 100) {
            bonus = 5;
        }else if (number <= 1000){
            bonus = 0.2 * number;
        }else if (number > 1000){
            bonus = 0.1 * number;
        }

        // even + 1
        // ends in 5 -> +2
        if (number % 2 == 0){
            bonus = bonus + 1; // bonus += 1
        }
        if (number % 10 == 5) {
            bonus = bonus + 2; // bonus += 2
        }

        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
