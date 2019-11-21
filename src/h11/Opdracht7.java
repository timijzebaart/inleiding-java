package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
        setSize(500,500);
    }

    public void paint(Graphics g) {

        int teller;
        int x = 0;
        int w = 500;

        for(teller = 0; teller <50 ; teller++){

            g.drawOval(x, x, w, w);
            x += 5;
            w -= 10;
        }

    }
}
