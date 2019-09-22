/*
package bankomat;

import metodyBankomatubankomat.MetodyBankomatu;

import java.util.HashMap;

public class Bankomat {
    //statyczne pola klasy- dlatego mogą być przed main
    static HashMap<Integer, String> klienci= new HashMap<>();    //hashmapa (to typ danych , mapa to konstruktor) łączy 2 obiekty ze sobą na stałe
    static HashMap<Integer, Double> kasiorka = new HashMap<>();

    public static void main(String[] args) {
        zainicjuj(klienci, kasiorka);   //alt+enter create , metoda do symulacji baz danych
        MetodyBankomatu.pokazWidok();
    }

    private static void zainicjuj(HashMap<Integer, String> klienci, HashMap<Integer, Double> kasiorka) {
        klienci.put(1122, "Jan Kowalski");
        klienci.put(3344, "Euzebia Nowak");
        klienci.put(5566, "Johny Brawo");
        kasiorka.put(1122, 1020.00);
        kasiorka.put(3344, 4086.00);
        kasiorka.put(5566, 12.80);
    }

    public static void zweryfikujKlienta(Integer pin) {
        if(klienci.containsKey(pin)) {
            MetodyBankomatu.konsola.setText("Witaj, "+ klienci.get(pin));
            MetodyBankomatu.pokazWidokiPoZalogowaniu();
            MetodyBankomatu.przycisnijZaloguj.setVisible(false);
        }else{ MetodyBankomatu.konsola.setText("Niepoprawna weryfikacja");
    }
}}
*/
