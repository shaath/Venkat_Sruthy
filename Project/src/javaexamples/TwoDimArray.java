package javaexamples;

public class TwoDimArray {

	public static void main(String[] args)
	{
		int[][] x=new int[2][3];
		
		x[0][2]=40000;
		
		x[1][1]=70000;
		
		x[1][1]=80000;
		
		//Finding the length of the rows
		
		
		System.out.println("The length of the rows "+x.length);
		
		//Length of the columns
		
		System.out.println("The length of the columns "+ x[1].length);
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
				
			}
			
		}
	}

}
