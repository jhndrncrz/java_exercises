package Ch2;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void solution() {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = stdin.nextLine().toUpperCase(Locale.ROOT);
        System.out.printf("Hello, %s, nice to meet you!", username);
    }
}
