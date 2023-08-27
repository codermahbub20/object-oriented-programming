import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

         // Draw Sad Face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        g.setColor(Color.BLACK);
        g.fillOval(55, 75, 30, 30);
        g.fillOval(135, 75, 30, 30);

        // Draw a frowning mouth
        g.drawArc(65, 120, 80, 60, 0, 180);
    }

    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}







