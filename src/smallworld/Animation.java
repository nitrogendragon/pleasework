
package smallworld;

import javax.swing.JFrame;


public class Animation {
    public static final int WIDTH = 1264, HEIGHT = 640;

    public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.pack();
    frame.setSize(WIDTH, HEIGHT);
    frame.setResizable(true);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new Game());
    frame.setVisible(true);
    
}
}
