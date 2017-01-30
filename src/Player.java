import java.awt.*;

/**
 * Created by Vika on 30.01.2017.
 */
public class Player {
    private int x,y,tileX,tileY;
    private Image player;

    public Player(){
        x=32;
        y=32;

        tileX = 1;
        tileY = 1;

    }
    public void move(int dx,int dy,int tx,int ty){
        x += dx;
        y += dy;

        tileX = tileX + tx;
        tileY = tileY + ty;
        return ;
    }
}
