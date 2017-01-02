package functions;

public class LoginTC {

	public static void main(String[] args) 
	{
		FunctionMaster fm=new FunctionMaster();
		
		String res=fm.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=fm.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=fm.org_Logout();
		System.out.println(res);
		
		fm.org_Close();
		

	}

}
