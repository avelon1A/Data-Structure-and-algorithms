package array.oops.solidPrinciples;

 interface Shapes {

  
}
interface I2DShape extends Shapes{
  double getArea();
}
interface I3DShape extends Shapes{

   double getVolume();
}


public class Circle implements I2DShape{
    
   int radius;
    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
  return Math.PI * radius* radius;
    }

}
 class Rectangle implements I2DShape{
  int length;
  int width;
    Rectangle(int length,int width ){
    this.length = length;
    this.width  = width;
    }
   
    @Override
  public double getArea(){
      return length*width;
    }
  
}
class Cube implements I3DShape {
  int length;
  Cube(int length){
    this.length = length;
  }
  @Override
  public double getVolume() {
   return length*length*length;
 
  }
  
}
