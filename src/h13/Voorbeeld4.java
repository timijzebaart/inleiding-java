package h13;

import java.applet.Applet;
import java.awt.*;

public class Voorbeeld4 extends Applet {

    double[] getallen = { 2, 4, 6, 8};
    double gemiddelde;

    public void init() {
        gemiddelde = berekenGemiddelde(getallen);
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde, 50, 60);
    }

    double berekenGemiddelde(double[] d){
        int teller;
        double som = 0;
        double gem = 0;

        for (teller = 0; teller < d.length; teller++){
            som += d[teller];
        }
        gem = som / d.length;

        return gem;
    }
}
