package lab;
import javax.swing.*;

public class z1 {
    private static void Gui1() {
        JFrame frame = new JFrame();

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Gui1();
            }
        });
    }
}