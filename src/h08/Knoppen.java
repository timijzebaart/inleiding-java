package h08;

import java.applet.Applet;
import java.awt.*;

public class Knoppen extends Applet {
    Button knop;

    public void init(){
        knop = new Button();
        knop.setLabel( "Klik op mij");
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?", 50,60);

    }
}
