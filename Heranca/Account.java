package Heranca;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance; //can be accessed in sub-classes and other classes in package


    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public Double withdraw(double amount) {
        balance -= amount + 5;
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
}




