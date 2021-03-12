package ConditionalStatements;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble((scanner.nextLine()));


        double decorPrice = 0.1 * budget;
        double clothsPrice = countStatists * pricePerStatist;

        if (countStatists > 150){
            clothsPrice = clothsPrice - 0.1 * clothsPrice;
        }
        double total = decorPrice + clothsPrice;

        if (total > budget){
            System.out.println(("Not enough money!"));
            double needMoney = total - budget;
            System.out.printf("Wingard needs %.2f leva more.", needMoney);
        } else  {
            System.out.printf("Action! %n");
            double leftMoney = budget - total;
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
    }
}
