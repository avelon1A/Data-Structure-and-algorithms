import java.util.Arrays;
public class ArraysInJava {

    public static void main(String[] args){
        int [] marks = {10,9,8,7};
      int n = marks.length;
        for(int i= 0;i<n;i++){
             System.out.print(marks[i]+" ");
        }
        Arrays.sort(marks);
        System.out.println(" ");
        System.out.println(marks[2]);
    

    int [][] finalMarks = {{20,19,23,25},{23,12,19,22}};
     for( int i = 0;i < finalMarks.length;i++){
        for(int j = 0;j < finalMarks[i].length;j++){
            System.out.print(finalMarks[i][j]+" "); //output 20 19 23 25 23 12 19 
        }
          System.out.println();
     }

    }
}
    

