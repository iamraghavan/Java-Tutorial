package OOPS;

public class Abstraction {

    public static void main(String[] args) {

        HP objHp = new HP();
        Dell objDell = new Dell();

        objDell.turnOn();
        objHp.turnOn();

        objHp.turnOff();
        objDell.turnOff();


    }

}

/*
* We can't create a Object for a Abstract Class
* abstract class cannot be instantiated
*/


abstract class Computer {

    abstract void turnOff();

    abstract void turnOn();

}

class HP extends Computer{

    void turnOn(){
        System.out.println("ON HP");
    }

    @Override
    void turnOff() {
        System.out.println("OFF HP");
    }
}

class Dell extends Computer{

    @Override
    void turnOn() {
        System.out.println("ON Dell");
    }

    @Override
    void turnOff() {
        System.out.println("OFF Dell");
    }
}
