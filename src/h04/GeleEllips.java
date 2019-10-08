package h04;

import java.applet.Applet;
import java.awt.*;

public class GeleEllips extends Applet {

    public void init(){

    }

    public void paint (Graphics g){

        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(150,100,100,100,150,360);
    }
}
