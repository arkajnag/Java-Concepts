package com.qa.PolyMorphismUsingTestNG;

public class GreatGrandFather_Class {

	public int Income=100;
	public int Children=4;
	
	public void FamilyCar()
	{
		System.out.println("Family of Great GrandFather is Cycle Rickshaw");
	}
	
	public void FamilyAddress()
	{
		System.out.println("Family Address of Great GrandFather is Howrah");
	}
	
	public void FamilyIndivualExpense()
	{
		System.out.println("Family Expense during Great GrandFather:"+(Income/Children));
	}
	
	private void GGF_WifeName()
	{
		System.out.println("Great GrandMother name is Late Srimoti Gulabi Rani");
	}
	
	public void OwnName()
	{
		System.out.println("Great Grandfather name is Late Sri Krishna Chandra");
	}
	
	public void GreatGrandFather()
	{
		System.out.println("~~~~~ Great Grand Father ~~~~~~~");
	}
}
