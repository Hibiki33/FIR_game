import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        ChessPiece piece0 = new ChessPiece(2, 4, 1);
        ChessPiece piece1 = new ChessPiece(14, 2, -1);
        board.setPiece(piece0);
        board.setPiece(piece1);
        System.out.println(board);
        System.out.println(piece0);

        JFrame jFrame = new JFrame();
        int colorOption = JOptionPane.showConfirmDialog(jFrame, "Choose Your Color");
        if (colorOption == 0) {
            System.out.println("black");
        } else if (colorOption == 1) {
            System.out.println("white");
        } else {
            System.exit(0);
        }

        GamePlaying game = new GamePlaying();
        game.setTitle("Gobang");
    }
}