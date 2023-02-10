package Ch4;

public class Ex4 {
    private static int rollUntilSum(int sum) {
        int die1, die2;
        int count;

        count = 0;
        do {
            die1 = (int)(Math.random()*6 + 1);
            die2 = (int)(Math.random()*6 + 1);
            count++;
            // System.out.printf("Roll #%d --> D1: %d - D2: %d\n", count, die1, die2);
        }
        while (die1 + die2 != sum);

        return count;
    }

    private static double averageRollsUntilSum(int sum, int repeatCount) {
        double average;

        average = 0;

        for (int i = 0; i < repeatCount; i++) {
            average += rollUntilSum(sum);
        }

        average /= repeatCount;

        return average;
    }

    public static void main(String[] args) {
        System.out.println("Total on Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");
        for (int i = 2; i < 13; i++) {
            System.out.printf("%13d     %23.4f\n", i, averageRollsUntilSum(i, 1000000));
        }
    }
}
