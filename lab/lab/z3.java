package lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class z3 {
    private static void Gui1() {
        JFrame frame = new JFrame();

        JButton btn = new JButton("click");
        btn.setBounds(100, 10, 100, 40);

        btn.addActionListener(new ActionListener() {
            int i = 0;
            @Override
            public void actionPerformed(ActionEvent x) {
                i++;
                System.out.println("click count:" + i);
            }
        });


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