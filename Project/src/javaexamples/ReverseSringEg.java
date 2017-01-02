package javaexamples;

public class ReverseSringEg {

	public static void main(String[] args)
	{
		String r="";
		String s="madam";//--->egdEQ
		//madam---->madam
		//malayalam--->malayalam
		//dad------->dad
		
		for (int i = s.length()-1; i>=0; i--) 
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);
		
		if (r.equalsIgnoreCase(s))
		{
			System.out.println("Given String polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
		
	}

}
