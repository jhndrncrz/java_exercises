package Ch3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double operand1, operand2, result;
        char operator;

        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a simple math expression (of the form a ? b): ");
        operand1 = stdin.nextInt();
        operator = stdin.next().charAt(0);
        operand2 = stdin.nextInt();

        result = switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> Double.NaN;
        };

        System.out.printf("%f %s %f = %f", operand1, operator, operand2, result);
    }
}
