package com.qa.Java_Abstraction_AbstractClass;

/***************************************************************************************************************************************************************
 * 1. When we extend the Abstract Class, as per the rule we need to call all the unimplemented methods of Parent Abstract Class as MANDATORY.
 * 2. CHILD class has to override all the unimplemented methods with their own logic.
 * 3. CHILD class can simultaneously define their own Methods.
 * 4. All the overridden methods can be can be called/fetched using the Object Reference of CHILD class object or creating Object Reference of PARENT class
 * using CHILD class Object. (Dynamic Polymorphism or TOP CASTING).
 * 5. Whenever we using TOP Casting then object reference of the PARENT class will call the overridden methods in CHILD CLASS as well it's own PARENT methods; but
 * it won't be able to call any OWN methods of the CHILD CLASS.
 ***************************************************************************************************************************************************************/

public class DefiningClassCallingReserveBank_SBI extends DefiningAbstractClass_ReserveBank {
	
	@Override
	public void Credit() {
		System.out.println("1. Overriding the Standard set by RBI with own SBI Implementation of Credit");
	}

	@Override
	public void Debit() {
		System.out.println("2. Overriding the Standard set by RBI with own SBI Implementation of Debit");
	}
	
	public void SBIStandards()
	{
		System.out.println("3. Defining Own Standards of SBI Branch");
	}
	
	public static void main(String[] args) {
		
		System.out.println("=================Creating Object Reference of Child Class using Child Class as Object==================================================");
		DefiningClassCallingReserveBank_SBI SBI=new DefiningClassCallingReserveBank_SBI();
		System.out.println("Calling the Overriden Methods by Object Reference of Child Class "+SBI.getClass().getName());
		SBI.Credit();
		SBI.Debit();
		System.out.println("Calling the own Method of the Child Class "+SBI.getClass().getName());
		SBI.SBIStandards();
		System.out.println("As Child class extended Parent Class; All methods of Parent Class defined as PUBLIC can be implemented by Child Class/n");
		SBI.RBIStandards();
		SBI.RBILocation("Kolkata");
		
		System.out.println("=================Creating Object Reference of Parent Abstract Class using Child Class as Object========================================");
		DefiningAbstractClass_ReserveBank ObjReferenceParentClassRBI=new DefiningClassCallingReserveBank_SBI();
		ObjReferenceParentClassRBI.Credit();
		ObjReferenceParentClassRBI.Debit();
		ObjReferenceParentClassRBI.RBIStandards();
		ObjReferenceParentClassRBI.RBILocation("Mumbai");
	}
}
