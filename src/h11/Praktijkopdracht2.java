package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2 extends Applet {

    Button knop;
    Label label;
    int teller;

    public void init() {

        knop = new Button("OK");
        knop.addActionListener( new KnopListener());
        label = new Label("Klik op OK voor het volgende tabel");

        add(label);
        add(knop);

        teller = 1;
    }

    public void paint(Graphics g) {

        int y = 70;
        for (int i = 1; i < 11; i++) {

            if (teller < 11){
                g.drawString(i + " X " + teller + " = " + (i * teller), 50, y);
                y += 20;
            }
            else {
                teller = 0;

            }
        }


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            repaint();
        }
    }

}
