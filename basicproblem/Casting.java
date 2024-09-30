public class Casting {

    public static void main(String[] args){
        //casting 
        // implicit casting 
        int price = 100;
        double finalPrice = 18.0;
        double total  = price + finalPrice;
        System.out.println(total);

        //explicit casting 

        int p = 1000;
        double t = 13.00;
        int to = p + (int)t;
        System.out.println(to);
    }
    
}
