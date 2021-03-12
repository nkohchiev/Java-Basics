package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String vacationType = "";
        double cost = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                vacationType = "Camp";
                cost = budget * 0.3;
            } else {
                vacationType = "Hotel";
                cost = budget * 0.70;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                vacationType = "Camp";
                cost = budget * 0.4;
            } else {
                vacationType = "Hotel";
                cost = budget * 0.8;
            }
        } else {
            destination = "Europe";
            vacationType = "Hotel";
            cost = budget * 0.9;
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f", vacationType, cost);
    }
}
