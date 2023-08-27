import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Shapes extends JPanel{
    private int choice;
    public Shapes(int userChoice){
        choice = userChoice;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i< 10;i++){
            switch (choice) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;

                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                
                case 3:
                   
                    int x[] = {50 + i * 10, 75 + i * 10, 100 + i * 10};
                    int y[] = {10 + i * 10, 60 + i * 10, 10 + i * 10};
                    g.fillPolygon(x, y, 3);
                    break;

            
                default:
                    break;
            }
        }
    }

     public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangle \n" + "Enter 2 to draw ovale \n" + "Enter 3 to draw triangle");
        int choice = Integer.parseInt(input);
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }
}



