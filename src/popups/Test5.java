package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


String parent = driver.getWindowHandle();
System.out.println(parent);

//new tab
driver.switchTo().newWindow(WindowType.TAB);



driver.navigate().to("https://www.amazon.com/");


Set<String> child = driver.getWindowHandles();
System.out.println(child);

driver.quit();

	}

}
