package OOPS;

public class Polymorphism {

    public static void main(String[] args) {
        methodDisplay objDisplay = new methodDisplay();

        objDisplay.display();
        objDisplay.display(5);

    }

}


class methodDisplay{
    void display(){
        System.out.println("vanakam Buddy's");
    }

    void display(int a){
        System.out.println(a);
    }
}
