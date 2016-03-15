package gui.powitanie;

import javax.swing.*;

/**
 * Created by Marta Pawlik on 3.02.2016.
 */
public class Powitanie {


    public Powitanie() {

        JFrame jFrame = new JFrame();

        String imie = JOptionPane.showInputDialog(jFrame, "Podaj imię: ");

        JOptionPane.showMessageDialog(jFrame, "Dzień dobry " + imie);
        System.exit(0);



    }


}
