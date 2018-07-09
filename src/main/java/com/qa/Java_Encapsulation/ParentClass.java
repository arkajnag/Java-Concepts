package com.qa.Java_Encapsulation;

/************************************************************************************************************
 * ~~~~~~~~~~		ENCAPSULATION or DATA HIDING ~~~~~~~~~~~~~~~~~
 * This concept in Java using the OOPs technique is helpful to hide the implementation logic or variables declared
 * which are protective in Nature. 
 * We can access Private variables in two ways: 
 * 1. Within the same class and not accessible to outside world.
 * 2. If declare Public Getter and Setter, we can access the Private Variables from Outside world.
 * To achieve this, OOPs have a concept to bind Variable and Method into single object.
 ************************************************************************************************************/
public class ParentClass {

	private String EmpName="Arka";
	private String WifeName="Sujata";
	public String MarriageMonth="December";
	final String MarriageDate="07-12-2015";
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}
	public String getWifeName() {
		return WifeName;
	}
	public void setWifeName(String WifeName) {
		this.WifeName = WifeName;
	}

	public void LoveMarriage()
	{
		System.out.println("Parent Class: Love Marriage of Arka and Sujata");
	}
}
