

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vika on 25.01.2017.
 */
public class Board  extends JPanel implements ActionListener {
    private Timer timer;

    private  Map map;



    public Board(){
        map =new Map();

        timer = new Timer(25,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }



    public void paint(Graphics g){
        super.paint(g);//not paint

         g.setColor(Color.red);
         g.fillRect(45,60,32,32);
    }
}
