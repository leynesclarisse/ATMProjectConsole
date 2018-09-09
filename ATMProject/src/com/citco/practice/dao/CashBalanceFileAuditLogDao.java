package com.citco.practice.dao;

public class CashBalanceFileAuditLogDao extends AbstractFileAuditDao{

	@Override
	String getLocation() {
		return "P:\\VDI_profile\\Cleynes\\Desktop\\ATM_Reports\\CashBalance";
	}

}