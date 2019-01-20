package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch("Cedar City");
        bank.addCustomer("Cedar City", "Paul", 0);
        bank.addCustomer("Texas", "Joe", 10000.09); // Test branch not added
        bank.addCustomer("Cedar City", "John", 30.90);
        bank.processTransaction("Cedar City", "John", 90);
        bank.processTransaction("Cedar City", "Bill", 704.9); // Test customer not added
        bank.processTransaction("Cedar City", "Paul", -99); // Test insufficient funds
        bank.processTransaction("Cedar City", "Paul", 899.87);
        bank.processTransaction("Cedar City", "Paul", -50.50);
        bank.showTransactions("Cedar City", true);
    }
}
