package Ch4;

import java.util.Scanner;

public class Ex2 {
    private static int hexValue(char c) {
        if (Character.isDigit(c)) {
            return c;
        }
        return switch (Character.toUpperCase(c)) {
            case 'A' -> 10;
            case 'B' -> 11;
            case 'C' -> 12;
            case 'D' -> 13;
            case 'E' -> 14;
            case 'F' -> 15;
            default -> throw new IllegalArgumentException();
        };
    }

    public static void main(String[] args) {
        Scanner stdin;
        String input;
        int totalValue;

        stdin = new Scanner(System.in);

        System.out.println("Enter a string to print its hexadecimal value:");
        input = stdin.nextLine();

        totalValue = 0;

        try {
            for (int i = 0; i < input.length();  i++) {
                int charValue = hexValue(input.charAt(i));
                totalValue = totalValue * 16 + charValue;
            }
            System.out.printf("0x%s ==> %d", input, totalValue);
        }
        catch (IllegalArgumentException e) {
            System.out.println("String is not hexadecimal!");
        }
    }
}
