
package input;

import java.awt.Graphics2D;
import java.util.LinkedList;
import objects.Enemy;


public class Controller {
    LinkedList<Enemy> e = new LinkedList<Enemy>();
    Enemy TempEnemy;
    public void draw(Graphics2D g2d){
        for(int i=0; i < e.size(); i++){
            TempEnemy = e.get(i);
            
            TempEnemy.draw(g2d);
        }
    }
    public void update(){
        for(int i=0; i < e.size(); i++){
            TempEnemy = e.get(i);
            TempEnemy.update();
        }
    }
}

