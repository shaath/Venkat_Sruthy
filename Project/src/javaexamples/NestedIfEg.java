package javaexamples;

public class NestedIfEg 
{
	public static void main(String[] args)
	{
		int a=5000;
		int b=6000;
		int c=7000;
		
		if (a > b & a > c) 
		{
			System.out.println("A is greater");
		}
		else if (b > c & b > a) 
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is Greater");
		}
	}

}
