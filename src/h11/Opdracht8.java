package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {

        int teller = 0;
        int w = 0;

        while(teller < 100){
            w += 10;

            g.drawOval(10,10,w,w);
            teller++;
        }

    }
}
