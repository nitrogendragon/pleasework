package objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import smallworld.Animation;
import smallworld.GlobalPosition;
/**
 The Enemy class creates an image and gives it coordinates for being plotted on the window as well as deals with its speed and implements collision detection to change the x and y direction speed of the image as it moves along the screen.
 
 */
public class Enemy extends GlobalPosition {

    private String enemyimage = "/resources/redbox.png";

    int speed = 0;
    int speedy = 0;
//sets up x and y coordinate specification for the Enemy object
    public Enemy(int x, int y) {
        super(x, y);
    }
//sets up the speed of the object and sets up collision detection with stations. Also determines loops of animations as Enemy's move along their course over and over again.
    public void update() {
        x += speed;
        y += speedy;
        
        for (Station station : Animation.game.getStations()){
            if (this.collidesWith(station)){
                this.setSpeed(station.speedX, station.speedY);
            }
        }
        if( x<0 && y<Animation.HEIGHT && y>Animation.HEIGHT-100){
            x=0;
            y=40;
        }
        /*if (x == 0 && y == 50) {
            speed = 5;
            speedy = 0;
        }
        if (x == 30 && y == 50) {
            speed = 5;
            speedy = 0;
        }
        if (x == 60 && y == 50) {
            speed = 5;
            speedy = 0;
        }
        if (x == 90 && y == 50) {
            speed = 5;
            speedy = 0;
        }
        if (x == 120 && y == 50) {
            speed = 5;
            speedy = 0;
        }
        if (x == 150 && y == 50) {
            speed = 5;
            speedy = 0;
        }
        if (x == 180 && y == 50) {
            speed = 5;
            speedy = 3;
        }
        if (x == 210 && y == 68) {
            speed = 5;
            speedy = 3;
        }
        if (x == 240 && y == 86) {
            speed = 5;
            speedy = 3;
        }
        if (x == 270 && y == 104) {
            speed = 5;
            speedy = 3;
        }
        if (x == 300 && y == 122) {
            speed = 5;
            speedy = 3;
        }
        if (x == 330 && y == 140) {
            speed = 5;
            speedy = 0;
        }
        if (x == 360 && y == 140) {
            speed = 5;
            speedy = 0;
        }
        if (x == 390 && y == 140) {
            speed = 5;
            speedy = 0;
        }
        if (x == 450 && y == 140) {
            speed = 5;
            speedy = 3;
        }
        if (x == 470 && y == 152) {
            speed = 5;
            speedy = 3;
        }
        if (x == 500 && y == 170) {
            speed = 5;
            speedy = 3;
        }
        if (x == 530 && y == 188) {
            speed = -5;
            speedy = 3;
        }
        if (x == 500 && y == 206) {
            speed = -5;
            speedy = 3;
        }
        if (x == 470 && y == 224) {
            speed = -5;
            speedy = 3;
        }
        if (x == 440 && y == 242) {
            speed = 5;
            speedy = 3;
        }
        if (x == 490 && y == 272) {
            speed = 5;
            speedy = 3;
        }
        if (x == 540 && y == 302) {
            speed = 5;
            speedy = 3;
        }
        if (x == 570 && y == 320) {
            speed = 5;
            speedy = 3;
        }
        if (x == 600 && y == 338) {
            speed = 5;
            speedy = 3;
        }

        if (x == 610 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 640 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 670 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 700 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 730 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 760 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 790 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 820 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 850 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 880 && y == 344) {
            speed = 5;
            speedy = 0;
        }
        if (x == 910 && y == 344) {
            speed = 5;
            speedy = 0;
        }*/
//        if (x > Animation.WIDTH - 62 && y == 344) {
//            x = 0;
//            y = 50;
//        }

//        if(x>Animation.WIDTH-62){
//            speed=-5;
//            speedy=-5;
//            
//        }
//        if(x<0){
//            speed=5;
//            speedy=5;
//        }
//        if(y>Animation.HEIGHT-62){
//            speed=5;
//            speedy=-5;
//        }
//         if(y<0){
//           speed= -5;
//           speedy= 5;
//        }
//         if(x==Animation.WIDTH/2&&y==Animation.HEIGHT/2){
//             speed=0;
//             speedy=0;
//        
//    }
    }
//tells the program to draw the Enemy at the x,y coordiantes specified in Game
    public void draw(Graphics2D g2d) {
        g2d.drawImage(getEnemyImage(), x, y, null);
    }
//creates/determines collision detection with the Stations
    public boolean collidesWith(Station st) {
        return getBounds().intersects(st.getBounds());
    }
    //Sets speed... used in collision detection with Stations
    public void setSpeed(int x, int y){
        this.speed = x;
        this.speedy = y;
    }
//sets bounds of rectangles... used in collison detection
    public Rectangle getBounds() {
        return new Rectangle(x, y, 20, 20);
    }
//grabs the image used for Enemy and returns it
    public Image getEnemyImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(enemyimage));
        return i.getImage();
    }
}
