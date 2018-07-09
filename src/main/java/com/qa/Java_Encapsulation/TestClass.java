package com.qa.Java_Encapsulation;

import org.testng.log4testng.Logger;

public class TestClass extends ChildClass{

	public static void main(String args[])
	{
		Logger log=Logger.getLogger(TestClass.class);
		ParentClass PC=new ParentClass();
		log.info("~~~~ Testing Encapsulation Concept. Calling Private variable using Getter method ~~~~");
		System.out.println("Fetching the First Private Variable Data using Encapsulation Getter Concept:"+PC.getEmpName());
		
		log.info("~~~~ Testing Encapsulation Concept. Calling Private variable using Getter method after setting new details ~~~~");
		PC.setWifeName("Sujata Chakraborty");
		System.out.println("Fetching the Second Private Variable Data after changing it using Setter Method:"+PC.getWifeName());
		
		log.info("~~~~~~ Calling a method without Creating an Object using concept of Inheritance & static keyword ~~~~~~");
		//Able to call the method in Children Class directly without creating any Object as below method is declared as Static.
		MarriageLocation();
	
		log.info("~~~~~~~ Creating Object of Child Class and calling Overridden and Normal Method ~~~~~");
		ChildClass CC=new ChildClass();
		CC.LoveMarriage();
		log.info("~~~~~~~ Calling Overridden method of Parent Class. Method Overriding. Concept of Polymorphism.");
		CC.Marriage();
		
		log.info("~~~~~~~ Creating Object of Parent Class using Child Class as Reference. All methods of Parent Class can be called. Method Overriding will trigger.  ");
		ParentClass PC_ChildReference= new ChildClass();
		PC_ChildReference.LoveMarriage();
	
	}
}
