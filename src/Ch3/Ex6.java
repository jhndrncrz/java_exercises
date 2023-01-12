package Ch3;

import java.util.ArrayList;

public class Ex6 {
    public static void solution() {
        ArrayList<Integer> numbersWithMaxDivisors = new ArrayList<Integer>();
        int maxNumberOfDivisors;

        maxNumberOfDivisors = 1;

        for (int n = 1; n < 10000; n++) {
            int nDivisors = 0;
            for (int d = 1; d <= n; d++) {
                if (n % d == 0) {
                    nDivisors++;
                }
            }
            if (nDivisors > maxNumberOfDivisors) {
                numbersWithMaxDivisors = new ArrayList<Integer>();
                numbersWithMaxDivisors.add(n);
                maxNumberOfDivisors = nDivisors;
            }
            else if (nDivisors == maxNumberOfDivisors) {
                numbersWithMaxDivisors.add(n);
            }
        }

        System.out.print("The number/s with the most divisors is/are: ");
        for (int i : numbersWithMaxDivisors) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("These all had %d divisors.", maxNumberOfDivisors);

    }
}
