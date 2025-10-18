package selfStudy.AbstractClass.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to the Bank System =====");
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Create a Savings Account dynamically
            System.out.print("Enter account number: ");
            String accNo = sc.next();
            System.out.print("Enter initial balance: ");
            double ibal = sc.nextDouble();
            System.out.print("Enter minimum balance required: ");
            double minBal = sc.nextDouble();

            SavingAccount sa = new SavingAccount(accNo, ibal, minBal);
            System.out.println("Savings account created successfully!");

            System.out.print("Enter deposit amount: ");
            double damt = sc.nextDouble();
            sa.deposit(damt);

            System.out.print("Enter withdrawal amount: ");
            double wamt = sc.nextDouble();
            sa.withdraw(wamt);

        } else if (choice == 2) {
            // Create a Current Account dynamically
            System.out.print("Enter account number: ");
            String accNo = sc.next();
            System.out.print("Enter initial balance: ");
            double ibal = sc.nextDouble();
            System.out.print("Enter overdraft limit: ");
            double limit = sc.nextDouble();

            CurrentAccount ca = new CurrentAccount(accNo, ibal, limit);
            System.out.println("Current account created successfully!");

            System.out.print("Enter deposit amount: ");
            double damt = sc.nextDouble();
            ca.deposit(damt);

            System.out.print("Enter withdrawal amount: ");
            double wamt = sc.nextDouble();
            ca.withdraw(wamt);

        } else {
            System.out.println("Invalid option! Please select 1 or 2.");
        }

        sc.close();
        System.out.println("===== Transaction Completed =====");
    }
}
