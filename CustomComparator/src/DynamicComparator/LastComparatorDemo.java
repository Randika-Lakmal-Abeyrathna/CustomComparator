/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicComparator;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Randika Lakmal
 */
public class LastComparatorDemo {
    public static void main(String[] args) {
        TreeSet tr = new TreeSet(new LastComparator());
        tr.add("Comedy Drama");
        tr.add("Joe Swanberg");
        tr.add("Funny Tales");
        
        Iterator it = tr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
