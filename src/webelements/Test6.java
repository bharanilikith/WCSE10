package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement usertb = driver.findElement(By.id("username"));

if(usertb.isDisplayed()) {
	System.out.println("Pass:element is displayed");
	usertb.sendKeys("admin456789");
}

else
{
	System.out.println("Fail:element is not dispalyed");
}
	}

}
