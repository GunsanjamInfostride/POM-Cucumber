package StepDefinition;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.LoginPage;

//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import TestBase.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Login  extends Base
{
	public Login()
	{
		super();
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("https://opensource-demo.orangehrmlive.com/");
		Base.initialization();
	}

	@Then("user enters username and enters password in textfield")
	public void user_enters_username_and_enters_password_in_textfield() 
	{
		obj.getlogin().adduserandpass();
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		obj.getlogin().loginbutton();
	}

	@Then("user is on Home page")
	public void user_is_on_Home_page() 
	{
		obj.getlogin().Validatehomepagetitle();
	}

	@Then("click on Users")
	public void click_on_Users()
	{
	   
	}

	@Then("click on add button")
	public void click_on_add_button() 
	{
		
	}
	
	@Then("enter user role")
	public void enter_user_role()
	{
		
	}

	@Then("enter employee name")
	public void enter_employee_name() {
	    
	}

	@Then("enter username")
	public void enter_username() {
	    
	}

	@Then("enter status")
	public void enter_status() {
	    
	}

	@Then("enter password")
	public void enter_password() {
	    
	}

	@Then("enter confirm password")
	public void enter_confirm_password() {
	    
	}

	@Then("click on save button")
	public void click_on_save_button() {
	   
	}
	
	@Then("click on Welcome")
	public void click_on_Welcome() 
	{
		
	}

	@Then("click on logout button")
	public void click_on_logout_button() 
	{
		
	}
}
