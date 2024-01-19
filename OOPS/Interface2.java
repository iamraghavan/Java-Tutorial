package OOPS;

public class Interface2 {

    public static void main(String[] args) {
        al newObj = new al();

        newObj.call();
        newObj.talk();
    }

}


interface Father{

    abstract void call();
    abstract void talk();

}

interface Mothers{
   abstract void call();
    abstract void talk();
}


class al implements Father,Mothers{

    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }
}