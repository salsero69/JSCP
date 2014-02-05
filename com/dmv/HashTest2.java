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
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HashTest2 {
    
    private String str;
    
    public HashTest2(String str) {
        this.str = str;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
        
    public static void main(String args[]) {
        HashTest2 h1 = new HashTest2("2");        
        String s1 = new String("1");        
        
        List<Object> list = new LinkedList<Object>();
        list.add(h1);
        list.add(s1);
        
        Collections.sort(list);
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
