package courses;

/**
 * Created by user on 20.12.2014.
 */
public class Spin {
    private int array [][];
    private int size;
    private Position currentPosition;
    private Direction direction;

    public Spin(int size) {
        this.size = size;
        array = new int[size][size];
        currentPosition = new Position(0,0);
        direction = Direction.Right;
    }

    public void startMoving(){
        int end=size*size;
        do{
            Position checkPosition = new Position(currentPosition.getX() + direction.getX(), currentPosition.getY() + direction.getY());
            try {
                if(end!=1)
                {
                    if (array[checkPosition.getX()][checkPosition.getY()]==1){
                        throw new AlreadyVisitedPlaceException();

                    }
                }
                array[currentPosition.getX()][currentPosition.getY()]=1;
                currentPosition=checkPosition;
                end--;
            }catch (Exception ex){
                direction=direction.getNextDirection();
            }
        }while (end!=0);

    }

    public void printArray(){
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++ ){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    private class Position{
        private int x;
        private int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
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
}
