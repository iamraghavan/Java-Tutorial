import java.awt.*;
import java.util.Date;

public class ReferenceDatatype {

    public static void main(String[] args) {

        int a = 20;

        // new keyword is a Java Keyword new --> create a space in RAM or Allocated Some space in memory

        Date today = new Date();
        System.out.println(today);

        int b = a;
        a = 5;

        System.out.println(a);
        System.out.println(b);

        Point p1 = new Point(3,4);
        Point p2 = p1;
        System.out.println(p2);

        p1.x = 23;

        System.out.println(p2);
        System.out.println(p1);




    }

}
