package array.oops.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasSet {

    public static void main(String[] args) {
        
        Set<Integer> set = new TreeSet<>(); 
        // Set<Integer> set = new LinkedHashSet<>();
        // Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(1);
        set.add(52);
        set.add(21);
        set.add(45);
        set.add(56);
        set.add(68);

        System.out.println(set);

    }
    
}
