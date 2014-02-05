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
public class EmptyStringTest {

    public static boolean isEmpty(String s) {
        return (s == null || s.length() == 0);
    }

    public static void main(String args[]) {
        if (isEmpty(null)) {
            System.out.print("empty ");
        } else {
            System.out.print("not_empty ");
        }
    }
}
