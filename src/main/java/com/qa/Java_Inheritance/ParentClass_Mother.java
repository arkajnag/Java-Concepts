package com.qa.Java_Inheritance;

public class ParentClass_Mother {

	int i=10;
	public void FamilyName()
	{
		System.out.println("Defining Name as Nag");
	}
	
	public void FamilyAddress()
	{
		System.out.println("Address of Family is Kolkata, India");
	}
	
	private void MotherFamilyName()
	{
		System.out.println("Mother's Family Name is Zinta");
	}
	
	public static void main(String[] args) {
		
		ParentClass_Mother PC= new ParentClass_Mother();
		System.out.println("Calling All the Methods defined in Parent Class using Parent Class Object Reference.");
		PC.FamilyName();
		PC.FamilyAddress();
		PC.MotherFamilyName();
	}

}
