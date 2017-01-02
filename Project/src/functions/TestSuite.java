package functions;

public class TestSuite {

	public static void main(String[] args) 
	{
		FunctionMaster fm=new FunctionMaster();
		//Login Tc

		String res=fm.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=fm.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=fm.org_Logout();
		System.out.println(res);
		
		fm.org_Close();
		
		//Empreg TC
		
		res=fm.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Applicaion Launch "+res);
		
		res=fm.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=fm.org_Empreg("Sandeep", "Kumar");
		System.out.println("Employee registration "+res);
		
		res=fm.org_Logout();
		System.out.println("Application Logout "+res);
		
		fm.org_Close();
		System.out.println("Application closed successfully");
		
		//Userreg
		
		res=fm.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Applicaion Launch "+res);
		
		res=fm.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=fm.org_UserReg("Sandeep Kumar", "SandeepKumar123", "SandeepKumar123", "SandeepKumar123");
		System.out.println("user registration "+res);
		
		res=fm.org_Logout();
		System.out.println("Application Logout "+res);
		
		fm.org_Close();
		System.out.println("Application closed successfully");

		//UserLogin
		
		res=fm.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Applicaion Launch "+res);
		
		res=fm.org_Login("SandeepKumar123", "SandeepKumar123");
		System.out.println("User Login "+res);
		
		res=fm.org_Logout();
		System.out.println("Application Logout "+res);
		
		fm.org_Close();
		System.out.println("Application closed successfully");
	}

}
