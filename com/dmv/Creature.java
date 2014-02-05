/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp;

/**
 *
 * @author dovailla
 */
public class Creature {
    private int legCount;
    // changted to public
    public int wingCount;
    
    public Creature(int legCount) {
        // added this line
        this.legCount = this.legCount;
        this.wingCount = 0;
    }
    
    public String toString() {
        return "legs=" + this.legCount + " wings=" + wingCount;
    }
}
