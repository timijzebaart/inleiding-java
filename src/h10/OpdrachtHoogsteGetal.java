package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtHoogsteGetal extends Applet {
    TextField tekstvak;
    int hoogsteGetal, laagsteGetal;
    boolean firstNumber;

    public void init(){
        tekstvak = new TextField("", 20);
        Label label = new Label("Type hier een getal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        firstNumber = true;
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g){
        g.drawString("Hoogste getal: " + hoogsteGetal, 50, 60);
        g.drawString("Laagste getal: " + laagsteGetal, 50, 80);

    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            String s = tekstvak.getText();
            int invoer = Integer.parseInt(s);
            if (firstNumber){
                firstNumber = false;
                hoogsteGetal = invoer;
                laagsteGetal = invoer;
            }
            else {
                if (invoer > hoogsteGetal) {
                    hoogsteGetal = invoer;
                } else if (invoer < laagsteGetal) {
                    laagsteGetal = invoer;
                }
            }

            repaint();
        }
    }
}
