package Ch5;

public class Ex1 {
    public static void solution() {
        System.out.println("Rolling pair of dice until snake eyes");

        PairOfDice pairOfDice = new PairOfDice();
        int count = 1;

        while (pairOfDice.getDie1() != 1 || pairOfDice.getDie2() != 1) {
            System.out.println(pairOfDice);
            pairOfDice.roll();
            count++;
        }

        System.out.printf("Snake eyes (%s) took %d rolls.\n", pairOfDice.toString(), count);
    }
}
