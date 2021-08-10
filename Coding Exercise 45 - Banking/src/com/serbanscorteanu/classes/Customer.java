package com.serbanscorteanu.classes;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String name, double initialTransaction) {
		this.name = name;
		this.transactions = new ArrayList<>();
		this.transactions.add(initialTransaction);
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Double> getTransactions(){
		return this.transactions;
	}
	
	public void addTransaction(double transaction) {
		transactions.add(transaction);
	}
}
