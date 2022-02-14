package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class LoginPage extends Base
{
	@FindBy(id = "txtUsername")
    WebElement uname;
	
    @FindBy(id = "txtPassword")
    WebElement upass;
    
    @FindBy(id = "btnLogin")
    WebElement loginbtn;
    
    @FindBy(partialLinkText = "Forgot your password?")
    WebElement forgotbtn;
    
    public LoginPage()
    {
    	PageFactory.initElements(driver,this);
    }
    
    public String ValidateLoginPageTitle()
    {
		return driver.getTitle();
    	
    }
    
    public void adduserandpass()
    {
    	uname.sendKeys(prop.getProperty("username"));
    	upass.sendKeys(prop.getProperty("pasword"));
    }
    
    public void loginbutton()
    {
    	loginbtn.click();
    }
    
    public void forgot()
    {
        forgotbtn.click();
        driver.navigate().back();

    }
    
    public void Validatehomepagetitle()
    {
    	Assert.assertEquals("OrangeHRM",driver.getTitle());
    }
}
