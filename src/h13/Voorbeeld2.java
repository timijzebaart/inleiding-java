package h13;

import java.applet.Applet;
import java.awt.*;

public class Voorbeeld2 extends Applet {

    double gem;

    public void init() {
        double c = 6;
        double d = 7;
        berekenGemiddelde(c, d);

    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gem, 50,60);
    }

    void berekenGemiddelde(double a, double b){
        double som;

        som = a + b;
        gem = som / 2;

    }
}
