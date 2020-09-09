package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {


    public void init() {
        setSize(650, 650);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        tekenMuur(g);

    }

    void tekenMuur(Graphics g){

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

}
