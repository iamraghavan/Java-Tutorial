package OOPS;

public class SuperKeyword {

    public static void main(String[] args) {
        SubClass m = new SubClass();


        System.out.println(m.gender);
        m.print();

    }


}

class MainClass{

    final char gender = 'M';
    int age = 50;

    void print(){
        System.out.println("Parent Class - Main Class");
    }

}


class SubClass extends MainClass {

    char gender = 'F';

    void print(){
        System.out.println(super.gender);
        super.print();
    }



}