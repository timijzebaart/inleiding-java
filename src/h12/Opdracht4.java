package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

    TextField tekstvak;
    int[] getallen = {2, 4, 6, 8, 9, 12, 15, 17, 19};
    Button knop;



    public void init() {
        tekstvak = new TextField("",20);
        tekstvak.addActionListener( new KnopListener());

        knop = new Button("OK");
        knop.addActionListener( new KnopListener() );

        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputString = tekstvak.getText();
            int inputInt = Integer.parseInt(inputString);
            int index = -1;

            for (int i = 0; i < getallen.length; i++) {
                if(getallen[i] == inputInt){
                    index = i;
                }
            }
            if (index != -1){
                getGraphics().clearRect(0,0,400,400);
                getGraphics().drawString("We hebben hem gevonden. Hij zit op index " + index, 50, 100);
                tekstvak.setText("");
            }
            else {
                getGraphics().clearRect(0,0,400,400);
                getGraphics().drawString("We hebben hem helaas niet gevonden. ", 50, 100);
                tekstvak.setText("");
            }

        }
    }
}
