package courses;

/**
 * Created by user on 20.12.2014.
 */
public enum Direction {
    Right(0,1),
    Left(0,-1),
    Up(-1,0),
    Down(1,0);
    private int x;
    private int y;

    private Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Direction getNextDirection(){
        switch (this){
            case Right:
                return Down;
            case Left:
                return Up;
            case Up:
                return Right;
            case Down:
                return Left;
            default:
                throw new UnknownDirectionException();
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
