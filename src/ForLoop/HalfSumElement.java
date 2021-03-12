package ForLoop;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber;

            if (currentNumber > max) {
                max = currentNumber;
            }
        }

        int sumWithOutMaxNumber = sum - max;
        if (max == sumWithOutMaxNumber) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - sumWithOutMaxNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
