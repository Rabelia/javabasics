package lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class z6 {
    private static void Gui1() {
        JFrame frame = new JFrame();

        JButton btn = new JButton("say hi");
        btn.setBounds(100, 5, 100, 40);

        JTextField jt = new JTextField("type name");
        jt.setBounds(100, 55, 100, 40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {
                JOptionPane.showMessageDialog(null, "Hi " + jt.getText() + "!");
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