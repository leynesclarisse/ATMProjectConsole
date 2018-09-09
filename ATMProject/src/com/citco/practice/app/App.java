package com.citco.practice.app;

import com.citco.practice.bfo.ATMTransaction;
import com.citco.practice.bfo.ATMTransaction.Services;
import com.citco.practice.domain.CashBalance;
import com.citco.practice.util.ConsoleUtil;

public class App {

	public static void main(String[] args) {
		new App().design();  
	}
	
	public void design() {
		ConsoleUtil consoleUtil = new ConsoleUtil();
		ATMTransaction atmTransaction = new ATMTransaction();
		CashBalance cashBalance = new CashBalance();
		
		do {
			consoleUtil.print("\n \t\t A T M ");
			consoleUtil.print("Enter 4-digit Pincode:");
			consoleUtil.readLine();
			
			consoleUtil.print("[1]Deposit");
			consoleUtil.print("[2]Withdrawal");
			consoleUtil.print("[3]Cash Balance");
			int choice = consoleUtil.readInt();
			
			if(choice == 1) {
				atmTransaction.dispatcher(Services.DEPOSIT).doTransaction(consoleUtil.toString(cashBalance.getBalance()));
			}else if (choice == 2) {
				atmTransaction.dispatcher(Services.WITHDRAWAL).doTransaction(consoleUtil.toString(cashBalance.getBalance()));
			}else {
				atmTransaction.dispatcher(Services.CASHBALANCE).doTransaction(consoleUtil.toString(cashBalance.getBalance()));
			}
		}while(true);
	}

}