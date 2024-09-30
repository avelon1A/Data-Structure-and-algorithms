public class Name {
    
    public static void main(String[] args){
     String name = "aman";  //not premivtive data type
     int age = 23;  // premivtie data type
     float fi = 10.33F;
     char letter = 'a';
     String name1 = "fist";
     String name2 =  "second";
     String name3  = name1 + "and" +name2;
     String name4 = name.replace('a', 'm');
     String subString = name.substring(1, 3);
     

     System.out.println(age); // output 23
     System.out.println(name); // output aman
     System.out.println(name.length());  // output 4
     System.out.println(fi); // output 10.33
     System.out.println(letter); // output a
     System.out.println(name3);  // output firstandsecond
     System.out.println(name3.charAt(0)); // output f
     System.out.println(name4);
     System.out.println(subString);

     /* 
      * String are immutable in java
      */
     
    }
}
