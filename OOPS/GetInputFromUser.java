package OOPS;

import java.util.Scanner;

public class GetInputFromUser {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.println("Enter a Input" + " " + a);

        float b = input.nextFloat();
        System.out.println(b);

        String c = input.next();
        System.out.println(c);

    }

}



