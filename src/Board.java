

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
    private Maze maze;

    private Timer timer;

    private  Map map;
    private Player player;
    private boolean win = false;
    private String message="";
    private Font font = new Font("Serif",Font.BOLD,48);

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
        if (map.getMap(player.getTileX(),player.getTileY()).equals("f")){
            message=("Winner");
            win=true;
        }
        repaint();
    }



    public void paint(Graphics g){
        super.paint(g);//not paint
    if(!win){
        for (int y=0;y<14;y++) {
            for (int x = 0; x < 14; x++) {
                if (map.getMap(x, y).equals("f")) {
                    g.drawImage(map.getFinish(), x * 32, y * 32, null);
                }
                if (map.getMap(x, y).equals("g")) {
                    g.drawImage(map.getGrass(), x * 32, y * 32, null);
                }
                if (map.getMap(x, y).equals("w")) {
                    g.drawImage(map.getWall(), x * 32, y * 32, null);
                }

            }
        }
        g.drawImage(player.getPlayer(),player.getTileX()*32,player.getTileY()*32,null);
    }
        if(win) {
            //add winner string
            g.setColor(Color.orange);
            g.setFont(font);
            g.drawString(message, 150, 150); //  winner
        }

         //g.setColor(Color.red);
         //g.fillRect(45,60,32,32);28
              //  g.drawImage(map.getFinish(),448-32*2,448-32*2,null);
    }

    public class Al extends KeyAdapter{
        public void  keyPressed(KeyEvent e){
        int keycode = e.getKeyCode();
            if (keycode == KeyEvent.VK_UP){
                if (!map.getMap(player.getTileX(),player.getTileY()-1).equals("w")){
                player.move(0,-1);
              }
            }

            if (keycode == KeyEvent.VK_DOWN) {
                if (!map.getMap(player.getTileX(), player.getTileY() + 1).equals("w")) {
                    player.move(0, 1);
                }
            }
             if (keycode == KeyEvent.VK_LEFT){
                 if (!map.getMap(player.getTileX()-1,player.getTileY()).equals("w")){
                player.move(-1,0);
                 }
            }
            if (keycode == KeyEvent.VK_RIGHT) {
                if (!map.getMap(player.getTileX()+1, player.getTileY()).equals("w")) {
                    player.move(1, 0);
                }
            }
          }

        public  void keyRelased(KeyEvent e){

        }
        public  void keyTyped(KeyEvent e){

        }
    }
}
