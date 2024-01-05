public class ConditionalStatement {
    public static void main(String[] args) {

        boolean attendance = true;

        if ( attendance == true) {
            System.out.println("Thambi Class tha Irukaa !");
        }
        else {
            System.out.println("Thambi class cut adichuta...");
        }


        /* Else if Statement */

        int age = 19;

        if (age <= 18 ) {
            System.out.println("Your are a Teenage");
        } else if ( age >= 30 ){
            System.out.println("Your are a not a Teenage");
        }else {
            System.out.println("nothing");
        }

    }
}
