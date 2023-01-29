package Ch5;

import java.util.Scanner;

public class Ex6 {
    static Scanner scanner = new Scanner(System.in);
    public static void solution() {
        int score = 0;
        for (int i = 0; i < 10; i++) {
            AdditionQuestion additionQuestion;
            int answer;

            additionQuestion = new AdditionQuestion();
            System.out.printf("Q%d: %s\n", i + 1, additionQuestion.getQuestion());

            System.out.print("--> ");
            answer = scanner.nextInt();
            scanner.nextLine();


            if (additionQuestion.getCorrectAnswer() == answer) {
                System.out.println("You got it correctly!");
                System.out.println();
                score += 1;
            }
            else {
                System.out.printf("Sorry, you got that wrong! The correct answer was %s.\n", additionQuestion.getCorrectAnswer());
                System.out.println();
            }
        }
        System.out.printf("You scored %d/10. Congratulations!\n", score);
    }
}
