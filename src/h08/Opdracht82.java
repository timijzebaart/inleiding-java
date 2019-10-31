package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht82 extends Applet {
    Button manknop, vrouwknop, jongenknop, meisjeknop;
    int tellerman, tellervrouw, tellerjongen, tellermeisje;

    public void init() {
        manknop = new Button("Man");
        manknop.addActionListener( new ManknopListener() );
        vrouwknop = new Button("Vrouw");
        vrouwknop.addActionListener( new VrouwknopListener() );
        jongenknop = new Button("Jongen");
        jongenknop.addActionListener( new JongenknopListener() );
        meisjeknop = new Button("Meisje");
        meisjeknop.addActionListener( new MeisjeknopListener() );

        add(manknop);
        add(vrouwknop);
        add(jongenknop);
        add(meisjeknop);

        tellerman =  0;
        tellervrouw = 0;
        tellerjongen = 0;
        tellermeisje = 0;

    }

    public void paint(Graphics g) {

        g.drawString(" " + tellerman, 120,40);
        g.drawString(" " + tellervrouw, 170, 40);
        g.drawString(" " + tellerjongen, 230,40);
        g.drawString(" " + tellermeisje, 285,40);
        g.drawString("Totaal: " + (tellerman + tellervrouw + tellerjongen + tellermeisje),  320,40);

    }

    class ManknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellerman++;
            repaint();

        }

    }

    class VrouwknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        tellervrouw++;
        repaint();

        }

    }

    class JongenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellerjongen++;
            repaint();

        }

    }

    class MeisjeknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellermeisje++;
            repaint();

        }

    }


}
