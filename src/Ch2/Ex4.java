package Ch2;

import java.util.Scanner;

public class Ex4 {
    public static void solution() {
        int quarters, dimes, nickels, pennies;
        double dollars;

        Scanner stdin = new Scanner(System.in);

        System.out.println("Give the number of your...");
        System.out.print("Quarters: ");
        quarters = stdin.nextInt();
        System.out.print("Dimes: ");
        dimes = stdin.nextInt();
        System.out.print("Nickels: ");
        nickels = stdin.nextInt();
        System.out.print("Pennies: ");
        pennies = stdin.nextInt();

        dollars = 0.25 * quarters + 0.10 * dimes + 0.05 * nickels + 0.01 * pennies;
        System.out.printf("You have $%1.2f.", dollars);
    }
}
