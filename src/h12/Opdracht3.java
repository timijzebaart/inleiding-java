package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {
    TextField[] tekstvakken;
    int[] getallen;
    Button knop;


    public void init() {
        setSize(400,400);

        tekstvakken = new TextField[5];
        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i]  = new TextField(20);
            add(tekstvakken[i]);
        }

        knop = new Button("OK");
        knop.addActionListener( new KnopListener() );

        getallen = new int[5];

        add(knop);


    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;

        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i].setLocation(x, y);
            y += 50;
        }
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvakken.length; i++) {
                String inputString = tekstvakken[i].getText();
                int inputInt = Integer.parseInt(inputString);
                getallen[i] = inputInt;
            }
            Arrays.sort(getallen);

            for (int i = 0; i < tekstvakken.length; i++) {
                String output = getallen[i] + "";
                tekstvakken[i].setText(output);
            }


        }
    }
}
