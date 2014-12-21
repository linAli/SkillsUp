package courses;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/21/14
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Spin spin= new Spin(5);
        spin.printArray();
        spin.startMoving();
        System.out.println();
        spin.printArray();
    }
}
