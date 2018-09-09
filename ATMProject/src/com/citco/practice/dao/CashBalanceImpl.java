package com.citco.practice.dao;

import java.io.FileNotFoundException;
import com.citco.practice.util.ConsoleUtil;

public class CashBalanceImpl extends AbtractFileDao implements IAuditReporter{
	
	ConsoleUtil consoleUtil = new ConsoleUtil();
	
	@Override
	String getLocation() {
		return "P:\\VDI_profile\\Cleynes\\Desktop\\ATM_Reports\\CashBalance";
	}

	@Override
	public double getLastBalance() {
		ReportHandler reportHandler = new ReportHandler();
		try {
			return super.readLastBalance(reportHandler);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private class ReportHandler implements IFileReaderCallback{
		
		@Override
		public String onLineRead(String strLine) {
			return strLine;
		}
	}
}

