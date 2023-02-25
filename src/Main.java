public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        ChessPiece piece0 = new ChessPiece(2, 4, 1);
        ChessPiece piece1 = new ChessPiece(14, 2, -1);
        board.setPiece(piece0);
        board.setPiece(piece1);
        System.out.println(board);
        System.out.println(piece0);
    }
}