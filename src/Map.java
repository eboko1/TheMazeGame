import java.io.*;
import java.util.*;

/**
 * Created by Vika on 25.01.2017.
 */
public class Map {
    private Scanner sc;
    private String Map[] = new String [14];

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
        while (sc.hasNext()){
            for(int i=0;i<14;i++){
                
            }
        }
    }
    public void closeFile() {
    }






}
