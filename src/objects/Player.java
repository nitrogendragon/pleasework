
package objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import smallworld.GlobalPosition;


public class Player extends GlobalPosition {
    
    private String playerimage ="/resources/train.png";
    
    int velX = 0;
    int velY = 0;
    
    public Player(int x, int y) {
        super(x, y);
    }
    public void update(){
        x+=velX;
        y+=velY;
        //Collision with outside
        if(x<0){
            x =1264-74;
        }
         if(y<0){
            y=640-100;
        }
         if(x>1264-74){
             x =1;
         }
         if (y> 640-100){
             y=0;
         }
    }
     public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            velX = 3;
        }
        else if(key==KeyEvent.VK_DOWN){
            velY = 3;
    }
        else if(key==KeyEvent.VK_UP){
            velY = -3;
        }
        else if(key==KeyEvent.VK_LEFT){
            velX = -3;
        }
     }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            velX = 0;
        }
        else if(key==KeyEvent.VK_DOWN){
            velY = 0;
    }
        else if(key==KeyEvent.VK_UP){
            velY = 0;
        }
        else if(key==KeyEvent.VK_LEFT){
            velX = 0;
        } 
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(getPlayerImage(), x, y, null);
    }
    public Image getPlayerImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
        return i.getImage();
    }
}
