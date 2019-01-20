package com.company;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<>();

	public Customer(String name, double amount) {
		this.name = name;
		processTransaction(amount);
	}

	public String getName() {
		return name;
	}

	public int processTransaction(double amount) {
		double currentBalance = getBalance();

		if ((currentBalance + amount) < 0) {
			System.out.println("Not enough funds to process transaction.");
			return -1;
		}

		this.transactions.add(amount);

		return 0;
	}

	public double getBalance() {
		double balance = 0;

		for(int i = 0; i < this.transactions.size(); i++) {
			balance += this.transactions.get(i).doubleValue();
		}

		return  balance;
	}

	public void listTransactions() {
		double total = 0;

		for(Double transaction : this.transactions) {
			double transactonAmount = transaction.doubleValue();
			total += transactonAmount;
			System.out.println(transactonAmount);
		}
		System.out.println("Total : " + total);
	}
}
