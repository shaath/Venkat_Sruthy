package javaexamples;

public class DynamicArray {

	public static void main(String[] args)
	{
		Object[] x=new Object[10];

		
		//Writing the data into an array
		
		x[5]=4444;
		
		x[8]="Selenium";
		
		
		System.out.println(x.length);
		
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
			
		}
		
	}

}
