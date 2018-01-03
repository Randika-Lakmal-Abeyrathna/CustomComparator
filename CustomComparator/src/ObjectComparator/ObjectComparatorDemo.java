/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectComparator;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Randika Lakmal
 */
public class ObjectComparatorDemo {
    
    public static void main(String[] args) {
        TreeSet tr = new TreeSet(new ObjectComparator());

        DataHolder holder1 = new DataHolder();
        holder1.setName("Test User 1");
        holder1.setAge(20);

        DataHolder holder2 = new DataHolder();
        holder2.setName("Test User 2");
        holder2.setAge(25);

        DataHolder holder3 = new DataHolder();
        holder3.setName("Test User 3");
        holder3.setAge(24);

        tr.add(holder1);
        tr.add(holder2);
        tr.add(holder3);

        Iterator it = tr.iterator();

        while (it.hasNext()) {
            DataHolder tempholder = (DataHolder) it.next();
            System.out.println(tempholder.getName()+" "+tempholder.getAge());
        }
    }
    
}
