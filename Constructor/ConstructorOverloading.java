package Constructor;

public class ConstructorOverloading {
int value1;
int value2;
ConstructorOverloading(int a)
{
	value1=a;
	System.out.println("Inside 1st Value is");
}
ConstructorOverloading(int a, int b)
{
	value1=a;
	value2=b;
	System.out.println("Inside 2nd Value is");
}
public void Display()
{
	System.out.println("Value1 ===" +value1);
	System.out.println("Value2 ===" +value2);
}
public static void main(String [] args)
{
ConstructorOverloading Obj1 = new ConstructorOverloading(0);
ConstructorOverloading Obj2 = new ConstructorOverloading(30);
ConstructorOverloading Obj3 = new ConstructorOverloading(30,40);
Obj1.Display();
Obj2.Display();
Obj3.Display();
}
}
