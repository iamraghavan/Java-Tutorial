package OOPS;

public class InheritanceFamily {

    public static void main(String[] args) {

        calculateDebit objBank = new calculateDebit();

        objBank.bankName = "State Bank of India";
        objBank.accountNum = 123482383;
        objBank.balance = 20000;
        objBank.DisplayDetails();
        objBank.calculate(14000);


    }


}


class BankDetails{

    String bankName;
    int accountNum;
    int balance;


}

class Debit extends BankDetails{

    int debitAmt;

    void DisplayDetails(){
        System.out.println("Bank Name : " + " " + bankName );
        System.out.println("Account Number : " + " " + accountNum);
        System.out.println("Balance : " + " " + balance);
    }



}

class calculateDebit extends Debit{

    void calculate(int a){
        int currentValue = balance - a;
        System.out.println("Current Balance : " + " " + currentValue);
    }

}

