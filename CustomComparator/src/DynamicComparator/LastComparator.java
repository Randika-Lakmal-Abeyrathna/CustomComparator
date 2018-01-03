/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicComparator;

import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author Randika Lakmal
 */
public class LastComparator implements Comparator<String>{
    
    HashMap<String, Integer> hm = new HashMap<String, Integer>();

    @Override
    public int compare(String o1, String o2) {
        
        hm.put("S", 1);
        hm.put("D", 2);
        hm.put("T", 3);
        String l1 = o1.split(" ")[1].substring(0,1);
        String l2 = o2.split(" ")[1].substring(0,1);
        
        System.out.println(l1);
        return Integer.valueOf(hm.get(l1)).compareTo(Integer.valueOf(hm.get(l2)));
        
        
        
    }
    
    
    
}
