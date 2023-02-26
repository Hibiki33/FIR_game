import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Arrays;
import java.util.Stack;

public class Board extends Canvas {
    private int[][] boardGrid;
    private Stack<ChessPiece> whiteChess;
    private Stack<ChessPiece> blackChess;

    private final int sx = 20;
    private final int sy = 20;
    private final int w = 20;
    private int cx = 200;
    private int cy = 200;
    private int player = 1;

    Board() {
        boardGrid = new int[15][15];
        whiteChess = new Stack<>();
        blackChess = new Stack<>();

        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                Graphics g = getGraphics();
                g.setXORMode(Board.this.getBackground());
                g.setColor(Color.RED);
                g.fillRect(cx - w / 4, cy - w / 4, w / 2, w / 2);
                if (e.getX() % 20 >= 10) {
                    cx = (e.getX() / 10 + 1) * 10;
                } else {
                    cx = e.getX() / 10 * 10;
                }
                if (e.getY() % 20 >= 10) {
                    cy = (e.getY() / 10 + 1) * 10;
                } else {
                    cy = e.getY() / 10 * 10;
                }
                g.fillRect(cx - w / 4, cy - w / 4, w / 2, w / 2);
            }
        });
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Graphics g = getGraphics();
                if (boardGrid[(cx - sx) / w][(cy - sy) / w] == 0) {
                    if (player == 1) {
                        g.setColor(Color.BLACK);
                        boardGrid[(cx - sx) / w][(cy - sy) / w] = 1;
                    } else {
                        g.setColor(Color.WHITE);
                        boardGrid[(cx - sx) / w][(cy - sy) / w] = 2;
                    }
                    g.fillOval(cx - w / 2 + 1, cy - w / 2 + 1, w - 2, w - 2);
                    g.setXORMode(Board.this.getBackground());
                    g.setColor(Color.RED);
                    g.fillRect(cx - w / 4, cy - w / 4, w / 2, w / 2);
                    player = (player + 1) % 2;
                }
            }
        });
    }

    public void paint(Graphics g) {
        for (int k = 0; k < 15; k++) {
            g.drawLine(sx, sy + k * w, sx + w * 14, sy + k * w);
        }
        for (int k = 0; k < 15; k++) {
            g.drawLine(sx + k * w, sy, sx + k * w, sy + w * 14);
        }
    }

    public void setPiece(ChessPiece newPiece) {
        if (newPiece.getColor() == 1) {
            whiteChess.push(newPiece);
            boardGrid[newPiece.getRow()][newPiece.getCol()] = 1;
        } else {
            blackChess.push(newPiece);
            boardGrid[newPiece.getRow()][newPiece.getCol()] = -1;
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
