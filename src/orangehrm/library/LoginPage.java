package orangehrm.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.AppUtils;


public class LoginPage extends AppUtils
{
	
	public void login(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();		
	}
	
	public boolean isAdminModuleDisplayed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public boolean isEmployeeModuleDisplayed()
	{
		try 
		{
		
			driver.findElement(By.linkText("Admin"));
			return false;
			
		} catch (Exception e) 
		{
			return true;
		}		
	}
	
	public boolean isErrMsgDisplayed()
	{
		String errmsg;
		errmsg = driver.findElement(By.id("spanMessage")).getText();
		if(errmsg.contains("Invalid"))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
}
