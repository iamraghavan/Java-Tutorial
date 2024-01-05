public class StringMethods {

    public static void main(String[] args) {

        String firstValue = "Raghavan Jeeva";

        System.out.println(firstValue);

        /* String Length --> To find the Length of String */

        int findStrLength = firstValue.length();
        System.out.println(findStrLength);

        /* Uppercase & Lowercase */

        String changeUppercase = firstValue.toUpperCase();
        System.out.println(changeUppercase);

        String changeLowercase = firstValue.toLowerCase();
        System.out.println(changeLowercase);

        /* Find the Character in a String */

        String secondValue = "Saravanan Jeeva";


        System.out.println(secondValue.indexOf("Jeeva"));


    }

}
