package h05;

import java.applet.Applet;
        import java.awt.*;

public class Praktijkopdrachth5 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){

        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 80;
        hoogte = 50;

    }
    public void paint (Graphics g){

        setBackground(Color.white);

        g.setColor(lijnkleur);
        g.drawLine(10,10,90,10);
        g.drawString("Lijn",40,22);
        ///Lijn

        g.drawRect(10,30,breedte,hoogte);
        g.drawString("Rechthoek",20,95);
        ///Rechthoek

        g.drawRoundRect(10,100,breedte,hoogte,20,20);
        g.drawString("Afgeronde rechthoek",10,165);
        ///Afgeronde rechthoek

        g.setColor(opvulkleur);
        g.fillRect( 150,30,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(150,30,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",100,95);
        ///Gevulde rechthoek met ovaal

        g.setColor(opvulkleur);
        g.fillOval(150,100,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",150,165);
        ///Gevulde ovaal

        g.drawOval(300,30,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(300,30,breedte,hoogte,1,45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen",270,95);
        ///Taartpunt met ovaal eromheen

        g.setColor(lijnkleur);
        g.drawOval(300,100,50,hoogte);
        g.drawString("Cirkel",310,165);
        ///Cirkel


    }
}
