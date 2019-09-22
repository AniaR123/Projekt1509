/*
package metodyBankomatubankomat;

import bankomat.Bankomat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetodyBankomatu {
    static JFrame ramka= new JFrame("mój bankomat");
    private static Integer pin=0;
    static JButton przyciskZaloguj= new JButton("Zaloguj");
    static JLabel konsola = new JLabel("");

    static void pokazWidok(){
        JLabel powitanie= new JLabel("Witaj, podatj PIN ");     //Label podstawowy tekst w swingu
        JFormattedTextField weryfikator = new JFormattedTextField();
        ramka.setLayout(new GridLayout());
        ramka.setSize(500,500);
        ramka.add(konsola);
        ramka.add(powitanie);
        ramka.add(weryfikator);
        ramka.add(przyciskZaloguj);
        ramka.pack();
        ramka.setVisible(true);
        przyciskZaloguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!weryfikator.getText().isEmpty()){
                    pin= Integer.valueOf(weryfikator.getText());
                    Bankomat.zweryfikujKlienta(pin);
                }
            }
        });
    }
    public static void pokazWidokiPoZalogowaniu() {
        JLabel ileLabel = new JLabel("Kwota");
        ramka.add(ileLabel);
        JFormattedTextField ile = new JFormattedTextField();
        JButton dodajSrodkiButton= new JButton("dodaj środki");
        JButton wyplacSrodkiButton= new JButton("wypłać");
        JButton stanKonta= new JButton("stan konta");
        ramka.add(ile);
        ramka.add(dodajSrodkiButton);
        ramka.add(wyplacSrodkiButton);
        ramka.add(stanKonta);

        dodajSrodkiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}*/
