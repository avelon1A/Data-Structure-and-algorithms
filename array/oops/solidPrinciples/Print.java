package array.oops.solidPrinciples;

public  class Print {

    // Method to print area of any shape
    public static void area(I2DShape shape) {
        System.out.println("Area of the "+ shape.getArea());
    }
   public static void volume(I3DShape shape){
      System.out.println("Area of the "+ shape.getVolume());
    }
   
}