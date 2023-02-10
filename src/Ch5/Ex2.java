package Ch5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StatCalc statCalc = new StatCalc();
        double input;


        System.out.println("Enter a list of numeric values to compute their descriptive statistics: ");

        while (true) {
            try {
                input = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("...");

                if (input == 0) {
                    break;
                } else {
                    statCalc.enter(input);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Try again.");
            }
        }
        System.out.println();
        System.out.printf("Sum: %f\n", statCalc.getSum());
        System.out.printf("Mean: %f\n", statCalc.getMean());
        System.out.printf("Min: %f\n", statCalc.getMin());
        System.out.printf("Max: %f\n", statCalc.getMax());
        System.out.printf("Standard deviation: %f\n", statCalc.getStandardDeviation());

    }
}
