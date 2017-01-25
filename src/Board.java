import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vika on 25.01.2017.
 */
public class Board  extends JPanel implements ActionListener {
    private Timer timer;

    public Board(){
        timer = new Timer(25,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
