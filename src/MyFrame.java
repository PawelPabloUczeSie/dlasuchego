

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame {

    JButton rulesButton  = new JButton("RULES");

    JButton playButton = new JButton("PLAY");
    JLabel nickName = new JLabel("Podaj nick: ");
    JTextField typeNick = new JTextField();

    JButton optionsButton = new JButton("Options");




    String name;


     MyFrame(String name) {

         optionsButton.setBounds(5,20,100,25);
         optionsButton.addActionListener(this::actionPerformed);
         this.add(optionsButton);

         rulesButton.setBounds(20,320,75,25);
         rulesButton.addActionListener(this::actionPerformed);
         this.add(rulesButton);

         nickName.setBounds(100,130,100,25);
         this.add(nickName);

         typeNick.setBounds(100,155,150,25);
         this.add(typeNick);


         playButton.setFont(new Font (null,Font.ITALIC,15));
         playButton.setBounds(100,190,150,20);
         playButton.addActionListener(this::actionPerformed);

         this.add(playButton,BorderLayout.CENTER);





         this.name = name;
        this.setTitle(name);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());
        this.setVisible(true);

    }
    public void actionPerformed (ActionEvent e) {

         if (e.getSource()==rulesButton) {
             RulesPage rulesPage = new RulesPage();

         }
         if (e.getSource()==optionsButton) {
             OptionsPage optionsPage = new OptionsPage();

         }
         if (e.getSource()==playButton) {
             this.dispose();
             SpaceShips spaceShips = new SpaceShips();
         }

    }






}
