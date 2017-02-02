import javax.swing.*;
import java.awt.*;

/**
 * Created by Vika on 30.01.2017.
 */
public class Player {
    private int tileX,tileY;
    private Image player;

    public Player(){
        ImageIcon img = new ImageIcon("C://Users//Vika//IdeaProjects//TheMazeGame//src//res//player.png");
        player = img.getImage();
        tileX = 1;
        tileY = 1;

    }
    public Image getPlayer (){
        return player;
    }

    public int getTileX(){
        return tileX;
    }
    public int getTileY(){
        return tileY;
    }

    public void move(int dx,int dy){
               tileX = tileX + dx;
               tileY = tileY + dy;
    }
}
