import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {

    JLabel label;
    ImageIcon icon;



    GameBoard () {


        icon = new ImageIcon("rocket.png");
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(0,0,100,100);







        this.add(label);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setTitle("Game Board");
    }



}
