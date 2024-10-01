package array.oops.solidPrinciples;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Collec {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

    
        // Collections.swap(myNumbers ,0,2);
        // Collections.sort(myNumbers, Collections.reverseOrder());
//       System.out.println(myNumbers.get(0));
//       myNumbers.set(5, 88);
//  System.out.println(myNumbers.get(5));
    //    for (int i : myNumbers) {
        //     System.out.println(i);
        // }

        Iterator<Integer> it = myNumbers.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
