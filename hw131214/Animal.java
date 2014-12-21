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
public abstract class Animal {

    private int legs;
    private boolean tail;
    private String sound;
    private int mood;

    public Animal(int legs, boolean tail,String sound) {
        this.legs = legs;
        this.tail = tail;
        this.sound = sound;
        this.mood = 0;
    }
    
    public abstract void eat(Food f);

    /**
     * @return the legs
     */
    public int getLegs() {
        return legs;
    }

    /**
     * @param legs the legs to set
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * @return the tail
     */
    public boolean isTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(boolean tail) {
        this.tail = tail;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * @return the mood
     */
    public int getMood() {
        return mood;
    }

    /**
     * @param mood the mood to set
     */
    public void setMood(int mood) {
        this.mood = mood;
    }
    public abstract String getType();
}
