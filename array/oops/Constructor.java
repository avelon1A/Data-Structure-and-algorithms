package array.oops;

/**
 * The Constructor class represents a simple example of a class with a constructor
 * that initializes an instance variable.
 */
public class Constructor {
    int x;

     public Constructor(int y){
        this.x = y;
     }
     // by default there will be constructor 


     public static void main(String[] args){
        Constructor object = new Constructor(10);
        System.out.println(object.x);
     }
    
}
