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
/**Uses most all classes and basically creates the animation.
 
 */
public class Game extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private String background = "/resources/tokyosubway.png";
    Timer gamelooptimer;
    //Player p;
    Controller c;
    Enemy en;
    Enemy bob;
    Enemy bobby;
    Enemy Nigelia;
    Enemy lucky;
    ArrayList<Station> stations;
/**Creates an ArrayList of all the stations to make it easier to make stations and use collision detection.

 */
    public ArrayList<Station> getStations() {
        return stations;
    }
/**Sets up timer for updating the animation and sets coordinates of Enemy objects along with stations and their motion values.
 
 */
    public Game() {
        setFocusable(true);

        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();
        en = new Enemy(0, 40);
        lucky = new Enemy(20,270);
        Nigelia = new Enemy(75,517);
        //p = new Player(180, 50);
        c = new Controller();
        bob = new Enemy(0,70);
        bobby = new Enemy(157,363);
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
        stations.add(new Station(157,363,5,0));
        stations.add(new Station(217,363,5,0));
        stations.add(new Station(327,363,5,3));
        stations.add(new Station(387,423,5,0));       
        stations.add(new Station(790,398,0,-5));       
        stations.add(new Station(790,390,-5,-3));       
        stations.add(new Station(710,340,-2,-5));       
        stations.add(new Station(706,330,0,-5));       
        stations.add(new Station(706,55,5,-3));       
        stations.add(new Station(736,22,5,0));       
        stations.add(new Station(1061,22,5,-3));       
        stations.add(new Station(75,520,5,0));       
        stations.add(new Station(680,520,5,-3));       
        stations.add(new Station(785,460,5,0));       
        stations.add(new Station(865,455,4,-3));       
        stations.add(new Station(905,415,0,-5));       
        stations.add(new Station(905,140,4,-3));       
        stations.add(new Station(995,85,4,-3));       
        stations.add(new Station(20,270,5,0));       
        stations.add(new Station(330,270,4,1));       
        stations.add(new Station(380,300,4,5));       
        stations.add(new Station(390,300,5,0));       
        stations.add(new Station(475,310,5,3));       
        stations.add(new Station(645,425,0,8));       
        stations.add(new Station(645,430,5,0));       
        stations.add(new Station(825,430,5,-3));       
        stations.add(new Station(840,421,0,-5));       
        stations.add(new Station(830,351,-4,-2));       
        stations.add(new Station(780,331,-4,-2));       
        stations.add(new Station(760,331,-4,-2));       
        stations.add(new Station(720,281,-2,-1));       
        stations.add(new Station(710,273,0,-5));       
        stations.add(new Station(710,183,-4,-2));       
        stations.add(new Station(660,163,-5,0));       
        stations.add(new Station(550,163,-5,-3));       
        stations.add(new Station(490,123,-5,0));       
        stations.add(new Station(410,123,-5,0));       
        //addKeyListener(new KeyInput(p));
    }
/**Draws background image of Tokyo Subway along with Enemy and stations.

 */
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(getBackgroundImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        //p.draw(g2d);
        c.draw(g2d);
        en.draw(g2d);
        bob.draw(g2d);
        bobby.draw(g2d);
        Nigelia.draw(g2d);
        lucky.draw(g2d);
        for (Station station : stations){
            station.draw(g2d);
        }

    }
/**Grabs the background imaqe and returns it.

 */
    public Image getBackgroundImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }
/**Updates positions allowing for the animation to be shown.
 
 */
    @Override
    public void actionPerformed(ActionEvent e) {
        //p.update();
        c.update();
        en.update();
        bob.update();
        bobby.update();
        Nigelia.update();
        lucky.update();
        repaint();
    }
}
