import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(2000);

		//		//id
		//		driver.findElement(By.id("login-username")).sendKeys("sheik@yahoo.com");
		//		driver.findElement(By.id("login-signin")).click();

		driver.findElement(By.linkText("Forgot username?")).click();


	}

}
