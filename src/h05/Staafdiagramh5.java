package h05;

import java.applet.Applet;
        import java.awt.*;

public class Staafdiagramh5 extends Applet {
        int hoogteXas;
        int gewichtJeroen;
        int gewichtHans;
        int gewichtValerie;




    public void init() {
        gewichtJeroen = 140;
        gewichtHans = 20;
        gewichtValerie = 60;
        hoogteXas = 240;

    }

    public void paint (Graphics g) {

        setBackground(Color.black);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90,60,200,200);
        ///Achtergrond staafdiagram

        g.setColor(Color.white);
        g.drawRect(90,60,200,200);
        ///witte rand

        g.setColor(Color.white);
        g.drawRect(130,80,160,160);
        ///witte rand in de staafdiagram

        g.setColor(Color.black);
        g.drawString("Gewicht in KG", 100, 76);

            g.setColor(Color.black);
            g.drawLine(132, 240, 128, 240);
            g.drawString("0", 120, 244);
            ///0kg

            g.drawLine(132, 220, 128, 220);
            g.drawString("20", 113, 224);
            ///20kg

            g.drawLine(132, 200, 128, 200);
            g.drawString("40", 113, 204);
            ///40kg

            g.drawLine(132, 180, 128, 180);
            g.drawString("60", 113, 184);
            ///60kg

            g.drawLine(132, 160, 128, 160);
            g.drawString("80", 113, 164);
            ///80kg

            g.drawLine(132, 140, 128, 140);
            g.drawString("100", 105, 144);
            ///100kg

            g.drawLine(132, 120, 128, 120);
            g.drawString("120", 105, 124);
            ///120kg

            g.drawLine(132, 100, 128, 100);
            g.drawString("140", 105, 104);
            ///140kg

        g.setColor(Color.red);
        g.fillRect(132, hoogteXas - gewichtJeroen,40,gewichtJeroen);
        g.drawString("Jeroen", 130, 255);
        ///100kg Jeroen

        g.setColor(Color.blue);
        g.fillRect(172, hoogteXas - gewichtHans,40,gewichtHans);
        g.drawString("Hans", 175, 255);
        ///80kg Hans

        g.setColor(Color.yellow);
        g.fillRect(212, hoogteXas - gewichtValerie,40,gewichtValerie);
        g.drawString("Valerie", 215, 255);
        ///40kg Valerie



    }
}
