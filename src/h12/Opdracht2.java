package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    Button[] knop;
    int knopteller = 25;

    public void init() {
        knop = new Button[knopteller];

        for (int teller = 0; teller < knopteller; teller++) {
            knop[teller] = new Button("Knop" + teller);
        }
        for (int teller = 0; teller < knopteller; teller++) {
            add(knop[teller]);
        }

    }


}
