package functions;

public class EmpregTC {

	public static void main(String[] args) 
	{
		FunctionMaster fm=new FunctionMaster();
		
		String res=fm.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Applicaion Launch "+res);
		
		res=fm.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=fm.org_Empreg("Sharath", "Chandra");
		System.out.println("Employee registration "+res);
		
		res=fm.org_Logout();
		System.out.println("Application Logout "+res);
		
		fm.org_Close();
		System.out.println("Application closed successfully");
	}

}
