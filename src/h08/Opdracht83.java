package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht83 extends Applet  {
    TextField tekstvak;
    Label label;
    Button knop;
    Double btw, getal;

    public void init() {
        tekstvak = new TextField("",20);
        tekstvak.addActionListener( new  TekstvakListener() );

        label = new Label("Het te berekenen bedrag: "    );

        knop = new Button("Ok");
        knop.addActionListener( new  KnopListener() );

        add(label);
        add(tekstvak);
        add(knop);

        btw = getal / 100 * 21;


    }


    public void paint(Graphics g) {
        g.drawString("Bedrag incl. 21% BTW: " + getal, 70,70);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
    class KnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            tekstvak.getText();
            repaint();
        }
    }

}
