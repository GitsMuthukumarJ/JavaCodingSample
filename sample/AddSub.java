package sample;
//package name sample

class Result {
	//class name Result
	void addition()
		//Method creation, method name addition
	{
		int a=10;
		//int datatype & variable a & value of a is 10
		int b=20;
		//int datatype & variable b & value of b is 20
		System.out.println(a+b);
		//Print addition values of a & b
	}
	void sub()
		//Method name sub
	{
		int a=20;
		//int datatype & variable a & value of a is 20
		int b=35;
		//int datatype & variable b & value of b is 35
		System.out.println(a-b);
		//Print subtraction values of a & b
	}
	void mul()
		//Method name mul
	{
		int a=5;
		//int datatype & variable a & value of a is 5
		int b=4;
		//int datatype & variable b & value of b is 4
		System.out.println(a*b);
		//Print multiplication values of a & b
	}
	void div()
		//Method name div
	{
		int a= 10;
		//int datatype & variable a & value of a is 10
		int b=2;
		//int datatype & variable b & value of b is 2
		System.out.println(a/b);
		//Print division values of a & b
	}
	}
public class AddSub
	//class name AddSub
{
	public static void main(String [] args)
		//Main method
	{
		Result obj = new Result();
		//Object creation
		obj.addition();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
