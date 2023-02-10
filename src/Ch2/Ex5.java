package Ch2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int eggs;
        int gross, dozen, units;

        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the number of eggs you have: ");
        eggs = stdin.nextInt();

        gross = eggs / 144;
        eggs %= 144;

        dozen = eggs / 12;
        eggs %= 12;

        units = eggs;

        System.out.printf("You have %d gross, %d dozen, and %d eggs.", gross, dozen, units);
    }
}
