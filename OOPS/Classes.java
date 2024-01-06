package OOPS;

class Classes {
    String name;
    int rollNo;

    public void display(String x, int y){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Classes myObj = new Classes();

       String name = "ram";
       int rollNo = 71;

        myObj.display(name, rollNo);


    }
}
