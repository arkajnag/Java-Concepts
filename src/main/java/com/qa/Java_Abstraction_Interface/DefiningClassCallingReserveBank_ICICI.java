package com.qa.Java_Abstraction_Interface;

public class DefiningClassCallingReserveBank_ICICI implements DefiningInterface_ReserveBank{

	public void Credit() {
		System.out.println("1. Overriding the PARENT INTERFACE Credit METHOD in CHILD CLASS. Defining the IMPLEMENTATION Logic.");
	}

	public void Debit() {
		System.out.println("2. Overriding the PARENT INTERFACE Debit METHOD in CHILD CLASS. Defining the IMPLEMENTATION Logic.");
	}

	public void SpecifyBankName(String BankName) {
		System.out.println("3. Overriding the Parameterized PARENT INTERFACE SpecifyBankName METHOD in CHILD CLASS.Defining the IMPLEMENTATION Logic.");
	}
	
	public void ICICI_Own_Standard()
	{
		System.out.println("4. Defining own Method by ICICI which is not PUBLIC to any others or PARENT class");
	}
	public static void main(String[] args) {
		
		DefiningClassCallingReserveBank_ICICI ICICI=new DefiningClassCallingReserveBank_ICICI();
		System.out.println("a. All METHODS of PARENT INTERFACE has been implemented and overridden in CHILD CLASS. Absolute Abstraction as Parent doesn't have any UnIMPLEMENTED methods.");
		ICICI.Credit();
		ICICI.Debit();
		ICICI.ICICI_Own_Standard();
		ICICI.SpecifyBankName("Pune Branch");
		
		DefiningInterface_ReserveBank RBI_Interface=new DefiningClassCallingReserveBank_ICICI();
		RBI_Interface.Credit();
		RBI_Interface.Debit();
		RBI_Interface.SpecifyBankName("Mumbai Branch");
		System.out.println("b. Child Class Object with Parent Class Object Reference, restrict you to call any Child Class Methods.");
	}
}
