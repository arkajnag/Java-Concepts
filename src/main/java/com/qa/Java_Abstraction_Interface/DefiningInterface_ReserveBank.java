package com.qa.Java_Abstraction_Interface;

public interface DefiningInterface_ReserveBank {

	/********************************************************************************************************
	 * Main aim of Abstraction: To Hide the Implementation Logic.
	 * Interface provides 100% Abstraction as it doesn't allow any non-abstract methods definition.
	 * All methods defined in Interface needs to be implemented if any class is called by 'implements'.
	 ********************************************************************************************************/
	public void Credit();
	public void Debit();
	public void SpecifyBankName(String BankName);	
}
