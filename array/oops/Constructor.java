package array.oops;

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
