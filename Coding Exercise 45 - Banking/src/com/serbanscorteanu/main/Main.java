package com.serbanscorteanu.main;

import com.serbanscorteanu.classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("Raiffeisen Bank");
		bank.addBranch("Cora Raiffeisen");
		
		bank.addCustomer("Cora Raiffeisen", "Serban", 4000);
		bank.addCustomer("Cora Raiffeisen", "Andrei", 5000);
		bank.addCustomer("Cora Raiffeisen", "Silvia", 6000);
		
		bank.addCustomerTransaction("Cora Raiffeisen", "Serban", 900);
		bank.addCustomerTransaction("Cora Raiffeisen", "Andrei", 10000);
		bank.addCustomerTransaction("Cora Raiffeisen", "Silvia", 5000);
		
		bank.listCustomers("Cora Raiffeisen", true);	// this will print the transactions
		//bank.listCustomers("Cora Raiffeisen", false);	// this won't print the transactions
		
		System.out.println();
		bank.addBranch("Iuliu Maniu Raiffeisen");
		bank.addCustomer("Iuliu Maniu Raiffeisen", "Alexandru", 1000);
		bank.addCustomer("Iuliu Maniu Raiffeisen", "Andreea", 2500);
		bank.addCustomerTransaction("Iuliu Maniu Raiffeisen", "Andreea", 500);
		bank.listCustomers("Iuliu Maniu Raiffeisen", true);
	}

}
