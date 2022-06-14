package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//UserName Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login button field
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//FlyOutwindow field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}


	//Logout Link
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}
	//user click
	@FindBy(xpath = "//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement otask;
	public WebElement getuser()
	{
		return otask;
	}
	//adduser click
	@FindBy(xpath = "//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	//firstName Text Field
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}
	//lastName Text Field
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	//email Text Field
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	//username Text Field
	@FindBy(xpath = "//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement usernameFieldinputFieldWithPlaceholder;
	public WebElement getusername()
	{
		return usernameFieldinputFieldWithPlaceholder;
	}
	//password Text Field
	private WebElement password;
	public WebElement getpwd()
	{
		return password;
	}
	//passwordcopy Text Field
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	//createuser button
	@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement createuser;
	public WebElement getcreateuser()
	{
		return createuser;
	}
	//user1 click
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement otask1;
	public WebElement getuser1()
	{
		return otask1;
	}

	//modifypassword button
	
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword()
	{
		return userDataLightBox_passwordField;
	}
	
	//modify passwordcopy button
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getpwdcopy()
	{
		return userDataLightBox_passwordCopyField;
	}
	//savechanges button
	@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement savechangesclick;
	public WebElement getsavechangesclick()
	{
		return savechangesclick;
	}
	//delete user
	@FindBy(xpath = "//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement deleteuser;

	public WebElement getdeleteuser()
	{
		return deleteuser;
	}
	//usernameclick button
	@FindBy(xpath = "//span[text()='case1, test']")
	private WebElement usernameclick1;
	public WebElement getusernameclick1()
	{
		return usernameclick1;
	}
	//user2 click
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement otask2;
	public WebElement getuser2()
	{
		return otask2;
	}
	 //user3 click
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement otask3;
	public WebElement getuser3()
	{
		return otask3;
	}
	//click on Task
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement ocst;
	public WebElement getontask()
	{
		return ocst;
	}
	//click on Addnew
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oadd;
	public WebElement getaddnew()
	{
		return oadd;
	}
	//click on new customer
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement ocst1;
	public WebElement getnewcustomer()
	{
		return ocst1;
	}
	private WebElement customerLightBox_nameField;
	public WebElement getcstfield()
	{
		return customerLightBox_nameField; 
	}
	private WebElement customerLightBox_descriptionField;
	public WebElement getcstdescriptionfield()
	{
		return customerLightBox_descriptionField;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]")
	private WebElement ocst2;
	public WebElement getcreatecst()
	{
		return ocst2;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement dcst;
	public WebElement getoncst()
	{
		return dcst;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement dcst2;
	public WebElement getonaction()
	{
		return dcst2;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement dcst3;
	public WebElement getondeletecst()
	{
		return dcst3;
	}
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getonconfirmdeletecst()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement mcst;
	public WebElement getonmcst()
	{
		return mcst;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement mcst2;
	public WebElement getclickonmcst()
	{
		return mcst2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement mcst3;
	public WebElement getclickonmcst2()
	{
		return mcst3;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement mcst4;
	public WebElement getonmcstfield()
	{
		return mcst4;
	}
	@FindBy(xpath="//*[@id=\"//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div")
	private WebElement mcst5;
	public WebElement getsavecustomer()
	{
		return mcst4;
	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement cproj;
	public WebElement getonnewproject()
	{
		return cproj;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectname()
	{
		return projectPopup_projectNameField;
	}
	
	private WebElement projectDescriptionField;
	public WebElement getprojectdescfield()
	{
		return projectDescriptionField;
	}
	@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
	private WebElement cproj2;
	public WebElement getcreateproject()
	{
		return cproj2;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement dproj1;
	public WebElement getonproj()
	{
		return dproj1;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement dproj2;
	public WebElement getonaction1()
	{
		return dproj2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement dproj3;
	public WebElement getondelete()
	{
		return dproj3;
	}
	
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getonconfirmdelete()
	{
		return  projectPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement mproj;
	public WebElement getonmproj()
	{
		return mproj;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement mproj2;
	public WebElement getonmproj2()
	{
		return mproj2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement mproj3;
	public WebElement getonmproj3()
	{
		return mproj3;
	}
	@FindBy(xpath="")
	private WebElement mproj4;
	public WebElement getsaveproj()
	{
		return mproj4;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement ctask1;
	public WebElement getctask1()
	{
		return ctask1;
	}
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement ctask2;
	public WebElement getctask2()
	{
		return ctask2;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement ctask3;
	public WebElement getctask3()
	{
		return ctask3;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div/span")
	private WebElement ctask4;
	public WebElement getctask4()
	{
		return ctask4;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement dtask1;
	public WebElement getdtask1()
	{
		return dtask1;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement dtask2;
	public WebElement getdtask2()
	{
		return dtask2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement dtask3;
	public WebElement getdtask3()
	{
		return dtask3;
	}
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getdtask4()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
	private WebElement mpwd1;
	public WebElement getmpwd1()//*[@id="userListTableContainer"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]
	{
		return mpwd1;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement mpwd2;
	public WebElement getmpwd2()
	{
		return mpwd2;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement mpwd3;
	public WebElement getmpwd3()
	{
		return mpwd3;
	}
	@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
	private WebElement avatar;
	public WebElement getavatar()
	{
		return avatar;
	}
}
