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
public class StringArray {

    public static void main(String args[]) {
        Object myObj = new String[]{"one", "two", "three"}; {
            for (String s : (String[]) myObj) {
                System.out.print(s + ".");
            }
        }
    }

}
