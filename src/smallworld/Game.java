package smallworld;

import input.Controller;
import input.KeyInput;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.Timer;
import objects.Enemy;
import objects.Player;

public class Game extends JPanel implements ActionListener{
   
    private static final long serialVersionUID = 1L;
    private String background="/resources/tokyosubway.png";
    Timer gamelooptimer;
    Player p;
    Controller c;
    public Game(){
        setFocusable(true);
    
        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();
        
        p = new Player(100,100);
        c = new Controller();
        addKeyListener(new KeyInput(p));
    }
    
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(getBackgroundImage(),0,0,this.getWidth(),this.getHeight(),this);
        p.draw(g2d);
        c.draw(g2d);
        
    }
    
    public Image getBackgroundImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    p.update();
    c.update();
    repaint(); 
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

   
    

