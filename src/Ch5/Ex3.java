package Ch5;

public class Ex3 {
    public static void solution() {
        System.out.println("Total on Dice     Average Number of Rolls     stDev of Rolls     Max Rolls");
        System.out.println("-------------     -----------------------     --------------     ---------");
        for (int i = 2; i < 13; i++) {
            StatCalc stat = statisticsRollsUntilSum(i, 1000000000);
            System.out.printf("%13d     %23.4f     %14.4f     %9d\n", i, stat.getMean(), stat.getStandardDeviation(), (int) stat.getMax());
        }
    }

    private static int rollUntilSum(int sum) {
        int die1, die2;
        int count;

        count = 0;
        do {
            die1 = (int)(Math.random()*6 + 1);
            die2 = (int)(Math.random()*6 + 1);
            count++;

        }
        while (die1 + die2 != sum);

        return count;
    }

    private static StatCalc statisticsRollsUntilSum(int sum, int repeatCount) {
        StatCalc statCalc = new StatCalc();

        for (int i = 0; i < repeatCount; i++) {
            statCalc.enter(rollUntilSum(sum));
        }

        return statCalc;
    }
}
