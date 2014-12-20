package exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/19/14
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ostrich extends  Bird{
    @Override
    public void fly() {
          throw new BirdCantFlyException ("I'm ostrich, I can't fly!");
    }
}
