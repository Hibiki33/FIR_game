import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePlaying extends JFrame implements ActionListener, ItemListener {
    private int maxTime = 60;
    private javax.swing.Timer time;
    private JLabel showTime;
    private JButton reStart;

    GamePlaying() {
        time = new javax.swing.Timer(1000, this);
        setLayout(new FlowLayout());
        showTime = new JLabel(" ");
        add(showTime);
        reStart = new JButton("restart");
        reStart.setEnabled(false);
        add(reStart);
        reStart.addActionListener(this);
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == time) {
            showTime.setText("Remain:" + maxTime + "s");
            maxTime--;
            if (maxTime <= 0) {
                maxTime = 60;

            }
        } else if (e.getSource() == reStart) {

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
