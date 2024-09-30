import java.util.Scanner;
public class Imput {

    public static void main(String[] args){
        
        Scanner  sc = new Scanner(System.in);
        System.out.println("input your age ");
        int age = sc.nextInt();
        System.out.println("your age "+age);

      
        System.out.println("input your name " );
          String name = sc.next();
          System.out.println("your name is " + name);
           sc.nextLine();

          System.out.println("input your line " );
          String line = sc.nextLine();
          System.out.println("your name is " + line);

    }
    
}
