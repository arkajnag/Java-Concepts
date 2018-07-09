package com.qa.Java_Constructor;

public class Constructor_Practise1 {
	
	/*****************************************************************************************************************************************************************************************************
	 * In Java, concept of Constructor is used to define the feature of the Class; Block of code similar like Method;
	 * We can have Default Constructor, Parameterised Constructor;
	 * Constructor never have a return statement; 
	 * Concept of Constructor Overloading is possible when we define and call Constructor in same class with and without Parameters;
	 * Constructors are defined with the same name as that of Class;
	 * super() keyword is used to access the Parent Class Constructor in Child Class;
	 * When we don't define any super() keyword in Child class constructor, compiler by default calls a no-argument super() when define object of Child Class;
	 * super() also should be the first statement in Child Class constructor definition or else it will throw Compilation Error;
	 *****************************************************************************************************************************************************************************************************/

	public int a;
	public int c;
	
	/* No Argument Constructor */
	public Constructor_Practise1()
	{
		a=100;
		c=120;
		System.out.println("Defined no Argument Constructor in Constructor_Practise1 Class");
	}
	
	/* Parameterised Constructor */
	public Constructor_Practise1(String Name)
	{
		System.out.println("Name Variable in Constructor_Practise1 Class:"+Name);
		System.out.println("Defined Parameterised Argument Constructor in Constructor_Practise1 Class");
	}
	
	public void DefineParameterOfConstructor()
	{
		/* If same variable is defined in Constructor and in Method, then local variable takes the priority. */
		a=150;
		
		/* Local Variable defined within the Method */
		int b=200;
		System.out.println("Value of a is:"+a);
		System.out.println("Value of b is:"+b);
		System.out.println("Value of c is:"+c);
	}
	public static void main(String[] args) {
		
		/* ***********************************************************************************************************
		 * Creating the Object of Constructor_Practise1 
		 * When creates the Object of the Class, it calls the Constructor by default;
		 * ***********************************************************************************************************/
		Constructor_Practise1 CP1_No_Argument=new Constructor_Practise1();
		
		/*** Constructor Overloading ***/
		Constructor_Practise1 CP1_Arguments=new Constructor_Practise1("Arkajyoti Nag");
		
		/*** Calling the Method by Reference ***/
		CP1_No_Argument.DefineParameterOfConstructor();
		
		/*** Defining same Variable as in Constructor but locally initialising the variable. ***/
		CP1_No_Argument.c=299;
		System.out.println("Value of c is:"+CP1_No_Argument.c);
		
		
		CP1_Arguments.DefineParameterOfConstructor();
	}
}
