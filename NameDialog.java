import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What Is Your Name ?");
        String message = String.format("Welcome, %s, To Java Programming!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
