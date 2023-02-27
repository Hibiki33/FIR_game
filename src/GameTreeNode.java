import java.util.ArrayList;

public class GameTreeNode extends ChessPiece {
    private GameTreeNode father;
    private ArrayList<GameTreeNode> sons;

    GameTreeNode() {}

    GameTreeNode(int col, int row, int color) {
        super(row, col, color);


    }
}
