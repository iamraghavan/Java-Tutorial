package OOPS;

public class SingleInheritance {

    public static void main(String[] args) {
       Mother motherObj = new Mother();
        System.out.println(motherObj.gender);
        motherObj.print();

        Uncle uncleObj = new Uncle();
        System.out.println(uncleObj.gender);
        uncleObj.print();


    }

}

class GrandFather {
    String gender = "M";

    void print(){
        System.out.println("Parent Class");
    }
}

class Mother extends GrandFather{

    String gender = "F";

}


class Uncle extends GrandFather{

    String gender = "M";
}