package com.citco.practice.bfo;

import com.citco.practice.dao.CashBalanceFileAuditLogDao;
import com.citco.practice.dao.CashBalanceImpl;
import com.citco.practice.util.ConsoleUtil;

public class DepositService implements ITransaction{

	CashBalanceImpl cashBalance = new CashBalanceImpl();
	
	@Override
	public void doTransaction(String balance) {
		ConsoleUtil consoleUtil = new ConsoleUtil();
		IAuditLogger auditLogger = new CashBalanceFileAuditLogDao();
		
		consoleUtil.print("Enter amount to Deposit:");
		double amountDeposit = consoleUtil.readInt();
		double currentBalance = cashBalance.getLastBalance();
		currentBalance += amountDeposit;
		consoleUtil.print(String.format("You have added %s to your account. \nYour new balance is %s", amountDeposit, currentBalance));
		auditLogger.doLogAudit(currentBalance);
	}

}
