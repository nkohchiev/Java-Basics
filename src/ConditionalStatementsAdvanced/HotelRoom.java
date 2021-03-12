package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equalsIgnoreCase("May") || month.equalsIgnoreCase("October")) {
            if (nights > 7 && nights <= 14) {
                priceStudio = 50 - 50 * 0.05;
                priceApartment = 65;

            } else if (nights > 14) {
                priceStudio = 50 - 50 * 0.3;
                priceApartment = 65 - 65 * 0.10;
            } else {
                priceStudio = 50;
                priceApartment = 65;
            }
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September")) {
            if (nights > 7 && nights <= 14) {
                priceApartment = 68.70;
                priceStudio = 75.20;
            } else if (nights > 14) {
                priceStudio = 75.20 - 75.20 * 0.20;
                priceApartment = 68.70 - 68.70 * 0.10;
            } else {
                priceApartment = 68.70;
                priceStudio = 75.20;
            }
        } else if (month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            if (nights > 14) {
                priceApartment = 77 - 77 * 0.10;
                priceStudio = 76;
            } else {
                priceApartment = 77;
                priceStudio = 76;
            }
        } else {

        }
        System.out.printf("Apartment: %.2f lv.%n", Math.abs(priceApartment * nights));
        System.out.printf("Studio: %.2f lv.", Math.abs(priceStudio * nights));
    }
}
