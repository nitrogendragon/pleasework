
package input;

import static input.Controller.e;
import java.awt.Graphics2D;
import java.util.LinkedList;
import java.util.Random;
import objects.Enemy;
import objects.Player;
import smallworld.Animation;

//not used atm but creates LinkedList for Enemy to make it easier to make multiple enemies
public class Controller {
    static LinkedList<Enemy> e = new LinkedList<Enemy>();
    
    Enemy TempEnemy;
  

     
    public Controller(){
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
//        addEnemy(new Enemy((int)(Math.random()*1200),(int)(Math.random()*540)));
        
       
        
       
    }
    
    public void draw(Graphics2D g2d){
        for(int i=0; i < e.size(); i++){
            TempEnemy = e.get(i);
            
            TempEnemy.draw(g2d);
        }
    }
    public void update(){
        for(int i=0; i < e.size(); i++){
            TempEnemy = e.get(i);
            
//            if(TempEnemy.x<100){
//                TempEnemy.x=Animation.WIDTH;
//            }
            
            TempEnemy.update();
        }
    }
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
}

