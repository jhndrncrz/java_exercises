package Ch5;

import static java.lang.String.format;

public class PairOfDice {
    private int die1;
    private int die2;


    public PairOfDice() {
        roll();
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void roll() {
        die1 = (int) ((Math.random() * 6) + 1);
        die2 = (int) ((Math.random() * 6) + 1);
    }

    public String toString() {
        if (die1 == die2) {
            return String.format("double %d", die1);
        }
        else {
            return String.format("%d and %d", die1, die2);
        }
    }
}
