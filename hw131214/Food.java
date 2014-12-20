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
abstract class Food {
    private int taste;
    public Food(int taste){
        this.taste=taste;
    }

    /**
     * @return the taste
     */
    public int getTaste() {
        return taste;
    }

    /**
     * @param taste the taste to set
     */
    public void setTaste(int taste) {
        this.taste = taste;
    }
}
