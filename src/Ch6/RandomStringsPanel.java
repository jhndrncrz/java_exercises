package Ch6;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class RandomStringsPanel extends JPanel implements MouseListener {
    private String message;
    private final Font[] font = new Font[5];

    public RandomStringsPanel() {
        this(null);
    }

    public RandomStringsPanel(String messageString) {
        message = messageString;
        if (message == null) {
            message = "Java!";
        }
        font[0] = new Font("Serif", Font.BOLD, 14);
        font[1] = new Font("SansSerif", Font.BOLD, 24);
        font[2] = new Font("Monospaced", Font.PLAIN, 34);
        font[3] = new Font("Dialog", Font.PLAIN, 29);
        font[4] = new Font("Serif", Font.ITALIC, 18);

        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        for (int i = 0; i < 25; ++i) {
            float hue = (float) Math.random();
            g.setColor(Color.getHSBColor(hue, 1.0F, 1.0F));

            g.setFont(font[(int) (Math.random() * 5)]);

            int x, y;
            x = (int) (Math.random() * width);
            y = (int) (Math.random() * height);

            g.drawString(message, x, y);
        }
    }

    public void mouseClicked(MouseEvent e) {
        ((Component) e.getSource()).repaint();
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}
