package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtHoogsteGetal extends Applet {
    TextField tekstvak;
    int hoogsteGetal;

    public void init(){
        tekstvak = new TextField("", 20);
        Label label = new Label("Type hier een getal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g){
        g.drawString("Hoogste getal: " + hoogsteGetal, 50, 60);

    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            String s = tekstvak.getText();
            int invoer = Integer.parseInt(s);
            if (invoer > hoogsteGetal) {
                hoogsteGetal = invoer;

            }

            repaint();
        }
    }
}
