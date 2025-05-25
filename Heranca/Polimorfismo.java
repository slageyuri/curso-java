package Heranca;

public class Polimorfismo {

    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01); //upcasting

        x.withdraw(50.0);
        y.withdraw(50.0); //compiler calls the SavingsAccount withdraw during its execution, upcasting the y account

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
