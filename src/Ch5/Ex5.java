package Ch5;

import java.util.Scanner;

public class Ex5 {
    static Scanner scanner = new Scanner(System.in);

    static Deck deck = new Deck(false);

    static BlackjackHand playerHand = new BlackjackHand();
    static BlackjackHand dealerHand = new BlackjackHand();

    public static boolean playGame() {
        deck.shuffle();
        System.out.println("GAME START");
        System.out.println();

        // deal initial cards
        for (int i = 0; i < 2; i++) {
            playerHand.addCard(deck.dealCard());
            dealerHand.addCard(deck.dealCard());
        }

        // check if anyone has won by default
        if (dealerHand.getBlackjackValue() == 21) {
            return false;
        }
        else if (playerHand.getBlackjackValue() == 21) {
            return true;
        }

        // show player two of their cards, one of the dealer's
        for (int i = 0; i < playerHand.getCardCount(); i++) {
            System.out.print("Player's Card " + (i + 1) + ": ");
            System.out.println(playerHand.getCard(i));
        }
        System.out.println("Player's Ch5.Blackjack Value: " + playerHand.getBlackjackValue());
        System.out.println();

        System.out.print("Dealer's Card 1: ");
        System.out.println(dealerHand.getCard(0));
        System.out.println();

        // give player option to hit or pass
        while (playerHand.getBlackjackValue() < 21) {
            System.out.print("Get another card? (Y/N): ");
            char input = scanner.nextLine().toLowerCase().charAt(0);
            System.out.println();

            if (input == 'y') {
                playerHand.addCard(deck.dealCard());
                for (int i = 0; i < playerHand.getCardCount(); i++) {
                    System.out.print("Player's Card " + (i + 1) + ": ");
                    System.out.println(playerHand.getCard(i));
                }
                System.out.println("Player's Ch5.Blackjack Value: " + playerHand.getBlackjackValue());
                System.out.println();
            }
            else {
                break;
            }
        }

        // make dealer hit or pass
        if (dealerHand.getBlackjackValue() <= 16) {
            dealerHand.addCard(deck.dealCard());
        }

        // check winner
        if (dealerHand.getBlackjackValue() > 21 || playerHand.getBlackjackValue() > 21) {
            return false;
        }
        else {
            return dealerHand.getBlackjackValue() < playerHand.getBlackjackValue();
        }
    }

    public static void solution() {
        int playerCash = 100;

        while (true) {
            System.out.print("Place your bet: $ ");
            int bet = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (bet > playerCash) {
                System.out.println("You bet more than you have!");
                continue;
            }
            boolean game = playGame();

            for (int i = 0; i < playerHand.getCardCount(); i++) {
                System.out.print("Player's Card " + (i + 1) + ": ");
                System.out.println(playerHand.getCard(i));
            }
            System.out.println();
            for (int i = 0; i < dealerHand.getCardCount(); i++) {
                System.out.print("Dealer's Card " + (i + 1) + ": ");
                System.out.println(dealerHand.getCard(i));
            }
            System.out.println("Dealer's Ch5.Blackjack Value: " + dealerHand.getBlackjackValue());
            System.out.println();

            if (game) {
                System.out.println("You won!");
                System.out.printf("You gain $ %d.00.\n", bet);
                playerCash += bet;
            } else {
                System.out.println("You lost.");
                System.out.printf("You lost $ %d.00.\n", bet);
                playerCash -= bet;
            }
            System.out.printf("Your Cash: $ %d.00\n", playerCash);
            System.out.println();

            System.out.print("Do you want to play again? (Y/N): ");
            char input = scanner.nextLine().toLowerCase().charAt(0);

            if (input != 'y') {
                break;
            }
        }
    }
}
