import javax.swing.*;

public class OptionsPage {

    JFrame frame = new JFrame("OPTIONS");
    JButton dpa = new JButton("er");
    JLabel siema = new JLabel("XDXXDXD");


    OptionsPage () {




        dpa.setBounds(50,50,150,150);

        frame.add(dpa);
        frame.add(siema);




        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
