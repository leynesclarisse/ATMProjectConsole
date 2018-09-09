package com.citco.practice.dao;

import java.io.IOException;

import com.citco.practice.bfo.IAuditLogger;

public abstract class AbstractFileAuditDao extends AbtractFileDao implements IAuditLogger{
	@Override
	public void doLogAudit(double balance) {
		try {
			updateBalance(balance);
		} catch (IOException e) {
			//file error
		}
	}
	
}

