package Ch3;
public class Ex2 {
    public static void solution() {
        int dice1, dice2;
        int count;

        count = 0;
        do {
            dice1 = (int)(Math.random()*6 + 1);
            dice2 = (int)(Math.random()*6 + 1);
            count++;
            System.out.printf("Dice 1: %d --- Dice 2: %d\n", dice1, dice2);
        }
        while (dice1 != 1 || dice2 != 1);
        System.out.printf("Snake Eyes at Roll #%d", count);

    }
}
