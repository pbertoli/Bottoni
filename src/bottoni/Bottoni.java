package bottoni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bottoni extends JFrame {

    public static final int MAX_WIDTH = 600;
    public static final int MAX_HEIGHT = 500;
    JButton b1, b2, b3, b4;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

    public JButton getB1() {
        return b1;
    }

    public JButton getB2() {
        return b2;
    }

    public JButton getB3() {
        return b3;
    }

    public JButton getB4() {
        return b4;
    }

    public JTextField getT1() {
        return t1;
    }

    public JTextField getT2() {
        return t2;
    }

    public JTextField getT3() {
        return t3;
    }

    public Bottoni() {
        super("Intercettiamo degli eventi");
        setPreferredSize(new Dimension(MAX_WIDTH, MAX_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        b1 = new JButton("OK");
        b1.setPreferredSize(new Dimension(80, 30));
        b2 = new JButton("Annulla");
        b2.setPreferredSize(new Dimension(80, 30));
        b3 = new JButton("Reset");
        b3.setPreferredSize(new Dimension(80, 30));
        b4 = new JButton("Insert");
        b4.setPreferredSize(new Dimension(80, 30));

        ActionListener onClick = new RispondiAlClick(this);

        b1.addActionListener(onClick);
        b2.addActionListener(onClick);
        b3.addActionListener(onClick);
        b4.addActionListener(onClick);

        JPanel pSouth = new JPanel();
        pSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pSouth.add(b1);
        pSouth.add(b2);
        pSouth.setBackground(Color.pink);
        add(pSouth, BorderLayout.SOUTH);

        JPanel pEast = new JPanel();
        pEast.setLayout(new BoxLayout(pEast, BoxLayout.Y_AXIS));
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        pEast.setBackground(Color.pink);
        pEast.add(b3);
        pEast.add(b4);
        add(pEast, BorderLayout.EAST);

        JPanel pCenter = new JPanel();
        pCenter.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        l1 = new JLabel("Cognome: ");
        l2 = new JLabel("Nome: ");
        l3 = new JLabel("Impiego: ");
        l1.setFont(new Font("Tahoma", 0, 20));
        l2.setFont(new Font("Tahoma", 0, 20));
        l3.setFont(new Font("Tahoma", 0, 20));
        t1 = new JTextField("<cognome>");
        t2 = new JTextField("<nome>");
        t3 = new JTextField("<impiego>");
        t1.setFont(new Font("Tahoma", 0, 18));
        t2.setFont(new Font("Tahoma", 0, 18));
        t3.setFont(new Font("Tahoma", 0, 18));
        
        ActionListener onInvio = new RispondiAInvio(this);
        t1.addActionListener(onInvio);
        t2.addActionListener(onInvio);
        t3.addActionListener(onInvio);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.0;
        c.insets = new Insets(10, 10, 10, 10);
        c.gridx = 0;
        c.gridy = 0;
        pCenter.add(l1, c);
        c.gridx = 1;
        pCenter.add(t1, c);
        c.gridx = 0;
        c.gridy = 1;
        pCenter.add(l2, c);
        c.gridx = 1;
        pCenter.add(t2, c);
        c.gridx = 0;
        c.gridy = 2;
        pCenter.add(l3, c);
        c.gridx = 1;
        pCenter.add(t3, c);
        add(pCenter, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public static void test() {
        Bottoni b = new Bottoni();
    }
}
