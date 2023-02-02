package Ch7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    static Scanner scanner = new Scanner(System.in);

    public static void solution() {
        int n = 0;
        double[] array = new double[100];
        while (true) {
            System.out.print("Enter a real number: ");
            double input = scanner.nextDouble();

            if (input == 0) {
                break;
            }
            n++;

            for (int i = 0; i < n; i++) {
                if ((input >= array[i] && input < array[i+1]) || i == n - 1) {
                    for (int j = i + 1; j > 0; j--) {
                        array[j+1] = array[j];
                    }
                    array[i] = input;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
// 1 5
// 0 1 2 3 4 5 6 7 8 9
// 1 5