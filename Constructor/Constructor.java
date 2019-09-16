package Constructor;
//Package name Constructor

public class Constructor {
	//Class name Constructor
	int value1;
	//int data type & Variable value1
	int value2;
	//int data type & Variable value2
	Constructor()
		//Created method Constructor
	{
	value1 =10;
		//Value for variable
	value2 =24;
		//Value for variable
	System.out.println("Inside Value is");
		//Printing statement/syntax
	}
public void Display()
{
	System.out.println("Value1 ===" +value1);
	System.out.println("Value2 ===" +value2);
}
public static void main (String [] args)
	//main method
{
	Constructor Object = new Constructor();
	//Object creation
	Object.Display();
}
	
}
