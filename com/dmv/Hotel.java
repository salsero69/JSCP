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
public class Hotel {
    
    public static void book(short a) {
        System.out.print("short ");
    }
    
    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    
    public static void book(Long a) {
        System.out.print("LONG ");
    }

    // added this function to make it compile
    public static void book(Integer a) {
        System.out.print("INTEGER ");
    }    
    
    public static void main(String[] args) {
        short shortRoom = 1;
        int intRoom = 2;
        long longRoom = 2;
        
        book(shortRoom);
        book(intRoom);
        book(longRoom);
    }
}
