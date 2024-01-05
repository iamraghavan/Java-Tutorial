public class JavaMath {

    public  static void positiveValue(int x){

        int negativeNum = Math.abs(x);
        System.out.println(negativeNum);


    }

    // Main Method
    public static void main(String[] args) {

        positiveValue(-23);
        max(23,43);

    }

    private static void max(int x, int y){

        int a = Math.max(x,y);
        System.out.println(a);

        min(a, 30);


    }

    protected static void min(int x, int y){

        int b = Math.min(x,y);
        System.out.println(b);

        square(b);

    };

    public static void square(int SquareValue){
      double c = Math.sqrt(SquareValue);
        System.out.println(c);

        gendrateNumbers(10);
    }

    /* Random Numbers */

    private static void gendrateNumbers(int x){


        int randomNumbers = (int)(Math.random() * x);
        System.out.println(randomNumbers);
    }



}
