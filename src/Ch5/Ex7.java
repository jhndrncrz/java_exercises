package Ch5;

import java.util.Scanner;

public class Ex7 {
    static Scanner scanner = new Scanner(System.in);

    static ArithmeticQuestion[] arithmeticQuestions = new ArithmeticQuestion[10];
    static int[] playerAnswers = new int[10];
    static int score = 0;

    public static void main(String[] args) {
        createQuiz();

        System.out.println("Welcome to the ARITHMETIC QUIZ!");
        System.out.println();
        administerQuiz();


        System.out.println("Here are the correct answers:");
        gradeQuiz();
    }

    public static void createQuiz() {
        for (int i = 0; i < 10; i++) {
            if ((int) (Math.random() * 2) < 1) {
                arithmeticQuestions[i] = new PlusQuestion();
            }
            else {
                arithmeticQuestions[i] = new MinusQuestion();
            }
        }
    }

    public static void administerQuiz() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Q%d: %s\n", i + 1, arithmeticQuestions[i].getQuestion());
            System.out.print("--> ");

            playerAnswers[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public static void gradeQuiz() {
        for (int i = 0; i < 10; i++) {
            if (arithmeticQuestions[i].getCorrectAnswer() == playerAnswers[i]) {
                System.out.printf("Q%d: You are CORRECT!\n", i + 1);
                score += 1;
            }
            else {
                System.out.printf("Q%d: You are INCORRECT. The correct answer was %d.\n", i + 1, arithmeticQuestions[i].getCorrectAnswer());
            }
        }
        System.out.println();
        System.out.printf("You got %d/10. Congratulations!", score);
    }
}
