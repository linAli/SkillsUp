package hw201214.enums;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/19/14
 * Time: 7:15 PM
 * To change this template use File | Settings | File Templates.
 */
enum Month {
    January(31), February(28), March(31), April(30), May(31), June(30), July(31), August(31), September(30), October(31),
    November(30), Desember(31);

    private final int days;

    int getDays() {
        return days;
    }


    Month(int days) {
        this.days = days;
    }

    static public int daysInPeriod(Month from, Month to){
        int result=0;
        Month monthArrray []= Month.values();
            int i = from.ordinal();
            do{
                if(i==12/*&&to.ordinal()!=11*/)
                     i=0;
                result+=monthArrray[i].days;
                i++;
            }while (i != to.ordinal()+1);
        return result;
    }
    static void detectSeason(Month month){
        switch (month.ordinal()){
            case 0:
            case 1:
            case 11:
                System.out.println("This is Winter!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("This is Spring!");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("This is Summer!");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("This is Autumn!");
                break;
        }
    }

}
