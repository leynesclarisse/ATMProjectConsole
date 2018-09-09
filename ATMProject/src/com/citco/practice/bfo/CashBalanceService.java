package com.citco.practice.bfo;

import com.citco.practice.dao.CashBalanceImpl;
import com.citco.practice.util.ConsoleUtil;

public class CashBalanceService implements ITransaction{
	
	ConsoleUtil consoleUtil = new ConsoleUtil();
	CashBalanceImpl cashBalance = new CashBalanceImpl();

	@Override
	public void doTransaction(String balance) {
		consoleUtil.print(String.format("Your current balance is %s", cashBalance.getLastBalance()));
	}
}
