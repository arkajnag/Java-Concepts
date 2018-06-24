package com.qa.Java_Inheritance;

public class ChildClass_Daughter extends ParentClass_Mother{
	
	public void School()
	{
		System.out.println("Name of the School is Nava Nalanda High School.");
	}
	
	public void FamilyName()
	{
		System.out.println("Daughter Family Name is Sujata Chakraborty.");
	}
	
	private void DaughterHusbandName()
	{
		System.out.println("Daughter's Husband Name is Arkajyoti Nag");
	}

	public static void main(String[] args) {
		
		ChildClass_Daughter CC=new ChildClass_Daughter();
		System.out.println("Calling All the Methods defined in Child Class as well as Parent Class using Child Class Object Reference.");
		
		CC.FamilyName(); //Being Overridden by Child Class Object Reference. Calling the Child Method instead of Parent Class Method.
		
		CC.FamilyAddress();//Calling the Parent Class Method using Child Class reference.
		
		CC.School();//Calling own Child Class Method defined as PUBLIC.
		
		CC.DaughterHusbandName(); //Calling own Child Class Method defined as PRIVATE.
		
		System.out.println("Value of i; Fetched from Parent Class:"+CC.i);//Calling public variable defined in Parent Class using Child Class Object Reference.
		
		System.out.println("==================================================================================================================");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		/*********************************************************************************************************
		 * Creating Parent Reference using Child Object is allowed.
		 * Example: Parent P= new Child(); [Allowed]
		 * This will allow the P reference to call all the methods and variables defined in Parent Class.
		 * But whichever methods are being overridden by Child Class; will fetch the name of Child class. 
		 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 * Creating Child Reference using Parent Object is not allowed.
		 * Example: Child C= new Parent(); [Not Allowed]
		 *********************************************************************************************************/
		
		ParentClass_Mother PC1=new ChildClass_Daughter();
		PC1.FamilyName();
		PC1.FamilyAddress();
		System.out.println("Variable i defined in Parent Class:"+(PC1.i+10));
	}

}
