public class ChessPiece {
    private int row;
    private int col;
    private int color;

    ChessPiece() {}

    ChessPiece(int row, int col, int color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public int[] getCoordinate() {
        int[] coordinate = new int[2];
        coordinate[0] = row;
        coordinate[1] = col;
        return coordinate;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getColor() {
        return color;
    }

    @Override
    public String toString() {
        String chessColor;
        if (color == 1) {
            chessColor = "white";
        } else {
            chessColor = "black";
        }
        return Character.toString(col + 'A') +
                (row < 10 ? Character.toString(row + '1') : "1" + Character.toString(row + '0' - 10)) +
                ":" + chessColor;
    }
}
