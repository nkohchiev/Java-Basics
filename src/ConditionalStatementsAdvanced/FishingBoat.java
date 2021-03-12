package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season){
            case "Spring":
                price = 3000;
                break;

            case "Summer":
            case "Autumn":
                price = 4200;
                break;

            case "Winter":
                price = 2600;
                break;
        }
        if (countPeople <=6) {
            price *= 0.9;
        } else if (countPeople > 6 && countPeople <= 11) {
            price *= 0.85;
        } else if (countPeople >11) {
            price *=0.75;
        }

        if (countPeople % 2 ==0 && !season.equals("Autumn")) {
            price *= 0.95;
        }

        if (price <= budget) {
            System.out.printf("Yes! You have %.2f leva left.",Math.abs(budget - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - price));
        }
    }
}
