package javaexamples;

public class SwitchCase {

	public static void main(String[] args) 
	{
		String course="Selenium";
		 
		switch(course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "LoadRunner":
			System.out.println("You are selected loadrunner");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}
		
		
	}

}
