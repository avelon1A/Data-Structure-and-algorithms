package array.oops.solidPrinciples;

import java.util.Collections;
import java.util.ArrayList;

public class Collec {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers, Collections.reverseOrder());

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
