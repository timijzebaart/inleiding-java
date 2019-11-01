package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht83 extends Applet  {
    TextField tekstvak;
    Label label;
    Button knop;
    double getal;

    public void init() {
        tekstvak = new TextField("",20);
        tekstvak.addActionListener( new  TekstvakListener() );

        label = new Label("Het te berekenen bedrag: "    );

        knop = new Button("Ok");
        knop.addActionListener( new  TekstvakListener() );

        add(label);
        add(tekstvak);
        add(knop);

    }


    public void paint(Graphics g) {
        g.drawString("Bedrag incl. 21% BTW: " + getal, 70,70);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal=getal*1.21;
            repaint();
        }
    }


}
