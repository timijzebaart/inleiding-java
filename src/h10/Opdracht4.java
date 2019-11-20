package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    TextField tekstvak, tekstvak2;
    Label label, label2;
    String s, tekst;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type hier het maandnummer in");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekstvak2 = new TextField("", 20);
        tekstvak2.addActionListener( new TekstvakListener() );
        label2 = new Label("Typ hier het jaartal in");

        knop = new Button("OK");
        knop.addActionListener( new TekstvakListener() );

        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);
        add(knop);

    }

    public void paint(Graphics g){

        g.drawString(tekst, 50, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
            int maand = Integer.parseInt( s);
            s = tekstvak2.getText();
            int jaartal = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "Januari, 31 dagen";
                    break;
                case 2:
                    tekst = "Februari, ";
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0){
                        tekst = "" + tekst + "29 dagen";
                    }
                    else{
                        tekst = "" + tekst + "28 dagen";
                    }
                    break;
                case 3:
                    tekst = "Maart, 31 dagen ";
                    break;
                case 4:
                    tekst = "April, 30 dagen";
                    break;
                case 5:
                    tekst = "Mei, 31 dagen";
                    break;
                case 6:
                    tekst = "Juni, 30 dagen";
                    break;
                case 7:
                    tekst = "Juli, 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus, 31 dagen";
                    break;
                case 9:
                    tekst = "September, 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "November, 30 dagen";
                    break;
                case 12:
                    tekst = "December, 31 dagen";
                    break;
                default:
                    tekst = "Dit is helaas geen geldig maand nummer ..!";
                    break;
            }
            repaint();
        }
    }
}


