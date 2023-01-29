package Ch5;

public class PlusQuestion implements ArithmeticQuestion {
    private final int a, b;  // The numbers in the problem.

    public PlusQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " + " + b + "?";
    }

    public int getCorrectAnswer() {
        return a + b;
    }
}
