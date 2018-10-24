package bottoni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bottoni extends JFrame {

    public static final int MAX_WIDTH = 600;
    public static final int MAX_HEIGHT = 500;
    JButton b1, b2, b3, b4, b5, b6;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;

    public Bottoni() {
        super("Intercettiamo degli eventi");
        setPreferredSize(new Dimension(MAX_WIDTH, MAX_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        b1 = new JButton("OK");
        b2 = new JButton("Annulla");
        b3 = new JButton("Reset");
        b4 = new JButton("Insert");

        b1.addActionListener(new RispondiAlClick(b1, b2, b3, b4));
        b2.addActionListener(new RispondiAlClick(b1, b2, b3, b4));
        b3.addActionListener(new RispondiAlClick(b1, b2, b3, b4));
        b4.addActionListener(new RispondiAlClick(b1, b2, b3, b4));
        
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
        pCenter.setLayout(new GridLayout(5,2));
        l1 = new JLabel("Cognome: ");
        l2 = new JLabel("Nome: ");
        l3 = new JLabel("Impiego: ");
        t1 = new JTextField("<cognome>");
        t2 = new JTextField("<nome>");
        t3 = new JTextField("<impiego>");
        l1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        l2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        l3.setAlignmentX(Component.RIGHT_ALIGNMENT);
        t1.setAlignmentX(Component.LEFT_ALIGNMENT);
        t2.setAlignmentX(Component.LEFT_ALIGNMENT);
        t3.setAlignmentX(Component.LEFT_ALIGNMENT);
        t1.addActionListener( new RispondiAInvio(t1,t2,t3));
        t2.addActionListener( new RispondiAInvio(t1,t2,t3));
        t3.addActionListener( new RispondiAInvio(t1,t2,t3));
        pCenter.add(l1);
        pCenter.add(t1);
        pCenter.add(l2);
        pCenter.add(t2);
        pCenter.add(l3);
        pCenter.add(t3);
        add(pCenter, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public static void test() {
        Bottoni b = new Bottoni();
    }
}
