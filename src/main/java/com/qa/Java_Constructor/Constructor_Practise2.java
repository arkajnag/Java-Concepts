package com.qa.Java_Constructor;

public class Constructor_Practise2 extends Constructor_Practise1{
	
	public int a;
	/* No Argument Constructor of Child Class */
	public Constructor_Practise2()
	{
		System.out.println("~~~ No Argument Constructor in Child Class ~~~");
	}
	
	public Constructor_Practise2(String Name)
	{
		super("Sujata Arkajyoti Nag");
		System.out.println("Name Variable in Constructor_Practise2 Class:"+Name);
	}
	
	public void DefineMethodInChildClass()
	{
		a=550;
		System.out.println("Value of a in Parent Class:"+super.a);
		System.out.println("Value of a in Child Class:"+a);
	}
	public static void main(String args[])
	{
		/****************************************************************************************************************************************************************
		 * If we just define the Object of the Child Class, then Parent No Argument Super() Keyword is called by default.
		 * First the Parent Constructor will be called and then Child Constructor will be called.
		 * **************************************************************************************************************************************************************/
		Constructor_Practise2 CP2_NoArgument=new Constructor_Practise2();
		
		Constructor_Practise2 CP2_Argument=new Constructor_Practise2("Sujata Chakraborty");
		
		CP2_NoArgument.DefineParameterOfConstructor();
		CP2_NoArgument.DefineMethodInChildClass();
		
		CP2_Argument.DefineParameterOfConstructor();
		CP2_Argument.DefineParameterOfConstructor();
		//Constructor_Practise2 CP2_Argument_Super=new Constructor_Practise2("Sujata Arkajyoti Nag");
	}
}
