package h06;

import java.applet.Applet;
import java.awt.*;

public class Cursistcijfers extends Applet {
    double a,b,c,totaal,gemiddeldedouble,gemiddelde,gemiddeldeint;


    public void init(){
        a = 5.9;
        b = 6.3;
        c = 6.9;
        totaal = a+b+c;
        gemiddeldedouble = totaal / 3;
        gemiddeldeint = (int) (gemiddeldedouble * 10);
        gemiddelde = gemiddeldeint / 10;


    }
    public void paint (Graphics g){
        setBackground(Color.lightGray);

        g.setColor(Color.blue);
        g.drawString("Het gemiddelde is: "+ gemiddelde, 30,50);



    }
}
