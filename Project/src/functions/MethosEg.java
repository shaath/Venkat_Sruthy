package functions;

public class MethosEg {

	public static void main(String[] args)
	{
		function1();
		
		String res=function2();
		System.out.println(res);
		
		MethosEg m=new MethosEg();
		
		m.function3();
		
		boolean flag=m.function4();
		System.out.println(flag);
		
	}
	
	//Static method without returning any value
	
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//static method with returning value
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	
	//Nonstatic Method without returning value
	
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non static method with returning value
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
}
