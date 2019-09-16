package sample;

class Result {
	void addition()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void sub()
	{
		int a=20;
		int b=35;
		System.out.println(a-b);
	}
	void mul()
	{
		int a=5;
		int b=4;
		System.out.println(a*b);
	}
	void div()
	{
		int a= 10;
		int b=2;
		System.out.println(a/b);
	}
	}
public class AddSub
{
	public static void main(String [] args)
	{
		Result obj = new Result();
		obj.addition();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
