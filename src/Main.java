import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean continuePlaying = true;
        while (continuePlaying) {
            JFrame chooseColorMessage = new JFrame();
            String[] colorOptions = {"BLACK", "WHITE", "EXIT"};
            int colorOption = JOptionPane.showOptionDialog(chooseColorMessage, "Choose Your Color", "COlOR OPTION",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, colorOptions, colorOptions[2]);
            switch (colorOption) {
                case 0 -> System.out.println("black");
                case 1 -> System.out.println("white");
                default -> System.exit(0);
            }

            GamePlaying game = new GamePlaying();
            game.setTitle("Gobang");

            JFrame chooseNextMessage = new JFrame();
            String[] nextOptions = {"One More Round", "Close"};
            int nextOption = JOptionPane.showOptionDialog(chooseNextMessage, "One more round or close ?",
                    "NEXT OPTION", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE,
                    null, nextOptions, nextOptions[1]);
            if (nextOption == 1) {
                continuePlaying = false;
            }
        }
    }
}