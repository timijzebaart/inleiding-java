package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstvak;
    Button knop;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {

        tekstvak = new TextField("",20);
        tekstvak.addActionListener( new TekstvakListener());
        knop = new Button("OK");
        knop.addActionListener( new TekstvakListener());
        label = new Label("Voer hier uw cijfer in ");
        tekst = "";

        add(label);
        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(tekst,168,50);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s);
            switch(cijfer) {
                case 1:
                    tekst = "Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                default:
                    tekst = "U heeft een verkeerd cijfer ingevoerd.";
                    break;
            }
            repaint();
        }
    }
}
