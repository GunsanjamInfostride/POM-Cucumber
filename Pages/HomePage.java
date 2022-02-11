package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class HomePage extends Base
{
	@FindBy(linkText="Users")
    WebElement user;
	
	@FindBy(id="btnAdd")
    WebElement add ;
	
	@FindBy(id="systemUser_userType")
	WebElement usertype;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement empname;
	
	@FindBy(id="systemUser_userName")
	WebElement usrname;
	
	@FindBy(id="systemUser_status")
	WebElement status;
	
	@FindBy(id="systemUser_password")
	WebElement password;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement conf;
	
	@FindBy(id="btnSave")
	WebElement save;
	
	@FindBy(partialLinkText="Welcome")
	WebElement wel;
	
	@FindBy(linkText="Logout")
	WebElement log;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void User()
	{
		user.click();
	}
	
	public void AddUser()
	{
		add.click();
	}
	
	public void User_Type()
	{
		usertype.click();
	}
	
	public void empName()
	{
		empname.click();
	}
	
	public void usrName()
	{
		usrname.click();
	}
	
	public void Status()
	{
		status.click();
	}
	
	public void Password()
	{
		password.click();
	}
	
	public void ConfirmPassword()
	{
		conf.click();
	}
	
	public void Save()
	{
		save.click();
	}
	public void Welcome()
	{
		wel.click();
	}
	
	public void userlogout()
	{
		log.click();
	}
}
