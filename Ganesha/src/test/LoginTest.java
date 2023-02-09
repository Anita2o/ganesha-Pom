package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority=0,groups= {"smoke","regrression"})
	public void verifyTitleofLoginPage() {
		String verifyTitleofLoginP=loginpage.titleofLoginPage();
		Assert.assertEquals(verifyTitleofLoginP,"Login");
	}
	@Test(priority=1,groups= {"smoke","regrression"})
	public void verifyCurrentUrlofPage() {
		String verifyUrlofPage=loginpage.urlofPage();
		Assert.assertEquals( verifyUrlofPage,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	
	@Test(priority=2,groups= {"smoke","regrression"})
    public void verifyLoginwithCorrectCredientials() {
		
		loginpage.setUserName("Admin");
		loginpage.setPassword("admin123");
		loginpage.clickLoginBtn();
		String titleofDash=dashBoardPage.titleofDashBoardPage();//methodname
		Assert.assertEquals(titleofDash, "Dashboard");
		
	}
	@Test(priority=-1,groups= {"smoke","regrression"})
	 public void verifyBuildTitleName() {
		String verifyTitleofBuild=loginpage.getBuildTitle();
		Assert.assertEquals(verifyTitleofBuild, "OrangeHRM");
	}
	



}
