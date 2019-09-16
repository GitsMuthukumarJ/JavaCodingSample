package Constructor;

public class Constructor {
	int value1;
	int value2;
	Constructor()
	{
	value1 =10;
	value2 =24;
	System.out.println("Inside Value is");
	}
public void Display()
{
	System.out.println("Value1 ===" +value1);
	System.out.println("Value2 ===" +value2);
}
public static void main (String [] args)
{
	Constructor Object = new Constructor();
	Object.Display();
}
	
}
