/*
package swing;

import javax.sound.sampled.AudioInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MusicPlayer implements ActionListener {
    AudioInputStream as;
    URL url;
    JButton play = new JButton("play");
    JButton stop = new JButton("stop");

    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()-> {
            new MusicPlayer().createGui();
        });
    }

    private void createGui() {
        JFrame frame= new JFrame("music player");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(play);
        frame.add(stop);
        play.addActionListener(this);   //odwołuję się do klasy, która posiada przycisk, dlatego this
        stop.addActionListener(this);
        frame.pack();
        frame.setVisible(true);
        try{
            url= new URL ("http://www.kozcoom/tech/piano2.wav");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        try {
            audioInputStream = new AudioInputStream(url.openStream());  //brak w bibliotece audioStream
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent akcja) {
        if (akcja.getSource()==play){
            System.out.println("play");
            AudioPlayer.player.start(as);       //nie ma w bibliotece, trzebaby pobrać
    }else if(akcja.getSource()==stop){
            AudioPlayer.player.stop(as);
        }
    }
}
*/
