package FirstStepsInProgramming;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberries = Double.parseDouble(scanner.nextLine());
        double strawberry = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberryPrice / 2;
        double orangesPrice = raspberriesPrice - (0.4 * raspberriesPrice);
        double bananasPrice = raspberriesPrice - (0.8 * raspberriesPrice);
        double raspberriesAmount = raspberries * raspberriesPrice;
        double orangesAmount = oranges * orangesPrice;
        double bananasAmount = bananas * bananasPrice;
        double strawberryAmount = strawberry * strawberryPrice;

        double totalAmount = raspberriesAmount + orangesAmount + bananasAmount + strawberryAmount ;

        System.out.printf("%.2f",totalAmount);
    }
}
