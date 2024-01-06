package OOPS;

class Sample {

    int rollNo;
    int marks;


}

class Construct {

    public static void main(String[] args) {
        Sample obj = new Sample(); // --- > in this line Sample(); this is constructor

        System.out.println(obj.rollNo);
        System.out.println(obj.marks);

    }

}
