public class JavaConditionalStatement {
    public static void main(String[] args) {

        checkFirstStatement(3);

    }

    private static void checkFirstStatement(int number){

        /* it is positive, negative, or zero. Display an appropriate message based on the input */
        /* IF Else Statement*/

        if(number > 0){
            System.out.println("The Given number is Positive :" + number);
        }
        else if(number < 0){
            System.out.println("The Given Number is Negative :" + number);
        }
        else if (number == 0) {
            System.out.println("The Given Number is Zero : 0");
        }
        else {
            System.out.println("Sorry The Given Value is Not an Integer");
        }

    }

}


  /*  Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b  */