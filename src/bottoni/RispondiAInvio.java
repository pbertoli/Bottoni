package bottoni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class RispondiAInvio implements ActionListener {

    Bottoni frame; 

    public RispondiAInvio(Bottoni frame) {
        this.frame=frame;
    }

    public void actionPerformed(ActionEvent e) {
        Object t = e.getSource();
        if (t == frame.getT1()) {
            System.out.println("Sono JTextField1 "+e.getActionCommand());
        } else if (t == frame.getT2())
            System.out.println("Sono JTextField2 "+e.getActionCommand());
        else if (t == frame.getT3())
            System.out.println("Sono JTextField3 "+e.getActionCommand());
        else
            System.out.println("Non so chi sono "+e.getActionCommand());
    }
}
