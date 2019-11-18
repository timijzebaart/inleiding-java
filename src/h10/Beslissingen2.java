package h10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen2 extends Applet {
    int leeftijd;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener());
        tekst = "";

        label = new Label("Geef uw leeftijd in en druk op enter");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);

    }

    class VakListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String s;

            s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);
            if (leeftijd > 20) {
                tekst = "U bent meerderjarig.";
            }
            else {
                tekst = "U bent minderjarig.";
            }
            repaint();
        }
    }
}
