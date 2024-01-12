package OOPS;

class Animals{
    int noLegs = 4;

    public static void eat(){
        System.out.println("I am Eating");
    }

    public static void walk(){
        System.out.println("I am walking");
    }

}

class Dogs extends Animals {
    boolean isBark = true;

    int noLegs = 5;

    public static void eat(){
        System.out.println("Dod is Eating");
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        Dogs isDogObj = new Dogs();
        System.out.println(isDogObj.noLegs);
        System.out.println(isDogObj.isBark);

        isDogObj.eat();
        isDogObj.walk();

    }
}
