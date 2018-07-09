package com.qa.PolyMorphismUsingTestNG;

public class Daughter_Class extends Father_Class{

	public int Income=1200;
	public int Children=1;
	
	public void FamilyCar()
	{
		System.out.println("Family of Daughter is Merz Benz");
	}
	
	public void FamilyAddress()
	{
		System.out.println("Family Address of Daughter is Mumbai");
	}
	
	public void FamilyIndivualExpense()
	{
		System.out.println("Family Expense during Daughter:"+(Income/Children));
	}
	
	private void D_HubbyName()
	{
		System.out.println("Husband Name is Sri Arkajyoti Nag");
	}
	
	public void OwnName()
	{
		System.out.println("Daughter name is Smt Sujata Chakraborty");
	}
	
	public void FamilyHouse(String MainCity)
	{
		System.out.println("Location of Family House in City:"+MainCity);
	}
	
	public void FamilyHouse(String MainCity, String MainLocation)
	{
		System.out.println("Location of Family House in City:"+MainCity+" of the Locality:"+MainLocation);
	}
}
