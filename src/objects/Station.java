package objects;

import static java.awt.Color.RED;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import smallworld.Animation;
import smallworld.GlobalPosition;

public class Station extends GlobalPosition {

   

    int speedX = 0;
    int speedY = 0;

    public Station(int x, int y, int speedX, int speedY) {
        super(x, y);
        this.speedX = speedX;
        this.speedY = speedY;
    }
    
    public void update(){
    }

    public void draw(Graphics2D g2d) {
       
        g2d.draw(getBounds());
        
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 20, 10);
    }

   

}
