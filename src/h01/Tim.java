/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Tim extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.BLUE);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Tim IJzebaart", 50, 60 );
    }

}