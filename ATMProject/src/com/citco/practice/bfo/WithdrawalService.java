package com.citco.practice.bfo;

import com.citco.practice.dao.CashBalanceFileAuditLogDao;
import com.citco.practice.dao.CashBalanceImpl;
import com.citco.practice.util.ConsoleUtil;

public class WithdrawalService implements ITransaction{

	CashBalanceImpl cashBalance = new CashBalanceImpl();
	ConsoleUtil consoleUtil = new ConsoleUtil();
	IAuditLogger auditLogger = new CashBalanceFileAuditLogDao();
	
	@Override
	public void doTransaction(String balance) {
		consoleUtil.print("Enter amount to Withdrawal:");
		double amountDeposit = consoleUtil.readInt();
		double currentBalance = cashBalance.getLastBalance();
		currentBalance -= amountDeposit;
		consoleUtil.print(String.format("You have deducted %s to your account. \nYour new balance is %s", amountDeposit, currentBalance));
		auditLogger.doLogAudit(currentBalance);
		
	}

}
