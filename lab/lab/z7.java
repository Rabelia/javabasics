package lab;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class z7 {
    private static void Gui1() {
        JFrame frame = new JFrame();

        JButton btn = new JButton("Show message");
        btn.setBounds(10, 10, 200, 40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent x) {
                JDialog dialog = new JDialog();
                BufferedImage img = null;
                JLabel txt = new JLabel("Hello crab!");

                try {
                    img = ImageIO.read(new File("lab/icon/crab.png"));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }

                JLabel image = new JLabel(new ImageIcon(img));
                image.setBounds(150, 5, 512, 512);

                dialog.add(image);
                dialog.add(txt);
                dialog.setVisible(true);
                dialog.setSize(700, 560);
                dialog.setLocationRelativeTo(null);
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