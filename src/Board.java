import java.util.Arrays;
import java.util.Stack;

public class Board {
    private int[][] boardGrid;
    private Stack<ChessPiece> whiteChess;
    private Stack<ChessPiece> blackChess;

    Board() {
        boardGrid = new int[15][15];
        whiteChess = new Stack<>();
        blackChess = new Stack<>();
    }

    public void setPiece(ChessPiece newPiece) {
        if (newPiece.getColor() == 1) {
            whiteChess.push(newPiece);
        } else {
            blackChess.push(newPiece);
        }
    }

    public String getCoordinate(int x, int y) {
        return Character.toString(y + 'A') + Character.toString(x + '1');
    }

    // FOR TEST
    @Override
    public String toString() {
        return Arrays.deepToString(boardGrid);
    }
}
