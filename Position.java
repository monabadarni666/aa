import java.util.Random;

public class Position {
    private int row;
    private int col;

    public Position(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
    public boolean isSpotEmpty(Disc disc)
    {


    }
    public int getRow()
    {
        return this.row;
    }
    public int getCol()
    {
        return  this.col;
    }
    public Position possiblePosition()
    {
        Random random = new Random();
        int newRow = random.nextInt(8); // 0 to 7 (8 rows on the board)
        int newCol = random.nextInt(8); // 0 to 7 (8 columns on the board)
        return new Position(newRow, newCol);

    }


















}
