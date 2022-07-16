package OrangeHRM_testcase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;


public class Admin_login extends AppUtils
{
	@Parameters({"Adminuid","Adminupwd"})
	@Test
  public void CHeckadmin_login(String Adminuid, String Adminupwd)   
	{
		LoginPage lp=new LoginPage();
		lp.login(Adminuid,Adminupwd);
		boolean res=lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
		

	}

}
