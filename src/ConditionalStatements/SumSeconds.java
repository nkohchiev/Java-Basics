package ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read input -> time1, time2, time 3
        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());
        //sum = time1 + time2 + time3
        int sumSeconds = time1 + time2 + time3;
        //calculate minutes = sumSeconds / 60
        int minutes = sumSeconds / 60;
        //calculate seconds = total % 60
        int seconds = sumSeconds % 60;
        //single digit
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else  {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
