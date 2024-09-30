package array.oops;
public class OOPS {

    public static void main(String[] args){
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p2.color = "red";
        p2.pen = "jelll";
        p1.color = "blue";
        p1.pen = "ball pen";
        p1.write();
        p1.type();
        p1.color();
        p2.type();
        p2.color();
    }

    
}
