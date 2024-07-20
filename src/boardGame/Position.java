 public class Position{
    
    private int row;
    private int col;
   
    public Position (int row, int col){
        this.row = row;
        this.col = col;
    }

    public Position(Position position){
        this(position.row, position.col);
    }
 
    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
    

    
    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Position position = (Position)obj;
        return row == position.row && col == position.col;
    }

    @Override
    public Object clone(){
        return new Position(row, col);
    }
}