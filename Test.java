import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        String message = String.format("%s,Welcome To Java",name);
        JOptionPane.showMessageDialog(null, message, message, 0);
    }
}