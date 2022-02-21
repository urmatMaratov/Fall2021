package com.digital_nomads.javaFall2021.applications;

import static com.digital_nomads.javaFall2021.applications.Bank.*;

public class BankerDemo {
    public static void main(String[] args) throws Exception {
        DemirBank nursultanDemirBankAccount = new DemirBank(123456789101l, 123456789);
        DemirBank urmatDemirBankAccount = new DemirBank(123456789987l, 987654321);

        System.out.println(nursultanDemirBankAccount.getBalance());

        nursultanDemirBankAccount.deposit(7000);

        System.out.println(nursultanDemirBankAccount.getBalance());
        Bank.transferFunds(nursultanDemirBankAccount, urmatDemirBankAccount, 5000);

        System.out.println(urmatDemirBankAccount.getBalance());
        System.out.println(nursultanDemirBankAccount.getBalance());

        OptimaBank dosOptimaBankAccount = new OptimaBank("+996708671484");
        OptimaBank belekOptimaBankAccount = new OptimaBank("+996555667788");

        dosOptimaBankAccount.deposit(50000);
        System.out.println("Dos: " +dosOptimaBankAccount.getBalance());

        transferFunds(dosOptimaBankAccount, belekOptimaBankAccount, 30000);
        System.out.println("Dos: " +dosOptimaBankAccount.getBalance());
        System.out.println("Belek: " +belekOptimaBankAccount.getBalance());


    }
}
