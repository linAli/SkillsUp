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
public class Cat extends Animal{
    private String type;
    private String color;
    

    public Cat(boolean tail, String sound, String type, String color) {
        super(4, tail, sound);
        this.type=type;
        this.color=color;
    }

    @Override
    public void eat(Food f) {
        if(f.getClass()==Meat.class){
            setMood(getMood() + f.getTaste());
        }else{
            setMood(getMood() - 3);
        }
            
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
