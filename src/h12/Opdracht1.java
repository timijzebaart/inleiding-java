package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double[] getallen;
    double gemiddelde;

    public void init() {
        getallen = new double [10];
        getallen[0] = 5;
        getallen[1] = 8;
        getallen[2] = 9;
        getallen[3] = 7.6;
        getallen[4] = 3.2;
        getallen[5] = 6.3;
        getallen[6] = 4;
        getallen[7] = 6.9;
        getallen[8] = 8.2;
        getallen[9] = 10;

        gemiddelde = (getallen[0] + getallen[1] + getallen[2] + getallen[3] + getallen[4] + getallen[5] + getallen[6] + getallen[7] + getallen[8] + getallen[9]) / 10;


    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        for (int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller],x,y * teller + 20);
        }
        g.drawString("Het gemiddelde is: " + gemiddelde, 120,20);



    }
}
