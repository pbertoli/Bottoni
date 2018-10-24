package bottoni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class RispondiAlClick implements ActionListener{
    JButton b1,b2,b3;
    
    public RispondiAlClick(JButton b1, JButton b2,JButton b3,JButton b4) {
        this.b1=b1;
        this.b2=b2;
        this.b3=b3;
    }

    public void actionPerformed(ActionEvent e) {
        Object b = e.getSource();
        if (b == b1) {
            System.out.println("Sono il primo bottone");
        } else if (b == b2) {
            System.out.println("Sono il secondo bottone");
        } else {
            System.out.println("Chi mi ha chiamato? Bohh");
        }
    }   
}
