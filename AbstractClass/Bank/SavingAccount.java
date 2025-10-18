package selfStudy.AbstractClass.Bank;

  class SavingAccount extends BankAccount{
      private double minBalance;
      public SavingAccount(String accountNumber, double balance, double minBalance) {
          super(accountNumber, balance);
          this.minBalance = minBalance;
      }
     public void deposit(double amount) {
         setBalance(getBalance()+ amount);
         System.out.println("Deposite $"+amount+ "Successfully. current balance $" + getBalance());

     }
     public void withdraw(double amount) {


         if(getBalance() - amount >= minBalance) {
             setBalance(getBalance() - amount);
             System.out.println("Withdraw $"+amount+ "Successfully. current balance $" + getBalance());
         }else {
             System.out.println("Withdraw $" + amount + "Failed. Current balance $" + getBalance());
         }

     }
}
