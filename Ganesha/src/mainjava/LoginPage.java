package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage  extends BaseTest{
	//All the locators of Page
    @FindBy(xpath="//*[text()='Login']")
    WebElement txt;
    
   @FindBy(name="username")
   WebElement user;
    
    @FindBy(name="password")
    WebElement pass;
    
    @FindBy(tagName="button")
   WebElement btn;

  //initialization of locator/variable
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  public String titleofLoginPage() {
  return txt.getText();
	  }
  
  public String urlofPage() {
	  return driver.getCurrentUrl();
	   }
  
  public void setUserName (String username) {
	  user.sendKeys(username);
  }
   public void setPassword(String password) {
	   pass.sendKeys(password);
   }
   public void clickLoginBtn() {
	   btn.click();
   }
    public String getBuildTitle() {
    	return driver.getTitle();
    }
   
}
   
   
  
  
  
  
  
  
  
  
  
  


