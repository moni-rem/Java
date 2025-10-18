package selfStudy.AbstractClass.Bank;

public  class CurrentAccount extends BankAccount {
    private double overDriftLimit;
    public CurrentAccount(String accountNumber, double balance, double overDriftLimit) {
        super(accountNumber, balance);
        this.overDriftLimit = overDriftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Depositing $"+amount+ "Successfully. current balance $" + getBalance());
    }
    public void withdraw(double amount) {
        double availableBalance = getBalance() + overDriftLimit;
        if(amount <= availableBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Witdre $"+amount+ "Successfully. current balance $" + getBalance());
        }
        else {
            System.out.println("Insufficient Funds. current balance $" + getBalance());
        }
    }
}
