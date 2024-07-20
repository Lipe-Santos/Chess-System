public abstract class Piece{
  protected Position position;  
  private Board board;

  public Piece(Position position, Board board){
    this.position = position;
    this.board = board;
  }

  public Position getPosition(){
    return position.clone();
  }

  public Board getBoard(){
    return board.clone();
  }

  public boolean isThereAnyPossibleMoves(){ // ve se ha mooves possiveis para aquela peça
    boolean[][] moves = possibleMoves();

    for( int i = 0; i < moves.length; i++ ){
        for ( int f = 0;  f < moves[i].length; f++){
            if(moves[i][f]){
                return true;
            }
        }
    }
    return false;
  }

  public boolean canMove(Position position){
    return possibleMoves()[position.getRow][position.getCol]; // ve se a peça se pode mexer para aquela coordenada
  }

 

  public abstract boolean[][] possibleMoves(); // ve os mooves possiveis da peça 

 
}