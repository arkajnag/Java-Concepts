package com.qa.PolyMorphismTestUsingTestNG;

import org.testng.annotations.Test;
import com.qa.PolyMorphismUsingTestNG.Daughter_Class;
import com.qa.PolyMorphismUsingTestNG.Father_Class;
import com.qa.PolyMorphismUsingTestNG.GrandFather_Class;
import com.qa.PolyMorphismUsingTestNG.GreatGrandFather_Class;

public class Family_Test_Class extends Daughter_Class{

	GreatGrandFather_Class GGF;
	GrandFather_Class GF;
	Father_Class F;
	Daughter_Class D;
	
	@Test
	public void PolyMorphism()
	{
		GGF= new GreatGrandFather_Class(); // Defining Object Reference of GreatGrandFather Class Object.
		GF =  new GrandFather_Class(); // Defining Object Reference of GrandFather Class Object.
		F= new Father_Class(); // Defining Object Reference of Father Class Object.
		D= new Daughter_Class(); // Defining Object Reference of Daughter Class Object.
		
		int DaughterIncome=D.Income;
		System.out.println("Income of Daughter:"+DaughterIncome);
		D.FamilyCar();
		D.FamilyAddress();
		D.FamilyIndivualExpense();
		D.FamilyHouse("Kolkata");
		D.FamilyHouse("Kolkata", "Thakurpukur");
		D.OwnName();
		D.GreatGrandFather();
		D.GrandFather();
		D.Father();
		
		F.FamilyCar();
		F.FamilyAddress();
		F.FamilyIndivualExpense();
		F.OwnName();
		F.GreatGrandFather();
		F.GrandFather();
		F.Father();
		
		
		F=new Daughter_Class(); //Dynamic Polymorphism
		F.FamilyCar();
		F.FamilyAddress();
		F.OwnName();
	}
}
