package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller <10){
            x += 20;
            g.drawLine(x, 50, x, 300);
            teller++;
        }

    }
}
