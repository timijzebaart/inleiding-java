package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    Button knop, knop2;

    public void init() {
        setSize(650, 650);
        setBackground(Color.lightGray);

        knop = new Button("Rode muur");
        knop.addActionListener(new KnopListener() );

        knop2 = new Button("Grijze muur");
        knop2.addActionListener(new Knop2Listener() );

        add(knop);
        add(knop2);



    }

    class KnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e) {
            rodeMuur(getGraphics());
        }
    }

    class Knop2Listener implements ActionListener{
        public void actionPerformed( ActionEvent e) {
            grijzeMuur(getGraphics());
        }
    }
    void rodeMuur(Graphics g){

        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 650, 650);

        int x, y;
        g.setColor(Color.red);


        for (int rijnummer = 1; rijnummer <= 5; rijnummer++) {
            for (int j = 0; j < 5; j++){
                int startX;
                if (rijnummer % 2 == 0) {
                    startX = 55;
                } else {
                    startX = 30;
                }
                x = j * 55 + startX;
                y = rijnummer * 25;
                g.fillRect(x, y, 50, 20);
            }
        }
    }
    void grijzeMuur(Graphics g){

        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 650, 650);

        int x, y;
        g.setColor(Color.darkGray);



        for (int rijnummer = 1; rijnummer <= 5; rijnummer++) {
            for (int j = 0; j < 5; j++){
                int startX;
                if (rijnummer % 2 == 0) {
                    startX = 55;
                } else {
                    startX = 30;
                }
                x = j * 75 + startX;
                y = rijnummer * 25;
                g.fillRect(x, y, 70, 20);
            }
        }
    }
}
