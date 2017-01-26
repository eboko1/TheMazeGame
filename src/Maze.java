import javax.swing.*;

/**
 * Created by Vika on 25.01.2017.
 */
public class Maze extends JFrame {
    public final int WIDTH = 500;
    public final int HEIGHT = 400;
    public Maze(){
        JFrame frame  = new JFrame();
        frame.setTitle(" Maze Game ");
        frame.add(new Board());
        frame.setSize(WIDTH,HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public  static void main(String[] args){
        new Maze();
    }




}//4
