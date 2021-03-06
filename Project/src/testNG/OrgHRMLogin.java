package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import functions.FunctionMaster;

public class OrgHRMLogin 
{
	
	FunctionMaster fm=new FunctionMaster();
	
	@BeforeMethod
	public void Launch()
	{
		String res=fm.org_LAunch("http://orangehrm.qedgetech.com");
		System.out.println(res);
	}
	@Test
	public void Login()
	{
		String res=fm.org_Login("Admin", "Admin");
		System.out.println(res);
	}

	@AfterMethod
	public void Logout_Close()
	{
		String res=fm.org_Logout();
		System.out.println(res);
		fm.org_Close();
	}
}
