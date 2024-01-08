package OOPS;

class Sample {

    int rollNo;
    int marks;

    Sample(int a, int b){
        System.out.println("This is working / Default Constructor");
        rollNo = a;
        marks = b;
    }



}

class Construct {

    public static void main(String[] args) {
        Sample obj = new Sample(34,90); // --- > in this line Sample(); this is constructor

        System.out.println(obj.rollNo);
        System.out.println(obj.marks);

    }

}
