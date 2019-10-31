package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht81 extends Applet  {
    TextField tekstvak;
    Label label;
    Button knop, resetknop;
    String s;

    public void init() {
        tekstvak = new TextField("Klik hier",20);
        tekstvak.addActionListener( new  TekstvakListener() );

        label = new Label("Typ in het tekstvak uw antwoord"    );

        knop = new Button("Ok");
        resetknop = new Button("Reset");
        knop.addActionListener( new  KnopListener() );
        resetknop.addActionListener( new ResetknopListener() );

        add(label);
        add(tekstvak);
        add(knop);
        add(resetknop);
        s = "";

    }


    public void paint(Graphics g) {
        g.drawString(s, 70,70);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class KnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            s = tekstvak.getText();
            repaint();
        }
    }
    class ResetknopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            tekstvak.setText("");
            repaint();
        }
    }
}
