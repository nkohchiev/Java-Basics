package FirstStepsInProgramming;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPages = Integer.parseInt(scanner.nextLine());
        int numberPagesPerHour = Integer.parseInt(scanner.nextLine());
        int numOfDays = Integer.parseInt(scanner.nextLine());


        int hoursOfReading = numOfPages / numberPagesPerHour;


        int totalHoursPerDay = hoursOfReading / numOfDays;

        System.out.println(totalHoursPerDay);

    }
}
