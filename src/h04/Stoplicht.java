package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {

    public void init(){

    }
    public void paint (Graphics g){

        setBackground(Color.white);

        g.setColor(Color.black);
        g.fillRect(100,30,150,220);
        ///achtergrond stoplicht

        g.setColor(Color.gray);
        g.drawRect(100,30,150,220);
        g.fillRect(165,250,20,80);
        ///rand en voet

        g.setColor(Color.red);
        g.fillOval(145, 45, 60, 60);
        g.setColor(Color.lightGray);
        g.drawOval(145,45,60,60);
        ///rood stoplicht kleur

        g.setColor(Color.orange);
        g.fillOval(145, 110, 60, 60);
        g.setColor(Color.lightGray);
        g.drawOval(145,110,60,60);
        ///oranje stoplicht kleur

        g.setColor(Color.green);
        g.fillOval(145, 175, 60, 60);
        g.setColor(Color.lightGray);
        g.drawOval(145,175,60,60);
        ///groen stoplicht kleur


    }
}
