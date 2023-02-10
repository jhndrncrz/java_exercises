package Ch3;

public class Ex7Pt2 {
    public static void main(String[] args) {
        int differentBirthdays = 0;
        boolean[] birthdays = new boolean[365];

        for (int i = 0; i < 365; i++) {
            birthdays[i] = false;
        }

        for (int i = 0; i < 365; i++) {
            int choice = (int) (Math.random() * 364);
            birthdays[choice] = true;
        }

        for (int i = 0; i < 365; i++) {
            if (birthdays[i]) {
                differentBirthdays++;
            }
        }

        System.out.printf("%d people out of 365 had distinct birthdays.\n", differentBirthdays);



    }
}
