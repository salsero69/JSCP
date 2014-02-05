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
public class TryMe {

    Integer A = new Integer(0);
    int a;

    public TryMe(int a) {
        System.out.print("Result: " + this.a + "\n");
        this.a = A + a;
        System.out.print("Result: " + this.a + "\n");
    }

    public static void main(String args[]) {
        Integer A = new Integer(1);
        TryMe t = new TryMe(A);
    }
}
