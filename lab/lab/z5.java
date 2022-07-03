package lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class z5 {
    private static void Gui1() {
        JFrame frame = new JFrame();

        JButton btn = new JButton("show");
        btn.setBounds(100, 10, 100, 40);

        JTextField jt = new JTextField("");
        jt.setBounds(100, 100, 100, 20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {
                System.out.println(jt.getText());
            }
        });

        frame.add(jt);
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