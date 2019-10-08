package h04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {

    public void init() {

    }

    public void paint (Graphics g) {

        setBackground(Color.black);
        g.setColor(Color.white);

        g.drawRect(140, 160, 100, 120);
        ///huis

        g.drawRect(160, 180, 25, 25);
        ///raam linksboven

        g.drawRect(200, 180, 25, 25);
        ///raam rechtsboven

        g.drawRect(190, 245, 42, 25);
        ///raam rechtsonder

        g.drawRect(160, 248, 20, 32);
        ///deur

        g.drawRect(165, 253, 10, 8);
        ///raam in deur

        g.drawRect(163, 266, 2, 2);
        ///deurknop

        g.drawLine(140, 160, 195, 100);
        g.drawLine(195, 100, 240, 160);
        ///dak

    }
}
