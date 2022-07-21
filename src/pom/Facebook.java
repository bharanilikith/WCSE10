package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	@FindBy(id="email")
	private WebElement emailaddress;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(xpath="//input[@id='login'")
	private WebElement loginbtn;
	
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void emailaddresstb(String us) {
		emailaddress.sendKeys(us);	
	}
	
	public void passwordtb(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
	
	

}
