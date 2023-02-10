package Ch6;

import javax.swing.JFrame;

public class RandomStrings {
    public static void main(String[] args) {
        JFrame window = new JFrame("Java Swing!");
        RandomStringsPanel content = new RandomStringsPanel("I Love Java!");

        window.addMouseListener(content);
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120, 70);
        window.setSize(350, 250);
        window.setVisible(true);
    }
}
