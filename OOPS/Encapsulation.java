package OOPS;

import javax.xml.crypto.Data;
import java.util.Date;

public class Encapsulation {

    String name;
    String bankName;
    int balance;
    private  int afterdebtBalance;
    private int debtAmount;

    public void setBankDetails(String getName, String getBankName, int getBalance, int getdebtAmount){

        String a = getName;
        String b = getBankName;
        int c = getBalance;
        int d = getdebtAmount;


        displayDetails(a,b,c,d);


    }

    public void displayDetails(String a, String b, int c, int d){

        Date dispDate = new Date();

        System.out.println("Account Holder Name : " + a);
        System.out.println("Bank Name " + b);

int e = c - d;

        System.out.println(dispDate);

        System.out.println("----------------------");

        System.out.println("Current  Balance : " + c);

        System.out.println("Debit Balance : " + d);

        System.out.println("-----------------------");

        System.out.println("Balance :" + e);

    }




}

class Atm{
    public static void main(String[] args) {
        Encapsulation atmObj = new Encapsulation();

        int[] accHolderNum = new int[50];
        String[] accHolderStr = new String[50];

        accHolderNum[0] = 20000;
        accHolderNum[1] = 5000;

        atmObj.bankName = accHolderStr[0]="Raghavan";
        atmObj.name = accHolderStr[1] = "State Bank of India";




atmObj.setBankDetails(accHolderStr[0], accHolderStr[1], accHolderNum[0], accHolderNum[1]);





    }
}
