package WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeLength = Integer.parseInt(scanner.nextLine());
        int cakeWidth = Integer.parseInt(scanner.nextLine());

        int cakeSize = cakeLength * cakeWidth;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {

            int currentPices = Integer.parseInt(input);

            cakeSize -= currentPices;

            if (cakeSize <= 0) {

                break;
            }

            input = scanner.nextLine();
        }
        if (cakeSize >= 0) {
            System.out.printf("%d pieces are left.", cakeSize);
        } else {
            System.out.printf("No more cake left! You need %s pieces more.", Math.abs(cakeSize));
        }
    }
}
