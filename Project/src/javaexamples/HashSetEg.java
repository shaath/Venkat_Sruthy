package javaexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		
		//Writing the data 
		
		s.add("Sharath");
		s.add("Sudha");
		s.add("Aparna");
		s.add("Venkat");
		s.add("Apple");
		s.add("Sudha");
		s.add("Sharath");
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String text=it.next();
			System.out.println(text);
			
			
		}
		
	}

}
