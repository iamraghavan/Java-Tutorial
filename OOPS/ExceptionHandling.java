package OOPS;

class UserDefinedException extends Exception {

    String msg;
    UserDefinedException(String m){

        super(m);

    }



}


public class ExceptionHandling {

    static void check(int age) throws UserDefinedException{
        if(age<18){
            throw new UserDefinedException("Age invalid");
        }
    }

    public static void main(String[] args) {



       int a = 5;
       int b = 0;

       try{
           System.out.println(a/b);
       }
       catch(ArithmeticException E) {

           System.out.println("Error" + E);

        }
       finally {
           System.out.println("Finally Block");
       }

        try{
            check(17);
        }catch (UserDefinedException E){
            System.out.println(E.getMessage());
        }


        System.out.println("vanakam da maple");

    }

}
