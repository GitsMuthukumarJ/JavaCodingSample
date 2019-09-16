package Constructor;
//package Constructor

public class ConstructorOverloading {
	//class name ConstructorOverloading
int value1;
	//int datatype & variable value1
int value2;
	//int datatype & variable value2
ConstructorOverloading(int a)
	//Method name ConstructorOverloading with parameter (int a)
{
	value1=a;
	//Variable with value
	System.out.println("Inside 1st Value is");
	//Printing statement/syntax
}
ConstructorOverloading(int a, int b)
	//Method with 2 parameters (int a, int b)
{
	value1=a;
	value2=b;
	//Variable with value
	System.out.println("Inside 2nd Value is");
}
public void Display()
	//Method name Display
{
	System.out.println("Value1 ===" +value1);
	System.out.println("Value2 ===" +value2);
}
public static void main(String [] args)
	//Main method
{
	//New objects creation
ConstructorOverloading Obj1 = new ConstructorOverloading(0);
ConstructorOverloading Obj2 = new ConstructorOverloading(30);
ConstructorOverloading Obj3 = new ConstructorOverloading(30,40);
Obj1.Display();
Obj2.Display();
Obj3.Display();
}
}
