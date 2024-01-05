public class While {

    public static void main(String[] args) {

        /* sum of n natural number using while loop */

        int n = 5;
        int sum = 0;
        int i = 1;


        while (i<=n){
            sum += i;
            i++;
        }

        System.out.println(sum);

    }

}
