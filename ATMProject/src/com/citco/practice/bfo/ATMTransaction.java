package com.citco.practice.bfo;

public class ATMTransaction {
	public enum Services{
		DEPOSIT,
		WITHDRAWAL,
		CASHBALANCE
	}
	
	ITransaction cashBalance = new CashBalanceService();
	ITransaction deposit = new DepositService();
	ITransaction withdrawal = new WithdrawalService();
	
	public ITransaction dispatcher(Services services) {
		if(services == Services.DEPOSIT) {
			return deposit;
		}else if(services == Services.WITHDRAWAL) {
			return withdrawal;
		}
		else {
			return cashBalance;
		}
	}
	
}
