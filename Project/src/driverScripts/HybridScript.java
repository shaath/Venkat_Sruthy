package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functions.FunctionMaster;

public class HybridScript {

	public static void main(String[] args) throws IOException
	{
		FunctionMaster fm=new FunctionMaster();
		String res=null;
		String xlpath="C:\\Users\\Dell\\Desktop\\Hybrid.xlsx";
		String xlout="F:\\Venkat_Sudha_Anna\\Project\\src\\results\\HybridRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);

		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("TestCase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("TestData");
		XSSFSheet ws3=wb.getSheet("EmpReg");
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		int emprc=ws3.getLastRowNum();
		for (int i = 1; i <= tcRc; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y")) 
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++)
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcId.equalsIgnoreCase(tstcId)) 
					{
						String keyword=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (keyword)
						{
						case "Launch":
							String url=ws2.getRow(1).getCell(0).getStringCellValue();
							res=fm.org_LAunch(url);
							break;
						case "login":	
							String u=ws2.getRow(1).getCell(1).getStringCellValue();
							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=fm.org_Login(u, p);
							break;
						case "logout":	
							res=fm.org_Logout();
							fm.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= emprc; k++) 
							{
								String f=ws3.getRow(k).getCell(0).getStringCellValue();
								String l=ws3.getRow(k).getCell(1).getStringCellValue();
								res=fm.org_Empreg(f, l);
								ws3.getRow(k).createCell(2).setCellValue(res);
							}
							
							
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(5).getStringCellValue();
							String uname=ws2.getRow(1).getCell(6).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(7).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(8).getStringCellValue();
							res=fm.org_UserReg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String uname1=ws2.getRow(1).getCell(6).getStringCellValue();
							String pswd1=ws2.getRow(1).getCell(7).getStringCellValue();
							res=fm.org_Login(uname1, pswd1);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						String status=ws.getRow(i).getCell(3).getStringCellValue();
						if (!status.equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
							
						}

					}
				}
				
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
