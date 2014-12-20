package exceptions2;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/19/14
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String name;
    private String surname;
    private int year;

    private Person(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public static Person cretePerson(String name, String surname, int year){
         if (year > 2014) {
            throw new IllegalArgumentException("Incorrect year!");
         }
        if(!name.matches("[-A-Za-z]+")){
            throw new IllegalArgumentException("Incorrect name!");
        }
        if (!surname.matches("[-A-Za-z]+")) {
            throw new IllegalArgumentException("Incorrect surname!");
        }
        return new Person(name, surname, year);
    }

    @Override
    public String toString(){
        return name + " " + surname + " was birn: " + year + ".";
    }
}
