import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

/**
 * Created by Vika on 25.01.2017.
 */
public class Map {
    private Scanner sc;
    private String Map[] = new String [14];

    private Image grass,wall,finish;

    public Map(){
        ImageIcon img = new ImageIcon("C://Users//Vika//IdeaProjects//TheMazeGame//src//res//glass.png");
        grass = img.getImage();
        img = new ImageIcon("C://Users//Vika//IdeaProjects//TheMazeGame//src//res//wall.png");
        wall = img.getImage();
        img = new ImageIcon("C://Users//Vika//IdeaProjects//TheMazeGame//src//res//finish.png");
        finish = img.getImage();

       openFile();
       readFile();
       closeFile();

    }
    public Image getFinish(){return finish;}
    public Image getGrass(){
        return grass;
    }
    public Image getWall(){
        return wall;
    }


    public String getMap(int x, int y){
        String index = Map[y].substring(x,x+1);
        return index;
    }


    public void openFile() {
        try {
            sc = new Scanner(new File("C://Users//Vika//IdeaProjects//TheMazeGame//src//res//Map.txt"));
        } catch (Exception e){
        System.out.println(" Error loading map");
        }
    }

    public void readFile() {
        while (sc.hasNext()){
            for(int i=0;i<14;i++){
               Map[i] = sc.next();
            }
        }
    }
    public void closeFile() {
        sc.close();
    }

}
