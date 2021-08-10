package com.serbanscorteanu.classes;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}

	public boolean newCustomer(String name, double transaction) {
		// return true if customer added succesfully
		// check if customer is already here
		// Customer customer = new Customer(name, transaction);
		Customer customer = findCustomer(name);
		if (customer != null) {
			return false;
		}
		Customer newCustomer = new Customer(name, transaction);
		customers.add(newCustomer);
		return true;

	}

	public boolean addCustomerTransaction(String name, double transaction) {
		// return true if transaction added succesfully
		Customer customer = findCustomer(name);
		if (customer != null) {
			customer.addTransaction(transaction);
			return true;
		}
		return false;
	}

	private Customer findCustomer(String name) {
		// return Customer / return null
		for (Customer customer : customers) {
			if (customer.getName() == name) {
				return customer;
			}
		}
		return null;
	}
}
