package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstvak, tekstvak2;
    Button knop;
    Label naam, telefoonnummer;
    String[] namen;
    String[] nummers;
    int teller;


    public void init() {


        namen = new String[10];
        nummers = new String[10];
        teller = 0;

        naam = new Label("Voer hier een naam in: ");
        tekstvak = new TextField("",20);
        tekstvak.addActionListener( new KnopListener());
        telefoonnummer = new Label("Voer hier een telefoonnummer in: ");
        tekstvak2 = new TextField("",20);
        tekstvak2.addActionListener( new KnopListener());
        knop = new Button("Opslaan");
        knop.addActionListener( new KnopListener());

        add(naam);
        add(tekstvak);
        add(telefoonnummer);
        add(tekstvak2);
        add(knop);


    }

    public void paint(Graphics g) {


    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("KLIK");
            String naam = tekstvak.getText();
            String nummer = tekstvak2.getText();

            namen[teller] = naam;
            nummers[teller] = nummer;
            int y = 100;

            if (teller == 10 - 1){

                for (int i = 0; i < 10 ; i++) {
                    getGraphics().drawString(namen[i] + " " + nummers[i], 100, y);
                    y += 20;
                }
            }
            tekstvak.setText("");
            tekstvak2.setText("");
            teller++;
        }
    }
}
