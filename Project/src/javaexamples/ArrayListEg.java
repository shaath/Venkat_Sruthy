package javaexamples;

import java.util.ArrayList;

public class ArrayListEg 
{

	public static void main(String[] args)
	{
		ArrayList<Object> s=new ArrayList<Object>();
		
		//Writing the data into arraylist
		
		s.add("Manual");
		s.add("Selenium");
		s.add(40000);
		s.add('M');
		s.add(4, true);
		s.add(2, "Sharath");
		
		
		System.out.println(s.size());
		
//		System.out.println(s.get(2));
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
		}
		
		
	}

}
