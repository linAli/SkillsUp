package exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/19/14
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
     Bird birds []= {new Sparrow(), new Pigeon(), new Ostrich(), new Penguin() };
        for(Bird bird: birds){
            try{
            bird.fly();
            }catch (BirdCantFlyException ex ){
                System.out.println(ex.getMessage());
            }
        }
    }
}
