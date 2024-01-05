public class ForLoop {

    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){

            int num = 5 * i;
            System.out.println("5" + " * " + i + " = " + num);

        }


        /* Sum of N Natural Number */

        int n = 5;
        int sum = 0;

        for(int i = 1; i <= n; i++) {

            /*sum = sum + i;*/
            sum += i;
            System.out.println("sum of n number " + sum);

        }

        /* Factorial Program using for loop */


        int j = 5;
        int fact = 1;

        for (int i = 1; i <=j ; i++) {
            fact *= i;
            System.out.println(fact);
        }


    }

}
