package Ch7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int items = 0;
        double[] a = new double[100];
        while (true) {
            double input;
            int inputIndex = 0;

            System.out.print("Enter a number: ");
            input = scanner.nextDouble();

            if (input == 0) {
                break;
            }

            for (int i = 0; i < items; ++i) {
                if (a[i] > input) {
                    inputIndex = i;
                    break;
                }
                else if (i == items - 1) {
                    inputIndex = items;
                }
            }

            for (int i = items - 1; i > inputIndex - 1; --i) {
                a[i + 1] = a[i];
            }
            a[inputIndex] = input;

            ++items;
        }
        System.out.println(Arrays.toString(a));
    }
}