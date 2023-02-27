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
        add("Center", new Board());
        Panel panel = new Panel();
        Button pass = new Button("pass");
        Button color = new Button("color");
        Button fail = new Button("fail");
        Button back = new Button("back");
        panel.setLayout(new GridLayout(8, 1, 10, 10));
        panel.add(new Label());
        panel.add(pass);
        panel.add(color);
        panel.add(fail);
        panel.add(back);
        add("East", panel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(400, 360);
        setVisible(true);
    }
}