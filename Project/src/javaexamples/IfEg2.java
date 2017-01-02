package javaexamples;

public class IfEg2 {

	public static void main(String[] args)
	{
		String c="You are selected Selenium";
		String c1="Selenium";
		
//		if (c.equals(c1)) 
//		{
//			System.out.println("Both the strings are same");
//		}
//		else
//		{
//			System.out.println("Both the strings are not same");
//		}

//		if (c.equalsIgnoreCase(c1)) 
//		{
//			System.out.println("Both the strings are same");
//		}
//		else
//		{
//			System.out.println("Both the strings are not same");
//		}
		
		
		if (c.contains(c1)) 
		{
			System.out.println("c contains c1");
		}
		else
		{
			System.out.println("c not caontains c1");
		}
	}

}
