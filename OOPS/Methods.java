package OOPS;

public class Methods {

    public static void main(String[] args) {

        /* add(10,45); */
        int c = add(10,45);
        c = c * 10;
        System.out.println(c);
        /*System.out.println(add(10,45));*/
        System.out.println("c is printed");

    }

    /* void has a return type */
    public static int add(int x, int y){


        int c = x+y;
        return c;

    }

}
