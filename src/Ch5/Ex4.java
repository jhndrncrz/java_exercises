package Ch5;

import java.util.Objects;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck(false);
        BlackjackHand blackjackHand = new BlackjackHand();

        deck.shuffle();

        do {
            int random = (int) (Math.random() * 5) + 2;

            System.out.println("--> Hand Cards <--");

            for (int i = 0; i < random; i++) {
                Card card = deck.dealCard();
                blackjackHand.addCard(card);

                System.out.println(card);
            }

            System.out.println("--> Hand Value <--");
            System.out.println(blackjackHand.getBlackjackValue());
            blackjackHand.clear();

            System.out.print("Enter any character to continue: ");

        } while (!Objects.equals(scanner.next(), ""));
    }
}
