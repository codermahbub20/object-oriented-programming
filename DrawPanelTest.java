import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel(); // Corrected instantiation

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected method name

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
