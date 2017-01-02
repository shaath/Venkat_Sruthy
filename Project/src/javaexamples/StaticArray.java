package javaexamples;

public class StaticArray {

	public static void main(String[] args)
	{
		String[] course={"Manual","Selenium","UFT","LoadRunner"};
		
		//Find the length of the array
		
		System.out.println(course.length);
		
		//Read the data from array
		
		System.out.println(course[2]);
		
		for (int i = 0; i < course.length; i++) 
		{
			System.out.println(course[i]);
			
		}
		
		
	}

}
