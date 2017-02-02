

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Vika on 25.01.2017.
 */
public class Board  extends JPanel implements ActionListener {
    private Timer timer;

    private  Map map;
    private Player player;


    public Board(){
        map =new Map();
        player = new Player();
        addKeyListener(new Al());// add class Al
        setFocusable(true);

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
                if(map.getMap(x,y).equals("w")){
                    g.drawImage(map.getWall(),x*32,y*32,null);
                }

            }
        
        }
        g.drawImage(player.getPlayer(),player.getX(),player.getY(),null);
         //g.setColor(Color.red);
         //g.fillRect(45,60,32,32);28
                g.drawImage(map.getFinish(),448-32*2,448-32*2,null);
    }

    public class Al extends KeyAdapter{
        public void  keyPressed(KeyEvent e){
        int keycode = e.getKeyCode();
            if (keycode == KeyEvent.VK_UP){
                player.move(0,-32,0,-1);
              }

            if (keycode == KeyEvent.VK_DOWN){
                player.move(0,32,0,1);
                 }
             if (keycode == KeyEvent.VK_LEFT){
                player.move(-32,0,-1,0);
                 }
            if (keycode == KeyEvent.VK_RIGHT) {
                player.move(32,0,32,0);
                 }
          }

        public  void keyRelased(KeyEvent e){

        }
        public  void keyTyped(KeyEvent e){

        }
    }
}
