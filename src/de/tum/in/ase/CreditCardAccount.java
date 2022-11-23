package de.tum.in.ase;

public class CreditCardAccount extends BankAccount {
    private double creditBalance = 0;
    private final double limit;

    public CreditCardAccount(int accountId, double initial, double limit) {
        super(accountId, initial);
        this.limit = limit;
    }

    public boolean pay(double amount) {
        System.out.println("Pay from account " + accountId + "\n" + "Amount:\t\t\t\t" + amount);
        if (- creditBalance + amount > limit) {
            System.out.println("Sorry, insufficient balance...\n");
            return false;
        }
        creditBalance = creditBalance - amount;
        System.out.println("New credit balance:\t" + creditBalance + "\n");
        return true;
    }
}
