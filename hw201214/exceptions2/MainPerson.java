package exceptions2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 12/19/14
 * Time: 11:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Input your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Input birth year: ");
        int year = scanner.nextInt();
        try{
            Person person = Person.cretePerson(name, surname, year);
            System.out.println(person);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
