package OOPS;

public class ThisKeyword {

    public static void main(String[] args) {
        MainClass1 m = new MainClass1();



        m.print('M', 23);
        System.out.println(m.gender);
        System.out.println(m.age);

    }


}

class MainClass1{

   char gender;
    int age;

    void print(char gender, int age){

        this.gender = gender;
        this.age = age;

    }

}


class SubClass1 extends MainClass1 {

    char gender;





}