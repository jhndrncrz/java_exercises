package Ch4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Ex8 {
    static ArrayList<Integer> operand1;
    static ArrayList<Integer> operand2;
    static ArrayList<Integer> correctAnswers = new ArrayList<>();
    static ArrayList<Integer> userAnswers = new ArrayList<>();
    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Basic Addition Quiz");

        System.out.print("Enter number of items: ");
        createQuiz();
        System.out.println();

        administerQuiz();
        System.out.println();

        System.out.println("Scoring");
        System.out.println();
        scoreQuiz();
    }

    private static ArrayList<Integer> generateRandomIntegers(int length) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            array.add((int) (Math.random() * 100));
        }
        return array;
    }

    private static void createQuiz() {
        int length;
        while (true) {
            try {
                length = stdin.nextInt();
                stdin.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number of items.");
            }
        }

        operand1 = generateRandomIntegers(length);
        operand2 = generateRandomIntegers(length);

        for (int i = 0; i < length; i++) {
            correctAnswers.add(operand1.get(i) + operand2.get(i));
        }
    }

    private static void administerQuiz() {
        for (int i = 0; i < correctAnswers.size(); i++) {
            System.out.printf("%2d.) %2d + %2d = ", i + 1, operand1.get(i), operand2.get(i));
            while (true) {
                try {
                    userAnswers.add(stdin.nextInt());
                    stdin.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                }
            }
        }
    }

    private static void scoreQuiz() {
        // System.out.println("            Your Answer || Correct Answer");
        int score = 0;
        for (int i = 0; i < correctAnswers.size(); i++) {
            String status;
            if (Objects.equals(userAnswers.get(i), correctAnswers.get(i))) {
                status = "CORRECT";
                score++;
            }
            else {
                status = "INCORRECT";
            }
            System.out.printf("%2d.) %2d + %2d = %3d (You answered: %3d, %s)\n", i + 1, operand1.get(i), operand2.get(i), correctAnswers.get(i), userAnswers.get(i), status);
        }
        System.out.printf("You scored %d/%d points (%1.2f%%). Congratulations!", score, userAnswers.size(), 100 * (double) score / userAnswers.size());
    }
}
