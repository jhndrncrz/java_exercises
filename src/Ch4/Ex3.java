package Ch4;

import java.util.Scanner;

public class Ex3 {
    private static int rollUntilSum(int sum) {
        int die1, die2;
        int count;

        count = 0;
        do {
            die1 = (int)(Math.random()*6 + 1);
            die2 = (int)(Math.random()*6 + 1);
            count++;
            System.out.printf("Roll #%d --> D1: %d - D2: %d\n", count, die1, die2);
        }
        while (die1 + die2 != sum);

        return count;
    }

    public static void solution() {
        Scanner stdin;
        int input;

        stdin = new Scanner(System.in);
        input = stdin.nextInt();

        System.out.printf("Snake eyes took %d rolls.", rollUntilSum(input));
    }
}
