package exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/19/14
 * Time: 9:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new BirdCantFlyException("I'm penguin, I can't fly!");
    }
}
