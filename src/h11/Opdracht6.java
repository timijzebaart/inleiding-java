package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {
        setSize(200,200);

    }

    public void paint(Graphics g) {

        int teller;
        int x = 0;
        int w = 100;

        for(teller = 0; teller <5 ; teller++){

            g.drawOval(x, x, w, w);
            x += 10;
            w -= 20;
        }

    }
}
