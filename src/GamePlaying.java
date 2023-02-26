import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GamePlaying extends Frame {
    public GamePlaying() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());
        Board b = new Board();
        add("Center", b);
        Panel p = new Panel();
        Button pass = new Button("放弃一次");
        Button color = new Button("变棋盘背景");
        Button fail = new Button("认输");
        Button back = new Button("悔棋");
        p.setLayout(new GridLayout(8, 1, 10, 10));
        p.add(new Label());
        p.add(pass);
        p.add(color);
        p.add(fail);
        p.add(back);
        add("East",p);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(500,450);
        setVisible(true);
    }
}