package com.digital_nomads.javaFall2021.applications;

public class OptimaBank extends BankCase {

    private double balance = 0;

    public OptimaBank(String phoneNumber) throws Exception {
        super(phoneNumber);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount < 0 || amount > 60000) {
            throw new Exception("Amount is invalid");
        } else {
            balance += amount;
        }
    }

    @Override
    public void withDraw(double amount) throws Exception {
        if (amount<0 || amount>40000){
            throw new Exception("invalid amount, cannot be withdrawn");
        } else if(amount> balance){
            throw new Exception("invalid amount, cannot be withdrawn");
        } else{
            balance -= amount;
        }
    }
}
