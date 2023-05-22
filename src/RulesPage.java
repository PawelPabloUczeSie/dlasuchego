import javax.swing.*;
import java.awt.*;

public class RulesPage {

    JFrame frame = new JFrame("RULES");
    JLabel rules1 = new JLabel("POKONAJ WSZYSTKICH WROGÓW");
    JLabel rules2 = new JLabel("NIE DAJ SIĘ TRAFIĆ");
    JLabel rules3 = new JLabel("BĄDŹ SZYBKI");
    JLabel rules4 = new JLabel("STRZELAJ CELNIE");



    RulesPage () {


        rules1.setBounds(100,50,300,100);
        rules1.setForeground(Color.RED);
        frame.add(rules1);
        rules2.setBounds(100,100,300,100);
        rules2.setForeground(Color.RED);
        frame.add(rules2);
        rules3.setBounds(100,150,300,100);
        rules3.setForeground(Color.RED);
        frame.add(rules3);
        rules4.setBounds(100,200,300,100);
        rules4.setForeground(Color.RED);
        frame.add(rules4);





        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }



    }


