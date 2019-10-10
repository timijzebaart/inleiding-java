package h06;

import java.applet.Applet;
import java.awt.*;

public class Berekening extends Applet {
    int totaal;
    double uitkomstJan;
    double uitkomstAli;
    double uitkomstJeannette;
    double uitkomstTim;

    public void init(){
        totaal = 113;
        uitkomstJan = (double)totaal / 4;
        uitkomstAli = (double)totaal / 4;
        uitkomstJeannette = (double)totaal / 4;
        uitkomstTim = (double)totaal / 4;

    }
    public void paint (Graphics g){

        setBackground(Color.black);

        g.setColor(Color.white);
        g.drawString("Jan " + uitkomstJan, 20, 20);
        g.drawString("Ali " + uitkomstAli, 20, 40);
        g.drawString("Jeannette " + uitkomstJeannette, 20, 60);
        g.drawString("Tim " + uitkomstTim, 20, 80);





    }
}
