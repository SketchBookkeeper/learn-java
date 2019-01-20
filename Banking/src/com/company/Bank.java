package com.company;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Branch> branches = new ArrayList<>();

	public void addBranch(String name) {
		branches.add(new Branch(name));
	}

	private int searchForBranch(String name) {
		for(int i = 0; i < branches.size(); i++) {
			if (branches.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	private int getBranchIndex(String name) {
		int branchIndex = searchForBranch(name);

		if (branchIndex != 0) {
			System.out.println("Branch not found.");
			return -1;
		}

		return branchIndex;
	}

	public int addCustomer(String branch, String customerName, double amount) {
		int branchIndex = getBranchIndex(branch);

		if (branchIndex < 0) {
			return -1;
		}

		branches.get(branchIndex).addCustomer(customerName, amount);

		return 0;
	}

	public int processTransaction(String branch, String customerName, double amount) {
		int branchIndex = getBranchIndex(branch);

		if (branchIndex < 0) {
			return -1;
		}

		Branch branchObject = branches.get(branchIndex);

		if (branchObject.processTransaction(customerName, amount) != 0) {
			return -1;
		}

		return 0;
	}

	public int showTransactions(String branch) {
		int branchIndex = getBranchIndex(branch);

		if (branchIndex < 0) {
			return -1;
		}

		branches.get(branchIndex).listCustomers();

		return 0;
	}

	public int showTransactions(String branch, boolean showTransactions) {
		int branchIndex = getBranchIndex(branch);

		if (branchIndex < 0) {
			return -1;
		}

		branches.get(branchIndex).listCustomers(showTransactions);

		return 0;
	}
}
