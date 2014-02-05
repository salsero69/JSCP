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
public class Test {     
    int a = 10;
    
    public void doStuff(int a) {
        a += 1;
        System.out.println(++a);
    }
    public static void main(String args[]) {
        Test t = new Test();
        t.doStuff(3);
    }
}
