package com.qa.PolyMorphismUsingTestNG;

public class GrandFather_Class extends GreatGrandFather_Class{

	public int Income=400;
	public int Children=5;
	
	public void FamilyCar()
	{
		System.out.println("Family of GrandFather is Auto");
	}
	
	public void FamilyAddress()
	{
		System.out.println("Family Address of GrandFather is Seladah");
	}
	
	public void FamilyIndivualExpense()
	{
		System.out.println("Family Expense during GrandFather:"+(Income/Children));
	}
	
	private void GF_WifeName()
	{
		System.out.println("Grand Mother Name is Late Sri Kamala Rani");
	}
	
	public void OwnName()
	{
		System.out.println("Grandfather name is Late Sri Baloram Chandra");
	}
	
	public void GrandFather()
	{
		System.out.println("~~~~~ Grand Father ~~~~~~~");
	}
}
