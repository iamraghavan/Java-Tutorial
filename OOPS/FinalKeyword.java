package OOPS;

public class FinalKeyword {

    public static void main(String[] args) {
        Daughter newDaughter = new Daughter();

        newDaughter.print();
        System.out.println(newDaughter.gender);
    }


}

class Fathers{

    final char gender = 'M';
    int age = 50;

    final void print(){
        System.out.println("Parent Class - Main Class");
    }

}


class Daughter extends Fathers {

    char gender = 'F';



}