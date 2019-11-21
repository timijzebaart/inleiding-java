package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstvak;
    Button knop;
    Label label;
    String s, tekst;
    int tafel;


    public void init() {

        tekstvak = new TextField("",20);
        tekstvak.addActionListener( new TekstvakListener());
        knop = new Button("OK");
        knop.addActionListener( new TekstvakListener());
        label = new Label("Typ hier welke tafel u wilt oefenen");
        tekst = "";

        add(label);
        add(tekstvak);
        add(knop);


    }

    public void paint(Graphics g) {
        int y = 70;
        for (int i = 1; i < 11; i++) {
            g.drawString(i + " X " + tafel + " = " + (i * tafel), 50, y);
            y += 20;
        }

    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tafel = Integer.parseInt(s);
            repaint();
        }

    }
}

