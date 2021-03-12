package ConditionalStatements;

import java.util.Scanner;

public class TimeIn15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read hour, minutes
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        //calculate total minutes = hour * 60 + minutes
        int totalInMinutes = hour * 60 + minutes;
        int totalInMinutesPlus15 = totalInMinutes + 15;

        //calculate endHour = totalAfter15 / 60
        //calculate endMinute = totalAfter % 60

        int endHour = totalInMinutesPlus15 / 60;
        int endMinutes = totalInMinutesPlus15 % 60;

        if (endHour == 24) {
            endHour = 0;
        }

        //print hour:minute
        System.out.printf("%d:%02d",endHour, endMinutes);
    }
}
