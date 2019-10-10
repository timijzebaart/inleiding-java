package h07;

import java.applet.Applet;
import java.awt.*;

public class Vensters extends Applet {

    public void init() {
        setSize(400, 300);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}

