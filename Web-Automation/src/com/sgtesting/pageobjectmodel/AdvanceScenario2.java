package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser1();
		logout();
		loginasuser1();
		createuser2();
		logout();
		loginasuser2();
		createuser3();
		logout();
		loginasuser3();
		logout();
		loginasuser2();
		modifyPassword3();
		logout();
		user3login();
		logout();
		loginasuser1();
		modifyPassword2();
		logout();
		user2login();
		logout();
		login();
		modifyPassword1();
		logout();
		user1login();
		logout();
		user2login();
		deleteuser3();
		logout();
		user1login();
		deleteuser2();
		logout();
		login();
		deleteuser1();
		logout();
		closeApplication();
		

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SampleAutomation\\Sample-Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("user");
			oPage.getlastName().sendKeys("1");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getusername().sendKeys("user1");
			oPage.getpwd().sendKeys("123");
			oPage.getpasswordCopy().sendKeys("123");
			oPage.getcreateuser().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("123");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getavatar().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser2()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("user");
			oPage.getlastName().sendKeys("2");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getusername().sendKeys("user2");
			oPage.getpwd().sendKeys("234");
			oPage.getpasswordCopy().sendKeys("234");
			oPage.getcreateuser().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("234");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getavatar().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser3()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("user");
			oPage.getlastName().sendKeys("3");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getusername().sendKeys("user3");
			oPage.getpwd().sendKeys("456");
			oPage.getpasswordCopy().sendKeys("456");
			oPage.getcreateuser().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("456");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getavatar().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyPassword3()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getmpwd3().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("235");
			Thread.sleep(2000);
			oPage.getpwdcopy().sendKeys("235");
			Thread.sleep(2000);
			oPage.getsavechangesclick().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user3login()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("235");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	private static void modifyPassword2()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getmpwd2().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("457");
			Thread.sleep(2000);
			oPage.getpwdcopy().sendKeys("457");
			Thread.sleep(2000);
			oPage.getsavechangesclick().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user2login()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("457");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	private static void modifyPassword1()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getmpwd1().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("987");
			Thread.sleep(2000);
			oPage.getpwdcopy().sendKeys("987");
			Thread.sleep(2000);
			oPage.getsavechangesclick().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user1login()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("987");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	private static void deleteuser3()
	{
		try
		{
			oPage.getuser().click();
			oPage.getmpwd3().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(2000);
			
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser2()
	{
		try
		{
			oPage.getuser().click();
			oPage.getmpwd2().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(2000);
			
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser1()
	{
		try
		{
			oPage.getuser().click();
			oPage.getmpwd1().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(2000);
			
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
