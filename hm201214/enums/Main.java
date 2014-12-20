package enums;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/19/14
 * Time: 7:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Month.daysInPeriod(Month.May, Month.June));
        System.out.println();
        System.out.println(Month.daysInPeriod(Month.May, Month.April));
        System.out.println();
        Month.detectSeason(Month.August);
    }
}
