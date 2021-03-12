package ConditionalStatements;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble((scanner.nextLine()));
        double salary = Double.parseDouble((scanner.nextLine()));

        double social = 0.35 * salary;
        double excellent = 25 * grade;

        //1. <=4.5 -> no scholar
        //2. 4.5 or 5.5
        //3. >= 5.50

        if (grade <= 4.5) {
            System.out.println("You cannot get a scholarship!");

        } else if (grade > 4.5 && grade < 5.5) {

            //Social - Scholarship
            if (income < salary) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
            } else {
                System.out.println("You cannot get a scholarship!");
            }

        } else if (grade >= 5.50) {
            //Excellent -> 5.50
            //Social -> >= 4.50 and income < salary
            if (income < salary) {
                // legit for both scholarships
                if (social > excellent) {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
                } else {
                    System.out.printf("You get a Excellent scholarship %.0f BGN", Math.floor(excellent));
                }
            } else {
                System.out.printf("You get a Excellent scholarship %.0f BGN", Math.floor(excellent));
            }


        }
    }
}
