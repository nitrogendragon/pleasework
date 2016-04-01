
package objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import smallworld.Animation;
import smallworld.GlobalPosition;


public class Enemy extends GlobalPosition {
    
    private String enemyimage ="/resources/train.png";
    
    int speed = 5;
    int speedy=3;
    
    public Enemy(int x, int y) {
        super(x, y);
    }
    
    public void update(){
        x+=speed;
        y+=speedy;
        if(x>Animation.WIDTH-62){
            speed=-5;
            speedy=-5;
            
        }
        if(x<0){
            speed=5;
            speedy=5;
        }
        if(y>Animation.HEIGHT-62){
            speed=5;
            speedy=-5;
        }
         if(y<0){
           speed= -5;
           speedy= 5;
        }
         if(x==Animation.WIDTH/2&&y==Animation.HEIGHT/2){
             speed=0;
             speedy=0;
        
    }
        
    }
    public void draw(Graphics2D g2d){
    g2d.drawImage(getEnemyImage(), x, y, null);
    }
    
    public Rectangle getBounds(){
            return new Rectangle(x, y, 62, 62);
        }
    
public Image getEnemyImage(){
    ImageIcon i = new ImageIcon(getClass().getResource(enemyimage));
return i.getImage();
}
}