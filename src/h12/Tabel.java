package h12;

import java.applet.Applet;
import java.awt.*;

public class Tabel extends Applet {

    double[] salaris;
    double[] kopie;

    public void init() {
        salaris = new double [5];
        kopie = new double[5];

        for (int teller = 0; teller < salaris.length; teller++) {
            salaris[teller] = 100 * teller + 100;
        }
        for (int teller = 0; teller < salaris.length; teller++) {
            kopie[teller] = salaris[teller];
        }
        kopie = salaris;
        kopie[3] = 1000;

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
            g.drawString("" + kopie[teller], 50,20 * teller + 20);
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }


    }
}
