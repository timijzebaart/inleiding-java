package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init(){

    }
    public void paint (Graphics g){

        setBackground(Color.white);

        g.setColor(Color.black);
        g.drawLine(10,10,90,10);
        g.drawString("Lijn",40,22);
        ///Lijn

        g.drawRect(10,30,80,50);
        g.drawString("Rechthoek",20,95);
        ///Rechthoek

        g.drawRoundRect(10,100,80,50,20,20);
        g.drawString("Afgeronde rechthoek",10,165);
        ///Afgeronde rechthoek

        g.setColor(Color.MAGENTA);
        g.fillRect( 150,30,80,50);
        g.setColor(Color.black);
        g.drawOval(150,30,80,50);
        g.drawString("Gevulde rechthoek met ovaal",100,95);
        ///Gevulde rechthoek met ovaal


    }
}
