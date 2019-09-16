package inheritance;
//package name inheritance

class Employee{  
	//class name Employee
	 float salary=40000; 
	//float datatype & variable salary & value is 40000
	//float datatype accept decimal values
	}  
	class Programmer extends Employee{  
		//Extends keyword
	 int bonus=10000;  
		//int datatype & variable name bonus & value is 10000
		//int, byte, short, long these datatypes are only accepts without decimal point
	 public static void main(String args[]){  
		 //Main method
	   Programmer p=new Programmer();  
		 //Object creation
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	} 
