package FirstStepsInProgramming;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine());

        double interestPerYear = deposit * percentPerYear / 100;
        double interestPerMonth = interestPerYear / 12;
        double totalSum = deposit + months * interestPerMonth;

        System.out.println(totalSum);
    }
}
