package array.oops.collections;


@FunctionalInterface // only one abstract function
interface Greeting {
    void sayHello(String name);
    // void sayTest(String name);
}


public class Lamda {
  
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("hello " + name + "!");
        greeting.sayHello("aman");
    }
    
}
