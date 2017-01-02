package javaexamples;

public class StingEg1 {

	public static void main(String[] args) 
	{
		String course="Selenium";
		//Finding the length of the String
		System.out.println(course.length());
		
//		System.out.println(course.charAt(3));
		
		for(int i=0; i < course.length(); i++)
		{
			System.out.println(course.charAt(i));
			
		}
		
		System.out.println("***");
		
		for (int i = course.length()-1 ; i >= 0; i--) 
		{
			System.out.println(course.charAt(i));
			
		}
	}

}
