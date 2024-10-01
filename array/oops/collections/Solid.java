package array.oops.solidPrinciples;

public class Solid {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 5);
        Cube cube  = new Cube(5);
        Print.area(circle);
        Print.area(rectangle);
        Print.volume(cube);
    }

   
}
