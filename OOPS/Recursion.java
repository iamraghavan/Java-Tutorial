package OOPS;

// Base Case
// Recursion Case
public class Recursion {

    public static void main(String[] args) {
        printNaturalNumbers(10);
    }

    public static void printNaturalNumbers(int n){
        if (n == 1){
            System.out.println(1);
        }

        else {
            System.out.println(n);
            printNaturalNumbers(n-1); // ---> Recursion Part
        }
    }




}
