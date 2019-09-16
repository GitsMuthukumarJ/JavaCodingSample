/* Abstraction - Hiding all the internal implementations and just highlighting what are the services offering is called as Acstraction */ 

package Abstraction;
//package name Abstraction

abstract class Abstraction
	//class name Abstraction ( class name must be started with Capital letter )
{

	abstract void run();
	// Created abstract method. Method name is run
	void print()
		//Created method print
	{
		System.out.println("Hello");
		//Printing statement/syntax
	}
}
class Abstraction1 extends Abstraction
//Creating child class/ using Extends keyword ( inheritance )
{
	void run()
	//Created method run
	{
		System.out.println("Hai i am running");
		//Printing statement/syntax
	}
	public static void main(String[] args) 
	//main method
	{
		Abstraction1 obj=new Abstraction1();
		//New object creation
		obj.run();
		//new Object & Variable name
		obj.print();
		//new Object & Variable name
	}
}
