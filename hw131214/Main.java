/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw131214;

/**
 *
 * @author therioyo
 */
public class Main {
    public static void main(String[] args) {
        Animal array[]={
            new Cat(false, "Rr-rr!", "Lynx", "red"),
            new Cat(true, "Meu!", "Home cat", "monochrome"),
            new Horse(true, "Igo-go", "Arabian", "black"),
            new Horse(false, "Fr-r-r!", "Suffolk punch", "white")
        };
        Food meat = new Meat();
        Food grass = new Grass();
        System.out.println("I give some meat every animal.");
        for(Animal a:array){
            a.eat(meat);
            System.out.println(a.getType()+", mood = "+a.getMood());
        }
        System.out.println("I give some grass every animal.");
        for(Animal a:array){
            a.eat(grass);
            System.out.println(a.getType()+", mood = "+a.getMood());
        }
    }
}
