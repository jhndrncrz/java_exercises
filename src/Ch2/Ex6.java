package Ch2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        String fullName, firstName, lastName, initials;

        Scanner stdin = new Scanner(System.in);

        System.out.println("Please enter your first name and last name, separated by a space.");
        fullName = stdin.nextLine();
        firstName = fullName.substring(0, fullName.indexOf(' '));
        lastName = fullName.substring(fullName.indexOf(' ') + 1);
        System.out.printf("Your first name is %s, which has %d characters. \n", firstName, firstName.length());
        System.out.printf("Your last name is %s, which has %d characters. \n", lastName, lastName.length());
        System.out.printf("Your initials are %s%s.", firstName.charAt(0), lastName.charAt(0));
    }
}
