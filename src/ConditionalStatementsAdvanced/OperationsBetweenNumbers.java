package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        // +, -, *, /, %

        switch (operator) {
            case '+':
                int sum = number1 + number2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", number1, number2, sum);
                } else {
                    System.out.printf("%d + %d = %d - odd", number1, number2, sum);
                }
                break;
            case '-':
                int result = number1 - number2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", number1, number2, result);
                } else {
                    System.out.printf("%d - %d = %d - odd", number1, number2, result);
                }
                break;
            case '*':
                int multiplication = number1 * number2;
                if (multiplication % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", number1, number2, multiplication);
                } else {
                    System.out.printf("%d * %d = %d - odd", number1, number2, multiplication);
                }
                break;
            case '/':
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    double division = number1 * 1.0 / number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, division);
                }
                break;
            case '%':
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    int leftOver = number1 % number2;
                    System.out.printf("%d %% %d = %d", number1, number2, leftOver);
                }
                break;
        }
    }
}
