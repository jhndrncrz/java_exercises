package Ch3;

public class Ex7Pt3 {
    public static void main(String[] args) {
        int differentPeople = 0;
        int differentBirthdays = 0;
        boolean[] birthdays = new boolean[365];

        for (int i = 0; i < 365; i++) {
            birthdays[i] = false;
        }

        while (differentBirthdays != 365) {
            int choice = (int) (Math.random() * 364) + 1;
            differentPeople++;
            if (birthdays[choice]) {
                continue;
            }
            else {
                birthdays[choice] = true;
                differentBirthdays++;
            }
        }

        System.out.printf("%d people had to be asked to have a birthday for each day of the year.\n", differentPeople);



    }
}
