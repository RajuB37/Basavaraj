package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BScenario2OMap {
	public static WebDriver browser=null;
	public static String filename = null;
	public static ObjectMap objectmap=null;

	public static void main(String args[])
	{
		launchbrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeApplication();
	}
	public static void launchbrowser() 
	{
		try {
			filename="D:\\SampleAutomation\\Sample-Automation\\Web-Automation\\Library\\objectmap\\objectMap.properties";
			System.setProperty("webdriver.chrome.driver","D:\\SampleAutomation\\Sample-Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			browser=new ChromeDriver();
			objectmap=new ObjectMap(filename);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try
		{
			browser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	private static void login()
	{
		try
		{
			browser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			browser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void createuser() 
	{
		try {
			browser.findElement(objectmap.getLocator("userheaderlink")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("adduserlink")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("userfirstnamelink")).sendKeys("demo");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("userlastnamelink")).sendKeys("user1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("useremaillink")).sendKeys("user1@gmail.com");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("Usernamelink")).sendKeys("DemoUSer1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("userpassword")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("Demouser1");
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("createusercommitlink")).click();
			Thread.sleep(1000);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void modifyuser() 
	{
		try
		{
		browser.findElement(objectmap.getLocator("userclick")).click();
		Thread.sleep(1000);
		browser.findElement(objectmap.getLocator("userfirstnamelink")).clear();
		Thread.sleep(1000);
		browser.findElement(objectmap.getLocator("userfirstnamelink")).sendKeys("Sample");
		Thread.sleep(1000);
		browser.findElement(objectmap.getLocator("usersavechanges")).click();
		Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser() 
	{
		try {
			browser.findElement(objectmap.getLocator("userclick")).click();
			Thread.sleep(1000);
			browser.findElement(objectmap.getLocator("deleteusercommit")).click();
			Thread.sleep(1000);
			Alert oalert = browser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void logout()
	{
		try
		{
			browser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			browser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
