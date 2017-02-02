import javax.swing.*;
import java.awt.*;

/**
 * Created by Vika on 30.01.2017.
 */
public class Player {
    private int x,y,tileX,tileY;
    private Image player;

    public Player(){
        ImageIcon img = new ImageIcon("C://Users//Vika//IdeaProjects//TheMazeGame//src//res//player.png");
        player = img.getImage();

        x=32;
        y=32;

        tileX = 1;
        tileY = 1;

    }
    public Image getPlayer (){
        return player;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public int getTileX(){
        return tileX;
    }
    public int getTileY(){
        return tileY;
    }

    public void move(int dx,int dy,int tx,int ty){
        x += dx;
        y += dy;

        tileX = tileX + tx;
        tileY = tileY + ty;
    }
}
