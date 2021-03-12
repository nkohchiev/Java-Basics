package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exh = Integer.parseInt(scanner.nextLine());
        int exm = Integer.parseInt(scanner.nextLine());
        int arh = Integer.parseInt(scanner.nextLine());
        int arm = Integer.parseInt(scanner.nextLine());

        int difference = ((exh * 60) + exm) - ((arh * 60) + arm);
        int hour = difference / 60;
        int minutes = difference % 60;

        if (difference > 30) {
            System.out.println("Early");

            if (difference >= 31 && difference <= 59) {
                System.out.printf("%02d minutes before the start", difference);

            } else {
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }


        } else if ((difference <= 30 && difference > 0) || difference == 0) {
            System.out.println("On time");

            if (difference <= 30 && difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            } else {

            }

        } else if (difference < 0) {
            System.out.println("Late");

            if (difference <= -1 && difference >= -9) {
                System.out.printf("%2d minutes after the start", Math.abs(difference));

            } else if (difference < -9 && difference >= -59) {
                System.out.printf("%d minutes after the start", Math.abs(difference));

            } else {
                System.out.printf("%d:%02d hours after the start", Math.abs(hour), Math.abs(minutes));
            }
        }
    }
}
