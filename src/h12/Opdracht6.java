package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht6 extends Applet {

    int[] waardes = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8, 8, 9, 9, 9, 9};
    TextField tekstvak;
    Button knop;

    public void init() {

        tekstvak = new TextField("",20);
        tekstvak.addActionListener( new TekstvakListener() );

        knop = new Button("SHOW");
        knop.addActionListener( new TekstvakListener() );

        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {

    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputString = tekstvak.getText();
            int inputInt = Integer.parseInt(inputString);
            int aantal = 0;


            for (int teller = 0; teller < waardes.length; teller++) {
                if (waardes[teller] == inputInt ){

                    aantal++;

                }
            }
            getGraphics().clearRect(0,0,400,400);
            getGraphics().drawString("De waarde " + inputInt + " komt " + aantal + " keer voor.", 100,40 );
            tekstvak.setText("");
        }
    }
}
