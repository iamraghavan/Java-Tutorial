package OOPS;

public class DataTypes {

    public static void main(String[] args) {

        String a = Integer.toString(24);
        System.out.println(a);

        String x = Integer.toBinaryString(15);
        System.out.println(x);

        int y = Integer.valueOf(x);
        System.out.println(x);

        int z = Integer.parseInt(x);
        System.out.println(x);

        String b = "Raghavan";
        System.out.println(b.equals("Raghavan"));

        System.out.println(b.length());
        System.out.println(b.charAt(0));

        System.out.println(b.compareTo("Rag"));

        char[] arr = b.toCharArray();
        System.out.println(arr[7]);

        String DoubleValue = "3.4342";
        System.out.println(Double.parseDouble(DoubleValue));



    }

}
