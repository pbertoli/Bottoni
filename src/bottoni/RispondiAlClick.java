package bottoni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RispondiAlClick implements ActionListener {

    Bottoni frame;

    public RispondiAlClick(Bottoni frame) {
        this.frame = frame; 
    }

    public void actionPerformed(ActionEvent e) {
        Object b = e.getSource();
        if (b == frame.getB1()) {
            System.out.println("Sono il primo bottone " + e.getActionCommand());
            frame.dispose();
        } else if (b == frame.getB2()) {
            System.out.println("Sono il secondo bottone " + e.getActionCommand());
            frame.getT1().setText("<cognome>");
            frame.getT2().setText("<nome>");
            frame.getT3().setText("<impiego>");
        } else if (b == frame.getB3()) {
            System.out.println("Sono il terzo bottone " + e.getActionCommand());
            frame.getT1().setText("");
            frame.getT2().setText("");
            frame.getT3().setText("");
        } else if (b == frame.getB4()) {
            System.out.println("Sono il quarto bottone " + e.getActionCommand());
            // TO DO inviare i dati della finestra
        } else {
            System.out.println("Non so chi sono. Bohh" + e.getActionCommand());
        }
    }
}
