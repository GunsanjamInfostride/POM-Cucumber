package PageFactory;

import Pages.HomePage;
import Pages.LoginPage;

public class ObjectPageFactory 
{
	 private LoginPage logObj;
     private HomePage homeObj;

     public LoginPage getlogin()
     {
         if (logObj == null)
         {
             logObj = new LoginPage();
         }
         return logObj;
     }
     public HomePage gethomepage()
     {
         if (homeObj == null)
         {
             homeObj = new HomePage();
         }
         return homeObj;
     }
}
