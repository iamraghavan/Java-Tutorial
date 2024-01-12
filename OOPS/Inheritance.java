package OOPS;

class Animal{
    int noLegs = 4;

    public static void eat(){
        System.out.println("I am Eating");
    }

    public static void walk(){
        System.out.println("I am walking");
    }

}

class Dog extends Animal {
    boolean isBark = true;

}

public class Inheritance {
    public static void main(String[] args) {
        Dog isDogObj = new Dog();
        System.out.println(isDogObj.noLegs);
        System.out.println(isDogObj.isBark);

        isDogObj.eat();
        isDogObj.walk();

    }
}
