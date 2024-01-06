package OOPS;

class AccessSpecifier {
    String name;
    int rollNo;

    public void display(String x, int y){
        System.out.println(x);
        System.out.println(y);
    }

    public void setValue(String getName, int getRollNo){

        String x = getName;
        int y = getRollNo;

        display(x,y);
    }



}

class Out{
    public static void main(String[] args) {
        AccessSpecifier myObj = new AccessSpecifier();
        AccessSpecifier myObj2 = new AccessSpecifier();
        AccessSpecifier argObj1 = new AccessSpecifier();


        String names = "Raghavan";
        int rollNos = 71;

        String[] name = new String[50];
        int[] rollNo = new int[50];

        name[0] = "Raghavan";
        rollNo[0] = 1;

        name[1] = "Ajay";
        rollNo[1] = 2;



        myObj.display(name[0],rollNo[0]);
        myObj2.display(name[1],rollNo[1]);

        /* Teq : 1 */
        argObj1.setValue("Ram Kumar", 3);

        /* Teq : 2 */
        argObj1.setValue(names,rollNos);



    }
}
