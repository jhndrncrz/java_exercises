package Ch4;

import java.util.Scanner;

public class Ex1 {
    private static void printCapitalized(String str) {
        String out;

        out = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || !Character.isLetter(str.charAt(i - 1))) {
                out += Character.toUpperCase(str.charAt(i));
            }
            else {
                out += str.charAt(i);
            }
        }

        System.out.println(out);
    }

    public static void solution() {
        Scanner stdin;
        String input;

        System.out.println("Enter a string to print capitalized:");
        stdin = new Scanner(System.in);
        input = stdin.nextLine();

        printCapitalized(input);
    }
}
