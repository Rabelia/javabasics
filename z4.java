package lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class z4 {
    private static void Gui1() {
        JFrame frame = new JFrame();

        JButton btn1 = new JButton("1");
        btn1.setBounds(5, 5, 50, 50);

        JButton btn2 = new JButton("2");
        btn2.setBounds(55, 5, 50, 50);

        JButton btn3 = new JButton("3");
        btn3.setBounds(105, 5, 50, 50);

        JButton btnplus = new JButton("+");
        btnplus.setBounds(155, 5, 50, 50);

        JTextField jt = new JTextField("");
        jt.setBounds(100, 100, 100, 20);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {
                String prev_text = jt.getText();
                String new_text = prev_text + "1";
                jt.setText(new_text);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {
                String prev_text = jt.getText();
                String new_text = prev_text + "2";
                jt.setText(new_text);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {
                String prev_text = jt.getText();
                String new_text = prev_text + "3";
                jt.setText(new_text);
            }
        });

        btnplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {
                String prev_text = jt.getText();
                String new_text = prev_text + "+";
                jt.setText(new_text);
            }
        });


        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btnplus);

        frame.add(jt);
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