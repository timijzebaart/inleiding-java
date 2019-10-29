package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekstvak extends Applet {
    TextField tekstvak;
    Label label;
    String s;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvakje" + " en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        s = "";

    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
        }
}

