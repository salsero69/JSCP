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
import java.util.Arrays;

public class HashTest implements Comparable{
    
    private String str;
    
    public HashTest(String str) {
        this.str = str;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
        
    @Override
    public int compareTo(Object o)
    {
        int result = str.compareTo(o.toString());
        
        return result;
    }
    public static void main(String args[]) {
        HashTest h1 = new HashTest("2");        
        String s1 = new String("1");        
        
        Object arr[] = new Object[2];
        arr[0] = h1;
        arr[1] = s1;
        Arrays.sort(arr);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}
