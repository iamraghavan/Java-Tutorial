public class Dowhile {

    public static void main(String[] args) {

        int n = 5;
        int sum = 0;
        int i = 6;

        do {
            sum += i;
            i++;
        }
        while (i<=n);

        System.out.println(sum);

    }

}
