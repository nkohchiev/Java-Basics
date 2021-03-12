package FirstStepsInProgramming;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakesPrice = cakes * 45;
        double wafflePrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;

        double priceAllDays = (cakesPrice + wafflePrice + pancakesPrice) * days;
        double priceAllDaysAllCooks = priceAllDays * cooks;

        double totalPrice = priceAllDaysAllCooks - priceAllDaysAllCooks / 8;

        System.out.printf("%.2f",totalPrice);

    }
}
