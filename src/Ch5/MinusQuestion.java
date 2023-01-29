package Ch5;

public class MinusQuestion implements ArithmeticQuestion {
    private final int a, b;  // The numbers in the problem.

    public MinusQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * a);
    }

    public String getQuestion() {
        return "What is " + a + " - " + b + "?";
    }

    public int getCorrectAnswer() {
        return a - b;
    }
}
