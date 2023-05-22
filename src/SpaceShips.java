import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SpaceShips extends JFrame{

    JFrame spaceShips = new JFrame ("Choose Character");


    ImageIcon icon1 = new ImageIcon("statek.png");
    ImageIcon icon2 = new ImageIcon("rocket.png");
    ImageIcon icon3 = new ImageIcon("samolot.png");

    JButton ship1 = new JButton();
    JButton ship2 = new JButton();
    JButton ship3 = new JButton();


    SpaceShips () {



        ship1.setIcon(icon1);
        ship1.setLayout(new BorderLayout());
        ship1.setBounds(0,0,110,110);
        ship1.addActionListener(this::actionPerformed);



        ship2.setIcon(icon2);
        ship2.setLayout(new BorderLayout());
        ship2.setBounds(0,0,110,110);

        ship3.setIcon(icon3);
        ship2.setLayout(new BorderLayout());
        ship2.setBounds(0,0,110,110);




        this.add(ship1);
        this.add(ship2);
        this.add(ship3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.BLACK);
        this.setVisible(true);

    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource()==ship1) {

            GameBoard gameBoard = new GameBoard();
            this.dispose();

        }
    }
}
