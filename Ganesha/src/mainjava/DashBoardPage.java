package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage  extends BaseTest {
	@FindBy(xpath="//*[text()='Dashboard']")
	WebElement titleDashboard;
	
	public DashBoardPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);

}
	public String titleofDashBoardPage() {
		return titleDashboard.getText();
	}
}