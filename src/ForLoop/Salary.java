package ForLoop;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nTabs; i++) {
            String nameSite = scanner.nextLine();

            switch (nameSite) {
                case "Facebook":
                    salary -= 150;
                    break;

                case "Instagram":
                    salary -= 100;
                    break;

                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {

                System.out.println("You have lost your salary.");
                i = nTabs;
            }
        }

        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
