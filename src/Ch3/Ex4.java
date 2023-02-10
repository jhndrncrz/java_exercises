package Ch3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String sentence;

        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = stdin.nextLine();

        sentence = sentence.replaceAll("[^A-Za-z' ]", "");

        Scanner word = new Scanner(sentence);
        while (word.hasNext()) {
            System.out.println(word.next());
        }
    }
}
