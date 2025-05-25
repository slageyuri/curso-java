package Heranca;

public final class SavingsAccount extends Account{
    //final avoids that the class can be extended
    private Double interestRate;


    public SavingsAccount(){
        super();
    }


    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){

        balance+= balance*interestRate;

    }

    @Override
    public final Double withdraw(double amount) { //method can't be overridden (if SavingsaAccount is extended)
        balance-=amount;
        return balance;
    }


}
