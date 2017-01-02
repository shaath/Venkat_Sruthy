package functions;

public class UserLogin {

	public static void main(String[] args)
	{
		FunctionMaster fm=new FunctionMaster();
		String res=fm.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Applicaion Launch "+res);
		
		res=fm.org_Login("SharathChandra123", "SharathChandra123");
		System.out.println("Application Login "+res);
		
		res=fm.org_Logout();
		System.out.println("Application Logout "+res);
		
		fm.org_Close();
		System.out.println("Application closed successfully");

	}

}
