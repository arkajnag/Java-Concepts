package com.qa.PolyMorphismUsingTestNG;

public class Father_Class extends GrandFather_Class{

	public int Income=900;
	public int Children=2;
	
	public void FamilyCar()
	{
		System.out.println("Family of Father is Ambassador");
	}
	
	public void FamilyAddress()
	{
		System.out.println("Family Address of Father is Thakurpukur");
	}
	
	public void FamilyIndivualExpense()
	{
		System.out.println("Family Expense during Father:"+(Income/Children));
	}
	
	private void F_WifeName()
	{
		System.out.println("Wife Name is Smt Anita Nag");
	}
	
	public void OwnName()
	{
		System.out.println("Father name is Sri Dilip Nag");
	}
	
	public void Father()
	{
		System.out.println("~~~~~ Father ~~~~~~~");
	}
}
