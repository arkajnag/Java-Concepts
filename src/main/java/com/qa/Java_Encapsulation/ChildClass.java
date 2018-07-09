package com.qa.Java_Encapsulation;

public class ChildClass extends ParentClass{

	public static void MarriageLocation()
	{
		System.out.println("Child Class: Arka and Sujata got married in Kolkata");
	}
	
	// We have extended Parent Class as concept of Inheritance in Java.
	// We can call all the public methods defined in Parent Class including Getter and Setters.
	// With use of same, we will be able to set new Values to private variables of Parent class (provided if Setter method is defined).
	public void Marriage()
	{
		setEmpName("Arkajyoti Nag");
		setWifeName("Sujata Chakraborty Nag");
		System.out.println(getEmpName()+" & "+getWifeName()+" got married on "+MarriageDate);
		System.out.println("Best Month for Marriage is:"+MarriageMonth);
	}
	
	public void LoveMarriage()
	{
		System.out.println("Method Overriding in Child Class: Sujata is very beautiful.");
	}
}
