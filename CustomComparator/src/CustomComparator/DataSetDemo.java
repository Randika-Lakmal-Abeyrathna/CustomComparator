/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomComparator;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Randika Lakmal
 */
public class DataSetDemo {
    
    public static void main(String[] args) {
        
     TreeSet tr = new TreeSet(new CustomComparator());
        
        tr.add("01-03-2018");
        tr.add("02-03-2017");
        tr.add("20-04-2015");
        tr.add("09-12-2014");
        tr.add("09-03-2019");
        
        Iterator it = tr.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
