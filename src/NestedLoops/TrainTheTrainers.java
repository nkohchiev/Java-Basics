package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        double totalGrades = 0.0;
        int presentationCounts = 0;


        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            double sumGrade = 0.0;
            for (int i = 0; i < juryCount ; i++) {

                double grade = Double.parseDouble(scanner.nextLine());
                sumGrade += grade;

            }
            double averageGrade = sumGrade / juryCount;
            System.out.printf("%s - %.2f.%n", input, averageGrade);

            totalGrades += averageGrade;
            presentationCounts++;

            input = scanner.nextLine();
        }

        double averageGrade = totalGrades / presentationCounts;
        System.out.printf("Student's final assessment is %.2f.", averageGrade);
    }
}
