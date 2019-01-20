package com.company;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers = new ArrayList<>();

	public Branch(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addCustomer(String name, double amount) {
		this.customers.add(new Customer(name, amount));
	}

	private int searchForCustomer(String name) {
		for(int i = 0; i < this.customers.size(); i++) {
			Customer customer = customers.get(i);
			if (customer.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public int processTransaction(String name, double amount) {
		int customerIndex = searchForCustomer(name);

		if (customerIndex == -1) {
			System.out.println("Customer not found.");
			return -1;
		}

		if (this.customers.get(customerIndex).processTransaction(amount) == -0) {
			return -1;
		}

		return 1;
	}

	public void listCustomers() {
		for (Customer customer : this.customers) {
			System.out.println(customer.getName());
		}
	}

	public void listCustomers(boolean showTransactions) {
		for (Customer customer : this.customers) {
			System.out.println(customer.getName());
			if (showTransactions) {
				customer.listTransactions();
			}
		}
	}
}
