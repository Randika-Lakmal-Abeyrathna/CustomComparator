/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomComparator;

import java.util.Comparator;

/**
 *
 * @author Randika Lakmal
 */
public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        
        String value1 = o1.split("-")[2]+ o1.split("-")[1]+o1.split("-")[0];
        String value2 = o2.split("-")[2]+ o2.split("-")[1]+o2.split("-")[0];
        
        return Integer.valueOf(value1).compareTo(Integer.valueOf(value2));
        
    }
    
}
