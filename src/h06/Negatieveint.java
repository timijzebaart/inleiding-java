package h06;

import java.applet.Applet;
import java.awt.*;

public class Negatieveint extends Applet {
    int a,b, resultaat;

    public void init(){
        a = 2147483647;
        b = 1;
        resultaat = a + b;


    }
    public void paint (Graphics g){
        setBackground(Color.lightGray);

        g.drawString("Negatieve int waarde: "+ resultaat,30,50);

    }
}
