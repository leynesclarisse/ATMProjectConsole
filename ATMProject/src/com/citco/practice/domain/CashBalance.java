package com.citco.practice.domain;

public class CashBalance {
	private double balance;

	public CashBalance() {
		super();
		this.balance = 10000;
	}

	public double getBalance() {
		//Console.out.read();
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

