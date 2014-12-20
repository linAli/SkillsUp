package exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/19/14
 * Time: 9:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class BirdCantFlyException extends RuntimeException {

    public BirdCantFlyException(){
        super();
    }

    public  BirdCantFlyException(String message){
        super(message);
    }
}
