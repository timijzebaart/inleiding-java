package h13;

import java.awt.*;
import java.applet.Applet;

public class Opdracht1 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        int x1, y1, x2, y2, x3, y3;

        x1 = x2 = x3 = 160;
        y1 = y2 = y3 = 120;

        for (int i = 0; i < 100 ; i++) {
            tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
            y1--; x2--; y2++; x3++; y3++;
        }
        tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
}