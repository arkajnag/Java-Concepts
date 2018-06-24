package com.qa.Java_Abstraction_AbstractClass;

public abstract class DefiningAbstractClass_ReserveBank {
	
	/**************************************************************************************************
	 * 1. Defined the Class as 'abstract' and created abstract methods, which are nothing but PROTOTYPE.
	 * 2. There is no Implementation logic being defined in the Abstract Methods.
	 * 3. Can define both Abstract Methods and Non-Abstract Methods in Abstract Class.
	 * 4. This helps to achieve PARTIAL ABSTRACTION.
	 * 5. Goal of Abstraction: Hiding Implementation Logic.
	 * 6. Example: 
	 * 	  RBI has set some standards of Debit and Credit, which every Bank has to implement but each bank 
	 *    can implement in their own way using this Abstraction & Overriding concept.
	 **************************************************************************************************/
	public abstract void Credit();
	public abstract void Debit();
	
	public void RBIStandards()
	{
		System.out.println("RBI Standard Rule1");
	}
	
	public void RBILocation(String LocationName)
	{
		System.out.println("RBI Location "+LocationName+" in India");
	}

}
