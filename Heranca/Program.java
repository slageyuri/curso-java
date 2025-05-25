package Heranca;

public class Program {

    public static void main(String[] args) {
        Account acc= new Account(1001, "Alex", 0.0);

        BusinessAccount bacc= new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting -  Subclass casted to superclass

        Account acc1= bacc; //Business account IS-AN account

        Account acc2 = new BusinessAccount(1003,"Bob",0.0, 200.0 );

        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //Downcasting - Superclass casted to SubClass

        BusinessAccount acc4= (BusinessAccount) acc2;
        acc4.loan(1000.0);
        //((BusinessAccount) acc2).loan(100.0); - can't do loan on acc2  without downcasting because it's an account

        //BusinessAccount acc5 = (BusinessAccount) acc3; - operation isn't allowed as acc3 is a savings account

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5= (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }



}
