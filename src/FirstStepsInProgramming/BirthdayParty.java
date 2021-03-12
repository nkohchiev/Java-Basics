package FirstStepsInProgramming;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //наем за залата: 2250
        int partyRoomRent = Integer.parseInt(scanner.nextLine());
        //цена за тортата: 2250 * 20% = 450
        double cakePrice = partyRoomRent * 0.2;
        //цена за напитки: 450 – 45% = 247.5
        double drinkPrice = cakePrice - cakePrice * 0.45;
        //цена за аниматор: 1 / 3 от 2250 = 750
        double animatorPrice = partyRoomRent / 3;
        //необходима сума: 2250 + 450 + 247.5 +750 = 3697.5
        double totalCost = partyRoomRent + cakePrice + drinkPrice + animatorPrice;
        System.out.println(totalCost);
    }
}
