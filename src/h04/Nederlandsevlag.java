package h04;

import java.applet.Applet;
import java.awt.*;

public class Nederlandsevlag extends Applet {

    public void init() {

    }

    public void paint (Graphics g) {

        setBackground(Color.LIGHT_GRAY);


        g.setColor(Color.black);
        g.fillRect(100,100,2,100);
        ///stok


        g.setColor(Color.red);
        g.fillRect(102,110,50,10);

        g.setColor(Color.white);
        g.fillRect(102,120,50,10);

        g.setColor(Color.blue);
        g.fillRect(102,130,50,10);
        ///Nederlandsevlag

        g.setColor(Color.black);
        g.fillOval(91,200,20,10);
        ///Voet



    }
}
