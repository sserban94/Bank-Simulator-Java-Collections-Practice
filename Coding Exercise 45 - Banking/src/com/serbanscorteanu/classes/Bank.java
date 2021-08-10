package com.serbanscorteanu.classes;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}

	public boolean addBranch(String nameOfBranch) {
		// return true if branch added succesfully
		Branch temp = findBranch(nameOfBranch);
		if (temp != null) {
			return false;
		}
		Branch branch = new Branch(nameOfBranch);
		branches.add(branch);
		// or
		// branches.add(new Branch(nameOfBranch));
		return true;
	}

	public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
		// return true if customer added succesfully
		Branch branch = findBranch(nameOfBranch);
		if (branch != null) {
			if (branch.newCustomer(nameOfCustomer, initialTransaction)) // check if this works
				return true;
		}
		return false;

	}

	public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
		// return true if customer transaction added succesfully
		Branch branch = findBranch(nameOfBranch);
		if (branch != null) {
			// Customer customer = branch.findCustomer(nameOfCustomer);
			if (branch.addCustomerTransaction(nameOfCustomer, transaction)) {
				return true;
			}

		}
		return false;
	}

	private Branch findBranch(String nameOfBranch) {
		// return Branch if it exists else null
		for (Branch branch : branches) {
			if (branch.getName() == nameOfBranch) {
				return branch;
			}
		}
		return null;
	}

	public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
		// return true if branch exists
		// print list of customers
		Branch branch = findBranch(nameOfBranch);
		if (branch != null) {
			int i = 1;
			int j = 1;
			System.out.println("Customer details for branch " + nameOfBranch);
			for (Customer customer : branch.getCustomers()) {
				System.out.println("Customer: " + customer.getName() + "[" + i++ + "]");
				if (printTransactions) {
					System.out.println("Transactions");
					for (Double transaction : customer.getTransactions()) {
						System.out.println("[" + j++ + "]  Amount " + transaction);
					}
					j = 1;
				}
			}
			return true;
		}
		return false;
	}
}
