package Ch3;

public class Ex7Pt1 {
    public static void main(String[] args) {
        int[] birthdayTimesChosen = new int[365];

        for (int i = 0; i < 365; i++) {
            birthdayTimesChosen[i] = 0;
        }

        int numberOfPeople = 0;

        while (true) {
            int choice = (int) (Math.random() * 364);
            birthdayTimesChosen[choice]++;
            numberOfPeople++;
            if (birthdayTimesChosen[choice] == 3) {
                break;
            }
        }

        System.out.printf("%d people had to be asked before having three duplicate birthdays.\n", numberOfPeople);



    }
}
