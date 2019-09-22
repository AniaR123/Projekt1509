package swing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Disco {
    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()->{   //uruchomienie nowego wątku
    JFrame frame = new JFrame("dyskoteka"); //pasek z tytulem   otwiera nowe okienko
            frame.setLayout(new GridLayout(10,10,5,5));  //by określić co będzie znajdować się w ramce
            frame.setMinimumSize(new Dimension(500,500));   //wymiar ramki
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //zamykanie ramki
            for (int i = 0; i < 99999; i++) {       //do kolorów
                int red = new Random().nextInt(255);
                int green = new Random().nextInt(255);
                int blue = new Random().nextInt(255);
                Color color= new Color(red, green, blue);
                frame.getContentPane().setBackground(color);    //ustaw kolor ustaw tło po wylosowaniu koloru
                frame.update(frame.getGraphics());      //natychmiast przekoloruj -update od razu
                frame.pack();       //traktowanie wszystkich elementów jako jednosć
                frame.setVisible(true);     //aby ramka byla widoczna
            }
        });

    }
}
