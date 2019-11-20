package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    TextField tekstvak;
    Label label;
    Button knop;
    String s, tekst;
    double optelsom;
    int aantal;

    public void init(){
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TekstvakListener() );
        label = new Label("Typ hier uw cijfer");
        knop = new Button("OK");
        knop.addActionListener( new KnopListener() );

        optelsom = 0;
        aantal = 0;

        tekst = "";

        add(label);
        add(tekstvak);
        add(knop);


    }

    public void paint(Graphics g){
        g.drawString(tekst, 160,45);


    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal++;
            s = tekstvak.getText();
            double cijfer = Double.parseDouble(s);
            optelsom += cijfer;
            tekstvak.setText(" ");

            if (cijfer >= 5.5) {
                tekst = "Voldoende";
            }
            else {
                tekst = "Onvoldoende";
            }
            repaint();

        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double gemiddelde = optelsom / aantal;
            getGraphics().drawString("Het gemiddelde is: " + gemiddelde, 120,80);
        }
    }

}

