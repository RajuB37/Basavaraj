package com.sgtesting.pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scenario5 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
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
	private static void createCustomer()
	{
		try
		{
		oPage.getontask().click();
		Thread.sleep(2000);
		oPage.getaddnew().click();
		Thread.sleep(2000);
		oPage.getnewcustomer().click();
		Thread.sleep(2000);
		oPage.getcstfield().sendKeys("customer2");
		oPage.getcstdescriptionfield().sendKeys("Welcome to Project");
		oPage.getcreatecst().click();
		Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oPage.getoncst().click();
			Thread.sleep(2000);
			oPage.getonaction().click();
			Thread.sleep(2000);
			oPage.getondeletecst().click();
			Thread.sleep(2000);
			oPage.getonconfirmdeletecst().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oPage.getaddnew().click();
			Thread.sleep(2000);
			oPage.getonnewproject().click();
			Thread.sleep(2000);
			oPage.getprojectname().sendKeys("Ecommerce");
			Thread.sleep(2000);
			oPage.getprojectdescfield().sendKeys("It's a Java Project");
			Thread.sleep(2000);
			oPage.getcreateproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			oPage.getonproj().click();
			Thread.sleep(2000);
			oPage.getonaction1().click();
			Thread.sleep(2000);
			oPage.getondelete().click();
			Thread.sleep(2000);
			oPage.getonconfirmdelete().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}




}


