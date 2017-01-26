import java.io.*;
import java.util.*;

/**
 * Created by Vika on 25.01.2017.
 */
public class Map {
    private Scanner sc;

    public Map(){
       openFile();
       readFile();
       closeFile();

    }
    public void openFile() {
        try {
            sc = new Scanner(new File("C://"));
        } catch (Exception e){
        System.out.println(" Error loading map");
        }
    }

    public void readFile() {
    }
    public void closeFile() {
    }






}
