package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 1;
        int x = 0;
        int a = 1;
        int b = 1;

        while(teller < 30){
            x += 20;
            teller = (a + b) + teller;
            g.drawString("" + teller, x, 50);
            teller++;


        }
    }
}