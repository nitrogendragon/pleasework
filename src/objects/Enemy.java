
package objects;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import smallworld.Animation;
import smallworld.GlobalPosition;


public class Enemy extends GlobalPosition {
    
    private String enemyimage ="/resources/train.png";
    
    int speed = 5;
    
    public Enemy(int x, int y) {
        super(x, y);
    }
    
    public void update(){
        x+=speed;
        if(x>Animation.WIDTH-74){
            speed = -5;
        }
        if(x<0){
            speed = 5;
        }
    }
    public void draw(Graphics2D g2d){
    g2d.drawImage(getEnemyImage(), x, y, null);
    }
public Image getEnemyImage(){
    ImageIcon i = new ImageIcon(getClass().getResource(enemyimage));
return i.getImage();
}
}