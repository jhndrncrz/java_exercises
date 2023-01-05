package Ch2;

public class Ex2 {
    public static void solution() {
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        int roll = die1 + die2;

        System.out.printf("The first die comes up %d", die1);
        System.out.printf("The second die comes up %d", die2);
        System.out.printf("Your total roll is %d", roll);
    }
}
