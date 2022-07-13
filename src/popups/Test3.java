package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/downloads/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[text()='4.3.0']")).click();

	}

}
