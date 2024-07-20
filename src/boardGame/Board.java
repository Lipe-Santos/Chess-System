public class Board{
    private int rows;
    private int cols;
    private Piece[][] pieces;

    public Board(int rows, int cols){
        pieces = new Piece[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    public Piece[][] getPieces(){
        return pieces;
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public Piece getPiece(int row, int col){
        return Pieces[row][col];
    }

    public Piece getPiece(Position position){
       return getPiece(position.row, position.col);
    }


    private void placePiece(int row, int col, Piece piece){
        pieces[row][col] = piece;
        piece.position = new Position(row, col);
    }

    public void placePiece (Position position, Piece piece){
        pieces[position.row][positio.col] = piece;
        piece.position = position;
    }

    public Piece removePiece(int row, int col){
        Piece removedPiece = getPiece(row, col);
        pieces[row][col] = null;
        return removedPiece;
    }

    public Piece removePiece (Position position){
       return removePiece(position.row, position.col);
    }

    public boolean isThereAPiece(int row, int col){
       return pieces[row][col] != null;
    }

    public boolean isThereAPiece(Position position){
        return isThereAPiece(position.row, position.col);
     }

    public boolean positionExists(int row, int col){
        return row > 0 && row <= rows &&  col > 0 && col <= cols;
    }

    public boolean postionExits (Position position){
        return positionExists(position.row, position.col);
    }

    @Override
    public Object clone(){
        return new Board(rows, cols);
    }
}
