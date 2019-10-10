package h06;

import java.applet.Applet;
import java.awt.*;

public class Secondeberekening extends Applet {

    int seconden, uur, dag, jaar;
    int uitkomstUur, uitkomstDag, uitkomstJaar;


    public void init(){
        seconden = 60;
        uur = 60;
        dag = 24;
        jaar = dag * 365;
        uitkomstUur = seconden * uur;
        uitkomstDag = uitkomstUur * dag;
        uitkomstJaar = uitkomstDag * jaar;
    }

    public void paint (Graphics g){

        setBackground(Color.lightGray);

        g.setColor(Color.black);
        g.drawString("Uitkomst secondes in een uur: " + uitkomstUur,30,40);
        g.drawString("Uitkomst secondes in een dag: "+ uitkomstDag, 30,80);
        g.drawString("Uitkomst secondes in een jaar: "+ uitkomstJaar, 30,120);

    }
}
