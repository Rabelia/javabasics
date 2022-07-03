package lab;
import javax.swing.*;
import java.awt.*;

public class z2 {
    private static void Gui1() {
        JFrame frame = new JFrame();

        JButton btn = new JButton("click");
        btn.setBounds(5, 5, 250, 250);

        Icon button_icon = new ImageIcon("lab/icon/button.png");
        btn.setIcon(button_icon);

        frame.add(btn);
        frame.setSize(300, 300);
        frame.setLayout((LayoutManager)null);
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