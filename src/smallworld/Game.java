package smallworld;

import input.Controller;
import input.KeyInput;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.Timer;
import objects.Enemy;
import objects.Player;
import objects.Station;
//Uses most all classes and basically creates the animation
public class Game extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private String background = "/resources/tokyosubway.png";
    Timer gamelooptimer;
    //Player p;
    Controller c;
    Enemy en;
    ArrayList<Station> stations;
//Creates an ArrayList of all the stations to make it easier to make stations and use collision detection.
    public ArrayList<Station> getStations() {
        return stations;
    }
//Sets up timer for updating the animation and sets coordinates of Enemy objects along with stations and their motion values.
    public Game() {
        setFocusable(true);

        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();
        en = new Enemy(0, 40);
        //p = new Player(180, 50);
        c = new Controller();
        stations = new ArrayList<>();
        
        stations.add(new Station(0,50,5,0));
        stations.add(new Station(32,50,5,0));
        stations.add(new Station(66,50,5,0));
        stations.add(new Station(102,50,5,0));
        stations.add(new Station(138,50,5,0));
        stations.add(new Station(176,50,5,0));
        stations.add(new Station(196,50,5,3));
        stations.add(new Station(210,55,5,3));
        stations.add(new Station(245,76,5,3));
        stations.add(new Station(280,97,5,3));
        stations.add(new Station(315,118,5,3));
        stations.add(new Station(340,128,0,5));
        stations.add(new Station(340,168,0,5));
        stations.add(new Station(340,198,0,5));
        stations.add(new Station(340,253,5,3));
        stations.add(new Station(367,254,0,5));
        stations.add(new Station(367,311,-5,3));
        stations.add(new Station(287,313,0,5));
        stations.add(new Station(287,393,-5,3));
        
        //addKeyListener(new KeyInput(p));
    }
//Draws background image of Tokyo Subway along with Enemy and stations.
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(getBackgroundImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        //p.draw(g2d);
        c.draw(g2d);
        en.draw(g2d);
        for (Station station : stations){
            station.draw(g2d);
        }

    }
//Grabs the background imaqe and returns it.
    public Image getBackgroundImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }
//Updates positions allowing for the animation to be shown.
    @Override
    public void actionPerformed(ActionEvent e) {
        //p.update();
        c.update();
        en.update();

        repaint();

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
