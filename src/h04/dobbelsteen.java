package h04;

import java.applet.Applet;
import java.awt.*;

public class dobbelsteen extends Applet {

    public void init(){

    }

    public void paint (Graphics g){

        setBackground(Color.black);

        g.setColor(Color.white);
        g.fillRoundRect(150,80,100,100,25,25);
        ///witte dobbelsteen

        g.setColor(Color.black);
        g.fillOval(170,100,20,20);
        g.fillOval(170,140,20,20);
        g.fillOval(210,100,20,20);
        g.fillOval(210,140,20,20);
        ///dobbelsteen met 4 zwarte puntjes

    }
}
