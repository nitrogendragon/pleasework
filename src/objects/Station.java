package objects;

import static java.awt.Color.RED;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import smallworld.Animation;
import smallworld.GlobalPosition;
//Generates rectangles at coordinates specified in Game class and are used to adjust speed/course of Enemy as it moves along the screen on its route.
public class Station extends GlobalPosition {

   

    int speedX = 0;
    int speedY = 0;
//Sets up specification of coordinates and speed adjustments determined in Game class.
    public Station(int x, int y, int speedX, int speedY) {
        super(x, y);
        this.speedX = speedX;
        this.speedY = speedY;
    }
    //unused
    public void update(){
    }
//draws the rectangles...not used in final product
    public void draw(Graphics2D g2d) {
       
        g2d.draw(getBounds());
        
    }
//creates rectangles used in collision detection to change course of Enemy
    public Rectangle getBounds() {
        return new Rectangle(x, y, 20, 10);
    }

   

}
