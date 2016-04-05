
package input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import objects.Player;

//Sets up basis for adding key controls to move character
public class KeyInput extends KeyAdapter {
    
    Player p;
    
    public KeyInput(Player p){
        this.p = p;
    }
    public void keyPressed(KeyEvent e){
        p.keyPressed(e);
    }
    public void keyReleased(KeyEvent e){
        p.keyReleased(e);
    }
}
