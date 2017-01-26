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

    private Image grass,wall;

    public Map(){
        ImageIcon img = new ImageIcon("C://");
        grass = img.getImage();
        img = new ImageIcon("C://");
        wall = img.getImage();

       openFile();
       readFile();
       closeFile();

    }
    public Image getGrass(){
        return grass;
    }


    public String getMap(int x, int y){
        String index = Map[y].substring(x,x+1);
        return index;
    }


    public void openFile() {
        try {
            sc = new Scanner(new File("C://"));
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
