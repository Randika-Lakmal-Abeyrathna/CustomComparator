/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectComparator;

import java.util.Comparator;

/**
 *
 * @author Randika Lakmal
 */
public class ObjectComparator implements Comparator<DataHolder>{

    @Override
    public int compare(DataHolder o1, DataHolder o2) {
        
        return Integer.valueOf(o2.getAge()).compareTo(Integer.valueOf(o1.getAge()));
    }
    
}
