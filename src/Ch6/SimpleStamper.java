package Ch6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SimpleStamper extends JPanel implements MouseListener {
    public SimpleStamper() {
        setBackground(Color.BLACK);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Stamper");
        SimpleStamper content = new SimpleStamper();

        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(0, 0);
        window.setSize(1920, 1080);
        window.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        Graphics2D g = (Graphics2D) getGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int x = e.getX();
        int y = e.getY();

        if (e.isShiftDown()) {
            repaint();
            return;
        }

        if (e.getButton() == MouseEvent.BUTTON1) {
            g.setColor(Color.RED);
            g.fillRect(x - 40, y - 30, 80, 60);
            g.setColor(Color.WHITE);
            g.drawRect(x - 40, y - 30, 80, 60);
        }
        else if (e.getButton() == MouseEvent.BUTTON3) {
            g.setColor(Color.BLUE);
            g.fillOval(x - 40, y - 30, 80, 60);
            g.setColor(Color.WHITE);
            g.drawOval(x - 40, y - 30, 80, 60);
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}