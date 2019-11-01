package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField tekstvak1, tekstvak2;
    Button vermenigvuldig, delen, plus, minus;




    public void init() {
        tekstvak1 = new TextField(" ",  15);
        tekstvak2 = new TextField(" ", 15);

        vermenigvuldig = new Button("*");
        vermenigvuldig.addActionListener( new VermenigvuldigListener() );

        delen = new Button("/");
        delen.addActionListener( new DelenListener() );

        plus = new Button("+");
        plus.addActionListener( new PlusListener() );

        minus = new Button("-");
        minus.addActionListener( new MinusListener() );

        add(tekstvak1);
        add(tekstvak2);
        add(vermenigvuldig);
        add(delen);
        add(plus);
        add(minus);

    }


    class VermenigvuldigListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double imput1 = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double imput2 = Double.parseDouble(s2);
            double uitkomst = imput1 * imput2;

            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");

        }
    }
    class DelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double imput1 = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double imput2 = Double.parseDouble(s2);
            double uitkomst = imput1 / imput2;

            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }
    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double imput1 = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double imput2 = Double.parseDouble(s2);
            double uitkomst = imput1 + imput2;

            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }
    class MinusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double imput1 = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double imput2 = Double.parseDouble(s2);
            double uitkomst = imput1 - imput2;

            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }
}

