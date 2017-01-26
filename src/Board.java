

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

        for (int y=0;y<14;y++){
            for(int x=0;x<14;x++){
              if(map.getMap(x,y).equals("g")){
                  g.drawImage(map.getGrass(),x*32,y*32,null);
              }
            }
        }
         //g.setColor(Color.red);
         //g.fillRect(45,60,32,32);
    }
}
