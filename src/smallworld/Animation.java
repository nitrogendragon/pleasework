package smallworld;

import javax.swing.JFrame;
//Runs the game/animation
public class Animation {

    public static final Game game = new Game();
    public static final int WIDTH = 1264, HEIGHT = 640;
//Sets size of window and determines various other factors along with adding the code from the Game class and running it
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(Animation.game);
        frame.setVisible(true);

    }
}
